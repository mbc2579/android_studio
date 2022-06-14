package com.inhatc.ap_201844102;
/*
사용자 계정 정보 모델 클래스
 */

public class UserAccount {
    private String idToken;     //firebasr Uid(고유토큰정보)
    private String emailId;     //이메일 아이디
    private String password;    //비밀번호
    private String major;       //전공
    private String gender;         //성별

    public UserAccount() { } //firebase realtimedb는 빈 생성자 만들어줘야 오류 안남

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
