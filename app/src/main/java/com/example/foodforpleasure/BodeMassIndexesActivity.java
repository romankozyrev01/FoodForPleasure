package com.example.foodforpleasure;

import Services.ActivityService;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import dbAPI.DatabaseHelper;
import dbAPI.dao.IDao.IUserDao;
import dbAPI.dao.UserDao;
import models.Height.Centimeter;
import models.Height.IHeight;
import models.MassIndexes.*;
import models.User;
import models.Weight.IWeight;
import models.Weight.Kilogram;

import java.util.List;

public class BodeMassIndexesActivity extends OrmLiteBaseActivity<DatabaseHelper> {
    private TextView userBreitmanIndexTextView;
    private  TextView userNoordenIndexTextView;
    private  TextView userTatonIndexTextView;
    private  TextView userMassIndexTextView;
    private  TextView userBrokeIndexTextView;
    private  ActivityService activityService = new ActivityService();

    public BodeMassIndexesActivity(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bode_mass_index);

        userBreitmanIndexTextView = findViewById(R.id.userBreitmanIndex);
        userNoordenIndexTextView = findViewById(R.id.userNoordenIndex);
        userMassIndexTextView = findViewById(R.id.userMassIndex);
        userBrokeIndexTextView = findViewById(R.id.userBrokeIndex);
        userTatonIndexTextView = findViewById(R.id.userTatonIndex);

        processIndexes();
    }

    private void processIndexes(){
        IUserDao userDao = new UserDao(getHelper().getUserRuntimeDao());
        List<User> users = userDao.queryAll();


        if(users.size()>0){
            User user = users.get(0);
            IWeight weight = new Kilogram(user.getStartWeight());
            IHeight height = new Centimeter(user.getHeight());

            IMassIndex massIndex = new MassIndex(user.getGender(),weight,height);
            IMassIndex tatonIndex = new TatonIndex(height);
            IMassIndex noordenIndex = new NoordenIndex(height);
            IMassIndex brokeIndex = new BrokeIndex(height);
            IMassIndex breitmanIndex = new BreitmanIndex(height);

            userMassIndexTextView.setText(massIndex.toString());
            userBreitmanIndexTextView.setText(new Kilogram(breitmanIndex.getIndex().getWeight()).toString());
            userNoordenIndexTextView.setText(new Kilogram(noordenIndex.getIndex().getWeight()).toString());
            userTatonIndexTextView.setText(new Kilogram(tatonIndex.getIndex().getWeight()).toString());
            userBrokeIndexTextView.setText(new Kilogram(brokeIndex.getIndex().getWeight()).toString());
        }
        else{
            System.out.println("index: users not exist");
            activityService.startRegistrationActivity(this);
        }
    }

    public void submit(View view) {
        activityService.startMainActivity(this);
    }
}