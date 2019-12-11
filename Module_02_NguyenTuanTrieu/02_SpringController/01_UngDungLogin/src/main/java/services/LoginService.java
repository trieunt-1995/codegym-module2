package services;

import model.Login;
import model.User;

import java.util.List;

public interface LoginService {
    User checkLogin(Login login);

}
