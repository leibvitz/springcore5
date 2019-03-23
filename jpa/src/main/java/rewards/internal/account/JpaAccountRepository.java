package rewards.internal.account;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

/**
 * TODO-04: We have removed the JdbcAccountRepository. This replaces it.
 * <p>
 * 1. Modify this class to implement AccountRepository interface <br/>
 * 2. Annotate this class using a Spring stereotype annotation that indicates it is a
 * repository. <br/>
 * 3. Inject an EntityManager object via @PersistenceContext <br/>
 * 4. Define the method that will look up an Account given a
 * creditCardNumber string using a JPA query<br/>
 * </p>
 */

@Repository("accountRepository")
public class JpaAccountRepository implements AccountRepository {

	
	private EntityManager entityManager;
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Account findByCreditCard(String creditCardNumber) {
		String jpql = "SELECT a FROM Account a where a.creditCardNumber = :creditCardNumber";
		Account account = entityManager.createQuery(jpql, Account.class)
				.setParameter("creditCardNumber", creditCardNumber).getSingleResult();
		return account;
	}
}
