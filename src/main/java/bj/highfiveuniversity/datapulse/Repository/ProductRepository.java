package bj.highfiveuniversity.datapulse.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Product;

@Repository
public interface  ProductRepository extends JpaRepository<Product,Long>{
    
}
