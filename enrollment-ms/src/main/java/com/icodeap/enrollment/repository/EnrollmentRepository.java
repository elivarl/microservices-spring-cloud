package com.icodeap.enrollment.repository;

import com.icodeap.enrollment.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
