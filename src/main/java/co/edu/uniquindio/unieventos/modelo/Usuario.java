package co.edu.uniquindio.unieventos.modelo;

import lombok.*;
import org.springframework.data.annotation.Id;

@Builder
@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper = true,onlyExplicitlyIncluded = true)
public class Usuario {

    @Id
    @EqualsAndHashCode.Include
    private String cedula;
    private String nombre;
    private String telefono;
    private String direccion;



}
