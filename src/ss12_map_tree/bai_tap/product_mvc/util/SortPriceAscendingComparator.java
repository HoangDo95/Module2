package ss12_map_tree.bai_tap.product_mvc.util;

import ss12_map_tree.bai_tap.product_mvc.model.Products;

import java.util.Comparator;

public class SortPriceAscendingComparator implements Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }

}
