package tw.tinawang.learning.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
    
    @Id
    private String mid;
    private String fname;
    private String lname;

    public Member(){};

    public Member(String fname, String lname){
        this.mid = UUID.randomUUID().toString().replaceAll("-", "");
        this.fname = fname;
        this.lname = lname;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    
}