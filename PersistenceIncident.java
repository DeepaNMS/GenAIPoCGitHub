
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
import com.allianz.claims.extensions.ExtendableClass;//deepa
import java.time.LocalDate;
import java.time.OffsetDateTime;//date222224345345
import java.util.List;
import lombok.Data;//test
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder(toBuilder = true)
@ExtendableClass(extensionType = ENTITY)
@NoArgsConstructor
public class PersistenceIncident extends PersistenceAuditableIdEntity {

    private String incidentNumber; //incident nr343kk434newdddd
    private String cfmnewincidentNumber; //incident nr4466kkjj
    private String natCatCode; // nat code 66666kk
    private LocalDate receivedOn; //received  dd one
    private boolean isIncidentInfoOnly;//kk
    private PersistenceAddress location;//new changekkkkk
    private OffsetDateTime incidentDateTime; //incidenjjjt date and time
    @Deprecated(forRemoval = true)
    private String whatHappenedCode; //hah
    private String whatHappenedDescription;
    private PersistenceCoverageData coverageData;
    private IncidentComplexity incidentComplexity;
    private String lossCauseGrouping;
    private PersistenceIncidentStatus incidentStatus;
    private PersistenceIncidentCategory incidentCategory;
    private List<PersistenceCaseContext> relatedCases;
    private PersistenceIncidentPolicyData policyData;
    private List<PersistenceQuestionnaireQuestion> answeredQuestions;
    private List<PersistenceLinkedIncident> linkedIncidents;//ff
    private List<PersistenceContextDocument> notificationReferences;
    private PersistenceLabeledValue reportingMedium;//dddd2323233
    private OffsetDateTime discoveryDate; //sss2342333355444kk55 test chang 
    private List<PersistenceDocumentContextReference> additionalDocuments;
    private boolean confidential; //cdddjj33asdadasff33eeee333
    private PersistencePremiumStatus premiumStatus;//ddddd3322333
    private PersistenceIncidentManuallyAddedPolicyData manuallyAddedPolicyData;
    private String incidentTimeZone; ////dddd3377s44455554444333
    private String deepatestvariable5; //sample test var testsdsddwqd test
    private String deepatestvariable6; //sample test var testsdsddwqd test
}