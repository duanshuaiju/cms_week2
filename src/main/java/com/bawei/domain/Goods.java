package com.bawei.domain;

import java.math.BigInteger;
import java.sql.Date;

import javax.xml.crypto.Data;

public class Goods {
	private BigInteger id;
	private String gjz;
	private String ms;
	private String gsmc;
	private String ztcp;
	private String dz;
	private String zczb;
	private String clsj;
	private Date njrq;
	private String nkzt;
	private String bz;
	private String rq;
	
	public String getRq() {
		return rq;
	}
	public void setRq(String rq) {
		this.rq = rq;
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getGjz() {
		return gjz;
	}
	public void setGjz(String gjz) {
		this.gjz = gjz;
	}
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	public String getGsmc() {
		return gsmc;
	}
	public void setGsmc(String gsmc) {
		this.gsmc = gsmc;
	}
	public String getZtcp() {
		return ztcp;
	}
	public void setZtcp(String ztcp) {
		this.ztcp = ztcp;
	}
	public String getDz() {
		return dz;
	}
	public void setDz(String dz) {
		this.dz = dz;
	}
	public String getZczb() {
		return zczb;
	}
	public void setZczb(String zczb) {
		this.zczb = zczb;
	}
	public String getClsj() {
		return clsj;
	}
	public void setClsj(String clsj) {
		this.clsj = clsj;
	}
	public Date getNjrq() {
		return njrq;
	}
	public void setNjrq(Date njrq) {
		this.njrq = njrq;
	}
	
	public String getNkzt() {
		return nkzt;
	}
	public void setNkzt(String nkzt) {
		this.nkzt = nkzt;
	}
	
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", gjz=" + gjz + ", ms=" + ms + ", gsmc=" + gsmc + ", ztcp=" + ztcp + ", dz=" + dz
				+ ", zczb=" + zczb + ", clsj=" + clsj + ", njrq=" + njrq + ", nkzt=" + nkzt + "]";
	}
}
