package com.sspu.community.model;

import lombok.Data;

/**
 * @author Sun
 * @date 2022/3/29 16:22
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;


}