package com.example.foodforpleasure;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import dbAPI.DatabaseHelper;
import dbAPI.dao.IDao.IUserDao;
import dbAPI.dao.UserDao;
import models.NutrientFormuls.DailyColories;
import models.NutrientFormuls.IDailyNutrients;
import models.User;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class MainActivity extends OrmLiteBaseActivity<DatabaseHelper>{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.DailyCalories);

        IUserDao userDao = new UserDao(getHelper().getUserRuntimeDao());
        List<User> users = userDao.queryAll();


        if(users.size()>0){
            User user = users.get(0);
            IDailyNutrients dailyColories = new DailyColories(user.getStartWeight(),user.getHeight(),user.getAge());
            textView.setText(Integer.toString(dailyColories.process()));
        }
        else{
            System.out.println("users not exist");
            Intent intent = new Intent(this, RegistrationActivity.class);
            startActivity(intent);
        }
    }
}