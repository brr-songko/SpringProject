package com.mySpring.myapp.member.vo;


import org.springframework.stereotype.Component;

//SurveyVO_설문생성페이지
@Component("MemberVO")
	public class MemberVO {
		private int surveyNum;
		private int surveyQuestionNum;
		private String surveyManagementTitle;
		private String surveyDateStart;
		private String surveyDateEnd;
		private int respondentSendNum;
		private String surveyRespondentsReward;
		private String surveySelfCheck;
		private String surveyTitle;
		private String surveyGuidelines;
		private String surveyGuideEnd;
		private String suveyConsentProcess;
		private String surveyQuestion;
		private String surveyExplain;
		private String surveyRequiredAnswer;
		
		public MemberVO() {
			
		}
		
		public MemberVO(int surveyNum, int surveyQuestionNum, String surveyManagementTitle, String surveyDateStart, String surveyDateEnd,
				int respondentSendNum, String surveyRespondentsReward, String surveySelfCheck, String surveyTitle, String surveyGuidelines, String surveyGuideEnd, 
				String suveyConsentProcess, String surveyQuestion, String surveyExplain, String surveyRequiredAnswer) {
			this.surveyNum = surveyNum;
			this.surveyQuestionNum = surveyQuestionNum;
			this.surveyManagementTitle = surveyManagementTitle;
			this.surveyDateStart = surveyDateStart;
			this.surveyDateEnd = surveyDateEnd;
			this.respondentSendNum = respondentSendNum;
			this.surveyRespondentsReward = surveyRespondentsReward;
			this.surveySelfCheck = surveySelfCheck;
			this.surveyTitle = surveyTitle;
			this.surveyGuidelines = surveyGuidelines;
			this.surveyGuideEnd = surveyGuideEnd;
			this.suveyConsentProcess = suveyConsentProcess;
			this.surveyQuestion = surveyQuestion;
			this.surveyExplain = surveyExplain;
			this.surveyRequiredAnswer = surveyRequiredAnswer;
		}

		public int getSurveyNum() {
			return surveyNum;
		}

		public void setSurveyNum(int surveyNum) {
			this.surveyNum = surveyNum;
		}

		public int getSurveyQuestionNum() {
			return surveyQuestionNum;
		}

		public void setSurveyQuestionNum(int surveyQuestionNum) {
			this.surveyQuestionNum = surveyQuestionNum;
		}

		public String getSurveyManagementTitle() {
			return surveyManagementTitle;
		}

		public void setSurveyManagementTitle(String surveyManagementTitle) {
			this.surveyManagementTitle = surveyManagementTitle;
		}

		public String getSurveyDateStart() {
			return surveyDateStart;
		}

		public void setSurveyDateStart(String surveyDateStart) {
			this.surveyDateStart = surveyDateStart;
		}

		public String getSurveyDateEnd() {
			return surveyDateEnd;
		}

		public void setSurveyDateEnd(String surveyDateEnd) {
			this.surveyDateEnd = surveyDateEnd;
		}

		public int getrespondentSendNum() {
			return respondentSendNum;
		}

		public void setrespondentSendNum(int respondentSendNum) {
			this.respondentSendNum = respondentSendNum;
		}

		public String getSurveyRespondentsReward() {
			return surveyRespondentsReward;
		}

		public void setSurveyRespondentsReward(String surveyRespondentsReward) {
			this.surveyRespondentsReward = surveyRespondentsReward;
		}

		public String getSurveySelfCheck() {
			return surveySelfCheck;
		}

		public void setSurveySelfCheck(String surveySelfCheck) {
			this.surveySelfCheck = surveySelfCheck;
		}

		public String getSurveyTitle() {
			return surveyTitle;
		}

		public void setSurveyTitle(String surveyTitle) {
			this.surveyTitle = surveyTitle;
		}

		public String getSurveyGuidelines() {
			return surveyGuidelines;
		}

		public void setSurveyGuidelines(String surveyGuidelines) {
			this.surveyGuidelines = surveyGuidelines;
		}

		public String getSurveyGuideEnd() {
			return surveyGuideEnd;
		}

		public void setSurveyGuideEnd(String surveyGuideEnd) {
			this.surveyGuideEnd = surveyGuideEnd;
		}

		public String getSuveyConsentProcess() {
			return suveyConsentProcess;
		}

		public void setSuveyConsentProcess(String suveyConsentProcess) {
			this.suveyConsentProcess = suveyConsentProcess;
		}

		public String getSurveyQuestion() {
			return surveyQuestion;
		}

		public void setSurveyQuestion(String surveyQuestion) {
			this.surveyQuestion = surveyQuestion;
		}

		public String getSurveyExplain() {
			return surveyExplain;
		}

		public void setSurveyExplain(String surveyExplain) {
			this.surveyExplain = surveyExplain;
		}

		public String getSurveyRequiredAnswer() {
			return surveyRequiredAnswer;
		}

		public void setSurveyRequiredAnswer(String surveyRequiredAnswer) {
			this.surveyRequiredAnswer = surveyRequiredAnswer;
		}
	
}
