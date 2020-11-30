package com.zxf.demo;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.amazonaws.services.sns.model.SubscribeRequest;

public class SnsTest {
    public static void main(String[] args) {
        AmazonSNS snsClient = AmazonSNSClientBuilder.standard().withRegion("us-east-1").build();

//        SubscribeRequest subscribeRequest = new SubscribeRequest()
//                .withProtocol("email")
//                .withEndpoint("1204229457@qq.com")
//                .withReturnSubscriptionArn(true)
//                .withTopicArn("arn:aws:sns:us-east-1:836236936822:my-topic");
//
//        snsClient.subscribe(subscribeRequest);
//
//        System.out.println("===========================================");
//        System.out.println("===========================================");

        PublishRequest publishRequest =new PublishRequest().withTopicArn("arn:aws:sns:us-east-1:836236936822:new-blog-default").withMessage("hi ,Zhou Peng, how are you?💕💕💕 ");
        PublishResult publish = snsClient.publish(publishRequest);
        System.out.println(publish);

//        System.out.println("===========================================");
//        System.out.println("===========================================");
    }
}
