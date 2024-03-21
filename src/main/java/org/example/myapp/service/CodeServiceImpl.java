package org.example.myapp.service;

import org.example.myapp.model.Code;
import org.example.myapp.model.CodeBook;
import org.example.myapp.model.CodeCatalogue;
import org.example.myapp.repository.CodeBookRepository;
import org.example.myapp.repository.CodeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CodeServiceImpl implements CodeService {

    private final CodeBookRepository codeBookRepository;
    private final CodeRepository codeRepository;

    public CodeServiceImpl(CodeBookRepository codeBookRepository,
                           CodeRepository codeRepository) {
        this.codeBookRepository = codeBookRepository;
        this.codeRepository = codeRepository;
    }

    @Override
    public CodeCatalogue getCodeCatalogue() {
        return new CodeCatalogue("v1", codeBookRepository.findAll());
    }

    @Override
    public void saveTestCodes() {
        CodeBook codeBook = new CodeBook();
        codeBook.setName("cards");

        List<Code> codes = new ArrayList<>();

        Code c1 = new Code();
        c1.setValue("diamonds");
        c1.setCodeBook(codeBook);
        codes.add(c1);
        Code c2 = new Code();
        c2.setValue("spades");
        c2.setCodeBook(codeBook);
        codes.add(c2);
        Code c3 = new Code();
        c3.setValue("hearts");
        c3.setCodeBook(codeBook);
        codes.add(c3);
        Code c4 = new Code();
        c4.setValue("clubs");
        c4.setCodeBook(codeBook);
        codes.add(c4);

        codeBook.setCodes(codes);

        codeBookRepository.save(codeBook);

    }

}
