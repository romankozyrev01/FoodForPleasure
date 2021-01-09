package dbAPI.dao;

import com.j256.ormlite.dao.RuntimeExceptionDao;
import dbAPI.dao.IDao.IActivityDao;
import models.Activity;

import java.util.List;

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
        activityRuntimeDao.create(activity);
    }

    @Override
    public void update(Activity activity) {
        activityRuntimeDao.update(activity);
    }

    @Override
    public void delete(Activity activity) {
        activityRuntimeDao.delete(activity);
    }

    @Override
    public List<Activity> queryAll() {
        return activityRuntimeDao.queryForAll();
    }
}
