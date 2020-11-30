package com.contrastsecurity.api.Application_score_flow;

import com.contrastsecurity.api.constants.Auth;
import com.contrastsecurity.api.constants.BaseURI;
import com.contrastsecurity.api.constants.Endpoints;
import com.contrastsecurity.api.models.app_libraries.ApplicationLibraries;
import com.contrastsecurity.api.models.app_libraries.Library;
import com.contrastsecurity.api.models.app_scores.ApplicationScores;
import com.contrastsecurity.api.models.app_vulnerabilities.ApplicationVulnerabilities;
import com.contrastsecurity.api.models.applications.Application;
import com.contrastsecurity.api.models.applications.ApplicationsByOrg;
import com.contrastsecurity.api.models.organizations.ProfileOrganizations;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;

public class TestApplicationFlow extends Assert {
    private static String organization_uuid;
    private static String app_id;

    @Test
    public void testGETOrganizationUuid() {
        RestAssured.config = RestAssuredConfig.newConfig().httpClient(HttpClientConfig.httpClientConfig());
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .setBaseUri(BaseURI.BASE_URL.get())
                .setBasePath(BaseURI.NG.get())
                .setContentType(ContentType.JSON)
                .addHeaders(Auth.getCreds())
                .build();
        requestSpecification.log().all();

        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(Matchers.anyOf(
                        is(200),
                        is(201),
                        is(202),
                        is(203),
                        is(204),
                        is(205),
                        is(206)))
                .expectContentType(ContentType.JSON)
                .expectResponseTime(lessThan(180L), TimeUnit.SECONDS)
                .build();

        Response response = given()
                .spec(requestSpecification)
                .request(Method.GET, Endpoints.PROFILE.get().concat(Endpoints.ORGANIZATIONS.get()));
        response.then().spec(responseSpecification);

        response.prettyPrint();

        ProfileOrganizations organizations = response.as(ProfileOrganizations.class);
        organizations.getOrganizations().forEach(org -> {
            assertNotNull(org.getName(), "org.getName field is null");
            assertNotNull(org.getTimezone(), "org.getTimezone field is null");
            assertNotNull(org.getOrganizationUuid(), "org.getOrganizationUuid field is null");
            assertNotNull(org.getDateFormat(), "org.getDateFormat field is null");
            assertNotNull(org.getTimeFormat(), "org.getTimeFormat field is null");
            assertNotNull(org.getLocale(), "org.getLocale field is null");
            assertNotNull(org.getCreationTime(), "org.getCreationTime field is null");
            assertNotNull(org.getProtectionEnabled(), "org.getProtectionEnabled field is null");
            assertNotNull(org.getAutoLicenseProtection(), "org.getAutoLicenseProtection field is null");
            assertNotNull(org.getAutoLicenseAssessment(), "org.getAutoLicenseAssessment field is null");
            assertNotNull(org.getSuperadmin(), "org.getSuperadmin field is null");
            assertNotNull(org.getServerEnvironments(), "org.getServerEnvironments field is null");
            assertNotNull(org.getHarmonyEnabled(), "org.getHarmonyEnabled field is null");
        });

        organization_uuid = organizations.getOrganizations().get(0).getOrganizationUuid();
        assertEquals(java.util.Optional.of(organizations.getCount()), java.util.Optional.of(organizations.getOrganizations().size()));
    }

