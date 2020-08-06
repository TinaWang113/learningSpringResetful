package tw.tinawang.learning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tw.tinawang.learning.model.Certificate;


@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long>{
    
}