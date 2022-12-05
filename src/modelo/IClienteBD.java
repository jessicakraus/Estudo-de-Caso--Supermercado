package modelo;

import java.util.ArrayList;

public interface IClienteBD {

	public boolean cadastrar(Cliente c);

	public ArrayList<Cliente> listar();

	public boolean alterar(Cliente c, int id);

}
