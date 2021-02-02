package apps;

import model.BidUser;
import model.Sale;
import view.SaleCountDisplay;

import java.util.Iterator;
import java.util.Map;

public class MockSaleCountDisplay implements SaleCountDisplay {

    @Override
    public void display(Map<BidUser, Sale> activeSales) {
        Iterator it = activeSales.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
