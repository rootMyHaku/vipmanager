package cn.zh.pojo;

import java.util.Date;

public class Reply {
    private Integer rid;

    private Long pid;

    private String rtitle;

    private String rcontent;

    private String rauthor;

    private Date rdate;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getRtitle() {
        return rtitle;
    }

    public void setRtitle(String rtitle) {
        this.rtitle = rtitle == null ? null : rtitle.trim();
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent == null ? null : rcontent.trim();
    }

    public String getRauthor() {
        return rauthor;
    }

    public void setRauthor(String rauthor) {
        this.rauthor = rauthor == null ? null : rauthor.trim();
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }
}