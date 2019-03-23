
import com.blinderjay.BBS.grpc.Con.BBS_ConGrpc;
import com.blinderjay.BBS.grpc.Con.userinfoReply;
import com.blinderjay.BBS.grpc.Con.userinfoReq;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blinderjay
 */
public class testConnect_Grpc {
//    private static final Logger logger = Logger.getLogger(HelloWorldServer.class.getName());

  private Server server;

  private void start() throws IOException {
    /* The port on which the server should run */
    int port = 8585;
    server = ServerBuilder.forPort(port)
        .addService(new GreeterImpl())
        .build()
        .start();
//    logger.info("Server started, listening on " + port);
System.out.println("Server started, listening on " + port);
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
        System.err.println("*** shutting down gRPC server since JVM is shutting down");
        testConnect_Grpc.this.stop();
        System.err.println("*** server shut down");
      }
    });
  }

  private void stop() {
    if (server != null) {
      server.shutdown();
    }
  }

  /**
   * Await termination on the main thread since the grpc library uses daemon threads.
   */
  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }

  /**
   * Main launches the server from the command line.
     * @param args
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
   */
  public static void main(String[] args) throws IOException, InterruptedException {
    final testConnect_Grpc server = new testConnect_Grpc();
    server.start();
    server.blockUntilShutdown();
  }

  static class GreeterImpl extends BBS_ConGrpc.BBS_ConImplBase {
      @Override
    public void getinfo(userinfoReq req, StreamObserver<userinfoReply> responseObserver) {
//      userinfoReply reply = userinfoReply.newBuilder().setMessage("Hello " + req.getName()).build();
     userinfoReply reply = userinfoReply.newBuilder().setEmail("blinderjay@csdcv").setDes("csdcd").build();
      responseObserver.onNext(reply);
      responseObserver.onCompleted();
    }
    
  }
}

