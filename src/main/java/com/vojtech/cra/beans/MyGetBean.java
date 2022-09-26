package com.vojtech.cra.beans;

import com.vojtech.cra.item.Matches;
import com.vojtech.cra.item.MyFact;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class MyGetBean {

    public MyFact getResponse() {

        // Our JSON will end up having a nested structure due to presence of objects within
        MyFact myBaseFact = new MyFact(); // Declare instance of MyFact for a basic fact at the start of our response
        Matches nestedFacts = new Matches(); // Declare instance of Matches for nested facts in our response

        myBaseFact.setSubject("Camel");
        myBaseFact.setAdjective("Awesome"); // Because Camel is awesome

        nestedFacts.setHotel("Trivago");

        DateTimeFormatter dtform = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); // Format time to avoid fractions
        nestedFacts.setCurrentDateTime(dtform.format(LocalDateTime.now())); // Use formatted current time in response

        myBaseFact.setMatches(nestedFacts);

        return myBaseFact;
    }


}
