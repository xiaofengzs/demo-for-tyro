package com.zxf.demo;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class Game implements GameMBean{
    private String playerName;

    public void test() {
        System.out.println("Test");
    }

    @Override
    public void playFootball(String clubName) {
        System.out.println(
                this.playerName + " playing football for " + clubName);
    }

    @Override
    public String getPlayerName() {
        System.out.println("Return playerName " + this.playerName);
        return playerName;
    }

    @Override
    public void setPlayerName(String playerName) {
        System.out.println("Set playerName to value " + playerName);
        this.playerName = playerName;
    }

    public static void main(String[] args) {
        try {
            ObjectName objectName = new ObjectName("com.baeldung.tutorial:type=basic,name=game");
            MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            server.registerMBean(new Game(), objectName);
        } catch (MalformedObjectNameException | InstanceAlreadyExistsException |
                MBeanRegistrationException | NotCompliantMBeanException e) {
            // handle exceptions
        }
        while (true) {
        }
    }
}
