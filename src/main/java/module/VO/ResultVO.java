package module.VO;

import lombok.Data;

/**
 * The outer object returned after the http request
 * Created by Zihao
 */

@Data
public class ResultVO<T> {

    /** Error code. */
    private Integer code;

    /** Message. */
    private String msg;

    /** Data. */
    private T data;
}
