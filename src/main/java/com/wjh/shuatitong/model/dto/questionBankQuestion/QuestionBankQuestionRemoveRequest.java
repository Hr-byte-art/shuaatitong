package com.wjh.shuatitong.model.dto.questionBankQuestion;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 移除题目题库关系请求
 * @author 王哈哈
 */
@Data
public class QuestionBankQuestionRemoveRequest implements Serializable {
    /**
     * 题库 id
     */
    private Long questionBankId;

    /**
     * 题目 id
     */
    private Long questionId;

    @Serial
    private static final long serialVersionUID = 1L;
}