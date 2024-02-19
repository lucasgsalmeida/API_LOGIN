package me.lucas.login.model.domain.users;

public record UsuariosRequestDTO (String email, String senha, UserRole role){
}
