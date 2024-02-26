package com.infsis.Blog.Models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    //@Table(name= "\"user\""); creo que es eso :0
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //@Colum(name="nombre") hara referencia a un atributo de la tabla de la BD
    //@Column(columnDefinition="Bolean not null default true")
    private String name;
    private String email;
    @CreatedDate
    private LocalDateTime createdAt;
    //@OneToMany(fetch0 FetchType.LAZY)
    //private List<Article> articulos;
    //@ManyToMany
    //@JoinTable(
    // name= "user-role"
    // joinColumns= @JoinColum(name= "user-id")
    // inter
    // )
    //private List<roles> roles;
    public User(Integer id, String name, String email, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
    }

    public User(){

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
