package com.lz.springboot.bean;

import java.io.Serializable;
import java.util.Date;

public class LiveActivityTeam implements Serializable {
    private String teamId;

    private Long activityId;

    private String cusId;

    private String teamName;

    private String leaderName;

    private String leaderPhone;

    private String applicantName;

    private String applicantPhone;

    private String emergencyContact;

    private String emergencyPhone;

    private Date erollTime;

    private Integer erollResource;

    private Integer membersNum;

    private Integer auditStatus;

    private String refuseReason;

    private String uploaderPhone;

    private String uploaderName;

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId == null ? null : cusId.trim();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName == null ? null : leaderName.trim();
    }

    public String getLeaderPhone() {
        return leaderPhone;
    }

    public void setLeaderPhone(String leaderPhone) {
        this.leaderPhone = leaderPhone == null ? null : leaderPhone.trim();
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName == null ? null : applicantName.trim();
    }

    public String getApplicantPhone() {
        return applicantPhone;
    }

    public void setApplicantPhone(String applicantPhone) {
        this.applicantPhone = applicantPhone == null ? null : applicantPhone.trim();
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact == null ? null : emergencyContact.trim();
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone == null ? null : emergencyPhone.trim();
    }

    public Date getErollTime() {
        return erollTime;
    }

    public void setErollTime(Date erollTime) {
        this.erollTime = erollTime;
    }

    public Integer getErollResource() {
        return erollResource;
    }

    public void setErollResource(Integer erollResource) {
        this.erollResource = erollResource;
    }

    public Integer getMembersNum() {
        return membersNum;
    }

    public void setMembersNum(Integer membersNum) {
        this.membersNum = membersNum;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason == null ? null : refuseReason.trim();
    }

    public String getUploaderPhone() {
        return uploaderPhone;
    }

    public void setUploaderPhone(String uploaderPhone) {
        this.uploaderPhone = uploaderPhone == null ? null : uploaderPhone.trim();
    }

    public String getUploaderName() {
        return uploaderName;
    }

    public void setUploaderName(String uploaderName) {
        this.uploaderName = uploaderName == null ? null : uploaderName.trim();
    }
}