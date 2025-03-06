package  com.springproject.ecommerceApplication;
import com.springproject.ecommerceApplication.Product;
import com.springproject.ecommerceApplication.ProductSummary;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

interface ProductRepository {
    ArrayList<Product> getProducts(String sortBy, Integer category, String titleSearch, Integer rating);
    ProductSummary getProductById(Long id);
    Product addProduct(Product Product);
    void deleteProduct(Long id);
    Product updateProduct(Long id,Product Product);
}