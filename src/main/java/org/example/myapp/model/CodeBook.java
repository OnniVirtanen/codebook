package org.example.myapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CodeBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codeBookId;
    private String name;
    @OneToMany(mappedBy = "codeBook", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Code> codes = new ArrayList<>();

    public CodeBook() {

    }

    public void addCode(Code code) {
        codes.add(code);
        code.setCodeBook(this);
    }

    public Integer getCodeBookId() {
        return codeBookId;
    }

    public void setCodeBookId(Integer codeBookId) {
        this.codeBookId = codeBookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Code> getCodes() {
        return codes;
    }

    public void setCodes(List<Code> codes) {
        this.codes = codes;
    }

}
