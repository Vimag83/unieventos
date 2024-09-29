package co.edu.uniquindio.unieventos.servicios.interfaces;

import co.edu.uniquindio.unieventos.dto.cuenta.CambiarPasswordDTO;
import co.edu.uniquindio.unieventos.dto.cuenta.CrearCuentaDTO;
import co.edu.uniquindio.unieventos.dto.cuenta.EditarCuentaDTO;
import co.edu.uniquindio.unieventos.dto.cuenta.LoginDTO;
import co.edu.uniquindio.unieventos.modelo.documentos.Cuenta;

import java.util.List;


public interface CuentaServicio {
    String crearCuenta(CrearCuentaDTO cuenta) throws Exception;

    String editarCuenta(EditarCuentaDTO cuenta) throws Exception;

    String eliminarCuenta(String id) throws Exception;

    List<Cuenta> listarCuentas();

    Cuenta obtenerInformacionCuenta(String id) throws Exception;

    String enviarCodigoRecuperacionPassword(String correo) throws Exception;

    String cambiarPassword(CambiarPasswordDTO cambiarPasswordDTO) throws Exception;

    String iniciarSesion(LoginDTO loginDTO) throws Exception;
}
