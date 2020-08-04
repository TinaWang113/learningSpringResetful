package tw.tinawang.learning.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Skill {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long skillID;
    private String name;
    private String type;

    public Long getSkillID() {
        return skillID;
    }

    public void setSkillID(Long skillID) {
        this.skillID = skillID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
}