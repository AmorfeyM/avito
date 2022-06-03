package com.amr.project.dao.abstracts;


import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository<Category, Long> extends ReadWriteDao<Category, Long> {
}
