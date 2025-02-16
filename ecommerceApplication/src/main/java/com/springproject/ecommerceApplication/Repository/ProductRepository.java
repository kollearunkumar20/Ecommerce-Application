package  com.springproject.ecommerceApplication;

import com.springproject.ecommerceApplication.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
