package com.example.jonat.list;

import java.io.IOException;
import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList <Player> players = new ArrayList <Player>();
    private String teamLink;

    public Team (String teamLink, String teamName, ArrayList<Player> allPlayers) throws IOException {
        this.teamLink = teamLink;
        this.teamName = teamName;
        initTeam(allPlayers);
    }

    public String getName() {
        return teamName;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    /*
     * initTeam
     * Adds players of teamName to players ArrayList
     */
    public void initTeam(ArrayList<Player> allPlayers) throws IOException {
        /* These team links are not correctly updated on Basketball Reference. */
        if (teamLink.equals("https://www.basketball-reference.com/teams/NJN/2019.html")) {
            this.teamLink = ("https://www.basketball-reference.com/teams/BRK/2019.html");
        } else if (teamLink.equals("https://www.basketball-reference.com/teams/CHA/2019.html")) {
            this.teamLink = ("https://www.basketball-reference.com/teams/CHO/2019.html");
        } else if (teamLink.equals("https://www.basketball-reference.com/teams/NOH/2019.html")) {
            this.teamLink = ("https://www.basketball-reference.com/teams/NOP/2019.html");
        }

        for (int i = 0; i < allPlayers.size(); i++) {
            if (allPlayers.get(i).getTeam().equals(teamName)) {
                players.add(allPlayers.get(i));
            }
        }
    }

    public StringBuilder printPlayers() {
        StringBuilder allPlayers = new StringBuilder("");

        for (int i = 0; i < players.size(); i++) {
            allPlayers.append(players.get(i) + "\n");
        }

        return allPlayers;
    }

    public String toString() {
        return "\nName: " + teamName + "\nURL: " + teamLink + "\n" + printPlayers();
    }
}
