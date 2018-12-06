package pl.asseco.ksi.rosu2eessi.data;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Wniosek implements Serializable {
    @Id
    private Long id;
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
