package dbAPI.dao.IDao;

import models.Activity;

public interface IActivityDao {
    Activity getById(Integer id);
    void create(Activity user);
    void update(Activity user);
    void delete(Activity user);
}
