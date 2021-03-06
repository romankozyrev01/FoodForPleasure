package Services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.example.foodforpleasure.*;

public class ActivityService {
    public void startMainActivity(Context context){
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    public static void startRegistrationActivity(Context context){
        Intent intent = new Intent(context, RegistrationActivity.class);
        context.startActivity(intent);
    }

    public void startCharacteristicsActivity(Context context){
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    public static void startSettingsActivity(Context context){
        Intent intent = new Intent(context, SettingsActivity.class);
        context.startActivity(intent);
    }

    public void startBodeMassIndexesActivity(Context context){
        Intent intent = new Intent(context, BodeMassIndexesActivity.class);
        context.startActivity(intent);
    }

    public void startUserTargetActivity(Context context){
        Intent intent = new Intent(context, UserTargetActivity.class);
        context.startActivity(intent);
    }


}
