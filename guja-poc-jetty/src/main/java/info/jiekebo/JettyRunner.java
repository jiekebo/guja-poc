package info.jiekebo;

/*
 * #%L
 * guja-be-war
 * %%
 * Copyright (C) 2014 Wadpam
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.net.URL;
import java.security.ProtectionDomain;

public class JettyRunner {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        WebAppContext root = new WebAppContext();
        root.setContextPath("/");

        ProtectionDomain protectionDomain = JettyRunner.class.getProtectionDomain();
        URL location = protectionDomain.getCodeSource().getLocation();
        root.setWar(location.toExternalForm());

        server.setHandler(root);

        server.start();
        server.join();
    }

}
