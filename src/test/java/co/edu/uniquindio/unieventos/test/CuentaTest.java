package co.edu.uniquindio.unieventos.test;

import co.edu.uniquindio.unieventos.repositorios.CuentaRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class CuentaTest {


    @Autowired
    private CuentaRepo cuentaRepo;


}
