
public class Funcionario extends Pessoa{
	
	private String nMatricula;
	private String cargaH;
	private String especialidade;
	private int salario;
	
	
	public String getnMatricula() {
		return nMatricula;
	}
	public void setnMatricula(String nMatricula) {
		this.nMatricula = nMatricula;
	}
	public String getCargaH() {
		return cargaH;
	}
	public void setCargaH(String cargaH) {
		this.cargaH = cargaH;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}

}
