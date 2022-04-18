package com.sspu.community.dto;

import com.sspu.community.model.User;
import lombok.Data;

/**
 * @author Sun
 * @date 2022/4/16 15:58
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;
    private User user;
}