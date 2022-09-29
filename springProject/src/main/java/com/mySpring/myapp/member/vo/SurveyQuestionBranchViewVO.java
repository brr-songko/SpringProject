package com.mySpring.myapp.member.vo;

import org.springframework.stereotype.Component;

//설문 질문 분기 보기
@Component("??")
public class SurveyQuestionBranchViewVO {
	private int surveyQuestionNum;
	private int surveyNum;
	private String surveyAnswers;
	private String surveyBranchNum;
	
	public SurveyQuestionBranchViewVO() {
		
	}
	
	public SurveyQuestionBranchViewVO(int surveyQuestionNum, int surveyNum, String surveyAnswers, String surveyBranchNum) {
		this.surveyQuestionNum = surveyQuestionNum;
		this.surveyNum = surveyNum;
		this.surveyAnswers = surveyAnswers;
		this.surveyBranchNum = surveyBranchNum;
	}

	public int getSurveyQuestionNum() {
		return surveyQuestionNum;
	}

	public void setSurveyQuestionNum(int surveyQuestionNum) {
		this.surveyQuestionNum = surveyQuestionNum;
	}

	public int getSurveyNum() {
		return surveyNum;
	}

	public void setSurveyNum(int surveyNum) {
		this.surveyNum = surveyNum;
	}

	public String getSurveyAnswers() {
		return surveyAnswers;
	}

	public void setSurveyAnswers(String surveyAnswers) {
		this.surveyAnswers = surveyAnswers;
	}

	public String getSurveyBranchNum() {
		return surveyBranchNum;
	}

	public void setSurveyBranchNum(String surveyBranchNum) {
		this.surveyBranchNum = surveyBranchNum;
	}
	
}
