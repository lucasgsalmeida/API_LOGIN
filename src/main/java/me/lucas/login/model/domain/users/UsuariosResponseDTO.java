package me.lucas.login.model.domain.users;

public record UsuariosResponseDTO(Long id, String email, String senha, UserRole role) {

    public UsuariosResponseDTO(Usuarios user) {
        this(user.getId(), user.getEmail(), user.getSenha(), user.getRole());
    }
}
