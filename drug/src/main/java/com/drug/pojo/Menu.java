package com.drug.pojo;

public class Menu {
    private Integer ordernum;

    private Integer column2;

    private Integer fOrdernum;

    private String menuname;

    private String information;

    private String explain;

    private String picturesrc;

    private String linksrc;

    private Integer column9;

    private String targetwindow;

    private String statu;

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public Integer getColumn2() {
        return column2;
    }

    public void setColumn2(Integer column2) {
        this.column2 = column2;
    }

    public Integer getfOrdernum() {
        return fOrdernum;
    }

    public void setfOrdernum(Integer fOrdernum) {
        this.fOrdernum = fOrdernum;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information == null ? null : information.trim();
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    public String getPicturesrc() {
        return picturesrc;
    }

    public void setPicturesrc(String picturesrc) {
        this.picturesrc = picturesrc == null ? null : picturesrc.trim();
    }

    public String getLinksrc() {
        return linksrc;
    }

    public void setLinksrc(String linksrc) {
        this.linksrc = linksrc == null ? null : linksrc.trim();
    }

    public Integer getColumn9() {
        return column9;
    }

    public void setColumn9(Integer column9) {
        this.column9 = column9;
    }

    public String getTargetwindow() {
        return targetwindow;
    }

    public void setTargetwindow(String targetwindow) {
        this.targetwindow = targetwindow == null ? null : targetwindow.trim();
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu == null ? null : statu.trim();
    }
}