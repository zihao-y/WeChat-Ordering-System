package module.service;

import module.dataobject.ProductCategory;

import java.util.List;

/**
 * Category
 * Created by Zihao
 */

public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
