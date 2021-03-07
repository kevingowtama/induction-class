package id.bmri.induction.be.day2.beinductionday2.data;

import id.bmri.induction.be.day2.beinductionday2.entities.UserType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// data dummy aja

public class UserTypeData {

    public static List<UserType> userTypes =  new ArrayList<>(
            Arrays.asList(
            new UserType(1, "Owner"),
                new UserType(2, "Sales"),
                new UserType(3, "Akuntan"),
                new UserType(4, "Marketing"),
                new UserType(5, "IT")
    ));
}
