package co.edu.uniquindio.unieventos.modelo.documentos;

import co.edu.uniquindio.unieventos.modelo.EstadoCuenta;
import co.edu.uniquindio.unieventos.modelo.Rol;
import co.edu.uniquindio.unieventos.modelo.TipoUsuario;
import co.edu.uniquindio.unieventos.modelo.Usuario;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document("cuentas")
public class Cuenta {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    private String email;
    private TipoUsuario tipoUsuario;
    private EstadoCuenta estadoCuenta;
    private CodigoValidacion codigoValidacionPassword;
    private Usuario usuario;
    private Rol rol;
    private LocalDateTime fechaRegistro;
    private String password;
    private CodigoValidacion codigoValidacionRegistro;
    private List<LocalDateTime> historialConexion;

    @Builder
    public Cuenta(String email, TipoUsuario tipoUsuario, EstadoCuenta estadoCuenta,
                  CodigoValidacion codigoValidacionPassword, Usuario usuario,
                  LocalDateTime fechaRegistro, String password,
                  CodigoValidacion codigoValidacionRegistro) {

        this.email = email;
        this.tipoUsuario = tipoUsuario;
        this.estadoCuenta = estadoCuenta;
        this.codigoValidacionPassword = codigoValidacionPassword;
        this.usuario = usuario;
        this.fechaRegistro = fechaRegistro;
        this.password = password;
        this.codigoValidacionRegistro = codigoValidacionRegistro;
    }


}
