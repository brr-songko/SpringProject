package com.mySpring.myapp.member.vo;

import org.springframework.stereotype.Component;

//설문 정보 수집 항목
@Component("??")
public class SurveyInfoCollectionVO {
	private String surveyNum;
	private String respondentSex;
	private String respondentAge;
	private String respondentEducation;
	private String respondentMarried;
	private String respondentSalary;
	private String respondentReligion;
	
	public SurveyInfoCollectionVO() {
		
	}
	
	public SurveyInfoCollectionVO(String surveyNum, String respondentSex, String respondentAge,
			String respondentEducation, String respondentMarried, String respondentSalary, String respondentReligion) {
		this.surveyNum = surveyNum;
		this.respondentSex = respondentSex;
		this.respondentAge = respondentAge;
		this.respondentEducation = respondentEducation;
		this.respondentMarried = respondentMarried;
		this.respondentSalary = respondentSalary;
		this.respondentReligion = respondentReligion;
	}

	public String getSurveyNum() {
		return surveyNum;
	}

	public void setSurveyNum(String surveyNum) {
		this.surveyNum = surveyNum;
	}

	public String getRespondentSex() {
		return respondentSex;
	}

	public void setRespondentSex(String respondentSex) {
		this.respondentSex = respondentSex;
	}

	public String getRespondentAge() {
		return respondentAge;
	}

	public void setRespondentAge(String respondentAge) {
		this.respondentAge = respondentAge;
	}

	public String getRespondentEducation() {
		return respondentEducation;
	}

	public void setRespondentEducation(String respondentEducation) {
		this.respondentEducation = respondentEducation;
	}

	public String getRespondentMarried() {
		return respondentMarried;
	}

	public void setRespondentMarried(String respondentMarried) {
		this.respondentMarried = respondentMarried;
	}

	public String getRespondentSalary() {
		return respondentSalary;
	}

	public void setRespondentSalary(String respondentSalary) {
		this.respondentSalary = respondentSalary;
	}

	public String getRespondentReligion() {
		return respondentReligion;
	}

	public void setRespondentReligion(String respondentReligion) {
		this.respondentReligion = respondentReligion;
	}

	
	
}
