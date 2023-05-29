package com.burcovschi.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/emp")
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee", new Employee());
        return "ask-details";
    }
/*    @RequestMapping("/showDetails")
    public String showEmployeeDetails(){
        return "show-details";
    }*/

/*    @RequestMapping("/showDetails")
    public String showEmployeeDetails(HttpServletRequest request, Model model){
        String empName = "Mr. "+request.getParameter("employeeName");
        model.addAttribute("proceededEmpName",empName);
        model.addAttribute("description","best friend");
        return "show-details";
    }*/


/*    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model){

        model.addAttribute("proceededEmpName","Mr. "+empName);
        return "show-details";
    }*/

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "ask-details";
        } else {
            emp.setName("Mr. "+ emp.getName());
            emp.setSurname(emp.getSurname()+"!");
            emp.setSalary(emp.getSalary()*10);
            return "show-details";
        }
    }
}
