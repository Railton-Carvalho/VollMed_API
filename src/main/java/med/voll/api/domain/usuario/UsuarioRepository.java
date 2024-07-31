package med.voll.api.domain.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query(
        "SELECT usuario FROM Usuario usuario WHERE usuario.login = :login"
    )
    UserDetails findByLogin(@Param("login") String login);
}
