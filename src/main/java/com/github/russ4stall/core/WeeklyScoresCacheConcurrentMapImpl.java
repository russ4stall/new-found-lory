package com.github.russ4stall.core;

import com.github.russ4stall.representations.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by russ on 4/4/15.
 */
public class WeeklyScoresCacheConcurrentMapImpl extends ConcurrentHashMap<String, List<Game>> implements WeeklyScoresCache {

    @Override
    public boolean exists(String seasonAndWeek) {
        return containsKey(seasonAndWeek);
    }

    @Override
    public List<Game> getWeeklyScores(String seasonAndWeek) {
        return get(seasonAndWeek);
    }

    @Override
    public void addWeeklyScores(String seasonAndWeek, List<Game> weeklyScores) {
        putIfAbsent(seasonAndWeek, weeklyScores);
    }

    @Override
    public List<String> getKeys() {
        List<String> list = new ArrayList<>();
        for (String s:keySet()) {
            list.add(s);
        }
        return list;
    }
}
