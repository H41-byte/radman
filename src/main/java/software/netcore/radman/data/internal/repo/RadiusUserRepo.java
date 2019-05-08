package software.netcore.radman.data.internal.repo;

import org.springframework.data.repository.CrudRepository;
import software.netcore.radman.data.internal.entity.RadiusUser;

/**
 * @since v. 1.0.0
 */
public interface RadiusUserRepo extends CrudRepository<RadiusUser, Long> {
}