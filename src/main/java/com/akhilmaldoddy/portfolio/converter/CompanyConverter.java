package com.akhilmaldoddy.portfolio.converter;

import com.akhilmaldoddy.portfolio.dto.CompanyDto;
import com.akhilmaldoddy.portfolio.dto.ProjectsDto;
import com.akhilmaldoddy.portfolio.entity.Company;
import com.akhilmaldoddy.portfolio.entity.Project;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CompanyConverter {

    private final ModelMapper modelMapper;

    public Company convertDtoToCompany(CompanyDto companyDto) {
        Company company;
        company = modelMapper.map(companyDto, Company.class);
        return company;
    }

    public CompanyDto convertCompanyToDto(Company company) {
        CompanyDto companyDto;
        companyDto = modelMapper.map(company, CompanyDto.class);
        return companyDto;
    }

}
