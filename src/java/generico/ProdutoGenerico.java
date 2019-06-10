/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico;

import java.io.Serializable;

/**
 *
 * @author W10
 * @param <C>
 * @param <M>
 * @param <N>
 * @param <T>
 * @param <P>
 * @param <I>
 */
public class ProdutoGenerico <C,M,N,T,P,I> implements Serializable {
    
    private C codigo;
    private M moeda;
    private N nome;
    private T categoria;
    private P preco;
    private I imposto;

    public ProdutoGenerico(C codigo, M moeda, N nome, T categoria, P preco, I imposto) {
        this.codigo = codigo;
        this.moeda = moeda;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.imposto = imposto;
    }

    public ProdutoGenerico()
    {
        
    }
    
    
    public C getCodigo() {
        return codigo;
    }

    public void setCodigo(C codigo) {
        this.codigo = codigo;
    }

    public M getMoeda() {
        return moeda;
    }

    public void setMoeda(M moeda) {
        this.moeda = moeda;
    }

    public N getNome() {
        return nome;
    }

    public void setNome(N nome) {
        this.nome = nome;
    }

    public T getCategoria() {
        return categoria;
    }

    public void setCategoria(T categoria) {
        this.categoria = categoria;
    }

    public P getPreco() {
        return preco;
    }

    public void setPreco(P preco) {
        this.preco = preco;
    }

    public I getImposto() {
        return imposto;
    }

    public void setImposto(I imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return "ProdutoGenerico{" + "codigo=" + codigo + ", moeda=" + moeda + ", nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + ", imposto=" + imposto + '}';
    }
    
    
    
    
}
