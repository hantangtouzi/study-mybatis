package com.hantangtouzi.mapper.dao;

import com.hantangtouzi.mapper.MapperApplication;
import com.hantangtouzi.mapper.entity.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author WilliamChang.
 * Created on 2019-12-14 21:02:23
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MapperApplication.class)
public class CompanyDaoTest {
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void getCompanyById() {
        Company company = companyDao.getCompanyById(1);
        System.out.println(company);
    }

    @Test
    public void findCompanies() {
        List<Company> companies = companyDao.findCompanies();
        for (Company company : companies) {
            System.out.println(company);
        }
    }
}