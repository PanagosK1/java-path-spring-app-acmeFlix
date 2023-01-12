package gr.codelearn.spring.app.transfer;

import java.math.BigDecimal;

public interface PurchasesAndCostPerCustomerCategoryDto {
	String getCategory();

	Long getPurchases();

	BigDecimal getCost();
}
