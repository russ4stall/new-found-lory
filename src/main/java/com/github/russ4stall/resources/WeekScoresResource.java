package com.github.russ4stall.resources;

import com.github.russ4stall.core.ScoreScraper;
import com.github.russ4stall.core.SeasonSection;
import com.github.russ4stall.representations.Game;
import com.google.common.base.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by russ on 4/4/15.
 */
@Path("/scores/{year}/{week}")
@Produces(MediaType.APPLICATION_JSON)
public class WeekScoresResource {

    @GET
    public List<Game> games(@PathParam("week") Optional<Integer> weekNum, @PathParam("year") Optional<Integer> yearNum) {
        //todo: default to current week and season
        int week = weekNum.get();
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int year = yearNum.or(cal.get(Calendar.YEAR));

        //todo: implement utility that scrapes scores from NFL.com. Use cache once it's implemented
        ScoreScraper scoreScraper = new ScoreScraper(year, week, SeasonSection.REG);


        List<Game> games = scoreScraper.scrapeWeekScores();
        return games;
    }

}
