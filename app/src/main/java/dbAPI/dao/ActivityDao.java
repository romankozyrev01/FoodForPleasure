package dbAPI.dao;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import dbAPI.dao.IDao.IActivityDao;
import models.Activity;

public class ActivityDao implements IActivityDao {
    RuntimeExceptionDao<Activity,Long> activityRuntimeDao;

    public ActivityDao(RuntimeExceptionDao<Activity, Long> activityRuntimeDao){
        this.activityRuntimeDao = activityRuntimeDao;
    }

    @Override
    public Activity getById(Integer id) {
        return null;
    }

    @Override
    public void create(Activity activity) {
        if(activityRuntimeDao != null){
            activityRuntimeDao.create(activity);
        }
    }

    @Override
    public void update(Activity user) {

    }

    @Override
    public void delete(Activity user) {

    }
}
