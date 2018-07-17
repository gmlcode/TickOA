package com.qfedu.test;

import com.qfedu.common.util.HttpUtils;
import org.json.JSONObject;


public class MyIpTest {
    public static void main(String[] args) {
       String json=HttpUtils.getLocation("http://ip.chinaz.com/getip.aspx");
        System.out.println(new JSONObject(json).get("address"));
    }
}
