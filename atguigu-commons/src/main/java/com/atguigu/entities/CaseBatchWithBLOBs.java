package com.atguigu.entities;

import java.io.Serializable;

public class CaseBatchWithBLOBs extends CaseBatch implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch.batch_log
     *
     * @mbggenerated
     */
    private String batchLog;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table case_batch
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.remark
     *
     * @return the value of case_batch.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.remark
     *
     * @param remark the value for case_batch.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch.batch_log
     *
     * @return the value of case_batch.batch_log
     *
     * @mbggenerated
     */
    public String getBatchLog() {
        return batchLog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch.batch_log
     *
     * @param batchLog the value for case_batch.batch_log
     *
     * @mbggenerated
     */
    public void setBatchLog(String batchLog) {
        this.batchLog = batchLog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CaseBatchWithBLOBs other = (CaseBatchWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBatchCode() == null ? other.getBatchCode() == null : this.getBatchCode().equals(other.getBatchCode()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getEntrustProductId() == null ? other.getEntrustProductId() == null : this.getEntrustProductId().equals(other.getEntrustProductId()))
            && (this.getEntrustId() == null ? other.getEntrustId() == null : this.getEntrustId().equals(other.getEntrustId()))
            && (this.getTotalMoney() == null ? other.getTotalMoney() == null : this.getTotalMoney().equals(other.getTotalMoney()))
            && (this.getTotalNumber() == null ? other.getTotalNumber() == null : this.getTotalNumber().equals(other.getTotalNumber()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getBeginDate() == null ? other.getBeginDate() == null : this.getBeginDate().equals(other.getBeginDate()))
            && (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getActualEndDate() == null ? other.getActualEndDate() == null : this.getActualEndDate().equals(other.getActualEndDate()))
            && (this.getCreateEmpId() == null ? other.getCreateEmpId() == null : this.getCreateEmpId().equals(other.getCreateEmpId()))
            && (this.getModifyEmpId() == null ? other.getModifyEmpId() == null : this.getModifyEmpId().equals(other.getModifyEmpId()))
            && (this.getTarget() == null ? other.getTarget() == null : this.getTarget().equals(other.getTarget()))
            && (this.getAchieve() == null ? other.getAchieve() == null : this.getAchieve().equals(other.getAchieve()))
            && (this.getCollectionId() == null ? other.getCollectionId() == null : this.getCollectionId().equals(other.getCollectionId()))
            && (this.getBatchXls() == null ? other.getBatchXls() == null : this.getBatchXls().equals(other.getBatchXls()))
            && (this.getUploadTime() == null ? other.getUploadTime() == null : this.getUploadTime().equals(other.getUploadTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getBathTips() == null ? other.getBathTips() == null : this.getBathTips().equals(other.getBathTips()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getWdcDesc() == null ? other.getWdcDesc() == null : this.getWdcDesc().equals(other.getWdcDesc()))
            && (this.getIsUpload() == null ? other.getIsUpload() == null : this.getIsUpload().equals(other.getIsUpload()))
            && (this.getTemplateType() == null ? other.getTemplateType() == null : this.getTemplateType().equals(other.getTemplateType()))
            && (this.getHandle() == null ? other.getHandle() == null : this.getHandle().equals(other.getHandle()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getBatchLog() == null ? other.getBatchLog() == null : this.getBatchLog().equals(other.getBatchLog()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBatchCode() == null) ? 0 : getBatchCode().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getEntrustProductId() == null) ? 0 : getEntrustProductId().hashCode());
        result = prime * result + ((getEntrustId() == null) ? 0 : getEntrustId().hashCode());
        result = prime * result + ((getTotalMoney() == null) ? 0 : getTotalMoney().hashCode());
        result = prime * result + ((getTotalNumber() == null) ? 0 : getTotalNumber().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getBeginDate() == null) ? 0 : getBeginDate().hashCode());
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getActualEndDate() == null) ? 0 : getActualEndDate().hashCode());
        result = prime * result + ((getCreateEmpId() == null) ? 0 : getCreateEmpId().hashCode());
        result = prime * result + ((getModifyEmpId() == null) ? 0 : getModifyEmpId().hashCode());
        result = prime * result + ((getTarget() == null) ? 0 : getTarget().hashCode());
        result = prime * result + ((getAchieve() == null) ? 0 : getAchieve().hashCode());
        result = prime * result + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        result = prime * result + ((getBatchXls() == null) ? 0 : getBatchXls().hashCode());
        result = prime * result + ((getUploadTime() == null) ? 0 : getUploadTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getBathTips() == null) ? 0 : getBathTips().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getWdcDesc() == null) ? 0 : getWdcDesc().hashCode());
        result = prime * result + ((getIsUpload() == null) ? 0 : getIsUpload().hashCode());
        result = prime * result + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        result = prime * result + ((getHandle() == null) ? 0 : getHandle().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getBatchLog() == null) ? 0 : getBatchLog().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", remark=").append(remark);
        sb.append(", batchLog=").append(batchLog);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}