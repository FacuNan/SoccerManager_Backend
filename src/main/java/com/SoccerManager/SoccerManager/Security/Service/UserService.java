package com.SoccerManager.SoccerManager.Security.Service;

import com.SoccerManager.SoccerManager.Security.Entity.User;
import com.SoccerManager.SoccerManager.Security.Interface.UserInterface;
import com.SoccerManager.SoccerManager.Security.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserService implements UserInterface {
    @Autowired
    IUserRepository iUserRepository;

    @Override
    public Optional<User> getByNombreUsuario(String nombreUsuario) {
        return iUserRepository.findByNombreUsuario(nombreUsuario);
    }

    @Override
    public boolean existsBynombreusuario(String nombreUsuario) {
        return iUserRepository.existsByNombreUsuario(nombreUsuario);
    }

    @Override
    public boolean existsByEmail(String email) {
        return iUserRepository.existsByEmail(email);
    }

    @Override
    public void saveUsuario(User user) {
        iUserRepository.save(user);

    }
}
