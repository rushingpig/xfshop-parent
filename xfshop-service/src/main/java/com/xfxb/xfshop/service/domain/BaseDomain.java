package com.xfxb.xfshop.service.domain;

import com.xfxb.xfshop.service.persistent.Page;

/**
 * @author pigo.can
 * @email  rushingpig@163.com
 * @homepage http://www.pigo.top
 * @date   2015年11月12日 下午10:50:25
 * @ver    V1.0
 */
public class BaseDomain<T> {
	
	protected Page<T> page;

	public Page<T> getPage() {
		return page;
	}

	public void setPage(Page<T> page) {
		this.page = page;
	}
	
	

}
