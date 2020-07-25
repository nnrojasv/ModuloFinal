package com.m5d5.servicio;

import java.util.List;

import com.m5d5.dao.Checklist;




public interface IChecklistServicio {

	 List<Checklist> getAllChecklist();
	 Checklist getChecklistById(int chequeoId);
	 void addChecklist(Checklist ch);
	 void updateChecklist(Checklist ch);
	 void deleteChecklist(int chequeoId);

}
