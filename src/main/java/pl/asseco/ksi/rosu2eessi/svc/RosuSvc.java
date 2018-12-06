package pl.asseco.ksi.rosu2eessi.svc;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.asseco.ksi.rosu2eessi.data.Wniosek;
import pl.asseco.ksi.rosu2eessi.data.WniosekRepository;

@Service
@RequiredArgsConstructor
public class RosuSvc {

    @Autowired
    private final WniosekRepository wniosekRepository;

    public Wniosek pobierzWniosek(Long id){
        return wniosekRepository.findById(id);
    }
}
