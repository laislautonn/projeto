
public class Veiculo {

	private int id;
	private int rodas;
	private String placa;
	private String modelo;
	private String marca;
	private String descricao;
	private String estado_conservacao;
	
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getRodas(){
		return this.rodas;
	}
	public void set(int rodas){
		this.rodas = rodas;
	}
	public String getModelo(){
		return this.modelo;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public String getPlaca(){
		return this.placa;
	}
	public void setPlaca(String placa){
		this.placa = placa;;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEstado_conservacao() {
		return estado_conservacao;
	}
	public void setEstado_conservacao(String estado_conservacao) {
		this.estado_conservacao = estado_conservacao;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	
}
