/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bomcodigo.apphibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Bruno
 */
@Entity
@Table(name = "tbl_usuario")
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String contato;
    private String senha;  
    
    
    @Id
    @Column(name = "usuario_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Column(name = "usuario_nome")
    public String getNome() {
        return nome;
    }    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "usuario_email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "usuario_contato")
    public String getContato() {
        return contato;
    }
    
    public void setContato(String contato) {
        this.contato = contato;
    }

    @Column(name = "usuario_senha")
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
}
