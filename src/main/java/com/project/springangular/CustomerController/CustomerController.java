package com.project.springangular.CustomerController;

import com.project.springangular.DTO.CustomerDTO;
import com.project.springangular.DTO.CustomerSaveDTO;
import com.project.springangular.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {

    private CustomerService customerService;

//    public CustomerController(CustomerService customerService) {
//        this.customerService = customerService;
//    }

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO){
        String id = customerService.addCustomer(customerSaveDTO);
        return  id;

    }
}
