package com.atguigu.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TaskComponent {

    // fixedDelay：距离上一次定时任务执行完毕后N毫秒再执行，
    // fixedRate：执行周期，执行频率
    //@Scheduled(fixedDelay = 3000)
    //@Scheduled(fixedRate = 3000)
    @Scheduled(cron = "0-20 * * * * *")
    public void myTask() throws InterruptedException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
        //Thread.sleep(5000);
    }

}
