package com.heima.comment.pojos;

import lombok.Data;

/**
 * @author 梁峥嵘
 */
@Data
public class CommentVo extends ApComment {

    /**
     * 0：点赞
     * 1：取消点赞
     */
    private Short operation;
}
