package com.akhilmaldoddy.portfolio.service;

import com.akhilmaldoddy.portfolio.dto.CompanyDto;

import java.util.List;

public interface ICompanyService {

    List<CompanyDto> getCompanies();

    CompanyDto saveCompany(CompanyDto companyDto);

}
