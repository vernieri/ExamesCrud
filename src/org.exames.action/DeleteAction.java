package org.exames.action;

import org.exames.dao.Admin;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport {

	private static final long serialVersionUID = -146601914103585418L;
	String ucpf, msg;
	Admin dao = new Admin();

	@Override
	public String execute() throws Exception {
		try {
			int isDeleted = dao.deleteUserDetails(ucpf);
			if (isDeleted > 0) {
				msg = "Registro excluido com sucesso!";
			} else {
				msg = "Deu ruim.";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "DELETE";
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

}
