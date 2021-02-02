package apps;

import model.BidUser;
import view.UserLoader;

import java.util.ArrayList;
import java.util.List;

public class MockUserLoader implements UserLoader {
    @Override
    public List<BidUser> load() {
        List<BidUser> list = new ArrayList<>();
        list.add(new BidUser("Joaquin"));
        list.add(new BidUser("Jose Juan"));
        list.add(new BidUser("Pablo"));
        return list;
    }
}
