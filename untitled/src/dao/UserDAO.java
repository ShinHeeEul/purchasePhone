package dao;

import exception.UserException;
import model.user.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserDAO {
    private static final Map<String, User> db = new HashMap<>();

    public void insert(User user) throws UserException {
        String id = user.getId();
        if(db.get(id) == null){
            db.put(id, user);
            return;
        }
        throw new UserException("이미 해당 ID를 가진 유저가 존재합니다.");
    }

    public Optional<User> selectUserById(String id) {
        return Optional.ofNullable(db.getOrDefault(id, null));
    }

    public void update(User user) throws UserException {
        String id = user.getId();
        if(db.get(id) == null){
            throw new UserException("해당 ID를 가진 유저가 없습니다. 업데이트 할 수 없습니다");
        }
        db.put(id, user);
    }

    public void delete(User user) throws UserException {
        String id = user.getId();
        if(db.get(id) == null){
            throw new UserException("해당 ID를 가진 유저가 없습니다. 제거 할 수 없습니다");
        }
        db.put(id, null);
    }
}
