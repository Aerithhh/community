package com.sspu.community.mapper;

import com.sspu.community.model.Question;

/**
 * @author Sun
 * @date 2022/4/15 23:19
 */
public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question record);
}