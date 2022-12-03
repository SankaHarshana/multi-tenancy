package com.project.multitenancy.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "organization")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private Integer status;

    @OneToMany(mappedBy = "org", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Role> roles;

    @OneToMany(mappedBy = "org", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<InspectionSubscription> inspectionSubscriptions;


    @Column(name = "date_created")
    private Date dataCreated;



}
