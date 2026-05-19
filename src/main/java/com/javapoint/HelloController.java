package com.javatpoint;  

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  

/*
 * Comentario 2
 */
@Controller  
public class HelloController {  
@RequestMapping("/")  
    public String display()  
    {  
        return "index";  
    }     
}  