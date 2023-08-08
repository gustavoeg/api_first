package com.example.openapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-08T20:50:23.086720-03:00[America/Buenos_Aires]")
@Controller
@RequestMapping("${openapi.aPITitle.base-path:/v1}")
public class TestApiController implements TestApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TestApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
