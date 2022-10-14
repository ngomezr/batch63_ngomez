/**
 * 
 */
package com.product.service;

import java.util.Date;
import java.util.List;

import com.product.bean.Product;
import com.product.repo.ProductRepo;
import com.product.repo.ProductRepoImpl;

/**
 * @author Norberto Gomez
 * @date: Oct 14, 2022
 *	
 * 
 */
public class ProductServiceImpl implements ProductService{
	ProductRepo pd = new ProductRepoImpl();
	
	@Override
	public void addNewProduct(Product product) {
		pd.addNewProduct(product);
	}

	@Override
	public void deleteProductById(int productId) {
		pd.deleteProductById(productId);
	}

	@Override
	public void deleteProductByCat(String productCat) {
		pd.deleteProductByCat(productCat);
	}

	@Override
	public Product findProductById(int productId) {
		return pd.findProductById(productId);
	}

	@Override
	public List<Product> findProductByCat(String productCat) {
		return pd.findProductByCat(productCat);
	}

	@Override
	public Product findCheapestProductInCat(String productCat) {
		return pd.findCheapestProductInCat(productCat);
	}

	@Override
	public List<Product> findExpiredProducts() {
		return pd.findExpiredProducts();
	}

	@Override
	public void updateProduct(int productId, double price) {
		pd.updateProduct(productId, price);
	}

}
