/**
 * 
 */
package com.james.wee.linkssq.model;

/**
 * @author James
 *
 */
public class CrossModel {
	private String presentSeries;
	private String r1;
	private String r2;
	private String r3;
	private String r4;
	private String r5;
	private String r6;

	private Integer crossCnt1=0;
	private Integer crossCnt2=0;
	private Integer crossCnt3=0;
	private Integer crossCnt4=0;
	private Integer crossCnt5=0;

	private String crossReds1;
	private String crossReds2;
	private String crossReds3;
	private String crossReds4;
	private String crossReds5;

	
	
	public CrossModel(Presentdata present, String crossReds1,
			String crossReds2, String crossReds3, String crossReds4,
			String crossReds5) {
		super();
		this.presentSeries = present.getPresentSeries();
		this.r1 = present.getR1();
		this.r2 = present.getR2();
		this.r3 =present.getR3();
		this.r4 = present.getR4();
		this.r5 =present.getR5();
		this.r6 = present.getR6();
		this.crossReds1 = crossReds1;
		this.crossReds2 = crossReds2;
		this.crossReds3 = crossReds3;
		this.crossReds4 = crossReds4;
		this.crossReds5 = crossReds5;
		
		if(null!=crossReds1){
			if(this.crossReds1.indexOf(r1)!=-1)
				this.crossCnt1+=1;
			if(this.crossReds1.indexOf(r2)!=-1)
				this.crossCnt1+=1;
			if(this.crossReds1.indexOf(r3)!=-1)
				this.crossCnt1+=1;
			if(this.crossReds1.indexOf(r4)!=-1)
				this.crossCnt1+=1;
			if(this.crossReds1.indexOf(r5)!=-1)
				this.crossCnt1+=1;
			if(this.crossReds1.indexOf(r6)!=-1)
				this.crossCnt1+=1;
		}
		
		
		if(null!=crossReds2){
			if(this.crossReds2.indexOf(r1)!=-1)
				this.crossCnt2+=1;
			if(this.crossReds2.indexOf(r2)!=-1)
				this.crossCnt2+=1;
			if(this.crossReds2.indexOf(r3)!=-1)
				this.crossCnt2+=1;
			if(this.crossReds2.indexOf(r4)!=-1)
				this.crossCnt2+=1;
			if(this.crossReds2.indexOf(r5)!=-1)
				this.crossCnt2+=1;
			if(this.crossReds2.indexOf(r6)!=-1)
				this.crossCnt2+=1;
		}
		
		if(null!=crossReds3){
			if(this.crossReds3.indexOf(r1)!=-1)
				this.crossCnt3+=1;
			if(this.crossReds3.indexOf(r2)!=-1)
				this.crossCnt3+=1;
			if(this.crossReds3.indexOf(r3)!=-1)
				this.crossCnt3+=1;
			if(this.crossReds3.indexOf(r4)!=-1)
				this.crossCnt3+=1;
			if(this.crossReds3.indexOf(r5)!=-1)
				this.crossCnt3+=1;
			if(this.crossReds3.indexOf(r6)!=-1)
				this.crossCnt3+=1;
		}
		
		if(null!=crossReds4){
			if(this.crossReds4.indexOf(r1)!=-1)
				this.crossCnt4+=1;
			if(this.crossReds4.indexOf(r2)!=-1)
				this.crossCnt4+=1;
			if(this.crossReds4.indexOf(r3)!=-1)
				this.crossCnt4+=1;
			if(this.crossReds4.indexOf(r4)!=-1)
				this.crossCnt4+=1;
			if(this.crossReds4.indexOf(r5)!=-1)
				this.crossCnt4+=1;
			if(this.crossReds4.indexOf(r6)!=-1)
				this.crossCnt4+=1;
		}
		
		if(null!=crossReds5){
			if(this.crossReds5.indexOf(r1)!=-1)
				this.crossCnt5+=1;
			if(this.crossReds5.indexOf(r2)!=-1)
				this.crossCnt5+=1;
			if(this.crossReds5.indexOf(r3)!=-1)
				this.crossCnt5+=1;
			if(this.crossReds5.indexOf(r4)!=-1)
				this.crossCnt5+=1;
			if(this.crossReds5.indexOf(r5)!=-1)
				this.crossCnt5+=1;
			if(this.crossReds5.indexOf(r6)!=-1)
				this.crossCnt5+=1;
		}
	}

	public String getPresentSeries() {
		return presentSeries;
	}

	public void setPresentSeries(String presentSeries) {
		this.presentSeries = presentSeries;
	}

	public String getR1() {
		return r1;
	}

	public void setR1(String r1) {
		this.r1 = r1;
	}

	public String getR2() {
		return r2;
	}

	public void setR2(String r2) {
		this.r2 = r2;
	}

	public String getR3() {
		return r3;
	}

	public void setR3(String r3) {
		this.r3 = r3;
	}

	public String getR4() {
		return r4;
	}

	public void setR4(String r4) {
		this.r4 = r4;
	}

	public String getR5() {
		return r5;
	}

	public void setR5(String r5) {
		this.r5 = r5;
	}

	public String getR6() {
		return r6;
	}

	public void setR6(String r6) {
		this.r6 = r6;
	}

	public Integer getCrossCnt1() {
		return crossCnt1;
	}

	public void setCrossCnt1(Integer crossCnt1) {
		this.crossCnt1 = crossCnt1;
	}

	public Integer getCrossCnt2() {
		return crossCnt2;
	}

	public void setCrossCnt2(Integer crossCnt2) {
		this.crossCnt2 = crossCnt2;
	}

	public Integer getCrossCnt3() {
		return crossCnt3;
	}

	public void setCrossCnt3(Integer crossCnt3) {
		this.crossCnt3 = crossCnt3;
	}

	public Integer getCrossCnt4() {
		return crossCnt4;
	}

	public void setCrossCnt4(Integer crossCnt4) {
		this.crossCnt4 = crossCnt4;
	}

	public Integer getCrossCnt5() {
		return crossCnt5;
	}

	public void setCrossCnt5(Integer crossCnt5) {
		this.crossCnt5 = crossCnt5;
	}

	public String getCrossReds1() {
		return crossReds1;
	}

	public void setCrossReds1(String crossReds1) {
		this.crossReds1 = crossReds1;
	}

	public String getCrossReds2() {
		return crossReds2;
	}

	public void setCrossReds2(String crossReds2) {
		this.crossReds2 = crossReds2;
	}

	public String getCrossReds3() {
		return crossReds3;
	}

	public void setCrossReds3(String crossReds3) {
		this.crossReds3 = crossReds3;
	}

	public String getCrossReds4() {
		return crossReds4;
	}

	public void setCrossReds4(String crossReds4) {
		this.crossReds4 = crossReds4;
	}

	public String getCrossReds5() {
		return crossReds5;
	}

	public void setCrossReds5(String crossReds5) {
		this.crossReds5 = crossReds5;
	}

}
