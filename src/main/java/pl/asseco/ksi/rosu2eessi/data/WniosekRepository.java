package pl.asseco.ksi.rosu2eessi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface WniosekRepository extends JpaRepository<Wniosek, Long> {
    public Optional<Wniosek> findById(Long WniosekId);
}
