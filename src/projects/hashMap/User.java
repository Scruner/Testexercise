package projects.hashMap;

import java.io.FileNotFoundException;
import java.util.Objects;

public class User {

    private String name;
    private String surname;
    private String birthDate;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name)
                && Objects.equals(surname, user.surname)
                && Objects.equals(birthDate, user.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate);
    }

    protected Object foo() throws FileNotFoundException {

        return null;
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", birthDate='" + birthDate + '\'' + '}';
    }
}
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null) {
//            return false;
//        }
//        if (!o.instanceOf(User)) {
//            return false;
//        }
//        if (o.name.equals(this.name)
//                && o.surname.equals(this.surname)
//                && o.birthDate.equals(this.birthDate)) {
//            return true;
//        }
//        return true;
//    }





