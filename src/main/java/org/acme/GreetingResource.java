package org.acme;

import io.vertx.core.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestPath;
import org.jboss.logging.Logger;

@Path("/hello")
public class GreetingResource {

    private static final Logger LOG = Logger.getLogger(GreetingResource.class);

    @Path("{ami}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject helloAmi(@RestPath String ami) {
        // When command : curl "http://localhost:8080/hello/john" -w "\n"
        // Response body: {"empty":false,"map":{"ami":"john"}}  
        // Expected     : {"ami":"john"}
        JsonObject obj = new JsonObject();
        obj.put("ami", ami);
        LOG.info(obj);
        return obj;
    }

}