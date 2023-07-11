package com.SoccerManager.SoccerManager.Security.Entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioPrincipal implements UserDetails {
    private User user;
    private Collection<? extends GrantedAuthority > authorities;

    public UsuarioPrincipal(User user, Collection<? extends GrantedAuthority> authorities) {
        this.user = user;
        this.authorities = authorities;
    }

    public static UsuarioPrincipal build(User user){
        List<GrantedAuthority> authorities = user.getRoles().stream() /**Obtiene los roles asociados al usuario**/
                .map(rol -> new SimpleGrantedAuthority(rol.getNombre().name()/**Crea un objeto con el nombre de cada rol**/))
                .collect(Collectors.toList()/**Recopila los objetos)**/);
        return new UsuarioPrincipal(user ,authorities);
    }

    @Override

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getNombreUsuario();
    }

    public String getUserEmail() {
    return user.getEmail();
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
}
