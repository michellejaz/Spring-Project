package com.infsis.Blog.Models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name= "\"user\"")
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //@Colum(name="nombre") hara referencia a un atributo de la tabla de la BD
    //@Column(columnDefinition="Bolean not null default true")
    private String name;
    private String email;
    @CreatedDate
    private LocalDateTime createdAt;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private List<Article> articles;

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns=@JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<role> roles;

    @OneToOne(fetch = FetchType.LAZY,mappedBy = "user")
    private BlogU blog;

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
