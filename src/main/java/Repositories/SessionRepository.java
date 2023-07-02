package Repositories;

import Models.Session;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SessionRepository extends CrudRepository<Session, Integer> {

    public Session findSessionBySessionId(int sessionId);
    public Session findSessionByAdminId(int adminId);
    public List<Session> findAllSessionByTopic(String topic);
    public List<Session> findAllSessionByIsPrivateFalse();
    public List<Session> findAllSessionByIsOnlineTrue();
    public List<Session> findAllSessionByIsOnlineFalse();
}
