package com.exam.system.domain;

import java.io.Serializable;
import java.util.Date;

public class ExamPaperAnswer implements Serializable {

    private static final long serialVersionUID = -2143539181805283910L;

    private Integer id;

    private Integer examPaperId;

    /**
     * 试卷名称
     */
    private String paperName;

    /**
     * 试卷类型( 1固定试卷 4.时段试卷 6.任务试卷)
     */
    private Integer paperType;

    /**
     * 学科
     */
    private Integer subjectId;

    /**
     * 系统判定得分
     */
    private Integer systemScore;

    /**
     * 最终得�?千分�?
     */
    private Integer userScore;

    /**
     * 试卷总分
     */
    private Integer paperScore;

    /**
     * 做对题目数量
     */
    private Integer questionCorrect;

    /**
     * 题目总数�?
     */
    private Integer questionCount;

    /**
     * 做题时间(�?
     */
    private Integer doTime;

    /**
     * 试卷状�?1待判�?2完成)
     */
    private Integer status;

    /**
     * 学生
     */
    private Integer createUser;

    /**
     * 提交时间
     */
    private Date createTime;

    private Integer taskExamId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExamPaperId() {
        return examPaperId;
    }

    public void setExamPaperId(Integer examPaperId) {
        this.examPaperId = examPaperId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName == null ? null : paperName.trim();
    }

    public Integer getPaperType() {
        return paperType;
    }

    public void setPaperType(Integer paperType) {
        this.paperType = paperType;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getSystemScore() {
        return systemScore;
    }

    public void setSystemScore(Integer systemScore) {
        this.systemScore = systemScore;
    }

    public Integer getUserScore() {
        return userScore;
    }

    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }

    public Integer getPaperScore() {
        return paperScore;
    }

    public void setPaperScore(Integer paperScore) {
        this.paperScore = paperScore;
    }

    public Integer getQuestionCorrect() {
        return questionCorrect;
    }

    public void setQuestionCorrect(Integer questionCorrect) {
        this.questionCorrect = questionCorrect;
    }

    public Integer getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

    public Integer getDoTime() {
        return doTime;
    }

    public void setDoTime(Integer doTime) {
        this.doTime = doTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getTaskExamId() {
        return taskExamId;
    }

    public void setTaskExamId(Integer taskExamId) {
        this.taskExamId = taskExamId;
    }
}
