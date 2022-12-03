package com.project.multitenancy.repository;

import com.project.multitenancy.model.InspectionSubscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspectionRepository extends JpaRepository<InspectionSubscription, Long> {
}
