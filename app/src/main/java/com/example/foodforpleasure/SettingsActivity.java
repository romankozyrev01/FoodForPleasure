package com.example.foodforpleasure;

import Services.ActivityService;
import android.view.View;
import android.widget.*;
import android.os.Bundle;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import dbAPI.DatabaseHelper;
import dbAPI.dao.IDao.IUserDao;
import dbAPI.dao.UserDao;
import models.User;

import java.util.List;

public class SettingsActivity extends OrmLiteBaseActivity<DatabaseHelper> implements AdapterView.OnItemSelectedListener {
    IUserDao userDao;
    User selectedUSer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        userDao = new UserDao(getHelper().getUserRuntimeDao());
        Spinner spinner = findViewById(R.id.userSpinner);
        List<User> users = userDao.queryAll();
        SpinnerAdapter adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, users);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    public void addUser(View view){
        ActivityService.startRegistrationActivity(this);
    }

    public void deleteUser(View view){
        userDao.delete(selectedUSer);
    }

    public void deleteAllUsers(View view){
        for (User user :
                userDao.queryAll()) {
            userDao.delete(user);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        selectedUSer = (User) parent.getItemAtPosition(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}