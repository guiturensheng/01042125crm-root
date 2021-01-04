package com.qy25.sm.common.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @Author: Aaron
 * @Date: 2021/1/4 21:46
 * @Description:
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxiosResult<T> {
    private int status;
    private String message;
    private T data;

    private AxiosResult(){

    }
    /*
    * 错误的返回
    * */
    public static <T> AxiosResult<T> error(){
        return setData(AxiosStatus.ERROR,null);
    }
    /*
    * 错误的返回  带自定义的状态码
    * */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus){
        return setData(axiosStatus,null);
    }
    /*
    * 错误的返回  带自定义的状态码
    * */
    public static <T> AxiosResult<T> error(T data){
        return setData(AxiosStatus.ERROR,data);
    }
    /*
    * 错误的返回  带自定义的状态码
    * */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus,T data){
        return setData(axiosStatus,data);
    }
    /*
     * 成功返回的方法
     * */
    public static <T> AxiosResult<T> success(){
        return setData(AxiosStatus.OK,null);
    }
    /*
     * 成功返回的方法  带数据
     * */
    public static <T> AxiosResult<T> success(T data){
        return setData(AxiosStatus.OK,data);
    }
    /*
     * 成功返回的方法  自定义状态码
     * */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus){
        return setData(axiosStatus,null);
    }

    /*
     * 成功返回的方法  自定义状态码
     * */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus,T data){
        return setData(axiosStatus,data);
    }
    /*
    * 封装数据公共方法
    * */
    private static <T> AxiosResult<T> setData(AxiosStatus axiosStatus,T data){
        AxiosResult<T> axiosResult = new AxiosResult<>();
        axiosResult.setData(data);
        axiosResult.setStatus(axiosStatus.getStatus());
        axiosResult.setMessage(axiosStatus.getMessage());
        return axiosResult;
    }


}
