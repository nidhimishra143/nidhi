package com.wipro.test.form;

import com.wipro.test.dto.BaseDTO;

public class BaseForm {

 
    protected long id = 0;
    private Long[] ids;
    protected String createdBy;
    protected String modifiedBy;
    protected long createdDatetime;
    protected long modifiedDatetime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(long createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public long getModifiedDatetime() {
        return modifiedDatetime;
    }

    public void setModifiedDatetime(long modifiedDatetime) {
        this.modifiedDatetime = modifiedDatetime;
    }

    /**
     * Converts from into dto.
     *
     * @return
     */
    public BaseDTO getDto() {
        return null;
    }

    /**
     * Converts fto into form.
     *
     * @param bDto
     */
    public void populate(BaseDTO bDto) {

    }

	public Long[] getIds() {
		return ids;
	}

	public void setIds(Long[] ids) {
		this.ids = ids;
	}

}