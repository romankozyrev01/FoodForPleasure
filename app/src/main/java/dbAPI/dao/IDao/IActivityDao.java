package dbAPI.dao.IDao;

import models.Activity;

import java.util.List;

public interface IActivityDao {
    Activity getById(Integer id);
    void create(Activity activity);
    void update(Activity activity);
    void delete(Activity activity);
    List<Activity> queryAll();
}
