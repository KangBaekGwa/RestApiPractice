package seounguk.myrestfulservice.repository;

import org.springframework.stereotype.Repository;
import seounguk.myrestfulservice.entity.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class UserRepository {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;

    static {
        users.add(new User(1, "강성욱", new Date()));
        users.add(new User(2, "Seounguk", new Date()));
        users.add(new User(3, "KangKang", new Date()));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if (user.getId() == null){
            user.setId(++usersCount);
        }

        if(user.getJoinData() == null){
            user.setJoinData(new Date());
        }

        users.add(user);
        return user;
    }

    public User findOne(Integer id){
        for(User user : users){
            if(user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }
}
