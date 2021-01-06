package dbAPI.dao.IDao;

import models.Meal;
import models.User;

public interface IMealDao {
    Meal getById(Integer id);
    void create(Meal meal);
    void update(Meal meal);
    void delete(Meal meal);
}
