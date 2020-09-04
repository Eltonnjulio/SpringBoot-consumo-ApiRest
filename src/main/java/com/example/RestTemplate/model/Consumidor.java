/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.RestTemplate.model;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
/**
 *
 * @author Elton Julio
 */
public class Consumidor {



    private static final String GET_ALL_USERS_URL = "https://carcontroll.herokuapp.com/utilizador/findall";
    private static final String GET_USER_URL = "https://carcontroll.herokuapp.com/utilizador/find/{id}";
    private static final String CREATE_USER_URL = "https://carcontroll.herokuapp.com/utilizador/save";
    private static final String UPDATE_USER_URL = "https://carcontroll.herokuapp.com/utilizador/update/{id}";
    private static final String DELETE_USER_URL = "https://carcontroll.herokuapp.com/utilizador/delete/{id}";
    private static RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {


      Consumidor consumer = new Consumidor();
//      consumer.getUserById(2)
//          consumer.updateUser();
//      consumer.deleteUser(2);
//      consumer.getUser();
         
      
      
    }

    private void getUser() {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity < String > entity = new HttpEntity < String > ("parameters", headers);

        ResponseEntity < String > result = restTemplate.exchange(GET_ALL_USERS_URL, HttpMethod.GET, entity,
            String.class);

        System.out.println(result);
    }

    private void getUserById( long codigo) {

        Map < String, String > params = new HashMap < String, String > ();
        params.put("id",String.valueOf(codigo) );

        RestTemplate restTemplate = new RestTemplate();
        Usuario result = restTemplate.getForObject(GET_USER_URL, Usuario.class, params);

        System.out.println(result.toString());
    }

    private void createUser( Usuario usuario) {

       

        RestTemplate restTemplate = new RestTemplate();
        Usuario result = restTemplate.postForObject(CREATE_USER_URL, usuario, Usuario.class);

        System.out.println(result.toString());
    }

    private void updateUser() {
        Map < String, String > params = new HashMap < String, String > ();
        params.put("id", "1");
        long id =1;
        Usuario usuario = new Usuario(id,"HeliOtario Zandamela de Moz", "jr@gmail.com", "Normal", "4321", false);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(UPDATE_USER_URL, usuario, params);
    }

    private void deleteUser(long codigo) {
        Map < String, String > params = new HashMap < String, String > ();
        params.put("id", String.valueOf(codigo));
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(DELETE_USER_URL, params);
    }
}


