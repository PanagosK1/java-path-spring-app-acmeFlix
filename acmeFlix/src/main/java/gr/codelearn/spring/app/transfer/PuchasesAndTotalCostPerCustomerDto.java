package gr.codelearn.spring.app.transfer;

import java.math.BigDecimal;

public interface PuchasesAndTotalCostPerCustomerDto {
	String getCustomerName();

	Integer getPurchases();

	BigDecimal getCost();

}
