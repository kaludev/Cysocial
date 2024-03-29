package com.kaludev.Cysocial.appuser;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepository extends JpaRepository<AppUser, Long>{
	//@Query("SELECT * FROM AppUser user WHERE user.email = email")
	Optional<AppUser> findByEmail(String email);
	
	@Transactional
	@Modifying
	@Query("UPDATE AppUser user SET user.enabled = TRUE WHERE user.email = ?1")
	int enableAppUser(String email);
}
