package UR_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Composite implements Products {

    private List<Products> products = new ArrayList<>();

    public void addProduct(Products product) {
        products.add(product);
    }

    public void removeProduct(Products product) { // Исправлено: Products вместо Product
        products.remove(product);
    }

    @Override
    public void writeDown() {
        for (Products product : products) {
            product.writeDown();
        }
    }

    @Override
    public Long getSum() {
        AtomicReference<Long> result = new AtomicReference<>(0L);
        products.forEach(iProduct -> {
            result.updateAndGet(v -> v + iProduct.getSum()); // Исправлено: updateAndGet вместо set
        });
        return result.get();
    }
}
