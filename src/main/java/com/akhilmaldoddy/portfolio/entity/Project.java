package com.akhilmaldoddy.portfolio.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "project", uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", length = 36)
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="company")
    private String company;

    @Column(name="description")
    private String description;

}
