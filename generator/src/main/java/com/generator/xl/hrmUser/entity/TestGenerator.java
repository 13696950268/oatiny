package com.generator.xl.hrmUser.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Xiao Lang
 * @since 2020-08-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TestGenerator implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer age;


}
