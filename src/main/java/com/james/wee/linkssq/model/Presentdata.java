package com.james.wee.linkssq.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the presentdata database table.
 * 
 */
@Entity
@NamedQuery(name = "Presentdata.findAll", query = "SELECT p FROM Presentdata p order by p.id desc")
public class Presentdata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String blue;

	private int calc;

	@Column(name = "present_date")
	private String presentDate;

	@Column(name = "present_series")
	private String presentSeries;

	@Column(name = "R_1")
	private String r1;

	@Column(name = "R_2")
	private String r2;

	@Column(name = "R_3")
	private String r3;

	@Column(name = "R_4")
	private String r4;

	@Column(name = "R_5")
	private String r5;

	@Column(name = "R_6")
	private String r6;

	public Presentdata() {
	}

	public Presentdata(String lastData) {
		String[] last = lastData.split(",");
		// int total = 0;
		this.presentDate = last[0];
		this.presentSeries = last[1];
		this.r1 = last[2];
		this.r2 = last[3];
		this.r3 = last[4];
		this.r4 = last[5];
		this.r5 = last[6];
		this.r6 = last[7];
		this.blue = last[8];
		this.calc = 0;
		for (int i = 2; i < last.length - 1; i++) {
			this.calc += Integer.parseInt(last[i]);
		}
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBlue() {
		return this.blue;
	}

	public void setBlue(String blue) {
		this.blue = blue;
	}

	public int getCalc() {
		return this.calc;
	}

	public void setCalc(int calc) {
		this.calc = calc;
	}

	public String getPresentDate() {
		return this.presentDate;
	}

	public void setPresentDate(String presentDate) {
		this.presentDate = presentDate;
	}

	public String getPresentSeries() {
		return this.presentSeries;
	}

	public void setPresentSeries(String presentSeries) {
		this.presentSeries = presentSeries;
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

	public String getR6() {
		return this.r6;
	}

	public void setR6(String r6) {
		this.r6 = r6;
	}

	public String getOpenNums() {
		return this.r1 + " " + this.r2 + " " + this.r3 + " " + this.r4 + " "
				+ this.r5 + " " + this.r6 + " | " + this.blue;
	}

	public String getOpenRedNums() {
		return this.r1 + " " + this.r2 + " " + this.r3 + " " + this.r4 + " "
				+ this.r5 + " " + this.r6;
	}

	@Override
	public String toString() {
		return "Presentdata [id=" + id + ", blue=" + blue + ", calc=" + calc
				+ ", presentDate=" + presentDate + ", presentSeries="
				+ presentSeries + ", r1=" + r1 + ", r2=" + r2 + ", r3=" + r3
				+ ", r4=" + r4 + ", r5=" + r5 + ", r6=" + r6 + "]";
	}

}