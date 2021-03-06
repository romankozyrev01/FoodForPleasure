package dbAPI.dao;

import android.util.Log;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import dbAPI.dao.IDao.IUserDao;
import models.User;

import java.util.Date;
import java.util.List;

public class UserDao implements IUserDao {
    RuntimeExceptionDao<User,Long> userRuntimeDao;
    Dao<User,Long> userDao;

    public UserDao(RuntimeExceptionDao<User,Long> userRuntimeDao){
        this.userRuntimeDao = userRuntimeDao;
    }

    public UserDao(Dao<User,Long> userDao){
        this.userDao = userDao;
    }

    @Override
    public Boolean idExists(Long id) {
        return userRuntimeDao.idExists(id);
    }

    @Override
    public User getById(Long id) {
        return userRuntimeDao.queryForId(id);
    }

    @Override
    public void create(User user) {
        userRuntimeDao.create(user);
        Log.d("Dao message","User was created");
    }

    @Override
    public void update(User user) {
        userRuntimeDao.update(user);
        Log.d("Dao message","User was updated");
    }

    @Override
    public void delete(User user) {
        userRuntimeDao.delete(user);
    }

    @Override
    public void deleteById(Long id) {
        userRuntimeDao.deleteById(id);
    }

    @Override
    public List<User> queryAll() {
        return userRuntimeDao.queryForAll();
    }
}
