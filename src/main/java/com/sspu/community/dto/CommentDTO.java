package com.sspu.community.dto;

import lombok.Data;

/**
 * @author Sun
 * @date 2022/4/16 15:58
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}