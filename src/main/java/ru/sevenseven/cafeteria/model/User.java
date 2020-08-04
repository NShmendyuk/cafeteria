package ru.sevenseven.cafeteria.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String surname;

    @Column
    private String name;

    @Column
    private String login;

    @Column
    private String password;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {CascadeType.MERGE})
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Role role;


    @Override
    public String toString(){
        return id + " " + login + " " + surname + " " + name + " role: " + role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id)
                && surname.equals(user.surname)
                && name.equals(user.name)
                && login.equals(user.login)
                && password.equals(user.password)
                && role.equals(user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, login, password, role);
    }

}
