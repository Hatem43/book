package Pages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassengerData {
    private String title;
    private String firstName;
    private String lastName;
    private String countCode;
    private String mobile;
    private String gender;
    private String passport;
    private String nationality;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountCode(String countCode) {
        this.countCode = countCode;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountCode() {
        return countCode;
    }

    public String getGender() {
        return gender;
    }

    public String getPassport() {
        return passport;
    }

    public String getNationality() {
        return nationality;
    }

    public String getMobile() {
        return mobile;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}