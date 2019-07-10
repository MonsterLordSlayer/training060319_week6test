
package com.example.training060319_week6test;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SchoolAlone implements Parcelable
{

    @SerializedName("dbn")
    @Expose
    private String dbn;
    @SerializedName("school_name")
    @Expose
    private String schoolName;
    @SerializedName("boro")
    @Expose
    private String boro;
    @SerializedName("overview_paragraph")
    @Expose
    private String overviewParagraph;
    @SerializedName("academicopportunities1")
    @Expose
    private String academicopportunities1;
    @SerializedName("academicopportunities2")
    @Expose
    private String academicopportunities2;
    @SerializedName("academicopportunities3")
    @Expose
    private String academicopportunities3;
    @SerializedName("ell_programs")
    @Expose
    private String ellPrograms;
    @SerializedName("neighborhood")
    @Expose
    private String neighborhood;
    @SerializedName("shared_space")
    @Expose
    private String sharedSpace;
    @SerializedName("building_code")
    @Expose
    private String buildingCode;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("phone_number")
    @Expose
    private String phoneNumber;
    @SerializedName("fax_number")
    @Expose
    private String faxNumber;
    @SerializedName("school_email")
    @Expose
    private String schoolEmail;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("subway")
    @Expose
    private String subway;
    @SerializedName("bus")
    @Expose
    private String bus;
    @SerializedName("grades2018")
    @Expose
    private String grades2018;
    @SerializedName("finalgrades")
    @Expose
    private String finalgrades;
    @SerializedName("total_students")
    @Expose
    private String totalStudents;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("end_time")
    @Expose
    private String endTime;
    @SerializedName("addtl_info1")
    @Expose
    private String addtlInfo1;
    @SerializedName("extracurricular_activities")
    @Expose
    private String extracurricularActivities;
    @SerializedName("attendance_rate")
    @Expose
    private String attendanceRate;
    @SerializedName("pct_stu_enough_variety")
    @Expose
    private String pctStuEnoughVariety;
    @SerializedName("pct_stu_safe")
    @Expose
    private String pctStuSafe;
    @SerializedName("school_accessibility_description")
    @Expose
    private String schoolAccessibilityDescription;
    @SerializedName("offer_rate1")
    @Expose
    private String offerRate1;
    @SerializedName("program1")
    @Expose
    private String program1;
    @SerializedName("code1")
    @Expose
    private String code1;
    @SerializedName("interest1")
    @Expose
    private String interest1;
    @SerializedName("method1")
    @Expose
    private String method1;
    @SerializedName("seats9ge1")
    @Expose
    private String seats9ge1;
    @SerializedName("grade9gefilledflag1")
    @Expose
    private String grade9gefilledflag1;
    @SerializedName("grade9geapplicants1")
    @Expose
    private String grade9geapplicants1;
    @SerializedName("seats9swd1")
    @Expose
    private String seats9swd1;
    @SerializedName("grade9swdfilledflag1")
    @Expose
    private String grade9swdfilledflag1;
    @SerializedName("grade9swdapplicants1")
    @Expose
    private String grade9swdapplicants1;
    @SerializedName("seats101")
    @Expose
    private String seats101;
    @SerializedName("admissionspriority11")
    @Expose
    private String admissionspriority11;
    @SerializedName("admissionspriority21")
    @Expose
    private String admissionspriority21;
    @SerializedName("admissionspriority31")
    @Expose
    private String admissionspriority31;
    @SerializedName("admissionspriority41")
    @Expose
    private String admissionspriority41;
    @SerializedName("grade9geapplicantsperseat1")
    @Expose
    private String grade9geapplicantsperseat1;
    @SerializedName("grade9swdapplicantsperseat1")
    @Expose
    private String grade9swdapplicantsperseat1;
    @SerializedName("primary_address_line_1")
    @Expose
    private String primaryAddressLine1;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("state_code")
    @Expose
    private String stateCode;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("community_board")
    @Expose
    private String communityBoard;
    @SerializedName("council_district")
    @Expose
    private String councilDistrict;
    @SerializedName("census_tract")
    @Expose
    private String censusTract;
    @SerializedName("bin")
    @Expose
    private String bin;
    @SerializedName("bbl")
    @Expose
    private String bbl;
    @SerializedName("nta")
    @Expose
    private String nta;
    @SerializedName("borough")
    @Expose
    private String borough;
    public final static Parcelable.Creator<SchoolAlone> CREATOR = new Creator<SchoolAlone>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SchoolAlone createFromParcel(Parcel in) {
            return new SchoolAlone(in);
        }

        public SchoolAlone[] newArray(int size) {
            return (new SchoolAlone[size]);
        }

    }
    ;

    protected SchoolAlone(Parcel in) {
        this.dbn = ((String) in.readValue((String.class.getClassLoader())));
        this.schoolName = ((String) in.readValue((String.class.getClassLoader())));
        this.boro = ((String) in.readValue((String.class.getClassLoader())));
        this.overviewParagraph = ((String) in.readValue((String.class.getClassLoader())));
        this.academicopportunities1 = ((String) in.readValue((String.class.getClassLoader())));
        this.academicopportunities2 = ((String) in.readValue((String.class.getClassLoader())));
        this.academicopportunities3 = ((String) in.readValue((String.class.getClassLoader())));
        this.ellPrograms = ((String) in.readValue((String.class.getClassLoader())));
        this.neighborhood = ((String) in.readValue((String.class.getClassLoader())));
        this.sharedSpace = ((String) in.readValue((String.class.getClassLoader())));
        this.buildingCode = ((String) in.readValue((String.class.getClassLoader())));
        this.location = ((String) in.readValue((String.class.getClassLoader())));
        this.phoneNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.faxNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.schoolEmail = ((String) in.readValue((String.class.getClassLoader())));
        this.website = ((String) in.readValue((String.class.getClassLoader())));
        this.subway = ((String) in.readValue((String.class.getClassLoader())));
        this.bus = ((String) in.readValue((String.class.getClassLoader())));
        this.grades2018 = ((String) in.readValue((String.class.getClassLoader())));
        this.finalgrades = ((String) in.readValue((String.class.getClassLoader())));
        this.totalStudents = ((String) in.readValue((String.class.getClassLoader())));
        this.startTime = ((String) in.readValue((String.class.getClassLoader())));
        this.endTime = ((String) in.readValue((String.class.getClassLoader())));
        this.addtlInfo1 = ((String) in.readValue((String.class.getClassLoader())));
        this.extracurricularActivities = ((String) in.readValue((String.class.getClassLoader())));
        this.attendanceRate = ((String) in.readValue((String.class.getClassLoader())));
        this.pctStuEnoughVariety = ((String) in.readValue((String.class.getClassLoader())));
        this.pctStuSafe = ((String) in.readValue((String.class.getClassLoader())));
        this.schoolAccessibilityDescription = ((String) in.readValue((String.class.getClassLoader())));
        this.offerRate1 = ((String) in.readValue((String.class.getClassLoader())));
        this.program1 = ((String) in.readValue((String.class.getClassLoader())));
        this.code1 = ((String) in.readValue((String.class.getClassLoader())));
        this.interest1 = ((String) in.readValue((String.class.getClassLoader())));
        this.method1 = ((String) in.readValue((String.class.getClassLoader())));
        this.seats9ge1 = ((String) in.readValue((String.class.getClassLoader())));
        this.grade9gefilledflag1 = ((String) in.readValue((String.class.getClassLoader())));
        this.grade9geapplicants1 = ((String) in.readValue((String.class.getClassLoader())));
        this.seats9swd1 = ((String) in.readValue((String.class.getClassLoader())));
        this.grade9swdfilledflag1 = ((String) in.readValue((String.class.getClassLoader())));
        this.grade9swdapplicants1 = ((String) in.readValue((String.class.getClassLoader())));
        this.seats101 = ((String) in.readValue((String.class.getClassLoader())));
        this.admissionspriority11 = ((String) in.readValue((String.class.getClassLoader())));
        this.admissionspriority21 = ((String) in.readValue((String.class.getClassLoader())));
        this.admissionspriority31 = ((String) in.readValue((String.class.getClassLoader())));
        this.admissionspriority41 = ((String) in.readValue((String.class.getClassLoader())));
        this.grade9geapplicantsperseat1 = ((String) in.readValue((String.class.getClassLoader())));
        this.grade9swdapplicantsperseat1 = ((String) in.readValue((String.class.getClassLoader())));
        this.primaryAddressLine1 = ((String) in.readValue((String.class.getClassLoader())));
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.zip = ((String) in.readValue((String.class.getClassLoader())));
        this.stateCode = ((String) in.readValue((String.class.getClassLoader())));
        this.latitude = ((String) in.readValue((String.class.getClassLoader())));
        this.longitude = ((String) in.readValue((String.class.getClassLoader())));
        this.communityBoard = ((String) in.readValue((String.class.getClassLoader())));
        this.councilDistrict = ((String) in.readValue((String.class.getClassLoader())));
        this.censusTract = ((String) in.readValue((String.class.getClassLoader())));
        this.bin = ((String) in.readValue((String.class.getClassLoader())));
        this.bbl = ((String) in.readValue((String.class.getClassLoader())));
        this.nta = ((String) in.readValue((String.class.getClassLoader())));
        this.borough = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public SchoolAlone() {
    }

    /**
     * 
     * @param bbl
     * @param bus
     * @param schoolName
     * @param location
     * @param interest1
     * @param grade9geapplicants1
     * @param pctStuSafe
     * @param totalStudents
     * @param pctStuEnoughVariety
     * @param endTime
     * @param city
     * @param ellPrograms
     * @param startTime
     * @param subway
     * @param phoneNumber
     * @param dbn
     * @param attendanceRate
     * @param schoolEmail
     * @param longitude
     * @param grade9geapplicantsperseat1
     * @param communityBoard
     * @param grades2018
     * @param academicopportunities1
     * @param addtlInfo1
     * @param seats9ge1
     * @param nta
     * @param neighborhood
     * @param stateCode
     * @param overviewParagraph
     * @param grade9swdapplicantsperseat1
     * @param academicopportunities2
     * @param academicopportunities3
     * @param grade9swdapplicants1
     * @param code1
     * @param bin
     * @param latitude
     * @param grade9gefilledflag1
     * @param offerRate1
     * @param boro
     * @param seats101
     * @param primaryAddressLine1
     * @param buildingCode
     * @param admissionspriority41
     * @param method1
     * @param faxNumber
     * @param grade9swdfilledflag1
     * @param finalgrades
     * @param admissionspriority11
     * @param censusTract
     * @param councilDistrict
     * @param schoolAccessibilityDescription
     * @param extracurricularActivities
     * @param zip
     * @param sharedSpace
     * @param website
     * @param program1
     * @param admissionspriority31
     * @param borough
     * @param seats9swd1
     * @param admissionspriority21
     */
    public SchoolAlone(String dbn, String schoolName, String boro, String overviewParagraph, String academicopportunities1, String academicopportunities2, String academicopportunities3, String ellPrograms, String neighborhood, String sharedSpace, String buildingCode, String location, String phoneNumber, String faxNumber, String schoolEmail, String website, String subway, String bus, String grades2018, String finalgrades, String totalStudents, String startTime, String endTime, String addtlInfo1, String extracurricularActivities, String attendanceRate, String pctStuEnoughVariety, String pctStuSafe, String schoolAccessibilityDescription, String offerRate1, String program1, String code1, String interest1, String method1, String seats9ge1, String grade9gefilledflag1, String grade9geapplicants1, String seats9swd1, String grade9swdfilledflag1, String grade9swdapplicants1, String seats101, String admissionspriority11, String admissionspriority21, String admissionspriority31, String admissionspriority41, String grade9geapplicantsperseat1, String grade9swdapplicantsperseat1, String primaryAddressLine1, String city, String zip, String stateCode, String latitude, String longitude, String communityBoard, String councilDistrict, String censusTract, String bin, String bbl, String nta, String borough) {
        super();
        this.dbn = dbn;
        this.schoolName = schoolName;
        this.boro = boro;
        this.overviewParagraph = overviewParagraph;
        this.academicopportunities1 = academicopportunities1;
        this.academicopportunities2 = academicopportunities2;
        this.academicopportunities3 = academicopportunities3;
        this.ellPrograms = ellPrograms;
        this.neighborhood = neighborhood;
        this.sharedSpace = sharedSpace;
        this.buildingCode = buildingCode;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.schoolEmail = schoolEmail;
        this.website = website;
        this.subway = subway;
        this.bus = bus;
        this.grades2018 = grades2018;
        this.finalgrades = finalgrades;
        this.totalStudents = totalStudents;
        this.startTime = startTime;
        this.endTime = endTime;
        this.addtlInfo1 = addtlInfo1;
        this.extracurricularActivities = extracurricularActivities;
        this.attendanceRate = attendanceRate;
        this.pctStuEnoughVariety = pctStuEnoughVariety;
        this.pctStuSafe = pctStuSafe;
        this.schoolAccessibilityDescription = schoolAccessibilityDescription;
        this.offerRate1 = offerRate1;
        this.program1 = program1;
        this.code1 = code1;
        this.interest1 = interest1;
        this.method1 = method1;
        this.seats9ge1 = seats9ge1;
        this.grade9gefilledflag1 = grade9gefilledflag1;
        this.grade9geapplicants1 = grade9geapplicants1;
        this.seats9swd1 = seats9swd1;
        this.grade9swdfilledflag1 = grade9swdfilledflag1;
        this.grade9swdapplicants1 = grade9swdapplicants1;
        this.seats101 = seats101;
        this.admissionspriority11 = admissionspriority11;
        this.admissionspriority21 = admissionspriority21;
        this.admissionspriority31 = admissionspriority31;
        this.admissionspriority41 = admissionspriority41;
        this.grade9geapplicantsperseat1 = grade9geapplicantsperseat1;
        this.grade9swdapplicantsperseat1 = grade9swdapplicantsperseat1;
        this.primaryAddressLine1 = primaryAddressLine1;
        this.city = city;
        this.zip = zip;
        this.stateCode = stateCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.communityBoard = communityBoard;
        this.councilDistrict = councilDistrict;
        this.censusTract = censusTract;
        this.bin = bin;
        this.bbl = bbl;
        this.nta = nta;
        this.borough = borough;
    }

    public String getDbn() {
        return dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public SchoolAlone withDbn(String dbn) {
        this.dbn = dbn;
        return this;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public SchoolAlone withSchoolName(String schoolName) {
        this.schoolName = schoolName;
        return this;
    }

    public String getBoro() {
        return boro;
    }

    public void setBoro(String boro) {
        this.boro = boro;
    }

    public SchoolAlone withBoro(String boro) {
        this.boro = boro;
        return this;
    }

    public String getOverviewParagraph() {
        return overviewParagraph;
    }

    public void setOverviewParagraph(String overviewParagraph) {
        this.overviewParagraph = overviewParagraph;
    }

    public SchoolAlone withOverviewParagraph(String overviewParagraph) {
        this.overviewParagraph = overviewParagraph;
        return this;
    }

    public String getAcademicopportunities1() {
        return academicopportunities1;
    }

    public void setAcademicopportunities1(String academicopportunities1) {
        this.academicopportunities1 = academicopportunities1;
    }

    public SchoolAlone withAcademicopportunities1(String academicopportunities1) {
        this.academicopportunities1 = academicopportunities1;
        return this;
    }

    public String getAcademicopportunities2() {
        return academicopportunities2;
    }

    public void setAcademicopportunities2(String academicopportunities2) {
        this.academicopportunities2 = academicopportunities2;
    }

    public SchoolAlone withAcademicopportunities2(String academicopportunities2) {
        this.academicopportunities2 = academicopportunities2;
        return this;
    }

    public String getAcademicopportunities3() {
        return academicopportunities3;
    }

    public void setAcademicopportunities3(String academicopportunities3) {
        this.academicopportunities3 = academicopportunities3;
    }

    public SchoolAlone withAcademicopportunities3(String academicopportunities3) {
        this.academicopportunities3 = academicopportunities3;
        return this;
    }

    public String getEllPrograms() {
        return ellPrograms;
    }

    public void setEllPrograms(String ellPrograms) {
        this.ellPrograms = ellPrograms;
    }

    public SchoolAlone withEllPrograms(String ellPrograms) {
        this.ellPrograms = ellPrograms;
        return this;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public SchoolAlone withNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    public String getSharedSpace() {
        return sharedSpace;
    }

    public void setSharedSpace(String sharedSpace) {
        this.sharedSpace = sharedSpace;
    }

    public SchoolAlone withSharedSpace(String sharedSpace) {
        this.sharedSpace = sharedSpace;
        return this;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    public SchoolAlone withBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public SchoolAlone withLocation(String location) {
        this.location = location;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SchoolAlone withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public SchoolAlone withFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
        return this;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }

    public SchoolAlone withSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public SchoolAlone withWebsite(String website) {
        this.website = website;
        return this;
    }

    public String getSubway() {
        return subway;
    }

    public void setSubway(String subway) {
        this.subway = subway;
    }

    public SchoolAlone withSubway(String subway) {
        this.subway = subway;
        return this;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public SchoolAlone withBus(String bus) {
        this.bus = bus;
        return this;
    }

    public String getGrades2018() {
        return grades2018;
    }

    public void setGrades2018(String grades2018) {
        this.grades2018 = grades2018;
    }

    public SchoolAlone withGrades2018(String grades2018) {
        this.grades2018 = grades2018;
        return this;
    }

    public String getFinalgrades() {
        return finalgrades;
    }

    public void setFinalgrades(String finalgrades) {
        this.finalgrades = finalgrades;
    }

    public SchoolAlone withFinalgrades(String finalgrades) {
        this.finalgrades = finalgrades;
        return this;
    }

    public String getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(String totalStudents) {
        this.totalStudents = totalStudents;
    }

    public SchoolAlone withTotalStudents(String totalStudents) {
        this.totalStudents = totalStudents;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SchoolAlone withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SchoolAlone withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getAddtlInfo1() {
        return addtlInfo1;
    }

    public void setAddtlInfo1(String addtlInfo1) {
        this.addtlInfo1 = addtlInfo1;
    }

    public SchoolAlone withAddtlInfo1(String addtlInfo1) {
        this.addtlInfo1 = addtlInfo1;
        return this;
    }

    public String getExtracurricularActivities() {
        return extracurricularActivities;
    }

    public void setExtracurricularActivities(String extracurricularActivities) {
        this.extracurricularActivities = extracurricularActivities;
    }

    public SchoolAlone withExtracurricularActivities(String extracurricularActivities) {
        this.extracurricularActivities = extracurricularActivities;
        return this;
    }

    public String getAttendanceRate() {
        return attendanceRate;
    }

    public void setAttendanceRate(String attendanceRate) {
        this.attendanceRate = attendanceRate;
    }

    public SchoolAlone withAttendanceRate(String attendanceRate) {
        this.attendanceRate = attendanceRate;
        return this;
    }

    public String getPctStuEnoughVariety() {
        return pctStuEnoughVariety;
    }

    public void setPctStuEnoughVariety(String pctStuEnoughVariety) {
        this.pctStuEnoughVariety = pctStuEnoughVariety;
    }

    public SchoolAlone withPctStuEnoughVariety(String pctStuEnoughVariety) {
        this.pctStuEnoughVariety = pctStuEnoughVariety;
        return this;
    }

    public String getPctStuSafe() {
        return pctStuSafe;
    }

    public void setPctStuSafe(String pctStuSafe) {
        this.pctStuSafe = pctStuSafe;
    }

    public SchoolAlone withPctStuSafe(String pctStuSafe) {
        this.pctStuSafe = pctStuSafe;
        return this;
    }

    public String getSchoolAccessibilityDescription() {
        return schoolAccessibilityDescription;
    }

    public void setSchoolAccessibilityDescription(String schoolAccessibilityDescription) {
        this.schoolAccessibilityDescription = schoolAccessibilityDescription;
    }

    public SchoolAlone withSchoolAccessibilityDescription(String schoolAccessibilityDescription) {
        this.schoolAccessibilityDescription = schoolAccessibilityDescription;
        return this;
    }

    public String getOfferRate1() {
        return offerRate1;
    }

    public void setOfferRate1(String offerRate1) {
        this.offerRate1 = offerRate1;
    }

    public SchoolAlone withOfferRate1(String offerRate1) {
        this.offerRate1 = offerRate1;
        return this;
    }

    public String getProgram1() {
        return program1;
    }

    public void setProgram1(String program1) {
        this.program1 = program1;
    }

    public SchoolAlone withProgram1(String program1) {
        this.program1 = program1;
        return this;
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public SchoolAlone withCode1(String code1) {
        this.code1 = code1;
        return this;
    }

    public String getInterest1() {
        return interest1;
    }

    public void setInterest1(String interest1) {
        this.interest1 = interest1;
    }

    public SchoolAlone withInterest1(String interest1) {
        this.interest1 = interest1;
        return this;
    }

    public String getMethod1() {
        return method1;
    }

    public void setMethod1(String method1) {
        this.method1 = method1;
    }

    public SchoolAlone withMethod1(String method1) {
        this.method1 = method1;
        return this;
    }

    public String getSeats9ge1() {
        return seats9ge1;
    }

    public void setSeats9ge1(String seats9ge1) {
        this.seats9ge1 = seats9ge1;
    }

    public SchoolAlone withSeats9ge1(String seats9ge1) {
        this.seats9ge1 = seats9ge1;
        return this;
    }

    public String getGrade9gefilledflag1() {
        return grade9gefilledflag1;
    }

    public void setGrade9gefilledflag1(String grade9gefilledflag1) {
        this.grade9gefilledflag1 = grade9gefilledflag1;
    }

    public SchoolAlone withGrade9gefilledflag1(String grade9gefilledflag1) {
        this.grade9gefilledflag1 = grade9gefilledflag1;
        return this;
    }

    public String getGrade9geapplicants1() {
        return grade9geapplicants1;
    }

    public void setGrade9geapplicants1(String grade9geapplicants1) {
        this.grade9geapplicants1 = grade9geapplicants1;
    }

    public SchoolAlone withGrade9geapplicants1(String grade9geapplicants1) {
        this.grade9geapplicants1 = grade9geapplicants1;
        return this;
    }

    public String getSeats9swd1() {
        return seats9swd1;
    }

    public void setSeats9swd1(String seats9swd1) {
        this.seats9swd1 = seats9swd1;
    }

    public SchoolAlone withSeats9swd1(String seats9swd1) {
        this.seats9swd1 = seats9swd1;
        return this;
    }

    public String getGrade9swdfilledflag1() {
        return grade9swdfilledflag1;
    }

    public void setGrade9swdfilledflag1(String grade9swdfilledflag1) {
        this.grade9swdfilledflag1 = grade9swdfilledflag1;
    }

    public SchoolAlone withGrade9swdfilledflag1(String grade9swdfilledflag1) {
        this.grade9swdfilledflag1 = grade9swdfilledflag1;
        return this;
    }

    public String getGrade9swdapplicants1() {
        return grade9swdapplicants1;
    }

    public void setGrade9swdapplicants1(String grade9swdapplicants1) {
        this.grade9swdapplicants1 = grade9swdapplicants1;
    }

    public SchoolAlone withGrade9swdapplicants1(String grade9swdapplicants1) {
        this.grade9swdapplicants1 = grade9swdapplicants1;
        return this;
    }

    public String getSeats101() {
        return seats101;
    }

    public void setSeats101(String seats101) {
        this.seats101 = seats101;
    }

    public SchoolAlone withSeats101(String seats101) {
        this.seats101 = seats101;
        return this;
    }

    public String getAdmissionspriority11() {
        return admissionspriority11;
    }

    public void setAdmissionspriority11(String admissionspriority11) {
        this.admissionspriority11 = admissionspriority11;
    }

    public SchoolAlone withAdmissionspriority11(String admissionspriority11) {
        this.admissionspriority11 = admissionspriority11;
        return this;
    }

    public String getAdmissionspriority21() {
        return admissionspriority21;
    }

    public void setAdmissionspriority21(String admissionspriority21) {
        this.admissionspriority21 = admissionspriority21;
    }

    public SchoolAlone withAdmissionspriority21(String admissionspriority21) {
        this.admissionspriority21 = admissionspriority21;
        return this;
    }

    public String getAdmissionspriority31() {
        return admissionspriority31;
    }

    public void setAdmissionspriority31(String admissionspriority31) {
        this.admissionspriority31 = admissionspriority31;
    }

    public SchoolAlone withAdmissionspriority31(String admissionspriority31) {
        this.admissionspriority31 = admissionspriority31;
        return this;
    }

    public String getAdmissionspriority41() {
        return admissionspriority41;
    }

    public void setAdmissionspriority41(String admissionspriority41) {
        this.admissionspriority41 = admissionspriority41;
    }

    public SchoolAlone withAdmissionspriority41(String admissionspriority41) {
        this.admissionspriority41 = admissionspriority41;
        return this;
    }

    public String getGrade9geapplicantsperseat1() {
        return grade9geapplicantsperseat1;
    }

    public void setGrade9geapplicantsperseat1(String grade9geapplicantsperseat1) {
        this.grade9geapplicantsperseat1 = grade9geapplicantsperseat1;
    }

    public SchoolAlone withGrade9geapplicantsperseat1(String grade9geapplicantsperseat1) {
        this.grade9geapplicantsperseat1 = grade9geapplicantsperseat1;
        return this;
    }

    public String getGrade9swdapplicantsperseat1() {
        return grade9swdapplicantsperseat1;
    }

    public void setGrade9swdapplicantsperseat1(String grade9swdapplicantsperseat1) {
        this.grade9swdapplicantsperseat1 = grade9swdapplicantsperseat1;
    }

    public SchoolAlone withGrade9swdapplicantsperseat1(String grade9swdapplicantsperseat1) {
        this.grade9swdapplicantsperseat1 = grade9swdapplicantsperseat1;
        return this;
    }

    public String getPrimaryAddressLine1() {
        return primaryAddressLine1;
    }

    public void setPrimaryAddressLine1(String primaryAddressLine1) {
        this.primaryAddressLine1 = primaryAddressLine1;
    }

    public SchoolAlone withPrimaryAddressLine1(String primaryAddressLine1) {
        this.primaryAddressLine1 = primaryAddressLine1;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public SchoolAlone withCity(String city) {
        this.city = city;
        return this;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public SchoolAlone withZip(String zip) {
        this.zip = zip;
        return this;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public SchoolAlone withStateCode(String stateCode) {
        this.stateCode = stateCode;
        return this;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public SchoolAlone withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public SchoolAlone withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getCommunityBoard() {
        return communityBoard;
    }

    public void setCommunityBoard(String communityBoard) {
        this.communityBoard = communityBoard;
    }

    public SchoolAlone withCommunityBoard(String communityBoard) {
        this.communityBoard = communityBoard;
        return this;
    }

    public String getCouncilDistrict() {
        return councilDistrict;
    }

    public void setCouncilDistrict(String councilDistrict) {
        this.councilDistrict = councilDistrict;
    }

    public SchoolAlone withCouncilDistrict(String councilDistrict) {
        this.councilDistrict = councilDistrict;
        return this;
    }

    public String getCensusTract() {
        return censusTract;
    }

    public void setCensusTract(String censusTract) {
        this.censusTract = censusTract;
    }

    public SchoolAlone withCensusTract(String censusTract) {
        this.censusTract = censusTract;
        return this;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public SchoolAlone withBin(String bin) {
        this.bin = bin;
        return this;
    }

    public String getBbl() {
        return bbl;
    }

    public void setBbl(String bbl) {
        this.bbl = bbl;
    }

    public SchoolAlone withBbl(String bbl) {
        this.bbl = bbl;
        return this;
    }

    public String getNta() {
        return nta;
    }

    public void setNta(String nta) {
        this.nta = nta;
    }

    public SchoolAlone withNta(String nta) {
        this.nta = nta;
        return this;
    }

    public String getBorough() {
        return borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }

    public SchoolAlone withBorough(String borough) {
        this.borough = borough;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(dbn);
        dest.writeValue(schoolName);
        dest.writeValue(boro);
        dest.writeValue(overviewParagraph);
        dest.writeValue(academicopportunities1);
        dest.writeValue(academicopportunities2);
        dest.writeValue(academicopportunities3);
        dest.writeValue(ellPrograms);
        dest.writeValue(neighborhood);
        dest.writeValue(sharedSpace);
        dest.writeValue(buildingCode);
        dest.writeValue(location);
        dest.writeValue(phoneNumber);
        dest.writeValue(faxNumber);
        dest.writeValue(schoolEmail);
        dest.writeValue(website);
        dest.writeValue(subway);
        dest.writeValue(bus);
        dest.writeValue(grades2018);
        dest.writeValue(finalgrades);
        dest.writeValue(totalStudents);
        dest.writeValue(startTime);
        dest.writeValue(endTime);
        dest.writeValue(addtlInfo1);
        dest.writeValue(extracurricularActivities);
        dest.writeValue(attendanceRate);
        dest.writeValue(pctStuEnoughVariety);
        dest.writeValue(pctStuSafe);
        dest.writeValue(schoolAccessibilityDescription);
        dest.writeValue(offerRate1);
        dest.writeValue(program1);
        dest.writeValue(code1);
        dest.writeValue(interest1);
        dest.writeValue(method1);
        dest.writeValue(seats9ge1);
        dest.writeValue(grade9gefilledflag1);
        dest.writeValue(grade9geapplicants1);
        dest.writeValue(seats9swd1);
        dest.writeValue(grade9swdfilledflag1);
        dest.writeValue(grade9swdapplicants1);
        dest.writeValue(seats101);
        dest.writeValue(admissionspriority11);
        dest.writeValue(admissionspriority21);
        dest.writeValue(admissionspriority31);
        dest.writeValue(admissionspriority41);
        dest.writeValue(grade9geapplicantsperseat1);
        dest.writeValue(grade9swdapplicantsperseat1);
        dest.writeValue(primaryAddressLine1);
        dest.writeValue(city);
        dest.writeValue(zip);
        dest.writeValue(stateCode);
        dest.writeValue(latitude);
        dest.writeValue(longitude);
        dest.writeValue(communityBoard);
        dest.writeValue(councilDistrict);
        dest.writeValue(censusTract);
        dest.writeValue(bin);
        dest.writeValue(bbl);
        dest.writeValue(nta);
        dest.writeValue(borough);
    }

    public int describeContents() {
        return  0;
    }

}
