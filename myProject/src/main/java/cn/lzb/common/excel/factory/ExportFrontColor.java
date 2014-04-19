package cn.lzb.common.excel.factory;

import cn.lzb.common.lang.StringUtil;

/**
 * 功能描述：生成Excel文件字体颜色，目前只支持红色与绿色
 *
 * @author: Zhenbin.Li
 * email： zhenbin.li@okhqb.com
 * company：华强北在线
 * Date: 13-12-4 Time：下午5:57
 */
public enum ExportFrontColor {

    /** 红色 */
    RED("RED"),

    /** 绿色 */
    GREEN("GREEN");

    /** 颜色编码 */
    private String colorCode;

    private ExportFrontColor(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }

    public static ExportFrontColor getColor(String code) {
        if (StringUtil.isBlank(code)) {
            return null;
        }
        for (ExportFrontColor exportFrontColor : ExportFrontColor.values()) {
            if (exportFrontColor.getColorCode().equals(code)) {
                return exportFrontColor;
            }
        }
        return null;
    }
}
