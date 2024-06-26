package io.droksty.transfersdemo.repository;

import io.droksty.transfersdemo.model.Associate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociateRepository extends JpaRepository<Associate, Long> {
}
