package com.example.OneToManyDemo.Repository;

import com.example.OneToManyDemo.Entity.ItemsEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepo extends JpaRepository<ItemsEntity,Integer> {
}
