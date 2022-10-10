package com.ticenvios.ticenvios.backend.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {
    @Id
    @Column (nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_role;

    @Column(nullable = false, unique = true)
    private String name_role;
}
