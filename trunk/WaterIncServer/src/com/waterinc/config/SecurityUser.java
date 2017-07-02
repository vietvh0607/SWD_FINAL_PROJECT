package com.waterinc.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.waterinc.model.User;

import java.util.Collection;

/**
 * Created by Asus on 5/10/2017.
 */
public class SecurityUser implements UserDetails {
    private String username;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;
    private boolean enabled;

    private User userInfo;

    public SecurityUser() {
    }

    public SecurityUser(String username, String password, Collection<? extends GrantedAuthority> authorities, boolean enabled, User userInfo) {
        super();
        this.username = username;
        this.password = password;
        this.authorities = authorities;
        this.enabled = enabled;
        this.userInfo = userInfo;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
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
        return enabled;
    }

    public User getUserInfo() {
        return userInfo;
    }
}
