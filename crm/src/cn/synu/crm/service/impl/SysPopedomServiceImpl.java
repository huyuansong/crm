package cn.synu.crm.service.impl;

import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.synu.crm.dao.ISysPopedomDao;
import cn.synu.crm.domain.SysPopedom;
import cn.synu.crm.service.ISysPopedomService;

@Transactional(readOnly=true)
@Service(ISysPopedomService.SERVICE_NAME)
public class SysPopedomServiceImpl implements ISysPopedomService {

	@Resource(name=ISysPopedomDao.SERVICE_NAME)
	private ISysPopedomDao sysPopedomDao;
	
	public List<SysPopedom> findAllSysPopedoms() {
		LinkedHashMap<String, String> orderby=new LinkedHashMap<String, String>();
		orderby.put("o.sort", "asc");
		return sysPopedomDao.findObjectsByConditionWithNoPage(orderby);
	}

}
