package com.james.wee.linkssq.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the funnel database table.
 * 
 */
@Entity
@NamedQuery(name="Funnel.findAll", query="SELECT f FROM Funnel f")
public class Funnel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="R_01")
	private String r01;

	@Column(name="R_02")
	private String r02;

	@Column(name="R_03")
	private String r03;

	@Column(name="R_04")
	private String r04;

	@Column(name="R_05")
	private String r05;

	@Column(name="R_06")
	private String r06;

	@Column(name="R_07")
	private String r07;

	@Column(name="R_08")
	private String r08;

	@Column(name="R_09")
	private String r09;

	@Column(name="R_10")
	private String r10;

	@Column(name="R_11")
	private String r11;

	@Column(name="R_12")
	private String r12;

	@Column(name="R_13")
	private String r13;

	@Column(name="R_14")
	private String r14;

	@Column(name="R_15")
	private String r15;

	@Column(name="R_16")
	private String r16;

	@Column(name="R_17")
	private String r17;

	@Column(name="R_18")
	private String r18;

	@Column(name="R_19")
	private String r19;

	@Column(name="R_20")
	private String r20;

	@Column(name="R_21")
	private String r21;

	@Column(name="R_22")
	private String r22;

	@Column(name="R_23")
	private String r23;

	@Column(name="R_24")
	private String r24;

	@Column(name="R_25")
	private String r25;

	@Column(name="R_26")
	private String r26;

	@Column(name="R_27")
	private String r27;

	@Column(name="R_28")
	private String r28;

	@Column(name="R_29")
	private String r29;

	@Column(name="R_30")
	private String r30;

	@Column(name="R_31")
	private String r31;

	@Column(name="R_32")
	private String r32;

	@Column(name="R_33")
	private String r33;

	public Funnel() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getR01() {
		return this.r01;
	}

	public void setR01(String r01) {
		this.r01 = r01;
	}

	public String getR02() {
		return this.r02;
	}

	public void setR02(String r02) {
		this.r02 = r02;
	}

	public String getR03() {
		return this.r03;
	}

	public void setR03(String r03) {
		this.r03 = r03;
	}

	public String getR04() {
		return this.r04;
	}

	public void setR04(String r04) {
		this.r04 = r04;
	}

	public String getR05() {
		return this.r05;
	}

	public void setR05(String r05) {
		this.r05 = r05;
	}

	public String getR06() {
		return this.r06;
	}

	public void setR06(String r06) {
		this.r06 = r06;
	}

	public String getR07() {
		return this.r07;
	}

	public void setR07(String r07) {
		this.r07 = r07;
	}

	public String getR08() {
		return this.r08;
	}

	public void setR08(String r08) {
		this.r08 = r08;
	}

	public String getR09() {
		return this.r09;
	}

	public void setR09(String r09) {
		this.r09 = r09;
	}

	public String getR10() {
		return this.r10;
	}

	public void setR10(String r10) {
		this.r10 = r10;
	}

	public String getR11() {
		return this.r11;
	}

	public void setR11(String r11) {
		this.r11 = r11;
	}

	public String getR12() {
		return this.r12;
	}

	public void setR12(String r12) {
		this.r12 = r12;
	}

	public String getR13() {
		return this.r13;
	}

	public void setR13(String r13) {
		this.r13 = r13;
	}

	public String getR14() {
		return this.r14;
	}

	public void setR14(String r14) {
		this.r14 = r14;
	}

	public String getR15() {
		return this.r15;
	}

	public void setR15(String r15) {
		this.r15 = r15;
	}

	public String getR16() {
		return this.r16;
	}

	public void setR16(String r16) {
		this.r16 = r16;
	}

	public String getR17() {
		return this.r17;
	}

	public void setR17(String r17) {
		this.r17 = r17;
	}

	public String getR18() {
		return this.r18;
	}

	public void setR18(String r18) {
		this.r18 = r18;
	}

	public String getR19() {
		return this.r19;
	}

	public void setR19(String r19) {
		this.r19 = r19;
	}

	public String getR20() {
		return this.r20;
	}

	public void setR20(String r20) {
		this.r20 = r20;
	}

	public String getR21() {
		return this.r21;
	}

	public void setR21(String r21) {
		this.r21 = r21;
	}

	public String getR22() {
		return this.r22;
	}

	public void setR22(String r22) {
		this.r22 = r22;
	}

	public String getR23() {
		return this.r23;
	}

	public void setR23(String r23) {
		this.r23 = r23;
	}

	public String getR24() {
		return this.r24;
	}

	public void setR24(String r24) {
		this.r24 = r24;
	}

	public String getR25() {
		return this.r25;
	}

	public void setR25(String r25) {
		this.r25 = r25;
	}

	public String getR26() {
		return this.r26;
	}

	public void setR26(String r26) {
		this.r26 = r26;
	}

	public String getR27() {
		return this.r27;
	}

	public void setR27(String r27) {
		this.r27 = r27;
	}

	public String getR28() {
		return this.r28;
	}

	public void setR28(String r28) {
		this.r28 = r28;
	}

	public String getR29() {
		return this.r29;
	}

	public void setR29(String r29) {
		this.r29 = r29;
	}

	public String getR30() {
		return this.r30;
	}

	public void setR30(String r30) {
		this.r30 = r30;
	}

	public String getR31() {
		return this.r31;
	}

	public void setR31(String r31) {
		this.r31 = r31;
	}

	public String getR32() {
		return this.r32;
	}

	public void setR32(String r32) {
		this.r32 = r32;
	}

	public String getR33() {
		return this.r33;
	}

	public void setR33(String r33) {
		this.r33 = r33;
	}

}