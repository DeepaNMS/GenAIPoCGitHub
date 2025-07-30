
package com.allianz.bmp.claims.notification.service.core.adapter.outgoing.mongodb.notification.model.incident;

import static com.allianz.claims.extensions.ExtendableClass.ENTITY;

import com.allianz.bmp.claims.notification.service.core.adapter.outgoing.mongodb.common.model.PersistenceAddress;
import com.allianz.bmp.claims.notification.service.core.adapter.outgoing.mongodb.common.model.PersistenceAuditableIdEntity;
import com.allianz.bmp.claims.notification.service.core.adapter.outgoing.mongodb.common.model.PersistenceDocumentContextReference;
import com.allianz.bmp.claims.notification.service.core.adapter.outgoing.mongodb.common.model.PersistenceLabeledValue;
import com.allianz.bmp.claims.notification.service.core.adapter.outgoing.mongodb.common.model.questionnaire.PersistenceQuestionnaireQuestion;
import com.allianz.bmp.claims.notification.service.core.adapter.outgoing.mongodb.linkedincident.model.PersistenceLinkedIncident;
import com.allianz.bmp.claims.notification.service.core.adapter.outgoing.mongodb.notification.model.incident.coverage.PersistenceCoverageData;
import com.allianz.bmp.claims.notification.service.core.adapter.outgoing.mongodb.notification.model.owndamage.PersistenceContextDocument;
import com.allianz.bmp.claims.notification.service.core.domain.model.complexity.IncidentComplexity;
import com.allianz.claims.extensions.ExtendableClass;
import java.time.LocalDate;
import java.time.OffsetDateTime;//date22222
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder(toBuilder = true)
@ExtendableClass(extensionType = ENTITY)
@NoArgsConstructor
public class PersistenceIncidentnewfile extends PersistenceAuditableIdEntity {

    private String newincidentNumberdeepaNewfile; //incident test nr
    private String newincidentNumberAdded; // new attribute new text 
    private String newincidentNumberAdded2; // Added line
    private String newnatCatCode; // nat code 
 }