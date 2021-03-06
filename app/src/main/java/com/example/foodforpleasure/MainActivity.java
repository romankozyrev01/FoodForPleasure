package com.example.foodforpleasure;

import Services.ActivityService;
import Constatnts.Option;
import Services.NutrientsService;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import dbAPI.DatabaseHelper;
import dbAPI.dao.IDao.IUserDao;
import dbAPI.dao.UserDao;
import models.NutrientFormulas.Calories.DailyCaloriesBehavior;
import models.NutrientFormulas.Calories.IDailyCaloriesBehavior;
import models.NutrientFormulas.Carbohidrates.*;
import models.NutrientFormulas.Fats.*;
import models.NutrientFormulas.Proteins.*;
import models.User;

import java.util.List;

public class MainActivity extends OrmLiteBaseActivity<DatabaseHelper>{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewCalories = findViewById(R.id.DailyCalories);
        TextView textViewProteins = findViewById(R.id.UserProteins);
        TextView textViewFats = findViewById(R.id.UserFats);
        TextView textViewCarbohydrates = findViewById(R.id.UserCarbohydrates);

        IUserDao userDao = new UserDao(getHelper().getUserRuntimeDao());
        List<User> users = userDao.queryAll();


        if(users.size()>0){
            User user = users.get(0);
            IDailyCaloriesBehavior iDailyCaloriesBehavior = new DailyCaloriesBehavior(
                    user.getStartWeight(),
                    user.getHeight(),
                    user.getAge());

            int calories = iDailyCaloriesBehavior.process();
            int proteins = 0;
            int fats = 0;
            int carbohydrates = 0;
            System.out.println(this.getDataDir());

            switch (user.getGoal()) {
                case Option.LOSS: {
                    IProteinsBehavior iProteinsBehavior = new ProteinsOnLoss();
                    IFatsBehavior iFatsBehavior = new FatsOnLoss();
                    ICarbohydratesBehavior iCarbohydratesBehavior = new CarbohydratesOnLoss();

                    NutrientsService nutrientsService = new NutrientsService(iProteinsBehavior,iFatsBehavior,iCarbohydratesBehavior,calories);
                    proteins = nutrientsService.getRequiredProteins();
                    fats = nutrientsService.getRequiredFats();
                    carbohydrates = nutrientsService.getRequiredCarbohydrates();
                    break;
                }
                case Option.GAIN: {
                    IProteinsBehavior iProteinsBehavior = new ProteinsOnGain();
                    IFatsBehavior iFatsBehavior = new FatsOnGain();
                    ICarbohydratesBehavior iCarbohydratesBehavior = new CarbohydratesOnGain();

                    NutrientsService nutrientsService = new NutrientsService(iProteinsBehavior,iFatsBehavior,iCarbohydratesBehavior,calories);
                    proteins = nutrientsService.getRequiredProteins();
                    fats = nutrientsService.getRequiredFats();
                    carbohydrates = nutrientsService.getRequiredCarbohydrates();
                    break;
                }
                case Option.MAIN: {
                    IProteinsBehavior iProteinsBehavior = new ProteinsMaintaining();
                    IFatsBehavior iFatsBehavior = new FatsMaintaining();
                    ICarbohydratesBehavior iCarbohydratesBehavior = new CarbohydratesMaintaining();

                    NutrientsService nutrientsService = new NutrientsService(iProteinsBehavior,iFatsBehavior,iCarbohydratesBehavior,calories);
                    proteins = nutrientsService.getRequiredProteins();
                    fats = nutrientsService.getRequiredFats();
                    carbohydrates = nutrientsService.getRequiredCarbohydrates();
                    break;
                }
            }

            textViewProteins.setText(Integer.toString(proteins));
            textViewFats.setText(Integer.toString(fats));
            textViewCarbohydrates.setText(Integer.toString(carbohydrates));
            textViewCalories.setText(Integer.toString(iDailyCaloriesBehavior.process()));

        }
        else{
            System.out.println("users not exist");
            ActivityService.startRegistrationActivity(this);
        }
    }

    public void onSettingsButtonClick(View view){
        ActivityService.startSettingsActivity(this);
    }
}