package pl.com.redpike.NoteKeeper.entities.business.user;

import pl.com.redpike.NoteKeeper.entities.business.converter.YesNoEnumConverter;
import pl.com.redpike.NoteKeeper.entities.business.enums.YesNoEnum;
import pl.com.redpike.NoteKeeper.entities.utility.DbObjectNames;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = DbObjectNames.USERS, schema = DbObjectNames.SCHEMA)
public class User {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", precision = 9, nullable = false, unique = true)
    private Integer id;

    @NotNull
    @Size(max = 30)
    @Column(name = "login", length = 30, nullable = false, unique = true)
    private String login;

    @NotNull
    @Column(name = "passwd", nullable = false)
    private String password;

    @NotNull
    @Column(name = "passwd2", nullable = false)
    private String password2;

    @Size(max = 50)
    @Column(name = "name", length = 50)
    private String name;

    @Size(max = 50)
    @Column(name = "surname", length = 50)
    private String surname;

    @Column(name = "birthday")
    private Date birthday;

    @Size(max = 80)
    @Column(name = "email", length = 80)
    private String email;

    @Convert(converter = YesNoEnumConverter.class)
    @Column(name = "is_blocked")
    private YesNoEnum isBlocked;

    @Convert(converter = YesNoEnumConverter.class)
    @Column(name = "is_deleted")
    private YesNoEnum isDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public YesNoEnum getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(YesNoEnum isBlocked) {
        this.isBlocked = isBlocked;
    }

    public YesNoEnum getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(YesNoEnum isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (password2 != null ? !password2.equals(user.password2) : user.password2 != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (surname != null ? !surname.equals(user.surname) : user.surname != null) return false;
        if (birthday != null ? !birthday.equals(user.birthday) : user.birthday != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (isBlocked != user.isBlocked) return false;
        return isDeleted == user.isDeleted;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (password2 != null ? password2.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (isBlocked != null ? isBlocked.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", password2='" + password2 + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", isBlocked=" + isBlocked +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
