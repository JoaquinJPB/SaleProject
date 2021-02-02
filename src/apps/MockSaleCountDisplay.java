package apps;

import model.Sale;
import view.SaleCountDisplay;

import java.util.List;

public class MockSaleCountDisplay implements SaleCountDisplay {

    private List<Sale> saleList;

    @Override
    public void display(List<Sale> saleList) {
        this.saleList = saleList;
        for (Sale sale : saleList) {
            System.out.println(sale);
        }
    }
}
