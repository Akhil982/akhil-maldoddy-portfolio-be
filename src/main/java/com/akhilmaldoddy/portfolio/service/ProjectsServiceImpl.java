package com.akhilmaldoddy.portfolio.service;

import com.akhilmaldoddy.portfolio.converter.ProjectsConverter;
import com.akhilmaldoddy.portfolio.dao.ProjectsDao;
import com.akhilmaldoddy.portfolio.dto.ProjectsDto;
import com.akhilmaldoddy.portfolio.entity.Project;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProjectsServiceImpl implements IProjectsService{

    private final ProjectsDao projectsDao;

    private final ProjectsConverter projectsConverter;

    @Override
    public List<ProjectsDto> getProjects() {
        List<Project> projects = projectsDao.findAllProjects();
        return projects.stream()
                .map(projectsConverter::convertProjectToDto)
                .collect(Collectors.toList());
    }

}
