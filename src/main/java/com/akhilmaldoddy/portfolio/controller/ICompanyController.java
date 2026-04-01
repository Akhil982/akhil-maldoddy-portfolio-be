package com.akhilmaldoddy.portfolio.controller;

import com.akhilmaldoddy.portfolio.bean.ResponseBean;
import com.akhilmaldoddy.portfolio.dto.CompanyDto;
import com.akhilmaldoddy.portfolio.dto.ProjectsDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/company")
public interface ICompanyController {

    @PostMapping("/save-company")
    ResponseBean<CompanyDto> saveCompany(@RequestBody CompanyDto companyDto);

    @GetMapping("/get-companies")
    ResponseBean<List<CompanyDto>> getCompanies();

}
