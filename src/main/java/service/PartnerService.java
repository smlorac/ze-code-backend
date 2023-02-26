package service;

import model.Partner;
import org.springframework.stereotype.Service;
import repository.PartnerRepository;

@Service
public class PartnerService {

    private final PartnerRepository repository;

    public PartnerService(PartnerRepository repository) {
        this.repository = repository;
    }

    public Partner save(Partner partner){
        return repository.save(partner);
    }

    public Partner findById(Long id){
        return repository.findById(id).get();
    }

    public Partner findByLocation(int lon, int lat){
        return repository.findByLocation(lon, lat);
    }
}