    @Test(dependsOnMethods = {"testGETOrganizationUuid"})
    public void testGETOrgApplications() {
        RestAssured.config = RestAssuredConfig.newConfig().httpClient(HttpClientConfig.httpClientConfig());
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .setBaseUri(BaseURI.BASE_URL.get())
                .setBasePath(BaseURI.NG.get())
                .setContentType(ContentType.JSON)
                .addHeaders(Auth.getCreds())
                .addPathParam("id", organization_uuid).build();
        requestSpecification.log().all();


        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(Matchers.anyOf(
                        is(200),
                        is(201),
                        is(202),
                        is(203),
                        is(204),
                        is(205),
                        is(206)))
                .expectContentType(ContentType.JSON)
                .expectResponseTime(lessThan(180L), TimeUnit.SECONDS)
                .build();

        Response response = given().spec(requestSpecification)
                .request(Method.GET, Endpoints.ID.get().concat(Endpoints.APPLICATIONS.get()));
        response.then().spec(responseSpecification);
        response.prettyPrint();

        ApplicationsByOrg applications = response.as(ApplicationsByOrg.class);
        assertTrue(applications.getSuccess());
        assertEquals(applications.getMessages().get(0), "Applications loaded successfully");

        for (Application application : applications.getApplications()) {
            assertNotNull(application.getName(), "application.getName field is null");
            assertNotNull(application.getPath(), "application.getPath field is null");
            assertNotNull(application.getLanguage(), "application.getLanguage field is null");
            assertNotNull(application.getCreated(), "application.getCreated field is null");
            assertNotNull(application.getStatus(), "application.getStatus field is null");
            assertNotNull(application.getImportance(), "application.getImportance field is null");
            assertNotNull(application.getArchived(), "application.getArchived field is null");
            assertNotNull(application.getAssess(), "application.getAssess field is null");
            assertNotNull(application.getAssessPending(), "application.getAssessPending field is null");
            assertNotNull(application.getMaster(), "application.getMaster field is null");
            assertNotNull(application.getNotes(), "application.getNotes field is null");
            assertNotNull(application.getDefend(), "application.getDefend field is null");
            assertNotNull(application.getDefendPending(), "application.getDefendPending field is null");
            assertNotNull(application.getRoles(), "application.getRoles field is null");
            assertNotNull(application.getTags(), "application.getTags field is null");
            assertNotNull(application.getTechs(), "application.getTechs field is null");
            assertNotNull(application.getPolicies(), "application.getPolicies field is null");
            assertNotNull(application.getLinks(), "application.getLinks field is null");
            assertNotNull(application.getAppId(), "application.getAppId field is null");
            assertNotNull(application.getLastSeen(), "application.getLastSeen field is null");
            assertNotNull(application.getSizeShorthand(), "application.getSizeShorthand field is null");
            assertNotNull(application.getSize(), "application.getSize field is null");
            assertNotNull(application.getCodeShorthand(), "application.getCodeShorthand field is null");
            assertNotNull(application.getCode(), "application.getCode field is null");
            assertNotNull(application.getImportanceDescription(), "application.getImportanceDescription field is null");
            assertNotNull(application.getTotalModules(), "application.getTotalModules field is null");
            assertNotNull(application.getAttackLabel(), "application.getAttackLabel field is null");
            assertNotNull(application.getActiveAttacks(), "application.getActiveAttacks field is null");
            assertNotNull(application.getServersWithoutDefend(), "application.getServersWithoutDefend field is null");
            assertNotNull(application.getFirstSeen(), "application.getFirstSeen field is null");


            application.getLinks().stream()
                    .filter(l -> l.getHref() != null).collect(Collectors.toList())
                    .forEach(link -> {
                        assertNotNull(link.getRel(), "link.getRel is null");
                        assertNotNull(link.getHref(), "link.getHref is  null");
                        assertNotNull(link.getMethod(), "link.getMethod is null");
                    });

            assertNotNull(application.getAppId(), "app id is null");
            app_id = application.getAppId();
        }
    }

    @Test(dependsOnMethods = {"testGETOrganizationUuid", "testGETOrgApplications"})
    public void testGETOrgApplicationScore() {
        RestAssured.config = RestAssuredConfig.newConfig().httpClient(HttpClientConfig.httpClientConfig());
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .setBaseUri(BaseURI.BASE_URL.get())
                .setBasePath(BaseURI.NG.get())
                .setContentType(ContentType.JSON)
                .addHeaders(Auth.getCreds())
                .addPathParam("id", organization_uuid)
                .addPathParam("app_id", app_id).build();
        requestSpecification.log().all();


        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(Matchers.anyOf(
                        is(200),
                        is(201),
                        is(202),
                        is(203),
                        is(204),
                        is(205),
                        is(206)))
                .expectContentType(ContentType.JSON)
                .expectResponseTime(lessThan(180L), TimeUnit.SECONDS)
                .build();

        Response response = given().spec(requestSpecification)
                .request(Method.GET, Endpoints.ID.get()
                        .concat(Endpoints.APPLICATIONS.get())
                        .concat(Endpoints.APP_ID.get())
                        .concat(Endpoints.SCORE.get()));
        response.then().spec(responseSpecification);
        response.prettyPrint();

        ApplicationScores scores = response.as(ApplicationScores.class);
        assertTrue(scores.getSuccess(), "request not success");
        assertEquals(scores.getMessages().get(0), "Scores loaded successfully");

        assertNotNull(scores.getScores().getGrade(), "scores.getScores().getGrade field is null");
        assertNotNull(scores.getScores().getPlatform(), "scores.getScores().getPlatform field is null");
        assertNotNull(scores.getScores().getPlatform().getGrade(), "scores.getScores().getPlatform().getGrade field is null");
        assertNotNull(scores.getScores().getPlatform().getLetterGrade(), "scores.getScores().getPlatform().getLetterGrade field is null");
        assertNotNull(scores.getScores().getSecurity(), "scores.getScores().getSecurity field is null");
        assertNotNull(scores.getScores().getSecurity().getGrade(), "scores.getScores().getSecurity().getGrade field is null");
        assertNotNull(scores.getScores().getSecurity().getLetterGrade(), "scores.getScores().getSecurity().getLetterGrade field is null");
        assertNotNull(scores.getScores().getOverallScoringType(), "scores.getScores().getOverallScoringType field is null");
        assertNotNull(scores.getScores().getLibraryScoringType(), "scores.getScores().getLibraryScoringType field is null");
        assertNotNull(scores.getScores().getLetterGrade(), "scores.getScores().getLetterGrade field is null");
    }

