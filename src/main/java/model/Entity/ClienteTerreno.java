package model.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class ClienteTerreno {

    @Id
    private long id_ClienteTerreno;

    @ManyToOne
    private long id_Cliente;

    @ManyToOne
    private long id_Terreno;


}
