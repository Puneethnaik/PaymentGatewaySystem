package model;

import org.hibernate.annotations.Table;
import util.PaymentStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Payment")
public class Payment {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String email;
    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private String productInfo;
    @Column
    private Double amount;
    @Column
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Column
    @Temporal(TemporalType.DATE)
    private Date paymentDate;
    @Column
    private String txnId;
    @Column
    private String mihpayId;
    @Column
    @Enumerated(EnumType.STRING)
    private PaymentMode mode;
