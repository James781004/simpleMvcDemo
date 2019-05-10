package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.BaseApiResponse;

@RestController
@RequestMapping("/docker")
public class DockerController {

    /**
     * Result base api response.
     *
     * @return the base api response
     */
    @RequestMapping(value = "/")
    public BaseApiResponse result() {
        BaseApiResponse baseApiResponse = new BaseApiResponse();
        baseApiResponse.setId(1);
        baseApiResponse.setUsname("廖大帅");
        baseApiResponse.setSex("汉子");
        baseApiResponse.setRemark("很帅");
        return baseApiResponse;
    }

    /**
     * Index string.
     *
     * @param name the name
     * @return the string
     */
    @RequestMapping(value = "/{name}")
    public String index(@PathVariable(name = "name") String name) {
        return "Hello " + name + "! Welcome to Docker";
    }
}
