/**
 * 
 */
package com.product.repo;

import java.util.Date;
import java.util.List;

import com.product.bean.Product;

/**
 * @author Norberto Gomez
 * @date: Oct 14, 2022
 *	
 * 
 */
public interface ProductRepo {
	public void addNewProduct(Product product);
	public void deleteProductById(int productId);
	public void deleteProductByCat(String productCat);
	public Product findProductById(int productId);
	public List<Product> findProductByCat(String productCat);
	public Product findCheapestProductInCat(String productCat);
	public List<Product> findExpiredProducts();
	public void updateProduct(int productId, double price);
}
