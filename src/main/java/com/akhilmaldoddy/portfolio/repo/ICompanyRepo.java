package com.akhilmaldoddy.portfolio.repo;

import com.akhilmaldoddy.portfolio.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompanyRepo extends JpaRepository<Company, String>  {
}
