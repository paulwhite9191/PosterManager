package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.poster.PurchaseItem;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class MovieManager {
    private PurchaseItem[] items = new PurchaseItem[0];
    private int movieQuantity;

    public MovieManager(int movieQuantity) {
        this.movieQuantity = movieQuantity;
    }

    public void add(PurchaseItem item) {
        int resultLength = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[resultLength];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PurchaseItem[] getFindAll() {

        PurchaseItem[] result = new PurchaseItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public PurchaseItem[] getFindLast() {
        int resultLength = movieQuantity;
        if (resultLength > items.length) {
            resultLength = items.length;
        }

        PurchaseItem[] result = new PurchaseItem[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}