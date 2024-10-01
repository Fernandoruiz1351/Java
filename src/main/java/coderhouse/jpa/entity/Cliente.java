package coderhouse.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

    public Cliente() {}

    public Cliente(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    @Column(name = "NOMBRE")
    @Getter
    @Setter
    private String nombre;

    @Column(name = "APELLIDO")
    @Getter
    @Setter
    private String apellido;

    @Column(name = "DNI")
    @Getter
    @Setter
    private String dni;
}
