package com.elizabeth.framework;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class BbsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.print("<html><head><title>welcome servlet</title></head><body><font>我喜欢你！</font></body></html>");
        out.flush();


        int count = 23;
        while(count-- > 0){
            for (int i = 0; i < 1000; i++) {
                int temp = (int)(Math.random() * (1000 - 100)) + 100;
            }
        }
        /*try {
            TimeUnit.SECONDS.sleep(3600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST: test servlet");
    }
}
