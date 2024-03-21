package org.example.myapp.application;

import org.example.myapp.model.Code;

public class CodeDTO {

    private final Integer codeId;
    private final Integer codeBookId;
    private final String value;

    public CodeDTO(Code code) {
        this.codeId = code.getCodeId();
        this.codeBookId = code.getCodeBook().getCodeBookId();
        this.value = code.getValue();
    }

    public Integer getCodeId() {
        return codeId;
    }

    public Integer getCodeBookId() {
        return codeBookId;
    }

    public String getValue() {
        return value;
    }

}
