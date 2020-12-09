package dbAPI.dao.IDao;

import models.User;

public interface IUserDao {
    User getById(Integer id);
    void create(User user);
    void update(User user);
    void delete(User user);
}
