package com.mySpring.myapp.member.vo;

import org.springframework.stereotype.Component;

//설문응답 답변 모음
@Component("??")
public class SurveyAnswerCollectionVO {
	private int respondentPhoneNum;
	private int respondentSurveyQuestionNum;
	private int respondentSurveyNum;
	private String respondentSurveyQuestionAnswer;
	private int respondentQuestionNum;
	
	public SurveyAnswerCollectionVO() {
		
	}
	
	public SurveyAnswerCollectionVO(int respondentPhoneNum, int respondentSurveyQuestionNum, int respondentSurveyNum,
			String respondentSurveyQuestionAnswer, int respondentQuestionNum) {
		
	}
	
}
