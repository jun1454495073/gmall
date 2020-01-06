package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.ProductAttrValueEntity;
import lombok.Data;
import org.apache.commons.lang.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Data
public class AttrValueVO extends ProductAttrValueEntity{
    public void setValueSelected(List<Object> valueSelected){
        //将valueSelected数组变成以逗号分隔的字符串
        if (CollectionUtils.isEmpty(valueSelected)){
            //是空就赋值为null
            this.setAttrValue(null);
        }else{
            //不是空就赋值给数据库中的value
            String join = StringUtils.join(valueSelected, ",");
            this.setAttrValue(join);
        }
    }
}
