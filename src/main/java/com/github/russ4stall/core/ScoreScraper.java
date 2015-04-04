package com.github.russ4stall.core;

import com.github.russ4stall.representations.Game;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by russ on 4/4/15.
 */
public class ScoreScraper {

    private int year;
    private int weekNumber;
    private SeasonSection seasonSection = SeasonSection.REG;


    public ScoreScraper(int year, int weekNumber, SeasonSection seasonSection) {
        this.year = year;
        this.weekNumber = weekNumber;
        this.seasonSection = seasonSection;
    }

    public List<Game> scrapeWeekScores() {

        String url = "http://www.nfl.com/scores/" + year + "/" + seasonSection + weekNumber;

        Document document = null;
        try {
            document = Jsoup.connect(url).get();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
        List<Game> games = new ArrayList();

        Elements scoreboxWrappers = null;
        try {
            scoreboxWrappers = document.getElementsByClass("scorebox-wrapper");

            for (Element scoreboxWrapper : scoreboxWrappers) {
                Game game = new Game(
                        scoreboxWrapper.getElementsByClass("date").html(),
                        scoreboxWrapper.getElementsByClass("home-team").first().getElementsByClass("team-name").first().text(),
                        scoreboxWrapper.getElementsByClass("away-team").first().getElementsByClass("team-name").first().text(),
                        scoreboxWrapper.getElementsByClass("home-team").first().getElementsByClass("total-score").first().text(),
                        scoreboxWrapper.getElementsByClass("away-team").first().getElementsByClass("total-score").first().text()
                );

                games.add(game);
            }
        } catch(Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        return games;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSeasonSection(SeasonSection seasonSection) {
        this.seasonSection = seasonSection;
    }

    //test
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int year = cal.get(Calendar.YEAR);

        ScoreScraper scoreScraper = new ScoreScraper(2014, 1, SeasonSection.REG);

        for (Game game : scoreScraper.scrapeWeekScores()) {
            System.out.println(game);
        }
    }


}
