import java.net.*;
import java.io.*;
import java.util.*;


public class server extends Thread{
public static void main(String args[]) throws Exception {
ServerSocket ssocket= new ServerSocket(1000);
Socket csocket=ssocket.accept();
BufferedReader br=new BufferedReader(new InputStreamReader(csocket.getInputStream()));
PrintWriter out= new PrintWriter(csocket.getOutputStream(),true);
Date d = new Date();
try{
    while(true){
        d=new Date();
        out.println("Time at server" + d.toString());
        System.out.println(br.readLine());
        sleep(1000);
    }
}
catch (Exception e){
    System.out.println("--Client has closed--");
}
}
}