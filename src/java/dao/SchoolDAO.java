/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author marij
 */
public class SchoolDAO {
    @SuppressWarnings("unchecked")
	public List<domain.Skole> getSchools(int page, int limit, String sort, String q) {
		Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
		session.beginTransaction();
		
		String queryString = "SELECT s " +
							 "FROM Skola s ";
		
		if (q != null && !q.isEmpty()) {
			queryString += "WHERE CONCAT(s.name, ' ', m.lastName) " +
						   "LIKE CONCAT('%', :name, '%'))";
		}
			queryString += "ORDER BY m.lastName " + sort + ", m.name";
		
		Query query = session.createQuery(queryString);
		
		if (!q.isEmpty()) {
			query.setString("name", q);
		}
		
		List<domain.Skole> all = query
				.setFirstResult((page - 1) * limit)
				.setMaxResults(limit)
				.list();

		session.close();

		return all;
	}
}
