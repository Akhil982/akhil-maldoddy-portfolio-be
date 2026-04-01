package com.akhilmaldoddy.portfolio.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProjectsDto {
    private String id;
    private String name;
    private String company;
    private String description;
}
