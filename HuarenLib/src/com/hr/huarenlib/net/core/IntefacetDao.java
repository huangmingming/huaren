package com.hr.huarenlib.net.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.hr.huarenlib.net.entity.ProductsEntity;
import com.hr.huarenlib.net.entity.ResultDesc;
import com.hr.huarenlib.net.request.HttpClientUtil;

import android.content.Context;


public class IntefacetDao extends BaseRemote {

    public IntefacetDao(Context context) {
        super(context);
    }

    /**
     * 登录 如果查询成功,ResultDesc.isSuccess() = true , ResultDesc.getData()返回的是user<br>
     * 如果查询失败,ResultDesc.isSuccess() = false,
     * ResultDesc.getDesc()返回的是错误的说�?ResultDesc.getCode()返回是错误代�?
     *
     * @return
     */
    public ResultDesc sendPost(String url, Map<String, String> map) {
        List<NameValuePair> parameters = new ArrayList<NameValuePair>(); // 创建表单
        for (String key : map.keySet()) {
            parameters.add(new BasicNameValuePair(key, map.get(key)));
        }
        ResultDesc resultDesc = getRemoteData(url, parameters);
        if (resultDesc.getStatus() == 0) { // 如果返回为成功状�?则对data数据进行下一步解�?
            String json = resultDesc.getData().toString();
//			User data = gson.fromJson(json, User.class); // 解析bean对象
            // List<User> data=gson.fromJson(json, new TypeToken<List<User>>()
            // {}.getType());//解析list集合
            resultDesc.setData(json); // 重新将集合设置进ResultData�?
        }
        return resultDesc;
    }

    public ProductsEntity getProducts(String url, Map<String, String> map) {
        List<NameValuePair> parameters = new ArrayList<NameValuePair>(); // 创建表单
        for (String key : map.keySet()) {
            parameters.add(new BasicNameValuePair(key, map.get(key)));
        }
        ProductsEntity resultEntity = null;
        String result = "";
        try {
            result = HttpClientUtil.post(url, parameters);
            resultEntity = gson.fromJson(result, ProductsEntity.class);
            //System.out.println("-----getProducts---------->"+result);
        } catch (Exception e) {
            resultEntity = new ProductsEntity();
            resultEntity.setMsg(ExceptionCode(e));
        }
        return resultEntity;

    }
}
