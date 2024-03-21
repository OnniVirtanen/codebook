package org.example.myapp.model;

import java.io.Serializable;
import java.util.List;

public class CodeCatalogue implements Serializable {

    private static final long serialVersionUID = 1L;

    private String version;
    private List<CodeBook> codeBooks;

    public CodeCatalogue(String version, List<CodeBook> codeBooks) {
        this.version = version;
        this.codeBooks = codeBooks;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<CodeBook> getCodeBooks() {
        return codeBooks;
    }

    public void setCodeBook(List<CodeBook> codeBooks) {
        this.codeBooks = codeBooks;
    }

}
