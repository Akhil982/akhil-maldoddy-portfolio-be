package com.akhilmaldoddy.portfolio.controller;

import com.akhilmaldoddy.portfolio.bean.ResponseBean;
import com.akhilmaldoddy.portfolio.dto.ProjectsDto;
import com.akhilmaldoddy.portfolio.service.IProjectsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProjectsControllerImpl implements IProjectsController{

    @Autowired
    IProjectsService projectsService;

    @Override
    public ResponseBean<List<ProjectsDto>> getProjects() {
        List<ProjectsDto> res = projectsService.getProjects();
        return new ResponseBean<>(200, null, res);
    }

}
