/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.RestTemplate.model;

/**
 *{
        "codigo": 6,
        "nome": "Elton Julio Cuambe",
        "username": "Eltonnjulio@gmail.com",
        "role": "Normal",
        "senha": "1234",
        "estado": true
    }
 * @author Elton Julio
 */
public class Usuario {

    private Long codigo;
    private String nome;
    private String username;
    private String role;
    private String senha;
    private boolean estado;
    
    public Usuario() {
    }

    public Usuario(Long codigo, String nome, String username, String role, String senha, boolean estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.username = username;
        this.role = role;
        this.senha = senha;
        this.estado = estado;
    }

    public Usuario(String nome, String username, String role, String senha, boolean estado) {
        this.nome = nome;
        this.username = username;
        this.role = role;
        this.senha = senha;
        this.estado = estado;
    }
    

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", nome=" + nome + ", username=" + username + ", role=" + role + ", senha=" + senha + ", estado=" + estado + '}';
    }
  
    
    
    
}
