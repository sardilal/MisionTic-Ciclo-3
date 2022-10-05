package com.ticenvios.ticenvios.backend.entities;

import lombok.*;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "User")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;

    @Column(nullable = false, unique = true)
    private String name_user;

    @Getter(value = AccessLevel.NONE)
    @Column(nullable = false)
    private String password_user;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(nullable =false)
    private List<Role> roles_user;

    public boolean checkPassword(String password_user){
        return this.password_user.equals(password_user);
    }

}
