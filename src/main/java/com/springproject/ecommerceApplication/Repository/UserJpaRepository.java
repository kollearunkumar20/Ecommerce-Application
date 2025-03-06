package  com.springproject.ecommerceApplication;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.springproject.ecommerceApplication.User;


@Repository
public interface UserJpaRepository extends JpaRepository<User, String> {

	User findByUsername(String username);
}