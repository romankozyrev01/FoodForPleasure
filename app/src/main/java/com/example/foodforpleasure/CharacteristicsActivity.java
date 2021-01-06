package com.example.foodforpleasure;

import Services.Validators.FieldValidators.IFieldValidator;
import Services.Validators.FieldValidators.StringFieldValidator;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import dbAPI.DatabaseHelper;
import dbAPI.dao.IDao.IUserDao;
import dbAPI.dao.UserDao;
import models.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CharacteristicsActivity extends OrmLiteBaseActivity<DatabaseHelper> {
    private int height;
    private double weight;

    public static final String FIRST_USER_NAME = "firstName";
    public static final String SECOND_USER_NAME = "secondName";
    public static final String DATE = "date";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characteristics);
    }


    public void submitRegistrationFinal(View view) throws ParseException {
        EditText editTextHeight = findViewById(R.id.editText_UserHeight);
        EditText editTextWeight = findViewById(R.id.editText_UserWeight);
        IFieldValidator heightValidator = new StringFieldValidator(editTextHeight.getText().toString());
        IFieldValidator weightValidator = new StringFieldValidator(editTextWeight.getText().toString());

        if (heightValidator.isValidate() &&
                weightValidator.isValidate()){
            weight = Double.parseDouble(editTextWeight.getText().toString());
            height = Integer.parseInt(editTextHeight.getText().toString());
        }

        Intent intent = getIntent();
        String firstName = intent.getStringExtra(FIRST_USER_NAME);
        String secondName = intent.getStringExtra(SECOND_USER_NAME);
        Date date = new SimpleDateFormat( "dd/MM/yyyy" ).parse(intent.getStringExtra(DATE));

        IUserDao userDao = new UserDao(getHelper().getUserRuntimeDao());
        User user = new User();
        Random random = new Random();
        user.setFirstName(firstName);
        user.setLastName(secondName);
        user.setAuthorizedToken(firstName+secondName+date+random.nextDouble());
        user.setBirthday(date);
        user.setStartWeight(weight);
        user.setHeight(height);
        userDao.create(user);

        Intent intentToMain = new Intent(this, MainActivity.class);
        startActivity(intentToMain);
    }
}