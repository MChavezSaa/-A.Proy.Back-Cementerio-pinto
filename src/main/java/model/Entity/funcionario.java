package model.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class funcionario {

    @Id
    private long id_Funcionario;

    private String nombre;
    private String apellido;
    private String cargo;

}
