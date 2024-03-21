package org.example.myapp.application;

import org.example.myapp.model.CodeCatalogue;
import org.example.myapp.service.CodeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeCatalogueController {

    private final CodeService codeService;

    public CodeCatalogueController(CodeService codeService) {
        this.codeService = codeService;
    }

    @GetMapping("/codecatalogue")
    public ResponseEntity<CodeCatalogue> getCodeCatalogue() {
        return ResponseEntity.ok(codeService.getCodeCatalogue());
    }

    @PostMapping("/testcodes")
    public void saveTestCodes() {
        codeService.saveTestCodes();
    }

}
