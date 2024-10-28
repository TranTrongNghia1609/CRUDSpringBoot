package vn.iotstar.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import vn.iotstar.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    Optional<Category> findById(Long aLong);

    long count();

    List<Category> findAll();

    void deleteById(Long aLong);

    Page<Category> findAll(Pageable pageable);

    List<Category> findAll(Sort sort);

    Optional<Category> findByName(String name);

    Page<Category> findByNameContaning(String name, Pageable pageable);

    <S extends Category> S save(S entity);

    void delete(Category entity);
}
