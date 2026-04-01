package com.akhilmaldoddy.portfolio.service;

import com.akhilmaldoddy.portfolio.converter.CompanyConverter;
import com.akhilmaldoddy.portfolio.dao.CompanyDao;
import com.akhilmaldoddy.portfolio.dto.CompanyDto;
import com.akhilmaldoddy.portfolio.entity.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements ICompanyService {

    private final CompanyDao companyDao;

    private final CompanyConverter companyConverter;

    @Override
    public CompanyDto saveCompany(CompanyDto companyDto){
        Company company = companyConverter.convertDtoToCompany(companyDto);
        return companyConverter.convertCompanyToDto(companyDao.saveCompany(company));
    }

    @Override
    public List<CompanyDto> getCompanies() {
        List<Company> companies = companyDao.findAllCompanies();
        return companies.stream()
                .map(companyConverter::convertCompanyToDto)
                .collect(Collectors.toList());
    }

}
