package org.exames.action;

import java.sql.ResultSet;

import org.exames.dao.Admin;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport {

	private static final long serialVersionUID = -1905974197186620917L;
	private String unome = "", ucpf = "", unota = "", ucargo = "", ucpfhidden = "";
	private String msg = "";
	ResultSet rs = null;
	Admin dao = new Admin();
	String submitType;

	@Override
	public String execute() throws Exception {
		try {
			if (submitType.equals("updatedata")) {
				rs = dao.fetchUserDetails(ucpf.trim());
				if (rs != null) {
					while (rs.next()) {
						unome = rs.getString("UNOME");
						ucpf = rs.getString("UCPF");
						unota = rs.getString("UNOTA");
						ucargo = rs.getString("UCARGO");
					}
				}
			} else {
				int i = dao.updateUserDetails(unome, ucpf, unota, ucargo, ucpfhidden);
				if (i > 0) {
					msg = "Registro atualizado com sucesso!";
				} else {
					msg = "Erro!";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "UPDATE";
	}

	public String getUnome() {
		return unome;
	}

	public void setUnome(String unome) {
		this.unome = unome;
	}

	public String getUnota() {
		return unota;
	}

	public void setUnota(String unota) {
		this.unota = unota;
	}

	public String getUcargo() {
		return ucargo;
	}

	public void setUcargo(String ucargo) {
		this.ucargo = ucargo;
	}

	public String getUcpf() {
		return ucpf;
	}

	public void setUcpf(String ucpf) {
		this.ucpf = ucpf;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUcpfhidden() {
		return ucpfhidden;
	}

	public void setUcpfhidden(String ucpfhidden) {
		this.ucpfhidden = ucpfhidden;
	}

	public String getSubmitType() {
		return submitType;
	}

	public void setSubmitType(String submitType) {
		this.submitType = submitType;
	}

}
