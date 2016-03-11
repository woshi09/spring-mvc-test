package com.spring.test.controller;

import com.alibaba.fastjson.JSON;
import com.spring.test.model.Person;
import com.spring.test.model.WmPoiShippingInfoVo;
import com.spring.test.model.WmPoiSpArea;
import com.spring.test.service.HelloService;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by xinyuangui on 15/8/22.
 */
@Controller
@RequestMapping("/service/hello")
public class HelloController {
    @Autowired
    HelloService helloService;


    @RequestMapping(value = "submit", method = RequestMethod.POST)
    public Object submit(@RequestParam("name") String name, Model model) {
        Person person = new Person();
        person.setName(name);
        person.setAge("18");
        person.setSex("男");
        model.addAttribute("person", person);
        return "person/result";
    }

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public Object test(InputStream in) {
        WmPoiShippingInfoVo shippingInfo = null;
        byte[] bs;
        try {
            bs = IOUtils.toByteArray(in);
            String json = new String(bs, "UTF-8");
            json = json.replaceAll("\\t", "");
            shippingInfo = JSON.parseObject(json, WmPoiShippingInfoVo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return shippingInfo;
    }

    public static void main(String[] args) {
        WmPoiShippingInfoVo wmPoiShippingInfoVo = new WmPoiShippingInfoVo();
        wmPoiShippingInfoVo.setLatitude(1000l);
        wmPoiShippingInfoVo.setLongitude(2000l);
        wmPoiShippingInfoVo.setWm_poi_id(333l);
        List<WmPoiShippingInfoVo.WmPoiSpScheme> list = new ArrayList<WmPoiShippingInfoVo.WmPoiSpScheme>();

        List<WmPoiSpArea> list2 = new ArrayList<WmPoiSpArea>();
        WmPoiSpArea wmPoiSpArea = new WmPoiSpArea();
        wmPoiSpArea.setType(2);
        wmPoiSpArea.setCtime(444);
        wmPoiSpArea.setMax_lng(333);
        wmPoiSpArea.setShipping_fee(3333);


        WmPoiSpArea wmPoiSpArea2 = new WmPoiSpArea();
        wmPoiSpArea2.setType(2);
        wmPoiSpArea2.setCtime(444);
        wmPoiSpArea2.setMax_lng(333);
        wmPoiSpArea2.setShipping_fee(3333);

        list2.add(wmPoiSpArea);
        list2.add(wmPoiSpArea2);


        WmPoiShippingInfoVo.WmPoiSpScheme wmPoiSpScheme = new WmPoiShippingInfoVo.WmPoiSpScheme();
        wmPoiSpScheme.setName("aaa");
        wmPoiSpScheme.setWmPoiSpAreas(list2);

        list.add(wmPoiSpScheme);

        wmPoiShippingInfoVo.setWmPoiSpSchemes(list);


        System.out.println(JSON.toJSON(wmPoiShippingInfoVo));
        try {
            HttpPost request = new HttpPost("http://localhost:8080/service/hello/search");
            StringEntity se = new StringEntity(JSON.toJSON(wmPoiShippingInfoVo).toString());
            request.setEntity(se);
            HttpResponse httpResponse = new DefaultHttpClient().execute(request);
            EntityUtils.toString(httpResponse.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
