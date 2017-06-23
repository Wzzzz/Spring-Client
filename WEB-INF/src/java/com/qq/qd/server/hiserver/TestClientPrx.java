package com.qq.qd.server.hiserver;

import com.qq.cloud.taf.common.annotation.*;
import com.qq.cloud.taf.common.support.Holder;

/**
 * Generated code, DO NOT modify it!
 * @author qq-central:maven-taf-plugin:1.0.0-SNAPSHOT:jce2java
 */
@JceService
public interface TestClientPrx {

	public String test1(String app_id, long freetype);

	public String test1(String app_id, long freetype, @JceContext java.util.Map<String, String> ctx);

	public void async_test1(@JceCallback TestClientPrxCallback callback, String app_id, long freetype);

	public void async_test1(@JceCallback TestClientPrxCallback callback, String app_id, long freetype, @JceContext java.util.Map<String, String> ctx);
}
