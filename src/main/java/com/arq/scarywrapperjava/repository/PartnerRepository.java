package com.arq.scarywrapperjava.repository;

import com.arq.scarywrapperjava.domain.PartnerRecord;
import java.time.Instant;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class PartnerRepository {
    private final Map<String, PartnerRecord> storage = new ConcurrentHashMap<>();

    public PartnerRepository() {
        storage.put("partner-seed", new PartnerRecord("partner-seed", "partner-owner", "eu-central", Instant.now()));
    }

    public Collection<PartnerRecord> findAll() {
        return storage.values();
    }
}
