/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.client.back;



import com.blinderjay.BBS.grpc.Con.BBS_ConGrpc;
import com.blinderjay.BBS.grpc.Con.bbsCookie;
import com.blinderjay.BBS.grpc.Con.userinfoReply;
import com.blinderjay.BBS.grpc.Con.userinfoReq;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author blinderjay
 */
public class GrpcService {
    private final ManagedChannel channel;
    private BBS_ConGrpc.BBS_ConBlockingStub blockingStub;

    /**
     * Construct client connecting to HelloWorld server at {@code host:port}.
     */
    public GrpcService(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build());

    }

    /**
     * Construct client for accessing HelloWorld server using the existing
     * channel.
     */
    GrpcService(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = BBS_ConGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    /**
     * Say hello to server.
     */
    public void req() {
        bbsCookie cookie = bbsCookie.newBuilder().setName("1").setValue("2").build();
        userinfoReq request = userinfoReq.newBuilder().setCookie(cookie).build();
userinfoReply response;
        try {
            response = blockingStub.getinfo(request);
            String email = response.getEmail();
            String Des = response.getDes();
            System.out.println(response.getEmail()+ response.getDes());

        } catch (Exception e) {
            System.err.print("err");
        }
    }

    /**
     * Greet server. If provided, the first element of {@code args} is the name
     * to use in the greeting.
     */
    public static void main(String[] args) throws Exception {
        
        GrpcService client = new GrpcService("127.0.0.1", 8888);
        try {
            /* Access a service running on the local machine on port 50051 */

            client.req();
        } finally {
            System.out.println("finished");
            client.shutdown();
        }

        
    }
}
