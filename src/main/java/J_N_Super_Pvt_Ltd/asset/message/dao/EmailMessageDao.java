package J_N_Super_Pvt_Ltd.asset.message.dao;


import J_N_Super_Pvt_Ltd.asset.message.entity.EmailMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailMessageDao extends JpaRepository<EmailMessage, Integer > {
}