package com.gary.springjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Any repository must extend one of the following three:
 * 1. JPARepository,
 * 2. PagingAndSortingRepository, and
 * 3. CrudRepository
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
