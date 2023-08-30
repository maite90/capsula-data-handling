package com.ejercicioCapsula.chatGPT.repositories;

import com.ejercicioCapsula.chatGPT.entities.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Billing, Long> {
    Billing findByBilling(String billing);
}
