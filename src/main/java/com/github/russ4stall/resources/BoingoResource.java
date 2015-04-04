package com.github.russ4stall.resources;

import com.github.russ4stall.representations.Boingo;
import com.google.common.base.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by russ on 4/4/15.
 */
@Path("/boingo")
@Produces(MediaType.APPLICATION_JSON)
public class BoingoResource {

   /* @GET
    public Boingo boingo (@QueryParam("name") Optional<String> name) {
        final String str = name.or("Russ");
        return new Boingo(str, 26);
    }*/

    @GET
    public List boingos () {
        List<Boingo> list = new ArrayList();
        for (int i =0; i<10; i++) {
            list.add(new Boingo("Russ "+i, 20+i));
        }


        return list;
    }
}
