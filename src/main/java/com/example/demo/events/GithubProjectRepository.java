package com.example.demo.events;

import org.springframework.data.repository.CrudRepository;

public interface GithubProjectRepository extends CrudRepository<GithubProject, Long> {
    GithubProject findByRepoName(String repoName);
}
