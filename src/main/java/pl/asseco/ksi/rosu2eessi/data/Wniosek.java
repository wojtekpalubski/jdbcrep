package pl.asseco.ksi.rosu2eessi.data;

import lombok.Data;
import javax.persistence.Id;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
//@Table(name="Wniosek")
public class Wniosek implements Serializable {
    @Id
    private Long WniosekId;
    private Long RodzajWnioskuId;
    private LocalDateTime DataWplywu;
    private String TjoWplywu;
    private Long PanstwoId;
    private Long InstytucjaId;
    private Long OsobaId;
    private Long PlatnikId;
    private Long SprawaId;
    private LocalDateTime DataOstatniejModyfikacji;
    private String OsobaModyfikujaca;
    private Long Lp;
    private Long LpRok;
    private LocalDateTime DataRejestracji;
}
