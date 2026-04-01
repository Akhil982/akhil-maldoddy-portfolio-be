package com.akhilmaldoddy.portfolio.controller;

import com.akhilmaldoddy.portfolio.bean.ResponseBean;
import com.akhilmaldoddy.portfolio.dto.ProjectsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/projects")
public interface IProjectsController {

    @GetMapping("/get-projects")
    ResponseBean<List<ProjectsDto>> getProjects();

}
