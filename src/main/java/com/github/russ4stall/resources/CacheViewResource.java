package com.github.russ4stall.resources;

import com.github.russ4stall.core.WeeklyScoresCache;
import io.dropwizard.views.View;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 * Created by russ on 4/4/15.
 */
@Path("/scores/cache")
@Produces(MediaType.TEXT_HTML)
public class CacheViewResource {
    private WeeklyScoresCache cache;

    public CacheViewResource(WeeklyScoresCache cache) {
        this.cache = cache;
    }

    @GET
    public String getCache() {
        StringBuilder sb = new StringBuilder();
        for (String s : cache.getKeys()) {
            sb.append(s);
            sb.append("<br>");
        }
        return sb.toString();
    }
}

