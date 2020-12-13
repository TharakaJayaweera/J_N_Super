package j_n_super_pvt_ltd.asset.discount_ratio.dao;


import j_n_super_pvt_ltd.asset.discount_ratio.entity.DiscountRatio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRatioDao extends JpaRepository<DiscountRatio, Integer > {
}
