package module.form;

import lombok.Data;

/**
 * Created by Zihao
 */

@Data
public class CategoryForm {

    private Integer categoryId;

    /** Category name. */
    private String categoryName;

    /** Category type. */
    private Integer categoryType;
}
