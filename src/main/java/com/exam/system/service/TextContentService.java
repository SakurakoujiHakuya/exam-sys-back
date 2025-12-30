package com.exam.system.service;

import com.exam.system.domain.TextContent;

import java.util.Date;
import java.util.List;
import java.util.function.Function;

public interface TextContentService extends BaseService<TextContent> {

    /**
     * 创建一个TextContent，将内容转化为json，回写到content中，不入�?
     *
     * @param list
     * @param now
     * @param mapper
     * @param <T>
     * @param <R>
     * @return
     */
    <T, R> TextContent jsonConvertInsert(List<T> list, Date now, Function<? super T, ? extends R> mapper);

    /**
     * 修改一个TextContent，将内容转化为json，回写到content中，不入�?
     *
     * @param textContent
     * @param list
     * @param mapper
     * @param <T>
     * @param <R>
     * @return
     */
    <T, R> TextContent jsonConvertUpdate(TextContent textContent, List<T> list, Function<? super T, ? extends R> mapper);

}
