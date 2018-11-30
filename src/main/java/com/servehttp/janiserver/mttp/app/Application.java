package com.servehttp.janiserver.mttp.app;

import com.servehttp.janiserver.mttp.model.Category;
import com.servehttp.janiserver.mttp.transformers.MTTPTransformer;
import com.servehttp.janiserver.mttp.utils.CategoryGenerator;
import java.util.List;

/**
 *
 * @author Jesus Sanchez
 */
public class Application {

    public static void main(String[] args) {

        List<Category> categories = CategoryGenerator.createCategories();
        categories = MTTPTransformer.transform(categories);
        categories.forEach(c -> System.out.println(c.getName() + " - " + c.getLeftIndex() + " - " + c.getRightIndex()));
    }

}
