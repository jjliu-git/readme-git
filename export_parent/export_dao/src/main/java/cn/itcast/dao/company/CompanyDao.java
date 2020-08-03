package cn.itcast.dao.company;

import cn.itcast.domain.company.Company;

import java.util.List;

public interface CompanyDao {
    //查询购买系统的所有的企业
    List<Company> findAll();
}
