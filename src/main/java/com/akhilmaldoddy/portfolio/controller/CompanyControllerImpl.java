package com.akhilmaldoddy.portfolio.controller;

import com.akhilmaldoddy.portfolio.bean.ResponseBean;
import com.akhilmaldoddy.portfolio.dto.CompanyDto;
import com.akhilmaldoddy.portfolio.dto.ProjectsDto;
import com.akhilmaldoddy.portfolio.entity.Company;
import com.akhilmaldoddy.portfolio.service.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CompanyControllerImpl implements ICompanyController {

    @Autowired
    ICompanyService companyService;

    @Override
    public ResponseBean<CompanyDto> saveCompany(CompanyDto companyDto) {
        CompanyDto res = companyService.saveCompany(companyDto);
        return new ResponseBean<>(200, null, res);
    }

    @Override
    public ResponseBean<List<CompanyDto>> getCompanies() {
        List<CompanyDto> res = companyService.getCompanies();
        return new ResponseBean<>(200, null, res);
    }

}
