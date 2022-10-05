package com.ticenvios.ticenvios.backend.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Route {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_route;

    @Column(nullable = false, unique = true)
    private String route_name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private List<Station> stations_route;

}
