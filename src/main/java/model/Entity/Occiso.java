package model.Entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;

@Data
@Entity
public class Occiso {

    @Id
    @OneToMany
    private long id_Occciso;

    private String rut;
    private String nombre;
    private String apellido;
    private Date fecha_Defuncion;


}
