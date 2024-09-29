package co.edu.uniquindio.unieventos.repositorios;

import co.edu.uniquindio.unieventos.modelo.documentos.Cuenta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;


public interface CuentaRepo extends MongoRepository<Cuenta, String> {

    @Query(value = "{email: email}")                     //{email:?0} -> primer argumento del método
    Optional<Cuenta> findByEmail(String email);          //Optional es el patrón que usa Java para este objeto

    @Query("{usuario.cedula : ?0 }")
    Optional<Cuenta> findByCedula(String cedula);

    @Query("{email : ?0, password: ?1 }")
    Optional <Cuenta> validarDatosAutenticacion(String email, String password);
    //findById
    Optional<Cuenta> findById(String id);
}
