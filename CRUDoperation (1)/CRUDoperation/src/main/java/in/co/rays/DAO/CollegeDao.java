package in.co.rays.DAO;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.rays.DTO.CollegeDTO;

@Repository("collegeDAO")
public class CollegeDao {

	@Autowired
	private SessionFactory sessionFactory;
	// private HibernateTemplate hibernateTemplate;

	// create
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addCollege(CollegeDTO college) {
		try {
			sessionFactory.getCurrentSession().save(college);
		} catch (HibernateException e) {
			sessionFactory.openSession().save(college);
		}

		// sessionFactory.getCurrentSession().save(college);
		// this.hibernateTemplate.save(college);
	}

	public List getAllCollege(CollegeDTO dto) {

		List list = null;
		Criteria criteria = sessionFactory.openSession().createCriteria(CollegeDTO.class);
		if (dto != null) {
			if (dto.getId() > 0) {
				criteria.add(Restrictions.eq("id", dto.getId()));
			}
			if (dto.getName() != null && dto.getName().length() > 0) {
				criteria.add(Restrictions.like("name", dto.getName() + "%"));
			}
			if (dto.getState() != null && dto.getState().length() > 0) {
				criteria.add(Restrictions.like("state", dto.getState() + "%"));
			}

			list = criteria.list();
		}
		System.out.println(list);
		return list;

	}

	public void UpdateCollege(CollegeDTO college) {
		try {
			sessionFactory.getCurrentSession().update(college);
			System.out.println("123");
		} catch (HibernateException e) {
			e.printStackTrace();
			sessionFactory.openSession().update(college);
			System.out.println("23232");
		}

	}
	
	public CollegeDTO findByPK(long pk) {
		// TODO Auto-generated method stub
		
		CollegeDTO dto=null;
		dto=(CollegeDTO) sessionFactory.getCurrentSession().get(CollegeDTO.class, pk);
		
		return dto;
	}


}
