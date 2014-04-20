package com.james.wee.linkssq.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cnt database table.
 * 
 */
@Entity
@NamedQuery(name="Cnt.findAll", query="SELECT c FROM Cnt c")
public class Cnt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String openseries;

	private int p1;

	private int p2;

	private int p3;

	private int p4;

	private int p5;

	private int p6;

	public Cnt() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOpenseries() {
		return this.openseries;
	}

	public void setOpenseries(String openseries) {
		this.openseries = openseries;
	}

	public int getP1() {
		return this.p1;
	}

	public void setP1(int p1) {
		this.p1 = p1;
	}

	public int getP2() {
		return this.p2;
	}

	public void setP2(int p2) {
		this.p2 = p2;
	}

	public int getP3() {
		return this.p3;
	}

	public void setP3(int p3) {
		this.p3 = p3;
	}

	public int getP4() {
		return this.p4;
	}

	public void setP4(int p4) {
		this.p4 = p4;
	}

	public int getP5() {
		return this.p5;
	}

	public void setP5(int p5) {
		this.p5 = p5;
	}

	public int getP6() {
		return this.p6;
	}

	public void setP6(int p6) {
		this.p6 = p6;
	}

}