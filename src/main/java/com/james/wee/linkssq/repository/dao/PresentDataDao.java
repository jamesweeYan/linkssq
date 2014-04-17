/**
 * 
 */
package com.james.wee.linkssq.repository.dao;

import java.beans.PropertyDescriptor;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.james.wee.linkssq.model.Presentdata;
import com.james.wee.linkssq.util.HtmlParse;

/**
 * @author James
 *
 */
@Repository("presentDataDao")
public class PresentDataDao {
	
	private static final Logger logger = LoggerFactory
			.getLogger(PresentDataDao.class);
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public boolean updateLastOpenData() {
		boolean flag = true;
		try {
			String open = HtmlParse.parseOpenSSQData();
			if (null != open) {
				Presentdata present = new Presentdata(open);
				logger.info("present====>" + present);
				entityManager.persist(present);
			}
		} catch (Exception e) {
			logger.info("鏇存柊鏈�鏂板紑濂栨暟鎹嚭鐜板紓甯革細" + e.getMessage());
			flag = false;
		}
		return flag;
	}

	@SuppressWarnings("unchecked")
	public List<Presentdata> queryAllPresentData() {
		Query query = entityManager.createNamedQuery("Presentdata.findAll");
		return query.getResultList();
	}

	/**
	 * 
	 * @param pageSize
	 * @param currageNo
	 * @param index
	 *            鏁版嵁鐨勭储寮�
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Presentdata> queryPresentDataForPage(int pageSize,
			int currageNo, int index) {
		return entityManager
				.createQuery(
						"SELECT p FROM Presentdata p order by p.id desc limit "
								+ ((currageNo - 1) * pageSize + index) + ","
								+ pageSize).getResultList();
	}

	public void countPresentData(int groups) {
		List<Presentdata> list = queryPresentDataForPage(groups, 1, 1);
		Map<String, Integer> cntMap = new TreeMap<String, Integer>();
		PropertyDescriptor pd = null;
		String value = null;
		if (null != list) {
			for (Presentdata present : list) {
				for (int i = 1; i <= 6; i++) {
					try {
						pd = new PropertyDescriptor("r" + i, Presentdata.class);
						value = (String) pd.getReadMethod().invoke(present);
						if (cntMap.get(value) != null)
							cntMap.put(value, cntMap.get(value).intValue() + 1);
						else
							cntMap.put(value, 1);
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
		}
	}
}
