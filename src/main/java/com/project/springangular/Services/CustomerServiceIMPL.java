package com.project.springangular.Services;

import com.project.springangular.CustomerRepor.CustomerRepo;
import com.project.springangular.DTO.CustomerDTO;
import com.project.springangular.DTO.CustomerSaveDTO;
import com.project.springangular.entities.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService{

    public CustomerServiceIMPL(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public CustomerServiceIMPL() {
    }

    private CustomerRepo customerRepo;

    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {
    // je n'arrive à corrigé ce message d'erreur il change la signature de cette méthode
        // en (string,string,int)
        // met la video à 33 minutes 48 secondes pour voir de quoi je parles
        Customer customer = new Customer(new String[]{
                customerSaveDTO.getName(),
        customerSaveDTO.getAddress(),
        customerSaveDTO.getMobile()
        });
        customerRepo.save(customer);
        return customer.getName();
    }
}
