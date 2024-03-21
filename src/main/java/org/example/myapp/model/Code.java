package org.example.myapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Code {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codeId;
    @ManyToOne
    @JoinColumn(name="codeBook")
    @JsonIgnoreProperties("codes")
    private CodeBook codeBook;
    private String value;

    public Code() {

    }

    public int getCodeId() {
        return codeId;
    }

    public void setCodeId(int codeId) {
        this.codeId = codeId;
    }

    public CodeBook getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(CodeBook codeBook) {
        this.codeBook = codeBook;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
