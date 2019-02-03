package org.exames.action;

import org.exames.dao.Admin;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 2139116285823340125L;
	private String unome, ucpf, unota, ucargo;
	private String msg = "";
	Admin admin = null;
	int ctr = 0;

	@Override
	public String execute() throws Exception {
		admin = new Admin();

		try {
			ctr = admin.registerUser(unome, ucpf, unota, ucargo);
			if (ctr > 0) {
				msg = "Registro feito com sucesso!";
			} else {
				msg = "Deu erro.";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "REGISTER";
	}

	public String getUnome() {
		return unome;
	}

	public void setUnome(String unome) {
		this.unome = unome;
	}

	public String getUcpf() {
		return ucpf;
	}

	public void setUcpf(String ucpf) {
		this.ucpf = ucpf;
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

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCtr() {
		return ctr;
	}

	public void setCtr(int ctr) {
		this.ctr = ctr;
	}

}
