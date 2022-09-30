package com.mycompany.teste;

public abstract class Npc {
	
	private String nome;
	private String cor;
	private Integer nivel;
	private double saude;
	private boolean vivo;
	private double forca;
	
	public void atacar(Npc npc) {
            
                npc.setSaude(npc.getForca() - this.getForca());
            
		System.out.println(this.getNome() + " atacou o " +  npc.getNome() + " e o "+ npc.getNome() + " ficou com isso de vida: "  + npc.getSaude());
                System.err.println(npc.getSaude() < 0 ? npc.getNome() + ": morreu" :npc.getNome() + ": ta vivao");
                System.out.println("------------------------------------------------------------------------");
	}
	
	public double getForca() {
		return forca;
	}

	public void setForca(double forca) {
		this.forca = forca;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public double getSaude() {
		return saude;
	}
	public void setSaude(double saude) {
		this.saude = saude;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
}
