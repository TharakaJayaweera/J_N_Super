package lk.J_N_Super_Pvt_Ltd.asset.item.entity;


import com.fasterxml.jackson.annotation.JsonFilter;
import lk.J_N_Super_Pvt_Ltd.asset.item.category.entity.Category;
import lk.J_N_Super_Pvt_Ltd.asset.purchaseOrder.entity.PurchaseOrderItem;
import lk.J_N_Super_Pvt_Ltd.asset.supplier.entity.Supplier;
import lk.J_N_Super_Pvt_Ltd.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("Item")
public class Item extends AuditEntity {

    @Size(min = 5, message = "Your name cannot be accepted")
    private String name;

    private Integer rop;

    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

    @OneToMany(mappedBy = "item")
    private List<PurchaseOrderItem> purchaseOrderItems;

    @OneToMany(mappedBy = "item")
    private List<ItemBatch> itemBatches;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    @JoinTable(name = "supplier_item",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "supplier_id"))
    private List<Supplier> suppliers;
}
