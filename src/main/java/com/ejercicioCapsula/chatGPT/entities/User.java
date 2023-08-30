package com.ejercicioCapsula.chatGPT.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native" , strategy = "native")
    private Long id;
    private String name;
    private String email;
    @ManyToOne
    private Role role;
    @OneToOne
    private Billing billing;

    public User() {
    }
    public User(Long id, String name, String email, Role role, Billing billing) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.billing = billing;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }
}
