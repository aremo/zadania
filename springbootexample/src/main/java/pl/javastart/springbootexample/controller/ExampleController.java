package pl.javastart.springbootexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Random;

@Controller
@RequestMapping("/testy")
public class ExampleController {


    @RequestMapping("/test1")
    @ResponseBody
    public String test(HttpServletRequest request) {
        String result = "Cześć, tutaj Arian. Spokojnie, wszystko działa! To się wyświetla na stronie :)<br></br>";
        System.out.println("Cześć, tutaj Arian. Spokojnie, wszystko działa!");

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String value = request.getHeader(name);
            result += name + ": " + value + "<br/>";
        }

        System.out.println(request.getRemoteAddr());

        return result;
    }
}
