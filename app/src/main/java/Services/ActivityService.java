package Services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.example.foodforpleasure.BodeMassIndexesActivity;
import com.example.foodforpleasure.CharacteristicsActivity;
import com.example.foodforpleasure.MainActivity;
import com.example.foodforpleasure.RegistrationActivity;

public class ActivityService {
    public void startMainActivity(Context context){
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    public void startRegistrationActivity(Context context){
        Intent intent = new Intent(context, RegistrationActivity.class);
        context.startActivity(intent);
    }

    public void startCharacteristicsActivity(Context context){
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    public void startSettingsActivity(Context context){
        Intent intent = new Intent(context, CharacteristicsActivity.class);
        context.startActivity(intent);
    }

    public void startBodeMassIndexesActivity(Context context){
        Intent intent = new Intent(context, BodeMassIndexesActivity.class);
        context.startActivity(intent);
    }
}
