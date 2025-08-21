package io.github.larrythexu.JPADemo.repositories;

import io.github.larrythexu.JPADemo.models.footnotes.Link;
import org.springframework.data.jpa.repository.JpaRepository;

// Link Footnote repo for testing
public interface LinkRepository extends JpaRepository<Link, Integer> {

}
