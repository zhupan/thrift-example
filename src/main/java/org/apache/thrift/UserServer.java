package org.apache.thrift;

import org.apache.thrift.generated.UserService;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TTransportException;

public class UserServer {

    private final static int PORT = Constant.PORT;

    public static void main(String[] args) {
        try {
            TNonblockingServerSocket socket = new TNonblockingServerSocket(PORT);
            UserService.Processor processor = new UserService.Processor(new UserServiceHandler());
            THsHaServer.Args arg = new THsHaServer.Args(socket);
            arg.protocolFactory(new TCompactProtocol.Factory());
            arg.transportFactory(new TFramedTransport.Factory());
            arg.processorFactory(new TProcessorFactory(processor));
            System.out.println("Started Server, Port is " + PORT);
            new THsHaServer(arg).serve();
        } catch (TTransportException e) {
            System.out.println(e.getMessage());
        }

    }
}