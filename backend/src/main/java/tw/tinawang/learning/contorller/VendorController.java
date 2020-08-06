package tw.tinawang.learning.contorller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.tinawang.learning.dao.VendorRepository;
import tw.tinawang.learning.model.Vendor;

@RequestMapping("/api")
@RestController
public class VendorController {

    @Autowired
    private VendorRepository vendorRepository;

    @GetMapping("/vendors")
    public Collection<Vendor> vendors(){
        return vendorRepository.findAll();
    }
 
    @GetMapping("/vendors/{id}")
    public ResponseEntity<?> getVendor(@PathVariable Long id){
        Optional <Vendor> vendor = vendorRepository.findById(id);
        return vendor.map(reponse -> ResponseEntity.ok().body(vendor))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}