package com.project.springangular.Services;

import com.project.springangular.DTO.CustomerDTO;
import com.project.springangular.DTO.CustomerSaveDTO;

public interface CustomerService {

    String addCustomer(CustomerSaveDTO customerSaveDTO);
}
