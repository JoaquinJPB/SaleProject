package apps;

import control.MonitorSaleCommand;
import view.SaleCountDisplay;
import view.SaleLoader;
import view.UserLoader;
import view.UserSaleActive;

public class Main {

    private final SaleCountDisplay saleCountDisplay;
    private final SaleLoader saleLoader;
    private final UserLoader userLoader;
    private final UserSaleActive userSaleActive;

    public Main() {
        saleCountDisplay = new MockSaleCountDisplay();
        saleLoader = new MockSaleLoader();
        userLoader = new MockUserLoader();
        userSaleActive = new MockUserSaleActive();
    }

    public static void main(String[] args){
        new Main().execute();
    }

    private void execute(){
        new MonitorSaleCommand(saleCountDisplay,saleLoader,userLoader,userSaleActive);
    }

}
