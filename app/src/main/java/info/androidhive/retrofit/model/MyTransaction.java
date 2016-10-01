package info.androidhive.retrofit.model;

/**
 * Created by Sanwal Singh on 29/9/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class MyTransaction {

    @SerializedName("scheme_name")
    @Expose
    private String schemeName;
    @SerializedName("sch_id")
    @Expose
    private String schId;
    @SerializedName("scheme_code")
    @Expose
    private String schemeCode;
    @SerializedName("category_type")
    @Expose
    private String categoryType;
    @SerializedName("trxntype")
    @Expose
    private String trxntype;
    @SerializedName("current_value")
    @Expose
    private Float currentValue;
    @SerializedName("folio_no")
    @Expose
    private String folioNo;
    @SerializedName("units")
    @Expose
    private Float units;
    @SerializedName("trnx_date")
    @Expose
    private String trnxDate;
    @SerializedName("current_invest")
    @Expose
    private Integer currentInvest;
    @SerializedName("gainLoss")
    @Expose
    private Float gainLoss;

    public MyTransaction(String schemeName, String schId, String schemeCode, String categoryType, String trxntype, Float currentValue, String folioNo, Float units, String trnxDate, Integer currentInvest, Float gainLoss) {
        this.schemeName = schemeName;
        this.schId = schId;
        this.schemeCode = schemeCode;
        this.categoryType = categoryType;
        this.trxntype = trxntype;
        this.currentValue = currentValue;
        this.folioNo = folioNo;
        this.units = units;
        this.trnxDate = trnxDate;
        this.currentInvest = currentInvest;
        this.gainLoss = gainLoss;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public String getSchId() {
        return schId;
    }

    public void setSchId(String schId) {
        this.schId = schId;
    }

    public String getSchemeCode() {
        return schemeCode;
    }

    public void setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getTrxntype() {
        return trxntype;
    }

    public void setTrxntype(String trxntype) {
        this.trxntype = trxntype;
    }

    public Float getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Float currentValue) {
        this.currentValue = currentValue;
    }

    public String getFolioNo() {
        return folioNo;
    }

    public void setFolioNo(String folioNo) {
        this.folioNo = folioNo;
    }

    public Float getUnits() {
        return units;
    }

    public void setUnits(Float units) {
        this.units = units;
    }

    public String getTrnxDate() {
        return trnxDate;
    }

    public void setTrnxDate(String trnxDate) {
        this.trnxDate = trnxDate;
    }

    public Integer getCurrentInvest() {
        return currentInvest;
    }

    public void setCurrentInvest(Integer currentInvest) {
        this.currentInvest = currentInvest;
    }

    public Float getGainLoss() {
        return gainLoss;
    }

    public void setGainLoss(Float gainLoss) {
        this.gainLoss = gainLoss;
    }

}