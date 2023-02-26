package controller;

import model.Partner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.PartnerService;

@RestController
@RequestMapping("/partners")
public class PartnerController {

    private final PartnerService service;

    public PartnerController(PartnerService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Partner> createPartner(@RequestBody Partner partner){
        return ResponseEntity.ok(service.save(partner));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Partner> findPartnerById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/location")
    public ResponseEntity<Partner> findPartnerByLocation(@RequestParam int lon,  @RequestParam int lat){
        return ResponseEntity.ok(service.findByLocation(lon, lat));
    }
}
