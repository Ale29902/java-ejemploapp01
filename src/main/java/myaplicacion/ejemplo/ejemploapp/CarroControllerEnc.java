package myaplicacion.ejemplo.ejemploapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Coche {
    private String marca; // Atributo privado
    private int año; // Atributo privado

    // Constructor para inicializar la marca y el año
    public Coche(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

    // Método público para obtener la marca
    public String getMarca() {
        return marca;
    }

    // Método público para establecer la marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método público para obtener el año
    public int getAño() {
        return año;
    }

    // Método público para establecer el año
    public void setAño(int año) {
        this.año = año;
    }

    public String arrancar() {
        return "El auto está arrancando...";
    }
}

@RestController
@RequestMapping("/carro")
public class CarroControllerEnc {

    @GetMapping
    public String getCarro() {
        Coche miCoche = new Coche("Toyota", 2022);

        // Lla/mar al método arrancar
        return miCoche.arrancar();
    }
}