package com.boteteam.yper.everyday.Module;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Feng Jiang on 2017/10/21.
 */

public class EverDayModel {
    private String zdjt;    //集团针对
    private String zlzs; //战略战术是否吻合
    private String ryqk;//人员情况
    private String sjgc; // 设计高层问题，技术发展，对外合作，组织架构，工作流程等等
    private String xsxc; //巡视工作现场
    private String jhjc; //检查工作计划
    private String gjxq; //关键需求参与

    private String writeDate; //日期 用字符串类型，因为日期转换默认格式可能有问题。

    public EverDayModel(Date writeDate) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        this.writeDate=sdf.format(writeDate);

    }

    public String getZdjt() {
        return zdjt;
    }

    public void setZdjt(String zdjt) {
        this.zdjt = zdjt;
    }

    public String getZlzs() {
        return zlzs;
    }

    public void setZlzs(String zlzs) {
        this.zlzs = zlzs;
    }

    public String getRyqk() {
        return ryqk;
    }

    public void setRyqk(String ryqk) {
        this.ryqk = ryqk;
    }

    public String getSjgc() {
        return sjgc;
    }

    public void setSjgc(String sjgc) {
        this.sjgc = sjgc;
    }

    public String getXsxc() {
        return xsxc;
    }

    public void setXsxc(String xsxc) {
        this.xsxc = xsxc;
    }

    public String getJhjc() {
        return jhjc;
    }

    public void setJhjc(String jhjc) {
        this.jhjc = jhjc;
    }

    public String getGjxq() {
        return gjxq;
    }

    public void setGjxq(String gjxq) {
        this.gjxq = gjxq;
    }
}
