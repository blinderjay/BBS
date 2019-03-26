/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blinderjay.BBS.client.util;

import io.grpc.CallOptions;
import io.grpc.ClientCall;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.MethodDescriptor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author blinderjay
 */
public class bbsChannel {

    static ManagedChannel channel;
    private static String Address = "127.0.0.1";
    private static int Port = 8888;

    public static ManagedChannel getdefault() {
        channel = ManagedChannelBuilder.forAddress(Address, Port).usePlaintext().build();
        return channel;
    }

    public static void rebuid(String address, int port) {
        Address = address;
        Port = port;
        channel = ManagedChannelBuilder.forAddress(address, port).usePlaintext().build();
    }

    public static void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public static void shutdown(int timeout, TimeUnit tu) throws InterruptedException {

        channel.shutdown().awaitTermination(timeout, tu);
    }

    public static ManagedChannel getchannel() {
        if (channel == null) {
            return getdefault();
        } else if (channel.isShutdown()) {
               channel = ManagedChannelBuilder.forAddress(Address, Port).usePlaintext().build();
//            channel.resetConnectBackoff();
        }
        return channel;
    }

}
