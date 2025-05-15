package cl.duoc.ms_customer_bff.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import cl.duoc.ms_customer_bff.model.dto.CustomerDTO;

@FeignClient(name="ms-customer-bs", url="http://localhost:8181/")
public interface CustomerBsFeignClient {

    @GetMapping("customers")
    public List<CustomerDTO> selectAllCustomer();
    

}