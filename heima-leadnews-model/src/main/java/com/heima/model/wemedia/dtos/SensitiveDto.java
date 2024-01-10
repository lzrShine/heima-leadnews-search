package com.heima.model.wemedia.dtos;

import com.heima.model.common.dtos.PageRequestDto;
import lombok.Data;

/**
 * @author 梁峥嵘
 */
@Data
public class SensitiveDto extends PageRequestDto {

    /**
     * 敏感词名称
     */
    private String name;
}
