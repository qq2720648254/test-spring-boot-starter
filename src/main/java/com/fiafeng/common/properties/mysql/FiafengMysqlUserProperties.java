package com.fiafeng.common.properties.mysql;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("fiafeng.mysql-table.user")
@Data
public class FiafengMysqlUserProperties implements IMysqlTableProperties{

    /**
     * 主键id的字段名称
     */
    public String idName = "id";

    /**
     * 表名
     */
    public String tableName = "base_user";

    /**
     * 名称字段的名字
     */
    public String tableColName = "username";


}
