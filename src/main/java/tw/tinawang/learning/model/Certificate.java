package tw.tinawang.learning.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long certificateID;
    private String ctfName;

    @ManyToOne
    @JoinColumn(name = "skillId")
    private Skill skill;
    
    @ManyToOne
    @JoinColumn(name="companyId")
    private Company company;

    public Long getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(Long certificateID) {
        this.certificateID = certificateID;
    }

    public String getCtfName() {
        return ctfName;
    }

    public void setCtfName(String ctfName) {
        this.ctfName = ctfName;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    
}