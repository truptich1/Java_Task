import java.io.*;
import java.net.*;


public class ChatApp {
   static ServerSocket serverSocket=null;
   static Socket client=null; 
   static ChatApp obj;
   static Receive1 receiver;
   static Send1 sender;
   Class Receive1 extents Thread{

      //Try and Catch Method used to setup the connection between the server and client
      synchronized public void run(){
            try{
               BufferedReader br = null;
                  try{
                     InputStream is = client.getInputStream();
                     br = new BufferReader(new InputStreamReader)
                  }
            }

      }
   }

}
