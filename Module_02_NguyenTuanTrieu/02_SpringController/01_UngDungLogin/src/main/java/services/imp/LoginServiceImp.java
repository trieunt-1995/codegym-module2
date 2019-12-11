package services.imp;

import model.Login;
import model.User;
import services.LoginService;

import java.util.ArrayList;
import java.util.List;

public class LoginServiceImp implements LoginService {
    private static final List<User> userList = new ArrayList<User>();

    static {
        initUser();
    }

    public static void initUser() {
        userList.add(new User("trieunt", "123456", "Nguyễn Tuấn Triều", "trieunt.qng@gmail.com",
                25));
        userList.add(new User("trieunt2", "112233", "Nguyễn Tuấn Triều", "trieunt2.qng@gmail.com",
                26));
        userList.add(new User("admin", "admin", "Nguyễn Tuấn Triều", "trieunt.qng@gmail.com",
                25));
    }

    @Override
    public User checkLogin(Login login) {
        for (User user : userList) {
            if (login.getAccount().equals(user.getAccount())
                    && login.getPassword().equals(user.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
