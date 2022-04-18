package com.sspu.community.dto;

import lombok.Data;

/**
 * @author Sun
 * @date 2022/4/16 20:57
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}