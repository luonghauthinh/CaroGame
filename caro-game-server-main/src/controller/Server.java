
package controller;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import view.Admin;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Server {

    public static volatile ServerThreadBus serverThreadBus;
    public static Socket socketOfServer;
    public static int ROOM_ID;
    public static volatile Admin admin;

    private static void initFlatlaf() {
        FlatRobotoFont.install();
        FlatLaf.setPreferredFontFamily(FlatRobotoFont.FAMILY);
        FlatLaf.setPreferredLightFontFamily(FlatRobotoFont.FAMILY_LIGHT);
        FlatLaf.setPreferredSemiboldFontFamily(FlatRobotoFont.FAMILY_SEMIBOLD);
        FlatLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
    }
    public static void main(String[] args) {
        initFlatlaf();
        ServerSocket listener = null;
        serverThreadBus = new ServerThreadBus();
        System.out.println("Server is waiting to accept user...");
        int clientNumber = 0;
        ROOM_ID = 100;

        try {
            listener = new ServerSocket(7777);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                10,
                100,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(8)
        );
        admin = new Admin();
        admin.run();
        try {
            while (true) {
                socketOfServer = listener.accept();
                System.out.println(socketOfServer.getInetAddress().getHostAddress());
                ServerThread serverThread = new ServerThread(socketOfServer, clientNumber++);
                serverThreadBus.add(serverThread);
                System.out.println("Số thread đang chạy là: " + serverThreadBus.getLength());
                executor.execute(serverThread);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                listener.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
