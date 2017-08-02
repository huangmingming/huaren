package com.hr.huaren.utils;

import android.util.SparseArray;
import android.view.View;

/**
 * adapter view 缓存工具类
 * 
 * @author LiJiaJian
 * @date 2014-9-13 下午3:15:18
 * @Description: ViewHolder简洁写法,避免重复编写不同的ViewHolder
 */
@SuppressWarnings("unchecked")
public class ViewHolder {
    public static <T extends View> T get(View view, int id) {
        SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();
        if (viewHolder == null) {
            viewHolder = new SparseArray<View>();
            view.setTag(viewHolder);
        }
        View childView = viewHolder.get(id);
        if (childView == null) {
            childView = view.findViewById(id);
            viewHolder.put(id, childView);
        }
        return (T) childView;
    }
}
