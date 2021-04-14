package com.example.springtest001.User;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true, nullable = false)
    private String fName;

    @Column(unique = true, nullable = false)
    private String lName;

    @Column(unique = true, nullable = false)
    private long pNumber;

    public user(Long id, String fName, String lName, Long pNumber) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.pNumber = pNumber;
    }

    public user() {

    }

    public user(long i, String ravi, String gupta, long i1) {   /// for testing
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", pNumber=" + pNumber +
                '}';
    }

}
