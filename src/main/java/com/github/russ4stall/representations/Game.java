package com.github.russ4stall.representations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

/**
 * Created by russ on 4/4/15.
 */
public class Game {
    private String date;
    private String homeTeam;
    private String awayTeam;
    private String homeTeamScore;
    private String awayTeamScore;

    public Game(String date, String homeTeam, String awayTeam, String homeTeamScore, String awayTeamScore) {
        this.date = date;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;
    }

    @Override
    public String toString() {
        return "Game{" +
                "date='" + date + '\'' +
                ", homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", homeTeamScore='" + homeTeamScore + '\'' +
                ", awayTeamScore='" + awayTeamScore + '\'' +
                '}';
    }

    @JsonProperty
    public String getDate() {
        return date;
    }

    @JsonProperty
    public String getHomeTeam() {
        return homeTeam;
    }

    @JsonProperty
    public String getAwayTeam() {
        return awayTeam;
    }

    @JsonProperty
    public String getHomeTeamScore() {
        return homeTeamScore;
    }

    @JsonProperty
    public String getAwayTeamScore() {
        return awayTeamScore;
    }
}
