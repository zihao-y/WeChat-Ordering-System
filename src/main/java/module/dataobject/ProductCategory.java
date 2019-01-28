package module.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Category
 * Created by Zihao
 */

@Entity
@DynamicUpdate
@Data
//@Table(name = "product_category")
public class ProductCategory {

    /** Category id. */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** Category name. */
    private String categoryName;

    /** Category type. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
