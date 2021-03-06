package com.sspu.community.dto;

import com.sspu.community.model.User;
import lombok.Data;

/**
 * @author Sun
 * @date 2022/4/3 17:59
 */
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;


}