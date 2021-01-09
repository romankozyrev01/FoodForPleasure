package com.example.foodforpleasure;

import Services.ActivityService;
import android.os.Bundle;
import android.widget.TextView;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import dbAPI.DatabaseHelper;
import dbAPI.dao.IDao.IUserDao;
import dbAPI.dao.UserDao;
import models.NutrientFormuls.DailyColories;
import models.NutrientFormuls.IDailyNutrients;
import models.User;

import java.util.List;

public class MainActivity extends OrmLiteBaseActivity<DatabaseHelper>{
    private ActivityService startActivityService = new ActivityService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.DailyCalories);
        
        

        IUserDao userDao = new UserDao(getHelper().getUserRuntimeDao());

//        for (User user :
//                userDao.queryAll()) {
//            userDao.delete(user);
//        }
        List<User> users = userDao.queryAll();

        
        if(users.size()>0){
            User user = users.get(0);
            IDailyNutrients dailyColories = new DailyColories(user.getStartWeight(),user.getHeight(),user.getAge());
            textView.setText(Integer.toString(dailyColories.process()));
        }
        else{
            System.out.println("users not exist");
            startActivityService.startRegistrationActivity(this);
        }
    }
}