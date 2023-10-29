package com.wnso.NextBus.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Route {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "BRAND_ID")
    private Long id;

//    @Column(name = "ROUTE_NAME")
    private String route_name;

//    @Column(name = "ROUTE_NUMBER")
    private int route_number;


}
