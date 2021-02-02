package view;

import model.BidUser;
import model.Sale;

import java.util.Map;

public interface SaleCountDisplay {
    void display(Map<BidUser,Sale> saleList);
}
