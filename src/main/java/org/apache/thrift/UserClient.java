package org.apache.thrift;

import org.apache.thrift.generated.UserNotFound;
import org.apache.thrift.generated.UserService;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class UserClient {

    public static void main(String[] ars) {
        String address = "localhost";
        int clientTimeout = 1000;
        TTransport transport = new TFramedTransport(new TSocket(address, Constant.PORT, clientTimeout));
        TProtocol protocol = new TCompactProtocol(transport);
        UserService.Client client = new UserService.Client(protocol);
        try {
            transport.open();
            System.out.println(client.getUserByName("user1"));
            System.out.println(client.getUserByName("user2"));
        } catch (TApplicationException e) {
            System.out.println(e.getMessage() + " " + e.getType());
        } catch (TTransportException e) {
            System.out.println(e.getMessage() + " " + e.getType());
        } catch (UserNotFound e) {
            System.out.println(e.getMessage());
        } catch (TException e) {
            System.out.println(e.getMessage());
        } finally {
            transport.close();
        }
    }
}