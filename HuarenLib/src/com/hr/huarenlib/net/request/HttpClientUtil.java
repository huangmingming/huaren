package com.hr.huarenlib.net.request;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

import android.util.Log;


/**
 * @auto ysp
 * http请求工具
 **/
public class HttpClientUtil {
    /**
     * 连接超时
     */
    public static final int CONNECTION_TIME_OUT = 1000 * 30;
    /**
     * 响应超时
     */
    public static final int SO_TIMEOUT = 1000 * 30;

    /**
     * 发起�?个post请求,包含文件上传,并返回服务器返回的字符串
     *
     * @param url      本次请求的URL路径
     * @param map      请求的参�?,该Map集合中Value值只会取两种类型,String & File<br>
     *                 <B>注意:</B><br>
     *                 <li>1. 如果Value不是File类型,则会调用Value.toString(),如果你保存的是个POJO对象的话,请重写toString()<br>
     *                 <li>2. 如果Value是File类型,并且文件不存在的�?,会抛�? FileNotFoundException 异常<br>
     * @param encoding 请求和接收字符串的编�? 格式,如果因为编码不正�?,则会默认使用UTF-8进行编码
     * @return 返回请求的结果字符串
     * @throws Exception 可能抛出多种网络或IO异常
     */
    public static String post(String url, Map<String, Object> map, String encoding) throws Exception {
        HttpParams params = new BasicHttpParams();                                                //实例化Post参数对象
        HttpConnectionParams.setConnectionTimeout(params, CONNECTION_TIME_OUT);                //设置请求超时
        HttpConnectionParams.setSoTimeout(params, SO_TIMEOUT);                                    //设置响应超时
        HttpClient client = new DefaultHttpClient(params);                                        //实例化一个连接对�?
        HttpPost post = new HttpPost(url);                                                        //根据Post参数,实例化一个Post对象
        MultipartEntity entity = new MultipartEntity();                                            //实例化请求实�?,请求正文
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {                                //迭代Map集合
                Object obj = entry.getValue();                                                    //获取集合中的�?
                ContentBody body = null;

                //*获取集合中的Value,如果当前的Value是File类型,则new �?个FileBody,如果是字符串类型,则new�?个StringBody
                //*并将该对象保存到请求实体�?

                if (obj != null) {
                    if (obj instanceof File) {
                        File file = (File) obj;
                        if (file.exists()) {
                            body = new FileBody(file);
                        } else {
                            throw new FileNotFoundException("File Not Found");
                        }
                    } else {
                        body = new StringBody(entry.getValue().toString(), Charset.forName(encoding));
                    }
                    entity.addPart(entry.getKey(), body);                                            //将正文保存到请求实体类中
                }
            }
        }

        post.setEntity(entity);                                                                    //将请求实体保存到Post的实体参数中
        try {
            HttpResponse response = client.execute(post);                                        //执行Post方法
            return EntityUtils.toString(response.getEntity(), encoding);                        //根据字符编码返回字符�?
        } catch (Exception e) {
            throw e;
        } finally {
            client.getConnectionManager().shutdown();                                            //释放连接�?有资�?
        }
    }

    /**
     * 发一起个Post请求,�?单的Text方式
     *
     * @param url        请求URL
     * @param parameters 请求参数
     * @param encoding   字符编码
     * @return
     * @throws Exception
     */
    public static String post(String url, List<NameValuePair> parameters, String encoding) throws Exception {
        BasicHttpParams httpParameters = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(httpParameters, CONNECTION_TIME_OUT);
        HttpConnectionParams.setSoTimeout(httpParameters, SO_TIMEOUT);
        HttpClient httpClient = new DefaultHttpClient(httpParameters);

        HttpPost post = new HttpPost(url);
        HttpResponse response;
        /**打印出URL*/
        url += "?";
        for (int i = 0; i < parameters.size(); i++) {
            url += parameters.get(i).getName() + "=" + parameters.get(i).getValue();
            if (i != parameters.size() - 1) {
                url += "&";
            }
        }
        //Log.d("NetHelper", url);
        try {
            UrlEncodedFormEntity encode = new UrlEncodedFormEntity(parameters, encoding);
            post.setEntity(encode);
            response = httpClient.execute(post);
            return EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            throw e;
        }
    }


    /**
     * 发一起个Post请求,�?单的Text方式,请求数据和返回数据均以UTF-8编码,
     *
     * @param url        请求URL
     * @param parameters 请求参数
     * @return Json格式字符�?
     * @throws Exception
     */
    public static String post(String url, List<NameValuePair> parameters) throws Exception {
        return post(url, parameters, "UTF-8");
    }

    /**
     * 发一起个Get请求,�?单的Text方式
     *
     * @param url 请求URL
     * @throws Exception
     */
    public static String get(String url) throws Exception {
        BasicHttpParams httpParameters = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(httpParameters, CONNECTION_TIME_OUT);
        HttpConnectionParams.setSoTimeout(httpParameters, SO_TIMEOUT);
        HttpClient httpClient = new DefaultHttpClient(httpParameters);
        HttpGet get = new HttpGet(url);
        HttpResponse response;
        try {
            response = httpClient.execute(get);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                return EntityUtils.toString(response.getEntity());
            }
            return "";
        } catch (Exception e) {
            throw e;
        }
    }
}
