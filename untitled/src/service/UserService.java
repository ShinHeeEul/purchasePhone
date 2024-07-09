package service;

import dao.UserDAO;
import exception.UserException;
import model.user.User;

import java.util.Optional;

public class UserService {

    private final static UserDAO userDAO = new UserDAO();

    public void join(User user) throws UserException {
        userDAO.insert(user);
    }

    public User login(String id, String hen) throws UserException {
        Optional<User> selectedOptionalUser = userDAO.selectUserById(id);
        User selectedUser = selectedOptionalUser.orElseThrow(() -> new UserException("ID가 일치하지 않습니다."));
        if(!selectedUser.checkPassword(hen)) {
            throw new UserException("비밀번호가 일치하지 않습니다.");
        }
        return selectedUser;
    }

    public void update(User updatedUser) throws UserException {
        userDAO.update(updatedUser);
    }

    public void remove(User currentUser) throws UserException {
        userDAO.delete(currentUser);
    }
}
