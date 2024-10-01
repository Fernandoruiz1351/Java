package coderhouse.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "VENTA")
public class Venta {

    public Venta() {}

    public Venta(String vendedor, String item, int precio) {
        this.vendedor= vendedor;
        this.item = item;
        this.precio = precio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    @Column(name = "VENDEDOR")
    @Getter
    @Setter
    private String vendedor;

    @Column(name = "ITEM")
    @Getter
    @Setter
    private String item;

    @Column(name = "PRECIO")
    @Getter
    @Setter
    private int precio;

}

