/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Duc
 */
@Entity
@Table(name="sending")
public class SendingDTO implements Serializable{
    private Long id;
    private String acc;
    private String cc;
    private String content;
    
    public SendingDTO(){
    
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long getId(){
        return id;
    }
    
    public void setId(Long newId){
        this.id = newId;
    }
    
    @Column(name="acc")
    public void setAcc(String newAcc){
        this.acc = newAcc;
    }
    
    public String getAcc(){
        return this.acc;
    }
    
    @Column(name="cc")
    public void setCc(String newCc){
        this.cc = newCc;
    }
    
    public String getCc(){
        return this.cc;
    }
    
    @Column(name="content")
    public void setContent(String newContent){
        this.content = newContent;
    }
    
    public String getContent(){
        return this.content;
    }
}
