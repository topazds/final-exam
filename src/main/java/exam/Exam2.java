package exam;

import java.util.ArrayList;
import java.util.List;

public class Exam2 {
	private List<String> product = new ArrayList<String>();
	private int[] countProduct = { 0, 0, 0, 0, 0 };
	private int dynamicCount;

	public void productASell() {
		countProduct[0]++;
		setDynamic(0);
	}

	public void productBSell() {
		countProduct[1]++;
		setDynamic(1);
	}

	public void productCSell() {
		countProduct[2]++;
		setDynamic(2);
	}

	public void productDSell() {
		countProduct[3]++;
		setDynamic(3);
	}

	public void productESell() {
		countProduct[4]++;
		setDynamic(4);
	}

	public int processPrice() {
		// initialProduct();
		double price[] = { 0, 0, 0, 0, 0 };
		int total = 0;
		int totalproduct = 0;
		for (int i = 0; i < countProduct.length; i++) {
			totalproduct += countProduct[i];
			if (countProduct[i] == 1) {
				price[i] = 100 * countProduct[i];
			}
			if (countProduct[i] == 2) {
				price[i] = (100 * countProduct[i]);
			}
			if (countProduct[i] == 3) {
				price[i] = (100 * countProduct[i]);
			}
			if (countProduct[i] == 4) {
				price[i] = (100 * countProduct[i]);
			}
			if (countProduct[i] == 5) {
				price[i] = (100 * countProduct[i]);
			}
			total += price[i];
		}
		if (dynamicCount > 1) {
			if (totalproduct == 2) {
				total = (int) (total * 0.95);
			} else if (totalproduct == 3) {
				total = (int) (total * 0.9);
			} else if (totalproduct == 4) {
				total = (int) (total * 0.8);
			} else if (totalproduct == 5) {
				total = (int) (total * 0.85);
			}
		}

		return total;
	}

	public List<String> initialProduct() {
		product.add("สินค้า A");
		product.add("สินค้า B");
		product.add("สินค้า C");
		product.add("สินค้า D");
		product.add("สินค้า E");
		return product;
	}

	public void setDynamic(int index) {
		if (countProduct[index] == 1) {
			dynamicCount++;
		}
	}
}
