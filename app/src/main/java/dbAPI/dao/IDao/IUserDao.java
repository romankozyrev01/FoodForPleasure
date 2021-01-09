package dbAPI.dao.IDao;


import models.User;

import java.util.List;

public interface IUserDao {
    Boolean idExists(Long id);
    User getById(Long id);
    void create(User user);
    void update(User user);
    void delete(User user);
    void deleteById(Long id);
    List<User> queryAll();
}
