package dbAPI.dao.IDao;

import models.Meal;
import models.User;

public interface IMealDao {
    Meal getById(Integer id);
    void create(Meal user);
    void update(Meal user);
    void delete(Meal user);
}
