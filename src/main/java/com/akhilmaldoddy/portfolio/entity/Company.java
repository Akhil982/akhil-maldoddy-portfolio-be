package com.akhilmaldoddy.portfolio.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "company", uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "company_id", length = 36)
    private String companyId;

    @Column(name="company_name")
    private String companyName;

    @Column(name="start_date")
    private LocalDate startDate;

    @Column(name="end_date")
    private LocalDate endDate;

    @OneToMany(mappedBy="company", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Project> projects;

}
