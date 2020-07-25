package com.m5d5.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5d5.dao.Checklist;
import com.m5d5.dao.ChecklistRepositorio;


@Service
public class ChecklistServImpl implements IChecklistServicio {

	@Autowired 
	ChecklistRepositorio daoch;

	@Override
	public List<Checklist> getAllChecklist() {
		// TODO Auto-generated method stub
		return (List<Checklist>) daoch.findAll();
	}

	@Override
	public Checklist getChecklistById(int chequeoId) {
		// TODO Auto-generated method stub
		return daoch.findOne(chequeoId);
	}

	public void addChecklist(Checklist checklist) {
		// TODO Auto-generated method stub
		daoch.save(checklist);
	}

	@Override
	public void updateChecklist(Checklist checklist) {
		// TODO Auto-generated method stub
		daoch.save(checklist);
	}

	@Override
	public void deleteChecklist(int chequeoId) {
		// TODO Auto-generated method stub
		daoch.delete(chequeoId);
	}

	
}
