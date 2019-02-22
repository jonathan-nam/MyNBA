package com.example.jonat.list;

import java.util.Comparator;

public class Player {
    /* General information */
    private String name;
    private String pos;
    private int age;
    private String team;
    private int games, gamesStarted;
    private float minPlayed;

    /* Field goal-related numbers */
    private float fGGame;
    private float fGAttempted;
    private float fGPercent;
    private float threePtrsGame;
    private float threePtrsAtt;
    private float threePtrsPct;
    private float twoPtrsGame;
    private float twoPtrsAtt;
    private float twoPtrsPct;
    private float eFG;
    private float fTGame;
    private float fTAtt;
    private float fTPct;

    /* Rebounding numbers */
    private float oRB;
    private float dRB;

    /* Big 5 */
    private float PPG;
    private float tRB;
    private float aST;
    private float sTL;
    private float bLK;

    /* Player errors */
    private float tOV;
    private float persFouls;

    private String photoLink;

    public Player(String name, String pos, int age, String team, int games, int gamesStarted, float minPlayed, float fGGame,
                  float fGAttempted, float fGPercent, float threePtrsGame, float threePtrsAtt, float threePtrsPct,
                  float twoPtrsGame, float twoPtrsAtt, float twoPtrsPct, float eFG, float fTGame, float fTAtt, float fTPct,
                  float oRB, float dRB, float tRB, float aST, float sTL, float bLK, float tOV, float persFouls, float PPG,
                  String photoLink) {
        this.name = name;
        this.pos = pos;
        this.age = age;

        switch (team)
        {
            case "ATL":
                this.team = "Atlanta Hawks";
                break;
            case "BOS":
                this.team = "Boston Celtics";
                break;
            case "BRK":
                this.team = "Brooklyn Nets";
                break;
            case "CHI":
                this.team = "Chicago Bulls";
                break;
            case "CHO":
                this.team = "Charlotte Hornets";
                break;
            case "CLE":
                this.team = "Cleveland Cavaliers";
                break;
            case "DAL":
                this.team = "Dallas Mavericks";
                break;
            case "DEN":
                this.team = "Denver Nuggets";
                break;
            case "DET":
                this.team = "Detroit Pistons";
                break;
            case "GSW":
                this.team = "Golden State Warriors";
                break;
            case "HOU":
                this.team = "Houston Rockets";
                break;
            case "IND":
                this.team = "Indiana Pacers";
                break;
            case "LAC":
                this.team = "Los Angeles Clippers";
                break;
            case "LAL":
                this.team = "Los Angeles Lakers";
                break;
            case "MEM":
                this.team = "Memphis Grizzlies";
                break;
            case "MIA":
                this.team = "Miami Heat";
                break;
            case "MIL":
                this.team = "Milwaukee Bucks";
                break;
            case "MIN":
                this.team = "Minnesota Timberwolves";
                break;
            case "NOP":
                this.team = "New Orleans Pelicans";
                break;
            case "NYK":
                this.team = "New York Knicks";
                break;
            case "OKC":
                this.team = "Oklahoma City Thunder";
                break;
            case "ORL":
                this.team = "Orlando Magic";
                break;
            case "PHI":
                this.team = "Philadelphia 76ers";
                break;
            case "PHO":
                this.team = "Phoenix Suns";
                break;
            case "POR":
                this.team = "Portland Trail Blazers";
                break;
            case "SAC":
                this.team = "Sacramento Kings";
                break;
            case "SAS":
                this.team = "San Antonio Spurs";
                break;
            case "TOR":
                this.team = "Toronto Raptors";
                break;
            case "UTA":
                this.team = "Utah Jazz";
                break;
            case "WAS":
                this.team = "Washington Wizards";
                break;
            default:
                this.team = "No team";
        }

        this.games = games;
        this.gamesStarted = gamesStarted;
        this.minPlayed = minPlayed;
        this.fGGame = fGGame;
        this.fGAttempted = fGAttempted;
        this.fGPercent = fGPercent;
        this.threePtrsGame = threePtrsGame;
        this.threePtrsAtt = threePtrsAtt;
        this.threePtrsPct = threePtrsPct;
        this.twoPtrsGame = twoPtrsGame;
        this.twoPtrsAtt = twoPtrsAtt;
        this.twoPtrsPct = twoPtrsPct;
        this.eFG = eFG;
        this.fTGame = fTGame;
        this.fTAtt = fTAtt;
        this.fTPct = fTPct;
        this.oRB = oRB;
        this.dRB = dRB;
        this.tRB = tRB;
        this.aST = aST;
        this.sTL = sTL;
        this.bLK = bLK;
        this.tOV = tOV;
        this.persFouls = persFouls;
        this.PPG = PPG;
        this.photoLink = photoLink;
    }

