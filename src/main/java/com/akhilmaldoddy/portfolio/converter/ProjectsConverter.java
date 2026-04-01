package com.akhilmaldoddy.portfolio.converter;

import com.akhilmaldoddy.portfolio.dto.ProjectsDto;
import com.akhilmaldoddy.portfolio.entity.Project;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProjectsConverter {

    private final ModelMapper modelMapper;

    public ProjectsDto convertProjectToDto(Project project) {
        ProjectsDto projectsDto;
        projectsDto = modelMapper.map(project, ProjectsDto.class);
        return projectsDto;
    }

}
