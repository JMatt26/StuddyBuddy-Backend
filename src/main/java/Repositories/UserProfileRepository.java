package Repositories;

import Models.User;
import Models.UserProfile;
import org.springframework.data.repository.CrudRepository;

public interface UserProfileRepository extends CrudRepository<UserProfile, User> {

    public UserProfile findUserProfileByUserProfileId(int profileId);
    public UserProfile findUserProfileByUser(User user);
    public UserProfile findUserProfileBySchool(String school);
    public UserProfile findUserProfileByFirstName(String firstName);
    public UserProfile findUserProfileByLastName(String lastName);

}
