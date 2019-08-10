package com.hcl.demand.supply.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name="training")
public class Training {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long trainingId;
	private String technology;
	private String level;
	private int durationInWeek;
}