    @Test(dependsOnMethods = {"testGETOrganizationUuid", "testGETOrgApplications"})
    public void testGETOrgApplicationLibraries() {
        RestAssured.config = RestAssuredConfig.newConfig().httpClient(HttpClientConfig.httpClientConfig());
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .setBaseUri(BaseURI.BASE_URL.get())
                .setBasePath(BaseURI.NG.get())
                .setContentType(ContentType.JSON)
                .addHeaders(Auth.getCreds())
                .addPathParam("id", organization_uuid)
                .addPathParam("app_id", app_id).build();
        requestSpecification.log().all();


        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(Matchers.anyOf(
                        is(200),
                        is(201),
                        is(202),
                        is(203),
                        is(204),
                        is(205),
                        is(206)))
                .expectContentType(ContentType.JSON)
                .expectResponseTime(lessThan(180L), TimeUnit.SECONDS)
                .build();

        Response response = given().spec(requestSpecification)
                .request(Method.GET, Endpoints.ID.get()
                        .concat(Endpoints.APPLICATIONS.get())
                        .concat(Endpoints.APP_ID.get())
                        .concat(Endpoints.LIBRARIES.get()));

        response.then().spec(responseSpecification);
        response.prettyPrint();

        ApplicationLibraries libraries = response.as(ApplicationLibraries.class);
        assertTrue(libraries.getSuccess(), "request not success");
        assertEquals(libraries.getMessages().get(0), "Libraries loaded successfully");

        assertNotNull(libraries.getSuccess(), "libraries.getSuccess() field is null");
        assertNotNull(libraries.getMessages(), "libraries.getMessages() field is null");
        assertNotNull(libraries.getLibraries(), "libraries.getLibraries() field is null");
        assertNotNull(libraries.getCount(), "libraries.getCount() field is null");
        assertNotNull(libraries.getAverageScoreLetter(), "libraries.getAverageScoreLetter() field is null");
        assertNotNull(libraries.getAverageScore(), "libraries.getAverageScore() field is null");
        assertNotNull(libraries.getQuickFilters(), "libraries.getQuickFilters() field is null");

        for (Library library : libraries.getLibraries()) {
            assertNotNull(library.getHash(), "library.getHash field is null");
            assertNotNull(library.getCustom(), "library.getCustom field is null");
            assertNotNull(library.getGrade(), "library.getGrade field is null");
            assertNotNull(library.getScore(), "library.getScore field is null");
            assertNotNull(library.getAgePenalty(), "library.getAgePenalty field is null");
            assertNotNull(library.getVersionPenalty(), "library.getVersionPenalty field is null");
            assertNotNull(library.getVersion(), "library.getVersion field is null");
            assertNotNull(library.getLoc(), "library.getLoc field is null");
            assertNotNull(library.getVulns(), "library.getVulns field is null");
            assertNotNull(library.getRestricted(), "library.getRestricted field is null");
            assertNotNull(library.getLicenses(), "library.getLicenses field is null");
            assertNotNull(library.getOssEnabled(), "library.getOssEnabled field is null");
            assertNotNull(library.getFileName(), "library.getFileName field is null");
            assertNotNull(library.getAppLanguage(), "library.getAppLanguage field is null");
            assertNotNull(library.getGroup(), "library.getGroup field is null");
            assertNotNull(library.getFileVersion(), "library.getFileVersion field is null");
            assertNotNull(library.getLatestVersion(), "library.getLatestVersion field is null");
            assertNotNull(library.getReleaseDate(), "library.getReleaseDate field is null");
            assertNotNull(library.getLatestReleaseDate(), "library.getLatestReleaseDate field is null");
            assertNotNull(library.getClassesUsed(), "library.getClassesUsed field is null");
            assertNotNull(library.getClassCount(), "library.getClassCount field is null");
            assertNotNull(library.getLocShorthand(), "library.getLocShorthand field is null");
            assertNotNull(library.getTotalVulnerabilities(), "library.getTotalVulnerabilities field is null");
            assertNotNull(library.getMonthsOutdated(), "library.getMonthsOutdated field is null");
            assertNotNull(library.getVersionsBehind(), "library.getVersionsBehind field is null");
            assertNotNull(library.getHighVulnerabilities(), "library.getHighVulnerabilities field is null");
            assertNotNull(library.getInvalidVersion(), "library.getInvalidVersion field is null");
            assertNotNull(library.getBugtrackerTickets(), "library.getBugtrackerTickets field is null");
        }
    }

