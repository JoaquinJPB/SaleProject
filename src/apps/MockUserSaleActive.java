package apps;

import view.UserSaleActive;

public class MockUserSaleActive implements UserSaleActive {

    @Override
    public void active() {
        System.out.println("Subastas iniciadas");
    }
}
