package cl.duoc.ms_customer_bff.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class CustomerDTO {
    private long id;
    private String username;
    private String password;
    private String name;
    private String lastname;
    private String email;
    
}
