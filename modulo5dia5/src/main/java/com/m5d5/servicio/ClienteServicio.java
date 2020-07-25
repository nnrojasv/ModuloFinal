package com.m5d5.servicio;

import java.util.List;

import com.m5d5.dao.Cliente;

public interface ClienteServicio {

	Cliente findClienteByClienteid(int clienteid);
	List<Cliente> listarCliente();
	void agregarCliente(Cliente cliente);
	void eliminarCliente(int clienteid);
	void editarCliente(Cliente cliente);
}
