package cl.duoc.ms_customer_bff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.duoc.ms_customer_bff.clients.CustomerBsFeignClient;
import cl.duoc.ms_customer_bff.model.dto.CustomerDTO;

@Service
public class CustomerService {

    @Autowired
    CustomerBsFeignClient customerBsFeignClient;

    public List<CustomerDTO> selectAllCustomer(){
        List<CustomerDTO> listaClientes = customerBsFeignClient.selectAllCustomer();
        return listaClientes;
    } 

}
