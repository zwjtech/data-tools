package com.ceying.tools.dao.scyp.tools;

import com.ceying.tools.entity.scyp.tools.ColumnInformation;
import com.ceying.tools.entity.scyp.tools.TableInformation;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: yangxh
 * 开发时间: 2018/6/13<br>
 * <br>
 */
@Repository
public interface ExportTableStructureDao {
    List<TableInformation> listTableInformation(String sql);
    List<ColumnInformation> listColumnInformation(String sql);
}
