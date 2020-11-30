package com.zxf.demo;

import javax.management.NotificationBroadcasterSupport;

public class Hello extends NotificationBroadcasterSupport implements GameMBean {
    @Override
    public void playFootball(String clubName) {

    }

    @Override
    public String getPlayerName() {
        return null;
    }

    @Override
    public void setPlayerName(String playerName) {

    }
}
