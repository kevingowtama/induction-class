package id.bmri.induction.be.day2.beinductionday2.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserType {
    private Integer id;
    private String name;

    public UserType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}
