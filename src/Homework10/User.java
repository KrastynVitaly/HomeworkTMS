package Homework10;

import java.util.Objects;

public class User implements Cloneable{
private String login;
private int id;
private Person person;

    public User(String login) {
        this.login = login;

    }

    public User(String login, int id, Person person) {
        this.login = login;
        this.id = id;
        this.person = person;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", id=" + id +
                ", person=" + person +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(login, user.login)&& Objects.equals(person, user.person);
    }


//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return id == user.id &&
//                Objects.equals(login, user.login) &&
//                Objects.equals(id, user.id) &&
//                Objects.equals(user, user.person);
//    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((login == null) ? 0 : login.hashCode());
        return result;
    }

    @Override
    public User clone() throws CloneNotSupportedException{
            return (User) super.clone();
    }

    public User deepClone() throws CloneNotSupportedException{
        Person clonedPerson = new Person(
                this.person.getName(),
                this.person.getSurname(),
                this.person.getAge());
        return new User(
                this.login,
                this.id,
                clonedPerson
        );

    }

}
