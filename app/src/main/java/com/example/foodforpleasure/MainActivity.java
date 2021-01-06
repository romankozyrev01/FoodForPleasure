package com.example.foodforpleasure;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import dbAPI.DatabaseHelper;
import dbAPI.dao.ActivityDao;
import dbAPI.dao.IDao.IActivityDao;
import models.Activity;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainActivity extends OrmLiteBaseActivity<DatabaseHelper> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView =  findViewById(R.id.textView);

        StringBuilder stringBuilder= new StringBuilder();
        IActivityDao activityDao = new ActivityDao(getHelper().getActivityRuntimeDao());

        for (Activity activity :
                getHelper().getActivityRuntimeDao().queryForAll()) {
            stringBuilder.append(activity.toString());
        }

        textView.setText(stringBuilder);
    }


}