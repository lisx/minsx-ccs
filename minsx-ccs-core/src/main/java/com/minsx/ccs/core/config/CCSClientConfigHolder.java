package com.minsx.ccs.core.config;

public class CCSClientConfigHolder {

	private AliyunOSSConfig aliyunOSSConfig;

	private TencentCOSConfig tencentCOSConfig;
	
	private BaiduBOSConfig baiduBOSConfig;

	public AliyunOSSConfig getAliyunOSSConfig() {
		return aliyunOSSConfig;
	}

	public void setAliyunOSSConfig(AliyunOSSConfig aliyunOSSConfig) {
		this.aliyunOSSConfig = aliyunOSSConfig;
	}

	public TencentCOSConfig getTencentCOSConfig() {
		return tencentCOSConfig;
	}

	public void setTencentCOSConfig(TencentCOSConfig tencentCOSConfig) {
		this.tencentCOSConfig = tencentCOSConfig;
	}

	public BaiduBOSConfig getBaiduBOSConfig() {
		return baiduBOSConfig;
	}

	public void setBaiduBOSConfig(BaiduBOSConfig baiduBOSConfig) {
		this.baiduBOSConfig = baiduBOSConfig;
	}

}
