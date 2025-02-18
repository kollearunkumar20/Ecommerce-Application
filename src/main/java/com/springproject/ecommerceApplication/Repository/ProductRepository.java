package  com.springproject.ecommerceApplication;
import com.springproject.ecommerceApplication.Product;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

interface ProductRepository {
    ArrayList<Product> getProducts();
    Product getProductById(Long id);
    Product addProduct(Product Product);
    void deleteProduct(Long id);
    Product updateProduct(Long id,Product Product);
}