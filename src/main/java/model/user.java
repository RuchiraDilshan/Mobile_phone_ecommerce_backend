package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class user {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;

    private String role = "USER"; // Default role is 'USER'

}
