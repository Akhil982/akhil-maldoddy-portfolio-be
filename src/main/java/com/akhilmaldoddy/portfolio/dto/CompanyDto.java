package com.akhilmaldoddy.portfolio.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto {
    private String companyId;
    private String companyName;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<ProjectsDto> projects;
}
