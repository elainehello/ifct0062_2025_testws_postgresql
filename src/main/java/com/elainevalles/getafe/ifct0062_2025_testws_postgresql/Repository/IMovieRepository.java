package com.elainevalles.getafe.ifct0062_2025_testws_postgresql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.elainevalles.getafe.ifct0062_2025_testws_postgresql.model.Movie;

@RepositoryRestResource
public interface IMovieRepository extends JpaRepository<Movie, Integer> {
}