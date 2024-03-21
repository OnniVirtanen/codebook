package org.example.myapp.application;

import org.example.myapp.model.CodeBook;

import java.util.List;

public class CodeBookDTO {

    private final Integer codeBookId;
    private final String name;
    private final List<CodeDTO> codes;

    public CodeBookDTO(CodeBook codeBook) {
        this.codeBookId = codeBook.getCodeBookId();
        this.name = codeBook.getName();
        this.codes = codeBook.getCodes().stream().map(CodeDTO::new).toList();
    }

    public Integer getCodeBookId() {
        return codeBookId;
    }

    public String getName() {
        return name;
    }

    public List<CodeDTO> getCodes() {
        return codes;
    }

}
