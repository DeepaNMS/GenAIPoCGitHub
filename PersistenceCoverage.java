package com.allianz.bmp.claims.notification.service.core.adapter.outgoing.mongodb.notification.model.incident;

import java.time.OffsetDateTime;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@Deprecated(forRemoval = true)
public class PersistenceCoverage {

    private PersistenceCoverageStatus automatedCoverageStatus;
    private PersistenceCoverageStatus coverageStatus;
    private String coverageReason;
    private OffsetDateTime lastCheckTime;
    private List<PersistenceCoverageOverrideItem> overrideItems;
    private String alterationsComment;
}