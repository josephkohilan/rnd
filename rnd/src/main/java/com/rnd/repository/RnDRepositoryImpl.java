package com.rnd.repository;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.rnd.entity.BasicMapEntity;

@Repository
public class RnDRepositoryImpl extends BaseDao implements RnDRepository {

	@Override
	public Integer getData(Integer input) {
		Criteria criteria = getSession().createCriteria(BasicMapEntity.class);
		criteria.add(Restrictions.eq("keyColumn", input));
		return ((BasicMapEntity)criteria.uniqueResult()).getValueColumn();
	}

}
