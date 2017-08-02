package com.hr.huarenlib.net.core;

import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpException;
import org.apache.http.NameValuePair;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;

import com.google.gson.Gson;
import com.hr.huarenlib.R;
import com.hr.huarenlib.net.acition.BaseAction;
import com.hr.huarenlib.net.entity.ResultDesc;
import com.hr.huarenlib.net.request.HttpClientUtil;

import android.content.Context;
import android.util.Log;


/**
 * 该类用于接收 手机端与服务器端交互返回的数�?有三种请求方�?
 */
public class BaseRemote {

    /**
     * JSON解析�?
     */
    protected static Gson gson = new Gson();

    /**
     * 上下文对�?
     */
    protected Context context;

    /**
     * 版本�?
     */
    protected String versionCode;

    /**
     * 手机唯一�?
     */
    protected String phoneKey;

    /**
     * 构�?方法,必须传�?�?��上下文对象进�?
     *
     * @param context
     */
    public BaseRemote(Context context) {
        this.context = context;
    }

    // 处理网络异常
    public String ExceptionCode(Exception e) {
        if (e instanceof HttpException) {
            return context.getString(R.string.networkFailure); // 网络异常

        } else if (e instanceof SocketTimeoutException) {
            return context.getString(R.string.responseTimeout); // 响应超时

        } else if (e instanceof ConnectTimeoutException) {
            return context.getString(R.string.requestTimeout); // 请求超时

        } else if (e instanceof IOException) {
            return context.getString(R.string.networkError); // 网络异常

        } else if (e instanceof JSONException) {
            return context.getString(R.string.jsonError); // json格式转换异常

        } else if (e instanceof com.google.gson.JsonSyntaxException) {
            return context.getString(R.string.jsonError); // json格式转换异常

        } else {
            return context.getString(R.string.canNotGetConnected); // 无法连接网络
        }
    }

    /***
     * �?��普�?的请�?
     */
    public ResultDesc getRemoteData(String url) {
        ResultDesc resultDesc = new ResultDesc();
        try {
            String result = HttpClientUtil.get(url);
            resultDesc.setStatus(0);
            resultDesc.setMsg("");
        } catch (Exception e) {
            resultDesc.setStatus(1);
            resultDesc.setMsg(ExceptionCode(e));
        }
        return resultDesc;
    }

    /**
     * 发起�?��请求,并将结果解析为一个标准的响应实体�?纯文本参数请求方�?
     *
     * @return 如果在请求中发生了异�? 则resultDesc.getDesc()中包含了错误的信�?br>
     * 发如请求正常,resultDesc.getData() 返回了服务器返回的Json字符�?�?��进一步解�?
     */
    public ResultDesc getRemoteData(String url, List<NameValuePair> par) {
        List<NameValuePair> parameters = new ArrayList<NameValuePair>(); // 创建表单
        parameters
                .add(new BasicNameValuePair("version", BaseAction.versionCode)); // 请求公用的参数统�?��里添加，不需要每次在请求时添�?
        parameters.addAll(par);// 参数合并
        ResultDesc resultDesc = null;
        try {
            String result = HttpClientUtil.post(url, parameters);
            //Log.d("NetHelper", result);
            resultDesc = gson.fromJson(result, ResultDesc.class); // 将响应结果转换成标准格式,ResultDesc
            resultDesc.setData(result);
            if (resultDesc.getStatus() == 1) { // 如果服务端返回为false状�?,则表示数据处理异�?
                resultDesc.setMsg(resultDesc.getMsg()); // 匹配字符串中,服务器返回的代码,
            }
        } catch (Exception e) {
            resultDesc = new ResultDesc();
            resultDesc.setStatus(-1);
            resultDesc.setMsg(ExceptionCode(e)); // 如果处理数据当中发生了异�?则手动创建一个ResultDesc,并设置异常信�?
        }

        return resultDesc;
    }

    /**
     * 发起�?��请求,并将结果解析为一个标准的响应实体�?文本+文件的请求方�?
     *
     * @return 如果在请求中发生了异�? 则resultDesc.getDesc()中包含了错误的信�?br>
     * 发如请求正常,resultDesc.getData() 返回了服务器返回的Json字符�?�?��进一步解�?
     */
    public ResultDesc getRemoteFileData(String url, String fileUrl,
                                        Map<String, String> parMap) {
        Map<String, Object> map = new HashMap<String, Object>();
        File file = new File(fileUrl);
        map.put("file", file); // 将文件添加到map�?

        map.putAll(parMap);// 将请求参数添加到map�?
        ResultDesc resultDesc = null;
        try {
            String result = HttpClientUtil.post(url, map, "UTF-8"); // 发起HTTP
            // Post请求
            resultDesc = gson.fromJson(result, ResultDesc.class); // json解析
            // //将响应结果转换成标准格式,ResultDesc
            if (resultDesc.getStatus() == 1) { // 如果服务端返回为false状�?,则表示数据处理异�?
                resultDesc.setMsg(resultDesc.getMsg()); // 匹配字符串中,服务器返回的代码,
            }
        } catch (Exception e) {
            resultDesc = new ResultDesc();
            resultDesc.setMsg(ExceptionCode(e)); // 如果处理数据当中发生了异�?则手动创建一个ResultDesc,并设置异常信�?
        }
        return resultDesc;
    }

}
