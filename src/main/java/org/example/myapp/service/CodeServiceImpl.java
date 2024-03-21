package org.example.myapp.service;

import org.example.myapp.model.Code;
import org.example.myapp.model.CodeBook;
import org.example.myapp.repository.CodeBookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CodeServiceImpl implements CodeService {

    private final CodeBookRepository codeBookRepository;

    public CodeServiceImpl(CodeBookRepository codeBookRepository) {
        this.codeBookRepository = codeBookRepository;
    }

    @Override
    public List<CodeBook> getCodeBooks() {
        return codeBookRepository.findAll();
    }

    @Override
    public void saveTestCodes() {
        saveCards();
        saveFruits();
        saveColors();
    }

    private void saveCards() {
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

    private void saveFruits() {
        CodeBook codeBook = new CodeBook();
        codeBook.setName("fruits");
        List<Code> codes = new ArrayList<>();
        Code c1 = new Code();
        c1.setValue("apple");
        c1.setCodeBook(codeBook);
        codes.add(c1);
        Code c2 = new Code();
        c2.setValue("orange");
        c2.setCodeBook(codeBook);
        codes.add(c2);
        Code c3 = new Code();
        c3.setValue("banana");
        c3.setCodeBook(codeBook);
        codes.add(c3);
        Code c4 = new Code();
        c4.setValue("pear");
        c4.setCodeBook(codeBook);
        codes.add(c4);
        codeBook.setCodes(codes);
        codeBookRepository.save(codeBook);
    }

    private void saveColors() {
        CodeBook codeBook = new CodeBook();
        codeBook.setName("colors");
        List<Code> codes = new ArrayList<>();
        Code c1 = new Code();
        c1.setValue("red");
        c1.setCodeBook(codeBook);
        codes.add(c1);
        Code c2 = new Code();
        c2.setValue("green");
        c2.setCodeBook(codeBook);
        codes.add(c2);
        Code c3 = new Code();
        c3.setValue("blue");
        c3.setCodeBook(codeBook);
        codes.add(c3);
        Code c4 = new Code();
        c4.setValue("yellow");
        c4.setCodeBook(codeBook);
        codes.add(c4);
        codeBook.setCodes(codes);
        codeBookRepository.save(codeBook);
    }

}
