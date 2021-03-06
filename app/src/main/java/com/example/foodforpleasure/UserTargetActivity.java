package com.example.foodforpleasure;

import Services.ActivityService;
import Constatnts.Option;
import android.view.View;
import android.os.Bundle;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import dbAPI.DatabaseHelper;
import dbAPI.dao.IDao.IUserDao;
import dbAPI.dao.UserDao;
import models.User;

public class UserTargetActivity extends OrmLiteBaseActivity<DatabaseHelper>{
    ActivityService activityService = new ActivityService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
    }

    public void submitLoseWeight(View view){
        IUserDao userDao = new UserDao(getHelper().getUserRuntimeDao());
        User user = userDao.queryAll().get(0);
        user.setGoal(Option.LOSS);
        userDao.update(user);

        activityService.startMainActivity(this);
        finish();
    }


    public void submitMainWeight(View view){
        IUserDao userDao = new UserDao(getHelper().getUserRuntimeDao());
        User user = userDao.queryAll().get(0);
        user.setGoal(Option.MAIN);
        userDao.update(user);

        activityService.startMainActivity(this);
        finish();
    }

    public void submitGainWeight(View view){
        IUserDao userDao = new UserDao(getHelper().getUserRuntimeDao());
        User user = userDao.queryAll().get(0);
        user.setGoal(Option.GAIN);
        userDao.update(user);

        activityService.startMainActivity(this);
        finish();
    }
}