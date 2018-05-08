package product.service;

import java.util.List;

public interface ProductService {
	List<Product> findProductList();
	List<ProductInfo> findProductInfo(String productId);
	void addProduct(String productId,String productInfoId);
	void removeProduct(String productId,String productInfoId);
	String addTotalPrice();
	OrderJudge getOrderJudge(String productId);
	void addProductQuestion(String fcUserId,String productInfoId ,String content);
	ProductQuestion getProQuestion(String fcUserId,String productInfoId);
	void addOrder();
	List<ProOrder> findFreeOrderList(String fcUserId);
	List<ProOrder> findFreeOrderList();
	List<ProOrder> findOrderList(String fcUserId);
	List<ProOrder> findOrderList();
	ProOrder getOrder(String proOrderId);
}
