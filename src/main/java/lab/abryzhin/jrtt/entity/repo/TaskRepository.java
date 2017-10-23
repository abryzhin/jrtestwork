package lab.abryzhin.jrtt.entity.repo;


import lab.abryzhin.jrtt.entity.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {

}
