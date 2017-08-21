package com.sanchev;

import com.sanchev.servlets.ContactServiceImpl;
import com.sanchev.servlets.ContactServlet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class.getName());

    public static void main(String[] args) throws Exception {
        LOGGER.info("App started");
        Server server = new Server(8080);

        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        handler.addServlet(new ServletHolder(new ContactServlet(new ContactServiceImpl())), "/hello/contacts");
        server.setHandler(handler);

        server.start();
        LOGGER.info("Server started");
        //server.join();
        Thread.sleep(5000);
        server.stop();
        LOGGER.info("Server stopped");
        LOGGER.info("App finished");
    }

}