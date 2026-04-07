package com.arq.scarywrapperjava.web;

import com.arq.scarywrapperjava.dto.LedgerResponse;
import com.arq.scarywrapperjava.service.LedgerService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ledger")
public class LedgerController {
    private final LedgerService service;

    public LedgerController(LedgerService service) {
        this.service = service;
    }

    @GetMapping
    public List<LedgerResponse> list() {
        return service.summarize();
    }
}
