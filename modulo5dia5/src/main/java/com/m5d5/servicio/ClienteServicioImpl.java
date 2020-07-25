package com.m5d5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5d5.dao.Cliente;
import com.m5d5.dao.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements ClienteServicio{

	@Autowired
	ClienteRepositorio cli;
	
	@Override
	public Cliente findClienteByClienteid(int clienteid) {
		
		return cli.findOne(clienteid);
	}

	@Override
	public List<Cliente> listarCliente() {
		
		return (List<Cliente>) cli.findAll();
	}

	@Override
	public void agregarCliente(Cliente cliente) {
		cli.save(cliente);
		
	}

	@Override
	public void eliminarCliente(int clienteid) {
		cli.delete(clienteid);
		
	}

	@Override
	public void editarCliente(Cliente cliente) {
		cli.save(cliente);
		
	}

}
