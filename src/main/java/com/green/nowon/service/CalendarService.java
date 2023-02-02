package com.green.nowon.service;

import java.util.List;

import com.green.nowon.domain.dto.schedule.CalendarDTO;
import com.green.nowon.domain.dto.schedule.CalendarDTO2;

public interface CalendarService {
	
	// 캘린더 insert
	long save(long userMno , CalendarDTO dto);

	// 캘린더 select
	List<CalendarDTO> getList(long userMno);

	// 캘린더 Delete
	void delete(long cno);

	//캘린더 Update
	void update(long userMno, long cno, CalendarDTO dto);


	//////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////회사일정///////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	// 캘린더 select
	List<CalendarDTO2> getList2();
	
	// 캘린더 insert
	long save(CalendarDTO2 dto);
	
	// 캘린더 Delete
	void delete2(long cno2);
}
