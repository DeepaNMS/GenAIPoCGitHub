
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
import java.time.OffsetDateTime;
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
public class PersistenceIncident extends PersistenceAuditableIdEntity {

    private String incidentNumber; //incident nr
    private String natCatCode;
    private LocalDate receivedOn;
    private boolean isIncidentInfoOnly;
    private PersistenceAddress location;
    private OffsetDateTime incidentDateTime;
    @Deprecated(forRemoval = true)
    private String whatHappenedCode;
    private String whatHappenedDescription;
    private PersistenceCoverageData coverageData;
    private IncidentComplexity incidentComplexity;
    private String lossCauseGrouping;
    private PersistenceIncidentStatus incidentStatus;
    private PersistenceIncidentCategory incidentCategory;
    private List<PersistenceCaseContext> relatedCases;
    private PersistenceIncidentPolicyData policyData;
    private List<PersistenceQuestionnaireQuestion> answeredQuestions;
    private List<PersistenceLinkedIncident> linkedIncidents;
    private List<PersistenceContextDocument> notificationReferences;
    private PersistenceLabeledValue reportingMedium;
    private OffsetDateTime discoveryDate;
    private List<PersistenceDocumentContextReference> additionalDocuments;
    private boolean confidential;
    private PersistencePremiumStatus premiumStatus;
    private PersistenceIncidentManuallyAddedPolicyData manuallyAddedPolicyData;
    private String incidentTimeZone;

}