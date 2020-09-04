package com.example.RestTemplate;

import com.example.RestTemplate.model.Usuario;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest
class RestTemplateApplicationTests {

	@Test
	void consumir() {
           // String url ="https://carcontroll.herokuapp.com/utilizador/";
            //https://carcontroll.herokuapp.com/utilizador/findall
            RestTemplate template = new RestTemplate();
            UriComponents url = UriComponentsBuilder.newInstance()
                    .scheme("https")
                    .host("carcontroll.herokuapp.com/")
                    .path("utilizador/findall")
                    .build();
            
            ResponseEntity<Usuario> user = template.getForEntity(url.toString(),Usuario.class);
//            ResponseEntity<Usuario>[] user = template.getForEntity(url.toString(),Usuario.class);
	
//            System.out.println(user.getBody().getNome());

            System.out.println(user.toString());
            
        
        }

}
