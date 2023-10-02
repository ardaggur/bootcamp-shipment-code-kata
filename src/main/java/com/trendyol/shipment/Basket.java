package com.trendyol.shipment;

import java.util.*;

public class Basket {
    Integer threshold_value = 3;
    private List<Product> products;
    public ShipmentSize getShipmentSize() {
        if (products.size() < threshold_value) {
            return findLargestSize(products);
        } else {
            Map<ShipmentSize, Integer> sizeCountMap = countSizes();
            ShipmentSize mostCommonSize = findMostCommonSize(sizeCountMap);

            if (sizeCountMap.getOrDefault(mostCommonSize, 0) >= threshold_value) {
                return getUpperSize(mostCommonSize);
            } else {
                return findLargestSize(products);
            }
        }
    }
    private Map<ShipmentSize, Integer> countSizes() {
        Map<ShipmentSize, Integer> sizeCountMap = new HashMap<>();
        for (Product product : products) {
            ShipmentSize size = product.getSize();
            sizeCountMap.put(size, sizeCountMap.getOrDefault(size, 0) + 1);
        }
        return sizeCountMap;
    }
    private ShipmentSize findMostCommonSize(Map<ShipmentSize, Integer> sizeCountMap) {
        return Collections.max(sizeCountMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
    private ShipmentSize getUpperSize(ShipmentSize size) {
        switch (size) {
            case SMALL:
                return ShipmentSize.MEDIUM;
            case MEDIUM:
                return ShipmentSize.LARGE;
            case LARGE:
                return ShipmentSize.X_LARGE;
            case X_LARGE:
                return ShipmentSize.X_LARGE;
            default:
                return size;
        }
    }
    private ShipmentSize findLargestSize(List<Product> products) {

        return products.stream()
                .map(Product::getSize)
                .max(Comparator.naturalOrder())
                .orElse(ShipmentSize.SMALL);
    }

    public List<Product> getProducts() {return products;}

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}





