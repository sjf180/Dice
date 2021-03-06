package com.bihell.dice.blog.model.auth;

import com.baomidou.mybatisplus.annotation.TableId;
import com.bihell.dice.blog.model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author haseochen
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class AuthRelRoleItem extends BaseEntity<AuthRelRoleItem> {

    @TableId
    private Integer id;

    private Integer roleId;

    private Integer itemId;
}
