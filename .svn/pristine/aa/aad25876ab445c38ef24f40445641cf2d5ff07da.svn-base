package com.ut.scf.core.util;

import com.ut.scf.core.dict.ScfCacheDict;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * 系统内存缓存操作
 */
public class ScfCacheDictUtil {
    /**
     * 获取字典缓存
     *
     * @return 字典缓存
     */
    public static Map<String, Object> getDictMapList() {
        return ScfCacheDict.sysDictMap;
    }

    /**
     * 根据类型ID和类型属性获取类型值
     * @param typeId 类型ID
     * @param keyName 类型属性
     * @return 类型值 没有属性时返回null
     */
    public static String getDictMapValue(String typeId, String keyName) {
        Map<String, Object> map = ScfCacheDict.sysDictMap;
        for (Map<String, Object> valueMap : (List<Map<String, Object>>) map.get(typeId)) {
            if (StringUtils.isNotBlank(keyName) && keyName.equalsIgnoreCase((String) valueMap.get("value"))) {
                return (String) valueMap.get("key");
            }
        }
        return null;
    }
}
