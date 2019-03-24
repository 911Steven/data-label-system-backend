package site.assad.datalabel.vo;

import java.util.Date;

/**
 *
 * @author Al-assad
 * @since 2019/3/24
 * created by Intellij-IDEA
 */
public class FormVO {
    
    private String formId;
    private String orgId;
    private String title;
    private String description;
    private int curNum;
    private int limitNum;
    private int sourceCount;
    private Integer formStatus;
    private Integer type;
    private Integer itemType;
    private String itemContent;
    private Date createTime;
    
    public String getFormId() {
        return formId;
    }
    
    public void setFormId(String formId) {
        this.formId = formId;
    }
    
    public String getOrgId() {
        return orgId;
    }
    
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getCurNum() {
        return curNum;
    }
    
    public void setCurNum(int curNum) {
        this.curNum = curNum;
    }
    
    public int getLimitNum() {
        return limitNum;
    }
    
    public void setLimitNum(int limitNum) {
        this.limitNum = limitNum;
    }
    
    public int getSourceCount() {
        return sourceCount;
    }
    
    public void setSourceCount(int sourceCount) {
        this.sourceCount = sourceCount;
    }
    
    public Integer getFormStatus() {
        return formStatus;
    }
    
    public void setFormStatus(Integer formStatus) {
        this.formStatus = formStatus;
    }
    
    public Integer getType() {
        return type;
    }
    
    public void setType(Integer type) {
        this.type = type;
    }
    
    public Integer getItemType() {
        return itemType;
    }
    
    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }
    
    public String getItemContent() {
        return itemContent;
    }
    
    public void setItemContent(String itemContent) {
        this.itemContent = itemContent;
    }
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}