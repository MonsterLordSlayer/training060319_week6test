
package com.example.training060319_week6test;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SchoolwithSat implements Parcelable
{

    @SerializedName("dbn")
    @Expose
    private String dbn;
    @SerializedName("school_name")
    @Expose
    private String schoolName;
    @SerializedName("num_of_sat_test_takers")
    @Expose
    private String numOfSatTestTakers;
    @SerializedName("sat_critical_reading_avg_score")
    @Expose
    private String satCriticalReadingAvgScore;
    @SerializedName("sat_math_avg_score")
    @Expose
    private String satMathAvgScore;
    @SerializedName("sat_writing_avg_score")
    @Expose
    private String satWritingAvgScore;
    public final static Parcelable.Creator<SchoolwithSat> CREATOR = new Creator<SchoolwithSat>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SchoolwithSat createFromParcel(Parcel in) {
            return new SchoolwithSat(in);
        }

        public SchoolwithSat[] newArray(int size) {
            return (new SchoolwithSat[size]);
        }

    }
    ;

    protected SchoolwithSat(Parcel in) {
        this.dbn = ((String) in.readValue((String.class.getClassLoader())));
        this.schoolName = ((String) in.readValue((String.class.getClassLoader())));
        this.numOfSatTestTakers = ((String) in.readValue((String.class.getClassLoader())));
        this.satCriticalReadingAvgScore = ((String) in.readValue((String.class.getClassLoader())));
        this.satMathAvgScore = ((String) in.readValue((String.class.getClassLoader())));
        this.satWritingAvgScore = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public SchoolwithSat() {
    }

    /**
     * 
     * @param satCriticalReadingAvgScore
     * @param numOfSatTestTakers
     * @param schoolName
     * @param dbn
     * @param satWritingAvgScore
     * @param satMathAvgScore
     */
    public SchoolwithSat(String dbn, String schoolName, String numOfSatTestTakers, String satCriticalReadingAvgScore, String satMathAvgScore, String satWritingAvgScore) {
        super();
        this.dbn = dbn;
        this.schoolName = schoolName;
        this.numOfSatTestTakers = numOfSatTestTakers;
        this.satCriticalReadingAvgScore = satCriticalReadingAvgScore;
        this.satMathAvgScore = satMathAvgScore;
        this.satWritingAvgScore = satWritingAvgScore;
    }

    public String getDbn() {
        return dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public SchoolwithSat withDbn(String dbn) {
        this.dbn = dbn;
        return this;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public SchoolwithSat withSchoolName(String schoolName) {
        this.schoolName = schoolName;
        return this;
    }

    public String getNumOfSatTestTakers() {
        return numOfSatTestTakers;
    }

    public void setNumOfSatTestTakers(String numOfSatTestTakers) {
        this.numOfSatTestTakers = numOfSatTestTakers;
    }

    public SchoolwithSat withNumOfSatTestTakers(String numOfSatTestTakers) {
        this.numOfSatTestTakers = numOfSatTestTakers;
        return this;
    }

    public String getSatCriticalReadingAvgScore() {
        return satCriticalReadingAvgScore;
    }

    public void setSatCriticalReadingAvgScore(String satCriticalReadingAvgScore) {
        this.satCriticalReadingAvgScore = satCriticalReadingAvgScore;
    }

    public SchoolwithSat withSatCriticalReadingAvgScore(String satCriticalReadingAvgScore) {
        this.satCriticalReadingAvgScore = satCriticalReadingAvgScore;
        return this;
    }

    public String getSatMathAvgScore() {
        return satMathAvgScore;
    }

    public void setSatMathAvgScore(String satMathAvgScore) {
        this.satMathAvgScore = satMathAvgScore;
    }

    public SchoolwithSat withSatMathAvgScore(String satMathAvgScore) {
        this.satMathAvgScore = satMathAvgScore;
        return this;
    }

    public String getSatWritingAvgScore() {
        return satWritingAvgScore;
    }

    public void setSatWritingAvgScore(String satWritingAvgScore) {
        this.satWritingAvgScore = satWritingAvgScore;
    }

    public SchoolwithSat withSatWritingAvgScore(String satWritingAvgScore) {
        this.satWritingAvgScore = satWritingAvgScore;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(dbn);
        dest.writeValue(schoolName);
        dest.writeValue(numOfSatTestTakers);
        dest.writeValue(satCriticalReadingAvgScore);
        dest.writeValue(satMathAvgScore);
        dest.writeValue(satWritingAvgScore);
    }

    public int describeContents() {
        return  0;
    }

}
