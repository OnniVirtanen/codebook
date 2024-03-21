package org.example.myapp.application;

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
    public ResponseEntity<CodeCatalogueDTO> getCodeCatalogue() {
        CodeCatalogueDTO codeCatalogueDTO = new CodeCatalogueDTO("1.0", codeService.getCodeBooks());
        return ResponseEntity.ok(codeCatalogueDTO);
    }

    @PostMapping("/testcodes")
    public void saveTestCodes() {
        codeService.saveTestCodes();
    }

}