    @Test(dependsOnMethods = {"testGETOrganizationUuid", "testGETOrgApplications"})
    public void testGETOrgApplicationVulnerabilities() {
        RestAssured.config = RestAssuredConfig.newConfig().httpClient(HttpClientConfig.httpClientConfig());
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .setBaseUri(BaseURI.BASE_URL.get())
                .setBasePath(BaseURI.NG.get())
                .setContentType(ContentType.JSON)
                .addHeaders(Auth.getCreds())
                .addPathParam("id", organization_uuid)
                .addPathParam("app_id", app_id).build();
        requestSpecification.log().all();


        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(Matchers.anyOf(
                        is(200),
                        is(201),
                        is(202),
                        is(203),
                        is(204),
                        is(205),
                        is(206)))
                .expectContentType(ContentType.JSON)
                .expectResponseTime(lessThan(180L), TimeUnit.SECONDS)
                .build();

        Response response = given().spec(requestSpecification)
                .request(Method.GET, Endpoints.ID.get()
                        .concat(Endpoints.APPLICATIONS.get())
                        .concat(Endpoints.APP_ID.get())
                        .concat(Endpoints.BREACKPOINTS.get())
                        .concat(Endpoints.TRACE.get()));

        response.then().spec(responseSpecification);
        response.prettyPrint();

        ApplicationVulnerabilities vulnerabilities = response.as(ApplicationVulnerabilities.class);
        assertTrue(vulnerabilities.getSuccess(), "request not success");
        assertEquals(vulnerabilities.getMessages().get(0), "Application Vulnerability Breakdown loaded successfully");

        assertNotNull(vulnerabilities.getTraceBreakdown().getCriticals(), "TraceBreakdown().getCriticals field is null");
        assertNotNull(vulnerabilities.getTraceBreakdown().getHighs(), "TraceBreakdown().getHighs field is null");
        assertNotNull(vulnerabilities.getTraceBreakdown().getMeds(), "TraceBreakdown().getMeds field is null");
        assertNotNull(vulnerabilities.getTraceBreakdown().getLows(), "TraceBreakdown().getLows field is null");
        assertNotNull(vulnerabilities.getTraceBreakdown().getNotes(), "TraceBreakdown().getNotes field is null");
        assertNotNull(vulnerabilities.getTraceBreakdown().getSafes(), "TraceBreakdown().getSafes field is null");
        assertNotNull(vulnerabilities.getTraceBreakdown().getTriaged(), "TraceBreakdown().getTriaged field is null");
        assertNotNull(vulnerabilities.getTraceBreakdown().getConfirmed(), "TraceBreakdown().getConfirmed field is null");
        assertNotNull(vulnerabilities.getTraceBreakdown().getSuspicious(), "TraceBreakdown().getSuspicious field is null");
        assertNotNull(vulnerabilities.getTraceBreakdown().getNotProblem(), "TraceBreakdown().getNotProblem field is null");
        assertNotNull(vulnerabilities.getTraceBreakdown().getRemediated(), "TraceBreakdown().getRemediated field is null");
        assertNotNull(vulnerabilities.getTraceBreakdown().getReported(), "TraceBreakdown().getReported field is null");
        assertNotNull(vulnerabilities.getTraceBreakdown().getFixed(), "TraceBreakdown().getFixed field is null");
        assertNotNull(vulnerabilities.getTraceBreakdown().getRemediatedAutoVerified(), "TraceBreakdown().getRemediatedAutoVerified field is null");
        assertNotNull(vulnerabilities.getTraceBreakdown().getTraces(), "TraceBreakdown().getTraces field is null");
    }

}
