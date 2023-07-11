package com.SoccerManager.SoccerManager.Security.Dto;

import com.SoccerManager.SoccerManager.Security.Entity.User;

import java.util.HashSet;
import java.util.Set;

public class NuevoUsuario {
    private User user;
    private Set<String> role = new HashSet<>();

    public NuevoUsuario(User user, Set<String> role) {
        this.user = user;
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<String> getRole() {
        return role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }
}
