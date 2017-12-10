package rmi;

import java.io.Serializable;

public class Compte implements Serializable{

	private int code;
	private double solde;

	public Compte() {
		super();
	}

	public Compte(int code, double solde) {
		super();
		this.code = code;
		this.solde = solde;
	}

	protected int getCode() {
		return code;
	}

	protected void setCode(int code) {
		this.code = code;
	}

	protected double getSolde() {
		return solde;
	}

	protected void setSolde(double solde) {
		this.solde = solde;
	}

}
