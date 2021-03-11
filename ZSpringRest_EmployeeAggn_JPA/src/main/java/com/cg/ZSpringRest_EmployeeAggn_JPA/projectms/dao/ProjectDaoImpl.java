package com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.dao;

import javax.persistence.PersistenceContext;
import com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.exceptions.*;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import com.cg.ZSpringRest_EmployeeAggn_JPA.projectms.entities.*;

@Repository
public class ProjectDaoImpl implements IProjectDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Project add(Project project) {

		entityManager.persist(project);
		return project;
	}

	@Override
	public Project findById(int projectId) {

		Project project = entityManager.find(Project.class, projectId);

		if (project == null) {

			throw new ProjectNotFoundException("project not found for id=" + projectId);
		}
		return project;
	}

	@Override
	public Project update(Project project) {

		project = entityManager.merge(project);
		return project;
	}

}
