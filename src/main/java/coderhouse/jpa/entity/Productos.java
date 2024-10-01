package coderhouse.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PRODUCTOS")
public class Productos {

    public Productos() {}

    public Productos(String item, int precio) {
        this.item = item;
        this.precio = precio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    @Column(name = "ITEM")
    @Getter
    @Setter
    private String item;

    @Column(name = "PRECIO")
    @Getter
    @Setter
    private int precio;

}
