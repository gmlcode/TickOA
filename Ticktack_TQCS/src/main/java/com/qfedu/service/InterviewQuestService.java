package com.qfedu.service;

import com.qfedu.common.vo.PageVo;
import com.qfedu.domain.InterviewQuest;

public interface InterviewQuestService {

	boolean insert(InterviewQuest quest);
	PageVo<InterviewQuest> queryByPage(int page, int count);
}
