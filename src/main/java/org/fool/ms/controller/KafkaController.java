package org.fool.ms.controller;

import org.fool.ms.consumer.MsConsumer;
import org.fool.ms.producer.MsProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 9/20/2017.
 */
@Controller
public class KafkaController {

    @Autowired
    private MsProducer producer;

    @Autowired
    private MsConsumer consumer;

    @GetMapping("/welcome")
    public String welcome() {
        return "kafka/welcome";
    }

    @GetMapping("/sendMessage")
    public String sendMessage(Model model) {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String now = sdf.format(date);

        model.addAttribute("time", now);

        return "kafka/send";
    }

    @PostMapping("/sendMessage")
    public String sendMessage(@RequestParam("msg") String msg) {
        producer.sendMessage(msg);

        return "kafka/welcome";
    }

    @GetMapping("/receive")
    public String receive(Model model) {
        String msg = consumer.receive();

        model.addAttribute("msg", msg);

        return "kafka/receive";
    }
}
