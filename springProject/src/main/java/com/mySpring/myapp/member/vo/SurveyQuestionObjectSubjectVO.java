package com.mySpring.myapp.member.vo;

import org.springframework.stereotype.Component;

//설문 질문 객관식 주관식 보기
@Component("??")
public class SurveyQuestionObjectSubjectVO {
	private int surveyQuestionNum;
	private int surveyNum;
	private String surveyAnswers;
	private String surveyType;
	
	public SurveyQuestionObjectSubjectVO() {
		
	}
	
	public SurveyQuestionObjectSubjectVO(int surveyQuestionNum, int surveyNum, String surveyAnswers,
			String surveyType) {
		this.surveyQuestionNum = surveyQuestionNum;
		this.surveyNum = surveyNum;
		this.surveyAnswers = surveyAnswers;
		this.surveyType = surveyType;
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

	public String getSurveyAnswer() {
		return surveyAnswers;
	}

	public void setSurveyAnswer(String surveyAnswer) {
		this.surveyAnswers = surveyAnswer;
	}

	public String getSurveyType() {
		return surveyType;
	}

	public void setSurveyType(String surveyType) {
		this.surveyType = surveyType;
	}

}
