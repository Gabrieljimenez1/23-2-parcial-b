package co.edu.unisabana.parcialarquitectura.repository.jpa;

import co.edu.unisabana.parcialarquitectura.repository.entity.CheckpointEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckpointRepository extends JpaRepository<CheckpointEntity, Integer> {

}
