package com.akhilmaldoddy.portfolio.dao;

import com.akhilmaldoddy.portfolio.dto.CompanyDto;
import com.akhilmaldoddy.portfolio.entity.Company;
import com.akhilmaldoddy.portfolio.entity.Project;
import com.akhilmaldoddy.portfolio.repo.ICompanyRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CompanyDao {

    private final ICompanyRepo companyRepo;

    public Company saveCompany(Company company){
        if (company.getProjects() != null) {
            for (Project project : company.getProjects()) {
                project.setCompany(company);
            }
        }
        return companyRepo.save(company);
    }

    public List<Company> findAllCompanies(){
        return companyRepo.findAll();
    }
}
