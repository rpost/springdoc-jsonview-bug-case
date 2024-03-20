package org.example.springdocjsonview;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    void myEndpoint(@RequestBody @JsonView(JsonViews.MyView.class) MyDto request) {

    }

}
