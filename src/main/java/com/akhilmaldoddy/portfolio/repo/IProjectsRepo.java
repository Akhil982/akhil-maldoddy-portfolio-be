package com.akhilmaldoddy.portfolio.repo;

import com.akhilmaldoddy.portfolio.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjectsRepo extends JpaRepository<Project, String> {

}
