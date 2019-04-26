package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tds_master")
public class TDSModel {
	@Id
private int id;
	
private String deductor_name;

private String deductor_pan;

private int tds_deposited;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeductor_name() {
		return deductor_name;
	}
	public void setDeductor_name(String deductor_name) {
		this.deductor_name = deductor_name;
	}
	public String getDeductor_pan() {
		return deductor_pan;
	}
	public void setDeductor_pan(String deductor_pan) {
		this.deductor_pan = deductor_pan;
	}
	public int getTds_deposited() {
		return tds_deposited;
	}
	public void setTds_deposited(int tds_deposited) {
		this.tds_deposited = tds_deposited;
	}
	
}
