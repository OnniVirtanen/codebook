package org.example.myapp.service;

import org.example.myapp.model.CodeBook;

import java.util.List;

public interface CodeService {

    List<CodeBook> getCodeBooks();
    void saveTestCodes();

}
