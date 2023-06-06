package com.example.terramodusvt.repositories;
import com.example.terramodusvt.entities.Immob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImmobRepository extends JpaRepository<Immob,Long> {
}
