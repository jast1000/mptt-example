package com.servehttp.janiserver.mttp.transformers;

import com.servehttp.janiserver.mttp.model.Category;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesus Sanchez
 */
public class MTTPTransformer {
    
    public static List<Category> transform(List<Category> categories) {
        //Add id
        int i = 1;
        for (Category c : categories) {
            c.setId(i); i++;
        }

        //Calculate left
        categories.stream().reduce(new Category("", 0), (lastCategory, category) -> {
            int dif = Math.abs((category.getLevel() - lastCategory.getLevel()) - 2);
            category.setLeftIndex((lastCategory.getLeftIndex() == null ? 0 : lastCategory.getLeftIndex()) + dif);
            return category;
        });

        //calculate right
        categories.stream().forEach(category -> {
            List<Category> filterCategories = new ArrayList<>();
            try {
                categories.stream().forEach(cat -> {
                    if (cat.getId() <= category.getId()) {
                        return;
                    }
                    if (cat.getLevel() <= category.getLevel()) {
                        throw new RuntimeException();
                    }
                    filterCategories.add(cat);
                });
            } catch (Exception ex) { }
            category.setRightIndex(category.getLeftIndex() + (filterCategories.size() * 2) + 1);
        });
        return categories;
    }
    
}
