package com.vk.aeross;

public class Player {
    private final String playerName;
    private final String whoAreYou;

    public Player(String name, String whoAreYou) {
        this.playerName = name;
        this.whoAreYou = whoAreYou;
    }


    public String getPlayerName() {
        return playerName;
    }

    public String getWhoAreYou() {
        return whoAreYou;
    }

}
