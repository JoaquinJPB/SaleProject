package control;

import model.BidUser;
import model.Sale;
import view.SaleCountDisplay;
import view.SaleLoader;
import view.UserLoader;
import view.UserSaleActive;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MonitorSaleCommand implements Command {

    private final SaleCountDisplay saleCountDisplay;
    private final SaleLoader saleLoader;
    private final UserLoader userLoader;
    private final UserSaleActive userSaleActive;
    private final Map<BidUser,Sale> activeSales;
    private List<BidUser> userList;
    private List<Sale> saleList;

    public MonitorSaleCommand(SaleCountDisplay saleCountDisplay, SaleLoader saleLoader, UserLoader userLoader, UserSaleActive userSaleActive) {
        this.saleCountDisplay = saleCountDisplay;
        this.saleLoader = saleLoader;
        this.userLoader = userLoader;
        this.userSaleActive = userSaleActive;
        activeSales = new HashMap<>();
        userSaleActive.active();
        saleActive();
        execute();
    }

    private void saleActive() {
        userList = userLoader.load();
        saleList = saleLoader.load();
        int i = 0;
        for (BidUser user: userList) {
                saleList.get(i).setBid(saleList.get(i).getBid() + 1);
                activeSales.put(user,saleList.get(i));
                i++;
        }
    }

    @Override
    public void execute() {
        Iterator it = activeSales.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

}
