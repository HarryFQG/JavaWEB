package study.jms;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;
import study.service.MailService;

import javax.jms.Destination;


/**
 * 短信验证的生产者
 * @author fengqigui
 * @Date 2017/12/28 21:24
 */
@Component("smsProcessor")
public class SmsProcessor {

    /*直接注入*/
    /*@Autowired
    private JmsMessagingTemplate jms;*/

    @Autowired
    private MailService mailService;


    /**
     * 生产者用于生产消息
     * @param destination
     * @param message
     */
    public void sendSmsToQueue(Destination destination, final String message){
        //jms.convertAndSend( destination, message);
    }

    /**
     * 消费者,队列的监听者
     * 监听的队列是：sms.queue
     */
    @JmsListener(destination = "sms.queue")
    public void doSendSmsMessage() {

        mailService.sendInlineResourceMail("228463110@qq.com", "微微一笑很倾城", "你猜这是谁？", "C:\\Users\\fengqigui\\Desktop\\12.jpg", "12.jpg", "" +  ".jpg");
    }

}
