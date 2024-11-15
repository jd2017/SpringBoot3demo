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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

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
