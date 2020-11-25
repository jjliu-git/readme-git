package cn.itcast.service.company.impl;

import cn.itcast.dao.company.CompanyDao;
import cn.itcast.domain.company.Company;
import cn.itcast.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyDao companyDao;
    @Override
    public List<Company> findAll() {
        System.out.println("20201124firstBranch第一次修改");
        System.out.println("20201124secondBranch第一次修改");
        System.out.println("又一次在firstBranch中建分支第一次修改");
        return companyDao.findAll();
    }
}
