package com.james.wee.linkssq.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the lottodata database table.
 * 
 */
@Entity
@NamedQuery(name="Lottodata.findAll", query="SELECT l FROM Lottodata l")
public class Lottodata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String BLUE_bac;

	private String BLUE_prv;

	private int calc;

	@Column(name="lotto_date")
	private String lottoDate;

	@Column(name="lotto_series")
	private String lottoSeries;

	@Column(name="R_1")
	private String r1;

	@Column(name="R_2")
	private String r2;

	@Column(name="R_3")
	private String r3;

	@Column(name="R_4")
	private String r4;

	@Column(name="R_5")
	private String r5;

	public Lottodata() {
	}
	public Lottodata(String lastData) {
		String[] last = lastData.split(" ");
		// int total = 0;
		this.lottoDate = last[0];
		this.lottoSeries = last[1];
		this.r1 = last[2];
		this.r2 = last[3];
		this.r3 = last[4];
		this.r4 = last[5];
		this.r5 = last[6];
		this.BLUE_prv = last[7];
		this.BLUE_bac = last[8];
		this.calc = Integer.parseInt(last[9]);
		
	}
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBLUE_bac() {
		return this.BLUE_bac;
	}

	public void setBLUE_bac(String BLUE_bac) {
		this.BLUE_bac = BLUE_bac;
	}

	public String getBLUE_prv() {
		return this.BLUE_prv;
	}

	public void setBLUE_prv(String BLUE_prv) {
		this.BLUE_prv = BLUE_prv;
	}

	public int getCalc() {
		return this.calc;
	}

	public void setCalc(int calc) {
		this.calc = calc;
	}

	public String getLottoDate() {
		return this.lottoDate;
	}

	public void setLottoDate(String lottoDate) {
		this.lottoDate = lottoDate;
	}

	public String getLottoSeries() {
		return this.lottoSeries;
	}

	public void setLottoSeries(String lottoSeries) {
		this.lottoSeries = lottoSeries;
	}

	public String getR1() {
		return this.r1;
	}

	public void setR1(String r1) {
		this.r1 = r1;
	}

	public String getR2() {
		return this.r2;
	}

	public void setR2(String r2) {
		this.r2 = r2;
	}

	public String getR3() {
		return this.r3;
	}

	public void setR3(String r3) {
		this.r3 = r3;
	}

	public String getR4() {
		return this.r4;
	}

	public void setR4(String r4) {
		this.r4 = r4;
	}

	public String getR5() {
		return this.r5;
	}

	public void setR5(String r5) {
		this.r5 = r5;
	}
	@Override
	public String toString() {
		return "Lottodata [id=" + id + ", BLUE_bac=" + BLUE_bac + ", BLUE_prv="
				+ BLUE_prv + ", calc=" + calc + ", lottoDate=" + lottoDate
				+ ", lottoSeries=" + lottoSeries + ", r1=" + r1 + ", r2=" + r2
				+ ", r3=" + r3 + ", r4=" + r4 + ", r5=" + r5 + "]";
	}

}