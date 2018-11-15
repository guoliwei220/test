package com.chngc.common;

import java.io.Serializable;
import java.util.Map;

public class ResponseResult<T> implements Serializable {
    private static final long serialVersionUID = 7537941823440286434L;
    private String code;
    private String msg;
    private Object data;

    public ResponseResult() {
    }

    public ResponseResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseResult(String code, String msg, Map data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if(o == this) {
            return true;
        } else if(!(o instanceof ResponseResult)) {
            return false;
        } else {
            ResponseResult other = (ResponseResult)o;
            if(!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    String this$code = this.getCode();
                    String other$code = other.getCode();
                    if(this$code == null) {
                        if(other$code == null) {
                            break label47;
                        }
                    } else if(this$code.equals(other$code)) {
                        break label47;
                    }

                    return false;
                }

                String this$msg = this.getMsg();
                String other$msg = other.getMsg();
                if(this$msg == null) {
                    if(other$msg != null) {
                        return false;
                    }
                } else if(!this$msg.equals(other$msg)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if(this$data == null) {
                    if(other$data != null) {
                        return false;
                    }
                } else if(!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ResponseResult;
    }

    public int hashCode() {
        boolean PRIME = true;
        byte result = 1;
        String $code = this.getCode();
        int result1 = result * 59 + ($code == null?43:$code.hashCode());
        String $msg = this.getMsg();
        result1 = result1 * 59 + ($msg == null?43:$msg.hashCode());
        Object $data = this.getData();
        result1 = result1 * 59 + ($data == null?43:$data.hashCode());
        return result1;
    }

    public String toString() {
        return "ResponseResult(code=" + this.getCode() + ", msg=" + this.getMsg() + ", data=" + this.getData() + ")";
    }

}