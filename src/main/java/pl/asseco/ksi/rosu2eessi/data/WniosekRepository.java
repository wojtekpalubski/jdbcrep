package pl.asseco.ksi.rosu2eessi.data;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface WniosekRepository extends Repository <Wniosek, Long>{
    public Wniosek findById(Long Id);
}
