package com.ceying.tools.util.websocket;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * websocket 服务端
 *
 * @author huanghaiyun
 * @createTime 2017年9月11日
 */
@Service
public class WebSocketService extends WebSocketServer {

    private static final Logger LOG = LoggerFactory.getLogger(WebSocketService.class);
    private List<WebSocket> list=new ArrayList<>();
    @Autowired
    public WebSocketService() {
        super(new InetSocketAddress(8089));//参数是 websocket服务的端口号
        this.start();
    }

    @Override
    public void onClose(WebSocket webScoket, int arg1, String arg2, boolean arg3) {
        LOG.debug("onClose:" + webScoket);
        list.remove(webScoket);
    }

    @Override
    public void onError(WebSocket webScoket, Exception e) {
        LOG.error("onError:", e);
    }

    @Override
    public void onMessage(WebSocket webScoket, String data) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onOpen(WebSocket webScoket, ClientHandshake arg1) {
        list.add(webScoket);
        LOG.info("onOpen:" + webScoket);
    }

    /**
     * @description 发送webSocket
     *
     * @author Meow
     * @date 2018-7-11
     * @param [msg]
     * @return void
     */
    public void sendSuccess(String msg){
        for (WebSocket webSocket:list){
            Map<String,String> map = new HashMap<>();
            map.put("type","true");
            map.put("result",msg);
            webSocket.send(JSONObject.toJSONString(map));
        }
    }

    /**
     * @description 发送webSocket
     *
     * @author Meow
     * @date 2018-7-11
     * @param [msg]
     * @return void
     */
    public void sendError(String msg){
        for (WebSocket webSocket:list){
            Map<String,String> map = new HashMap<>();
            map.put("type","false");
            map.put("result",msg);
            webSocket.send(JSONObject.toJSONString(map));
        }
    }

    /**
     * @description 发送webSocket
     *
     * @author Meow
     * @date 2018-7-11
     * @param [msg]
     * @return void
     */
    public void sendComments(String msg){
        for (WebSocket webSocket:list){
            Map<String,String> map = new HashMap<>();
            map.put("type","comments");
            map.put("result",msg);
            webSocket.send(JSONObject.toJSONString(map));
        }
    }
}
