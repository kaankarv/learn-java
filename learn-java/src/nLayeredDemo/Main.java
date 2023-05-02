package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

    public static void main(String[] args){
        //todo : spring ioc ile refactor edilecek

        ProductService productService = new ProductManager(new AbcProductDao());
        Product product = new Product(1,2,"Elma",12,50);
        productService.add(product);


    }
}
