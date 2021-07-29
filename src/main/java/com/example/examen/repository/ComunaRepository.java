package com.example.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.model.Comuna;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComunaRepository extends JpaRepository<Comuna, Long>{

    @Query(value = """
SELECT t0.id as "id", count(T0.id) as "totalAvistamientos",
SUM(CASE t1.tipo when 'no se' then 1 else 0 end) as "nose" ,
SUM(CASE t1.tipo when 'insecto' then 1 else 0 end) as "insecto",
SUM(CASE t1.tipo when 'miriapodo' then 1 else 0 end) as "miriapodo",
SUM(CASE t1.tipo when 'aracnido' then 1 else 0 end) as "aracnido" ,
         SUM(CASE t1.estado when 'vivo' then 1 else 0 end) as "vivo",
         SUM(CASE t1.estado when 'muerto' then 1 else 0 end) as "muerto"
 FROM tarea2.avistamiento T0
 left join tarea2.comuna T7 on T0.comuna_id = T7.id
 left join tarea2.detalle_avistamiento T1 on T0.id = T1.avistamiento_id
 where t7.nombre = ?1
""", nativeQuery = true)
    Comuna findAvistamientos(String comuna);


}
