package ru.netology.poster;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PurchaseItem {
    private int id;
    private String urlMovie;
    private String nameMovie;
    private String genreMovie;
}