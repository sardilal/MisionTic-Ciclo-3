package com.ticenvios.ticenvios.backend.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Station {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_station;

    @Column(nullable = false)
    private String name_station;

    @Column(nullable = false, unique = true)
    private String address_station;
}
