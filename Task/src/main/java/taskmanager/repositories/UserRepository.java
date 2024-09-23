package taskmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import taskmanager.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    UserDetails findFirstByEmail(String username);
}
