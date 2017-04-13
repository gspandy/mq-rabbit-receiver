package com.ymatou.mq.rabbit.receiver.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * rabbit监听(如channel等)timer start
 * Created by zhangzhihua on 2017/3/31.
 */
@Component
public class RabbitMonitorTaskTimer {

    private static final Logger logger = LoggerFactory.getLogger(RabbitMonitorTask.class);

    @Autowired
    private RabbitMonitorTask channelMonitorTask;

    @PostConstruct
    public void init(){
        //FIXME: 为什么要try/catch??
        /*
        try {
            Timer timer = new Timer(true);
            timer.schedule(channelMonitorTask, 0, 1000 * 10);
            logger.info("monitor channel timer started.");
        } catch (Exception e) {
            logger.error("schedule error.",e);
        }
        */
    }
}
