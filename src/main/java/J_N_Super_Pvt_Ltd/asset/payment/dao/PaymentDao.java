package lk.J_N_Super_Pvt_Ltd.asset.payment.dao;

import lk.J_N_Super_Pvt_Ltd.asset.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDao extends JpaRepository<Payment,Integer> {
}
