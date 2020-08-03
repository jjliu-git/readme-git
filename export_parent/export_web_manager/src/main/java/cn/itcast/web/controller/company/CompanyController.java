package cn.itcast.web.controller.company;

import cn.itcast.domain.company.Company;
import cn.itcast.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    //查询所有公司
    @RequestMapping("/list")
    public String list(HttpServletRequest request){
        List<Company> list = companyService.findAll();
        request.setAttribute("list",list);
        return "company/company-list";
    }

    //保存用户，模拟字符串不能直接转日期类
    @RequestMapping("/save")
    public String save(Date date){
        System.out.println(date);
        System.out.println(1/0);
        return "success";
    }


}
