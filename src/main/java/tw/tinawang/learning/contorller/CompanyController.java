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
import tw.tinawang.learning.dao.CompanyRepository;
import tw.tinawang.learning.model.Company;


@RestController
@RequestMapping("/api")
public class CompanyController {
    
    @Autowired
    private CompanyRepository companyRepository ;

    //get all
    @GetMapping("/companies")
    public Collection<Company> companies(){
        return companyRepository.findAll();
    }

    @GetMapping("/companies/{cid}")
    public ResponseEntity<?> getCompany(@PathVariable Long cid) {
        Optional<Company> company = companyRepository.findById(cid);
    
        return company.map(response -> ResponseEntity.ok().body(company))
        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    

}