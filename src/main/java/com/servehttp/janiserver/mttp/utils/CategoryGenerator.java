package com.servehttp.janiserver.mttp.utils;

import com.servehttp.janiserver.mttp.model.Category;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jesus Sanchez
 */
public class CategoryGenerator {
    
    public static List<Category> createCategories() {
        return Arrays.asList(
                new Category("A", 1),
                new Category("B", 2),
                new Category("C", 2),
                new Category("D", 3),
                new Category("E", 3),
                new Category("E2", 4),
                new Category("F", 4),
                new Category("G", 2),
                new Category("H", 2),
                new Category("I", 3),
                new Category("J", 3),
                new Category("K", 4),
                new Category("L", 5)
        );
    }
        
}
