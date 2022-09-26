package com.vojtech.cra.route;

import com.vojtech.cra.item.MyFact;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

/**
 * We use Camel's REST DSL in our RouteBuilder to create the REST API.
 * RestConfiguration() allows us to define some baselines for the service,
 * and the rest() further defines individual REST operations.
 */
@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        // Base REST configuration
        restConfiguration()
                // A common servlet component is chosen
                .component("servlet")

                // Let Camel handle (un)marshalling between POJO and JSON, and use pretty formatting
                .bindingMode(RestBindingMode.json)
                .dataFormatProperty("prettyPrint", "true");


        // Individual REST API endpoints get created, only 1 (GET) in our case
        rest()
                .path("/awesome") // Use "/awesome" as the endpoint for our API

                .consumes("application/json")
                .produces("application/json") // REST API would be consuming and producing data in JSON format

                .get() // GET gets set here
                .outType(MyFact.class) // Allow Camel to marshall data into JSON format
                .to("bean:myGetBean"); // Use our 'myGetBean' Spring bean to produce results
    }
}