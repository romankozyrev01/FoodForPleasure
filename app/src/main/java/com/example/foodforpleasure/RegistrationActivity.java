package com.example.foodforpleasure;

import Listners.ListnerOnTextChange;
import Validators.FieldValidators.DateValidator;
import Validators.FieldValidators.StringFieldValidator;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RegistrationActivity extends AppCompatActivity {
    private EditText editTextDate;
    EditText editTextFirstName;
    EditText editTextSecondName;
    RadioButton radioButtonWomen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        editTextDate = findViewById(R.id.editText_UserBirthday);
        editTextFirstName = findViewById(R.id.editText_UserFirstName);
        editTextSecondName = findViewById(R.id.editText_UserSecondName);
        radioButtonWomen = findViewById(R.id.radioButtonFemale);

        editTextDate.addTextChangedListener(new ListnerOnTextChange(this,editTextDate));
    }

    public void submitRegistrationStep(View view){
        Intent intent = new Intent(this, CharacteristicsActivity.class);

        String date = editTextDate.getText().toString();
        String userFirstName = editTextFirstName.getText().toString();
        String userSecondName = editTextSecondName.getText().toString();

        DateValidator dateValidator = new DateValidator(date);
        StringFieldValidator firstNameValidator = new StringFieldValidator(userFirstName);
        StringFieldValidator secondNameValidator = new StringFieldValidator(userSecondName);

        if(dateValidator.isValidate() &&
                firstNameValidator.isValidate() &&
                secondNameValidator.isValidate()){
            intent.putExtra(CharacteristicsActivity.FIRST_USER_NAME,userFirstName);
            intent.putExtra(CharacteristicsActivity.SECOND_USER_NAME, userSecondName);
            intent.putExtra(CharacteristicsActivity.DATE, date);
            if(radioButtonWomen.isActivated()){
                intent.putExtra(CharacteristicsActivity.GENDER,"Женщина");
            }
            else {
                intent.putExtra(CharacteristicsActivity.GENDER,"Мужчина");
            }

            startActivity(intent);
        }
        else{
            System.out.println("Exists the null field");
        }
    }
}