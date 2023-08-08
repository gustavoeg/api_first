package com.example.openapi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-18T18:46:39.162798100-03:00[America/Buenos_Aires]")
@Controller
@RequestMapping("${openapi.rutaYFolios.base-path:/v1}")
public class AsignarApiController implements AsignarApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AsignarApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
