package com.github.russ4stall;

import com.github.russ4stall.core.WeeklyScoresCache;
import com.github.russ4stall.core.WeeklyScoresCacheConcurrentMapImpl;
import com.github.russ4stall.resources.WeekScoresResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


/**
 * Created by russ on 4/4/15.
 */
public class NflApplication extends Application<NflConfiguration> {

    public static void main(String[] args) throws Exception {
        new NflApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<NflConfiguration> bootstrap) {
        super.initialize(bootstrap);

    }

    @Override
    public void run(NflConfiguration nflConfiguration, Environment environment) throws Exception {
        WeeklyScoresCache cache = new WeeklyScoresCacheConcurrentMapImpl();

        final WeekScoresResource weekScoresResource = new WeekScoresResource(cache);
        environment.jersey().register(weekScoresResource);
    }
}
