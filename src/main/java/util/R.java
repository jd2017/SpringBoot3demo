package util;
import lombok.Data;
import java.io.Serializable;
import java.util.HashMap;

@Data
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private int code;
    private String message;
    private T data;


    public R() {}
    public static <T> R<T> ok(){
        R<T> r = new R<>();
        r.setMessage("成功");
        return r;
    }

    public static <T> R<T> error(){
        R<T> r = new R<>();
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        r.setData((T)new HashMap<>());
        return r;
    }

    public R<T> message(String message){
        this.setMessage(message);
        return this;
    }

    public R<T> code(Integer code){
        this.setCode(code);
        return this;
    }


    public R<T> data(T value){
        this.setData(value);
        return this;
    }
}
