package ru.sevenseven.cafeteria.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
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


    //??? ManyToMany or OneToMany or ManyToOne ??? может быть несколько ролей или только одна роль?
    // (Админ, клиент, модератор и т.п.)
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {CascadeType.MERGE})
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Role role;

    @Override
    public String toString(){
        return id + " " + surname + " " + name + " role: " + role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) && surname.equals(user.surname) && name.equals(user.name) && role.equals(user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, role);
    }


}
