package dbAPI;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import models.Activity;
import models.Meal;
import models.User;
import models.UserActivityStack;

import java.sql.SQLException;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "main.db";
    private static final int DATABASE_VERSION = 6;

    private Dao<User,Long> userDao = null;
    private RuntimeExceptionDao<User,Long> userRuntimeDao = null;

    private Dao<Meal,Long> mealDao = null;
    private RuntimeExceptionDao<Meal,Long> mealRuntimeDao = null;

    private Dao<Activity,Long> activityDao = null;
    private RuntimeExceptionDao<Activity,Long> activityRuntimeDao = null;

    private Dao<UserActivityStack,Long> userStackDao = null;
    private RuntimeExceptionDao<UserActivityStack,Long> userStackRuntimeDao = null;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            Log.i(DatabaseHelper.class.getName(), "onCreate");
            TableUtils.createTable(connectionSource, User.class);
            TableUtils.createTable(connectionSource, Activity.class);
            TableUtils.createTable(connectionSource, Meal.class);
            TableUtils.createTable(connectionSource, UserActivityStack.class);
        } catch (SQLException throwables) {
            Log.e(DatabaseHelper.class.getName(), "Can't create database", throwables);
            throwables.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            Log.i(DatabaseHelper.class.getName(), "onUpgrade");
            TableUtils.dropTable(connectionSource, User.class, true);
            TableUtils.dropTable(connectionSource, Activity.class, true);
            TableUtils.dropTable(connectionSource, Meal.class, true);
            TableUtils.dropTable(connectionSource, UserActivityStack.class, true);
            onCreate(database,connectionSource);
        } catch (SQLException throwables) {
            Log.e(DatabaseHelper.class.getName(), "Can't drop databases", throwables);
            throw new RuntimeException(throwables);
        }
    }

    public Dao<Activity, Long> getActivityDao() throws SQLException {
        if(activityDao == null){
            activityDao = getDao(Activity.class);
        }
        return activityDao;
    }

    public Dao<Meal, Long> getMealDao() throws SQLException {
        if(mealDao == null){
            mealDao = getDao(Meal.class);
        }
        return mealDao;
    }

    public RuntimeExceptionDao<Meal, Long> getMealRuntimeDao() {
        if(mealRuntimeDao == null){
            mealRuntimeDao = getRuntimeExceptionDao(Meal.class);
        }
        return mealRuntimeDao;
    }

    public Dao<User, Long> getUserDao() throws SQLException {
        if(userDao == null){
            userDao = getDao(User.class);
        }
        return userDao;
    }

    public RuntimeExceptionDao<User, Long> getUserRuntimeDao() {
        if(userRuntimeDao == null){
            userRuntimeDao = getRuntimeExceptionDao(User.class);
        }
        return userRuntimeDao;
    }

    public Dao<UserActivityStack, Long> getUserStackDao() throws SQLException {
        if(userStackDao == null){
            userStackDao = getDao(UserActivityStack.class);
        }
        return userStackDao;
    }

    public RuntimeExceptionDao<UserActivityStack,Long> getUserStackRuntimeDao() {
        if(userStackRuntimeDao == null){
            userStackRuntimeDao = getRuntimeExceptionDao(UserActivityStack.class);
        }
        return userStackRuntimeDao;
    }

    public RuntimeExceptionDao<Activity, Long> getActivityRuntimeDao() {
        if(activityRuntimeDao == null){
            activityRuntimeDao = getRuntimeExceptionDao(Activity.class);
        }
        return activityRuntimeDao;
    }

    @Override
    public void close() {
        super.close();
        this.userDao = null;
        this.mealDao = null;
        this.activityDao = null;
        this.userStackDao = null;
    }

}
