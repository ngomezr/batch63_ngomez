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
public class ProductRepoImpl implements ProductRepo {
	
	@Override
	public void addNewProduct(Product product) {
		InsertProduct inP = new InsertProduct();
		inP.insertProduct(product.getPid(), product.getPname(),
				product.getPcat(), product.getManufacture_date(),
				product.getPrice(), product.getExpiry_date());
	}

	@Override
	public void deleteProductById(int productId) {
		DeleteProduct dp = new DeleteProduct();
		dp.deleteProductById(productId);
	}

	@Override
	public void deleteProductByCat(String productCat) {
		DeleteProduct dp = new DeleteProduct();
		dp.deleteProductByCat(productCat);
	}

	@Override
	public Product findProductById(int productId) {
		FindProduct fp = new FindProduct();
		return fp.findProductById(productId);
	}

	@Override
	public List<Product> findProductByCat(String productCat) {
		FindProduct fp = new FindProduct();
		return fp.findProductByCategory(productCat);
	}

	@Override
	public Product findCheapestProductInCat(String productCat) {
		FindProduct fp = new FindProduct();
		return fp.findCheapestProductByCat(productCat);
	}
	
	@Override
	public List<Product> findExpiredProducts() {
		FindProduct fp = new FindProduct();
		return fp.findExpiredProducts();
	}

	@Override
	public void updateProduct(int productId, double price) {
		UpdateProduct up = new UpdateProduct();
		up.updateProductPrice(productId, price);
	}
}
