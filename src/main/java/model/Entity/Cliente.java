package model.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Data
@Entity
public class Cliente {

    @Id
    @OneToMany
    private long id_Cliente;

    private String rut;
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;


}
