package com.example.demo.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;


@Entity
@Table(name = "Repairs")
public class Repair {


        @Id
        @Column(name = "repairid", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long repairID;


        @Column(name = "description", length = 255)
        private String description;


        @Column(name = "dayofrepair")
        private LocalDateTime dayOfRepair;


        @Column(name = "repairstatus", length =30)
        private String repairStatus;


        @Column(name = "repairtype", length = 30)
        private String repairType;

        @Column(name="servicecost",precision=10, scale=2)
        private Double serviceCost;

        @Column(name = "platenumber",length = 8)
        private String plateNumber;

        @ManyToOne(optional=false, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
        @JoinColumn(name="owner_id",referencedColumnName="owner_id")
        private Owner owner;


        public Repair() {
        }


        public Long getRepairID() {
                return repairID;
        }

        public void setRepairID(Long repairID) {
                this.repairID = repairID;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public LocalDateTime getDayOfRepair() {
                return dayOfRepair;
        }

        public void setDayOfRepair(LocalDateTime dayOfRepair) {
                this.dayOfRepair = dayOfRepair;
        }

        public String getRepairStatus() {
                return repairStatus;
        }

        public void setRepairStatus(String repairStatus) {
                this.repairStatus = repairStatus;
        }

        public String getRepairType() {
                return repairType;
        }

        public void setRepairType(String repairType) {
                this.repairType = repairType;
        }

        public Double getServiceCost() {
                return serviceCost;
        }

        public void setServiceCost(Double serviceCost) {
                this.serviceCost = serviceCost;
        }

        public String getPlateNumber() {
                return plateNumber;
        }

        public void setPlateNumber(String plateNumber) {
                this.plateNumber = plateNumber;
        }

        public Owner getOwner() {
                return owner;
        }

        public void setOwner(Owner owner) {
                this.owner = owner;
        }


        @Override
        public String toString() {

                return "Repair{" +

                        "RepairID=" + repairID +

                        ", Description=" + description +

                        ", DayOfRepair='" + dayOfRepair + '\'' +

                        ", RepairStatus='" + repairStatus + '\'' +

                        ", RepairType='" + repairType + '\'' +

                        ", ServiceCost='" + serviceCost + '\'' +



                        ", PlateNumber='" + plateNumber + '\'' +

                        ", PlateNumber='" + plateNumber + '\'' +

                        '}';

        }




}

