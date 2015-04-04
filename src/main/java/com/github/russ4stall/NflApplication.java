package com.github.russ4stall;

import com.github.russ4stall.resources.BoingoResource;
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
        final BoingoResource boingoResource = new BoingoResource();
        environment.jersey().register(boingoResource);

        final WeekScoresResource weekScoresResource = new WeekScoresResource();
        environment.jersey().register(weekScoresResource);
    }
}
