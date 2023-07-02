package Repositories;

import Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findUserById(int id);
    public User findUserByEmail(String email);
    public User findUserByUsername(String username);
}
