package  com.springproject.ecommerceApplication;

import com.springproject.ecommerceApplication.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
