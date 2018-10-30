package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.isv.device.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-10-09 11:55:09
 */
public class AntMerchantExpandIsvDeviceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8865446122432793662L;

	/** 
	 * 机具申请物料订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}