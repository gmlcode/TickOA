package com.qfedu.test;

import com.qfedu.common.util.EncrypUtil;


public class MyTest {
    public static void main(String[] args) throws Exception {
//        HttpURLConnection huc= (HttpURLConnection) new URL("http://ip.chinaz.com/getip.aspx").openConnection();
//        huc.connect();
//        if(huc.getResponseCode()==200){
//            BufferedReader reader=new BufferedReader(new InputStreamReader(huc.getInputStream()));
//            StringBuffer buffer=new StringBuffer();
//            String msg;
//            while ((msg=reader.readLine())!=null){
//                buffer.append(msg);
//            }
//            System.out.println(buffer.toString());
//        }
        //3259d07fb6d7ef3215ec71e9a2f93ae5
        System.out.println(EncrypUtil.md5Pass("admin"));
        //8dbbb6c55ecd2a1d98d1f4749157bd30
        System.out.println(EncrypUtil.md5Pass("123456"));
    }
}
