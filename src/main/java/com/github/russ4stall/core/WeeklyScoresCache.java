package com.github.russ4stall.core;

import com.github.russ4stall.representations.Game;

import java.util.List;

/**
 * Created by russ on 4/4/15.
 */
public interface WeeklyScoresCache {
    boolean exists(String seasonAndWeek);

    List<Game> getWeeklyScores(String seasonAndWeek);

    void addWeeklyScores(String seasonAndWeek, List<Game> weeklyScores);

}
