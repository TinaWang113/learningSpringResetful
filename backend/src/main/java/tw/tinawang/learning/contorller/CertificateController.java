package tw.tinawang.learning.contorller;

import tw.tinawang.learning.model.Certificate;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.tinawang.learning.dao.CertificateRepository;

@RestController
@RequestMapping("/api")
public class CertificateController {
    
    @Autowired
    private CertificateRepository certificateRepository;

    @GetMapping("/certificates")
    public Collection<Certificate> certificates(){
        return certificateRepository.findAll();
    }
}