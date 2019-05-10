package com.example.demo.Entity;

public class BaseApiResponse {
    private int id;
    private String usname;
    private String sex;
    private String remark;

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets usname.
     *
     * @return the usname
     */
    public String getUsname() {
        return usname;
    }

    /**
     * Sets usname.
     *
     * @param usname the usname
     */
    public void setUsname(String usname) {
        this.usname = usname;
    }

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
