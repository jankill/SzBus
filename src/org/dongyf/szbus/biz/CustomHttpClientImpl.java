package org.dongyf.szbus.biz;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Created by Dongyf on 2014/10/18.
 */
public class CustomHttpClientImpl implements CustomHttpClient {

    /**
     * 1、线路，查询此线路的首末站，可以直接获取到线路的Code--->通过Code查询此线路公交车的状态（例如公交车到达哪一站了，什么时间到的） 例如：19路
     */
    private final String busUrl = "http://apis.juhe.cn/szbusline/bus?key=c8baa60764b604d148d89c400696345b&dtype=json&bus=19";

    /**
     * 2、站台，查询此站台的地理位置，可以直接获取站台Code 例如：综合保税区
     */
    private final String stationUrl = "http://apis.juhe.cn/szbusline/bus?key=c8baa60764b604d148d89c400696345b&station=综合保税区";

    /**
     * 3、站台代码，查询经过此站台的公交车的状态，可以获取线路Code--->通过Code查询此线路公交车的状态（例如公交车到达哪一站了，什么时间到的） 例如：AWE 园区综保区
     */
    private final String stationCodeUrl = "http://apis.juhe.cn/szbusline/bus?key=c8baa60764b604d148d89c400696345b&dtype=json&stationCode=AWE";
    /**
     * 线路编码查询公交车状态
     */
    private final String busLineUrl = "http://apis.juhe.cn/szbusline/bus?key=c8baa60764b604d148d89c400696345b&busline=edc1ecd6-2bf8-4b08-8727-385bb8943b9d&dtype=json";


    @Override
    public String GetJsonDataFormWebByHttpClient(String url, String urlParams, int type) {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpResponse httpResponse = null;
        HttpEntity httpEntity = null;
        String jsonContent = null;
        if (type == 0) {
        }
        HttpGet httpGet = new HttpGet(url);
        try {

            httpResponse = httpClient.execute(httpGet);
            httpEntity = httpResponse.getEntity();
            jsonContent = httpEntity.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
