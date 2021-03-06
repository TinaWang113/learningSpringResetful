package tw.tinawang.learning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tw.tinawang.learning.model.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {
    
}