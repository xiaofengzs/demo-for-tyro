//package com.zxf.demofortyro;
//
//import com.amazonaws.services.sqs.AmazonSQS;
//import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
//import com.amazonaws.services.sqs.model.Message;
//import com.amazonaws.services.sqs.model.SendMessageRequest;
//
//import java.sql.SQLOutput;
//import java.util.List;
//
//public class SqsTest {
//    public static void main(String[] args) {
//      final AmazonSQS amazonSQS= AmazonSQSClientBuilder.standard().withRegion("us-east-1").build();
//
//        System.out.println("===============================================");
//        System.out.println("Getting Started with Amazon SQS 标准 Queues");
//        System.out.println("===============================================\n");
//
//        try {
//            String url = "https://sqs.us-east-1.amazonaws.com/836236936822/terraform-example-queue";
//            SendMessageRequest request = new SendMessageRequest()
//                    .withQueueUrl(url)
//                    .withMessageBody("hello world")
//                    .withDelaySeconds(5);
//            amazonSQS.sendMessage(request);
//            System.out.println("==========================================");
//            List<Message> messages = amazonSQS.receiveMessage(url).getMessages();
//            System.out.println(messages.size());
//            System.out.println(messages.get(0).getBody());
//
//            amazonSQS.deleteMessage(url, messages.get(0).getReceiptHandle());
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}
