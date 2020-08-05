package tw.tinawang.learning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public @Data class Skill {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long skillID;
    @NonNull
    private String name;
    @NonNull
    private String type;

}