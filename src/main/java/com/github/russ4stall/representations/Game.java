package com.github.russ4stall.representations;

import org.joda.time.DateTime;

/**
 * Created by russ on 4/4/15.
 */
public class Game {
    private DateTime gameTime;
    private String homeTeam;
    private String awayTeam;
    private int homeTeamScore;
    private int awayTeamScore;

    public Game(DateTime gameTime, String homeTeam, String awayTeam, int homeTeamScore, int awayTeamScore) {
        this.gameTime = gameTime;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;
    }

    public DateTime getGameTime() {
        return gameTime;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }
}
