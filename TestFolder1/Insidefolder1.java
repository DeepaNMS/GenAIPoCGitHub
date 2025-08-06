package com.allianz.bmp.claims.notification.service.core.adapter.outgoing.mongodb.notification.model.incident;

import com.allianz.claims.extensions.ExtendableClass;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

import static com.allianz.claims.extensions.ExtendableClass.ENTITY;

@Data
@SuperBuilder(toBuilder = true)
@ExtendableClass(extensionType = ENTITY)
@NoArgsConstructor
public class Insidefolder1 {

    private String caseNumber;
    private boolean leadingCase;
    private String caseLossCauseGrouping;
    private PersistenceReserveAmount reserveAmount;
    private String status;
    private LocalDateTime lastReopenDateTime;

}