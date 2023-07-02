package Models;

import Enums.MajorEnum;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userProfileId;
    @OneToOne
    private User user;
    @ManyToMany (mappedBy = "user")
    private Set<User> friends;
    @OneToMany
    private List<Session> sessionList;
    private String firstName;
    private String lastName;
    private String school;
    /*
     *  TODO: CREATE ENUM FOR MAJORS
     */
    private MajorEnum major;

}
