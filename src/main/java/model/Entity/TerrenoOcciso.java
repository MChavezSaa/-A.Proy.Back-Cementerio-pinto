package model.Entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class TerrenoOcciso {


    @Id
    private long id_TerrenoOcciso;

    @ManyToOne
    private long id_Terreno;

    @ManyToOne
    private long id_Occiso;

}
