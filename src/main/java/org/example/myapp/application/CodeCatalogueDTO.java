package org.example.myapp.application;

import org.example.myapp.model.CodeBook;

import java.util.List;

public class CodeCatalogueDTO {

    private final String version;
    private final List<CodeBookDTO> codeBooks;

    public CodeCatalogueDTO(String version, List<CodeBook> codeBooks) {
        this.version = version;
        this.codeBooks = codeBooks.stream().map(CodeBookDTO::new).toList();
    }

    public String getVersion() {
        return version;
    }

    public List<CodeBookDTO> getCodeBooks() {
        return codeBooks;
    }

}
