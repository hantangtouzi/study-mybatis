package com.hantangtouzi.mapper.dao;

import com.hantangtouzi.mapper.entity.Company;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2019-12-14 20:56:21
 */

@Repository
public interface CompanyDao {
    Company getCompanyById(Integer id);

    List<Company> findCompanies();
}
