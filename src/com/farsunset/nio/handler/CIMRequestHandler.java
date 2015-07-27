package com.farsunset.nio.handler;

/**
 *  请求处理接口,所有的请求实现必须实现此接口
 *  @author 3979434@qq.com
 */
import com.farsunset.nio.mutual.ReplyBody;
import com.farsunset.nio.mutual.SentBody;
import com.farsunset.nio.session.CIMSession;
 
public    interface   CIMRequestHandler  {

    public abstract ReplyBody process(CIMSession session,SentBody message);
}