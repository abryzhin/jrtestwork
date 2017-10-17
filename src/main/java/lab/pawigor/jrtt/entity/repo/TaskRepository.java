package lab.pawigor.jrtt.entity.repo;


import lab.pawigor.jrtt.entity.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {

}
