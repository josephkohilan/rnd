package com.rnd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "rnd_basic_map")
public class BasicMapEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "key_col")
	private Integer keyColumn;
	
	@Column(name = "value_col")
	private Integer valueColumn;

	public Integer getKeyColumn() {
		return keyColumn;
	}

	public void setKeyColumn(Integer keyColumn) {
		this.keyColumn = keyColumn;
	}

	public Integer getValueColumn() {
		return valueColumn;
	}

	public void setValueColumn(Integer valueColumn) {
		this.valueColumn = valueColumn;
	}
	
}
