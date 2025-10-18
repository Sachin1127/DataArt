package Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyCv {
    private String name;
    private int age;
    private String address;
    private String email;
    private String phone;
    private String skills;
    private String education;
}