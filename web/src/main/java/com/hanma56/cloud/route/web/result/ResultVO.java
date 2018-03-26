package com.hanma56.cloud.route.web.result;

import java.io.Serializable;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by ZhangZhong on 2017/5/6.
 */
@Api(value = "ResultVO", description = "通用返回结果模型")
public class ResultVO<T> implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1475348231900998033L;
    @ApiModelProperty(value = "状态码")
    private int               code;

    @ApiModelProperty(value = "请求成功与否,true:成功,false:失败")
    private boolean           success;

    @ApiModelProperty(value = "提示信息")
    private String            message;

    @ApiModelProperty(value = "返回业务数据")
    private T                 result;


    public ResultVO(boolean isSuccess, int code, String message) {
        this.success = isSuccess;
        this.code = code;
        this.message = message;
    }

    public static ResultVO success() {
        return new ResultVO(true, 200, "操作成功!");
    }

    public static ResultVO success(Object data) {
        ResultVO result = new ResultVO(true, 200, "操作成功!");
        result.setResult(data);
        return result;
    }

    public static ResultVO error(String message) {
        ResultVO result = new ResultVO(true, 500, message);
        return result;
    }

    public static ResultVO error(String message, int code) {
        ResultVO result = new ResultVO(true, code, message);
        result.setCode(code);
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
