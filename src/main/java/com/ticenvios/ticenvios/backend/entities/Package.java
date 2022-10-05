package com.ticenvios.ticenvios.backend.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Package {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_package;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User user_package;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Route route_package;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Station startstation_package;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Station endstation_package;

    @Column(nullable = false)
    private Date date;



}
