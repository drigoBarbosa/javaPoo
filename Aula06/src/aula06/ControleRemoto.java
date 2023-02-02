package aula06;
public class ControleRemoto {
	// Atributos;
	private int volume;
	private boolean tocando;
	private boolean ligado;
	// Métodos especiais;
	public void ControRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
}
