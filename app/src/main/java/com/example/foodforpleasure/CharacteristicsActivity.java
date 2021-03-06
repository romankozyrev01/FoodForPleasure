package com.example.foodforpleasure;

import Services.ActivityService;
import Validators.FieldValidators.HeightFieldValidator;
import Validators.FieldValidators.IFieldValidator;
import Validators.FieldValidators.StringFieldValidator;
import Validators.FieldValidators.WeightFieldValidator;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
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
    public static final String FIRST_USER_NAME = "firstName";
    public static final String SECOND_USER_NAME = "secondName";
    public static final String DATE = "date";
    public static final String GENDER = "gender";

    private final ActivityService activityService = new ActivityService();
    private int height;
    private double weight;
    private String gender;
    String secondName;
    String firstName;
    Date date;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characteristics);
    }


    public void submitRegistrationFinal(View view) throws ParseException {
        EditText editTextHeight = findViewById(R.id.editText_UserHeight);
        EditText editTextWeight = findViewById(R.id.editText_UserWeight);
        IFieldValidator heightValidator = new HeightFieldValidator(editTextHeight.getText().toString());
        IFieldValidator weightValidator = new WeightFieldValidator(editTextWeight.getText().toString());

        if (heightValidator.isValidate() &&
                weightValidator.isValidate()){
            weight = Double.parseDouble(editTextWeight.getText().toString());
            height = Integer.parseInt(editTextHeight.getText().toString());
            Intent intent = getIntent();
            gender = intent.getStringExtra(GENDER);
            firstName = intent.getStringExtra(FIRST_USER_NAME);
            secondName = intent.getStringExtra(SECOND_USER_NAME);
            date = new SimpleDateFormat( "dd/MM/yyyy" ).parse(intent.getStringExtra(DATE));

            IUserDao userDao = new UserDao(getHelper().getUserRuntimeDao());
            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(secondName);
            user.setAuthorizedToken(firstName+secondName+date+random.nextDouble());
            user.setBirthday(date);
            user.setStartWeight(weight);
            user.setHeight(height);
            user.setGender(gender);
            userDao.create(user);

            activityService.startBodeMassIndexesActivity(this);
        }
    }
}