package model.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Data
@Entity
public class Terreno {

    @Id
    @OneToMany
    private long id_Terreno;

    private int patio;
    private int lote;
    private String orientacion;
    private int precio_Total;
    private int num_Cuotas;
    private int cuotas_Pagadas;
    private  int abono;

    //creo que nos falto algo para almacenar las coordenadas para el mapa

}
