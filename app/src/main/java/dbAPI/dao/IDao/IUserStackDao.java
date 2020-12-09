package dbAPI.dao.IDao;

import models.Activity;
import models.UserActivityStack;

public interface IUserStackDao {
    UserActivityStack getById(Integer id);
    void create(UserActivityStack user);
    void update(UserActivityStack user);
    void delete(UserActivityStack user);
}
