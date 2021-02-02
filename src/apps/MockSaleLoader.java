package apps;

import model.Sale;
import view.SaleLoader;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MockSaleLoader implements SaleLoader {
    @Override
    public List<Sale> load() {
        List<Sale> list = new ArrayList<>();
        list.add(new Sale("Puja 1","Esta es la puja 1", LocalDateTime.now()));
        list.add(new Sale("Puja 2","Esta es la puja 2", LocalDateTime.now()));
        list.add(new Sale("Puja 3","Esta es la puja 3", LocalDateTime.now()));
        return list;
    }
}
