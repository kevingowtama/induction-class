package id.bmri.induction.be.day2.beinductionday2.data;

import id.bmri.induction.be.day2.beinductionday2.entities.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// data dummy aja
public class UserData {

    public static List<User> users = new ArrayList<>(
            Arrays.asList(
            new User(1, "Ani", "asdjkl", UserTypeData.userTypes.get(0)),
            new User(2, "Budi", "asdjkl",  UserTypeData.userTypes.get(0)),
            new User(3, "Cindy", "asdjkl",  UserTypeData.userTypes.get(3)),
            new User(4, "Dani", "asdjkl",  UserTypeData.userTypes.get(1)),
            new User(5, "Mario", "asdjkl",  UserTypeData.userTypes.get(1))
    ));

}
