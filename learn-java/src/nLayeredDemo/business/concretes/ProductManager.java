package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public void add(Product product) {

        if (product.getCategoryId()==1){
            System.out.println("Bu kategoride urun kabul edilmiyor.");
            return;
        }
        this.productDao.add(product);
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
