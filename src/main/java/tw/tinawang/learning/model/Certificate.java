package tw.tinawang.learning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long certificateID;
    @NonNull
    private String ctfName;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "skillId")
    private Skill skill;
    
    @NonNull
    @ManyToOne
    @JoinColumn(name="companyId")
    private Company company;

}