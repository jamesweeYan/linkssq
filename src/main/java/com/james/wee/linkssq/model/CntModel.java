package com.james.wee.linkssq.model;

import java.util.List;

public class CntModel implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 32472972883836809L;

	public CntModel() {
	}

	private String openNumDate;
	private String openNumSeries;
	private String openNum;
	private List<Integer> groups_one;
	private List<Integer> groups_two;
	private List<Integer> groups_thr;
	private String frequency;
	private String zuMaIds;

	private String zuMaReds;

	private String redNum;
	public String getOpenNumDate() {
		return openNumDate;
	}

	public void setOpenNumDate(String openNumDate) {
		this.openNumDate = openNumDate;
	}

	public String getOpenNumSeries() {
		return openNumSeries;
	}

	public void setOpenNumSeries(String openNumSeries) {
		this.openNumSeries = openNumSeries;
	}

	public String getOpenNum() {
		return openNum;
	}

	public void setOpenNum(String openNum) {
		this.openNum = openNum;
	}

	public List<Integer> getGroups_one() {
		return groups_one;
	}

	public void setGroups_one(List<Integer> groups_one) {
		this.groups_one = groups_one;
	}

	public List<Integer> getGroups_two() {
		return groups_two;
	}

	public void setGroups_two(List<Integer> groups_two) {
		this.groups_two = groups_two;
	}

	public List<Integer> getGroups_thr() {
		return groups_thr;
	}

	public void setGroups_thr(List<Integer> groups_thr) {
		this.groups_thr = groups_thr;
	}

	public String getZuMaIds() {
		return zuMaIds;
	}

	public void setZuMaIds(String zuMaIds) {
		this.zuMaIds = zuMaIds;
	}

	public String getZuMaReds() {
		return zuMaReds;
	}

	public void setZuMaReds(String zuMaReds) {
		this.zuMaReds = zuMaReds;
	}

	public String getRedNum() {
		return redNum;
	}

	public void setRedNum(String redNum) {
		this.redNum = redNum;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public CntModel(String openNumDate, String openNumSeries, String openNum,
			List<Integer> groups_one, List<Integer> groups_two,
			List<Integer> groups_thr, String zuMaIds, String zuMaReds) {
		super();
		this.openNumDate = openNumDate;
		this.openNumSeries = openNumSeries;
		this.openNum = openNum;
		this.groups_one = groups_one;
		this.groups_two = groups_two;
		this.groups_thr = groups_thr;
		this.zuMaIds = zuMaIds;
		this.zuMaReds = zuMaReds;
	}

}