    public String getName() {
        return name;
    }

    public String getPos() {
        return pos;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }

    public int getGames() {
        return games;
    }

    public int getGamesStarted() {
        return gamesStarted;
    }

    public float getMinPlayed() {
        return minPlayed;
    }

    public float getfGGame() {
        return fGGame;
    }

    public float getfGAttempted() {
        return fGAttempted;
    }

    public float getfGPercent() {
        return fGPercent;
    }

    public float getThreePtrsGame() {
        return threePtrsGame;
    }

    public float getThreePtrsAtt() {
        return threePtrsAtt;
    }

    public float getThreePtrsPct() {
        return threePtrsPct;
    }

    public float getTwoPtrsGame() {
        return twoPtrsGame;
    }

    public float getTwoPtrsAtt() {
        return twoPtrsAtt;
    }

    public float getTwoPtrsPct() {
        return twoPtrsPct;
    }

    public float geteFG() {
        return eFG;
    }

    public float getfTGame() {
        return fTGame;
    }

    public float getfTAtt() {
        return fTAtt;
    }

    public float getfTPct() {
        return fTPct;
    }

    public float getoRB() {
        return oRB;
    }

    public float getdRB() {
        return dRB;
    }

    public float gettRB() {
        return tRB;
    }

    public float getaST() {
        return aST;
    }

    public float getsTL() {
        return sTL;
    }

    public float getbLK() {
        return bLK;
    }

    public float gettOV() {
        return tOV;
    }

    public float getPersFouls() {
        return persFouls;
    }

    public float getPPG() {
        return PPG;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", pos=" + pos + ", age=" + age + ", team=" + team + ", games=" + games
                + ", gamesStarted=" + gamesStarted + ", minPlayed=" + minPlayed + ", fGGame=" + fGGame
                + ", fGAttempted=" + fGAttempted + ", fGPercent=" + fGPercent + ", threePtrsGame=" + threePtrsGame
                + ", threePtrsAtt=" + threePtrsAtt + ", threePtrsPct=" + threePtrsPct + ", twoPtrsGame=" + twoPtrsGame
                + ", twoPtrsAtt=" + twoPtrsAtt + ", twoPtrsPct=" + twoPtrsPct + ", eFG=" + eFG + ", fTGame=" + fTGame
                + ", fTAtt=" + fTAtt + ", fTPct=" + fTPct + ", oRB=" + oRB + ", dRB=" + dRB + ", PPG=" + PPG + ", tRB="
                + tRB + ", aST=" + aST + ", sTL=" + sTL + ", bLK=" + bLK + ", tOV=" + tOV + ", persFouls=" + persFouls
                + "]";
    }

    public boolean equals (Object o) {
        boolean isEqual = false;

        if (o instanceof Player) {
            Player temp = (Player) o;
            if (temp.getName().equals(this.getName())) {
                isEqual = true;
            }
        }

        return isEqual;
    }
}

/*
 * Sort by points per game in descending order.
 */
class SortByPPG implements Comparator<Player> {
    public int compare(Player a, Player b) {
        if (b.getPPG() - a.getPPG() > 0) {
            return 1;
        } else if (b.getPPG() - a.getPPG() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

/*
 * Sort by rebounds per game in descending order.
 */
class SortByREB implements Comparator<Player> {
    public int compare (Player a, Player b) {
        if (b.gettRB() - a.gettRB() > 0) {
            return 1;
        } else if (b.gettRB() - a.gettRB() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

/*
 * Sort by assists per game in descending order.
 */
class SortByAST implements Comparator<Player> {
    public int compare (Player a, Player b) {
        if (b.getaST() - a.getaST() > 0) {
            return 1;
        } else if (b.getaST() - a.getaST() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

class SortBySTL implements Comparator<Player> {
    public int compare (Player a, Player b) {
        if (b.getsTL() - a.getsTL() > 0) {
            return 1;
        } else if (b.getsTL() - a.getsTL() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

class SortByBLK implements Comparator<Player> {
    public int compare (Player a, Player b) {
        if (b.getbLK() - a.getbLK() > 0) {
            return 1;
        } else if (b.getbLK() - a.getbLK() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

