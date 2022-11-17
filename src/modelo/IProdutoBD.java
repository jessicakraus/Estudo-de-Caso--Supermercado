package modelo;

import java.util.ArrayList;

public interface IProdutoBD {

	public boolean cadastrar(Produto p);

	public ArrayList<Produto> listar();

	public boolean alterar(Produto p, int id);

	public boolean deletar(Produto p, int id);

}
