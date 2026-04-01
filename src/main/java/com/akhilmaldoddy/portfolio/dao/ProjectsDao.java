package com.akhilmaldoddy.portfolio.dao;

import com.akhilmaldoddy.portfolio.entity.Project;
import com.akhilmaldoddy.portfolio.repo.IProjectsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProjectsDao {

    private final IProjectsRepo projectsRepo;

    public List<Project> findAllProjects() {
        return projectsRepo.findAll();
    }

}
