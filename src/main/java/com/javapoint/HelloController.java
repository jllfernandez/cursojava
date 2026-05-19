package com.javatpoint;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
@Controller  
/*
 * Comentario 2
 */
public class HelloController {  
@RequestMapping("/")  
    public String display()  
    {  
        return "index";  
    }     
}  