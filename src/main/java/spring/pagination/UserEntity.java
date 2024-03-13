package spring.pagination;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity(name = "user")
public class UserEntity {
    @Id
    String user;
    String username;
    String password;
}
