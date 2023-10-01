package org.example.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ClientHandler extends SimpleChannelInboundHandler<String > {
    protected void channelRead0(ChannelHandlerContext ctx, String msg) {
        System.out.println("SERVER: " + msg);
    }
}
