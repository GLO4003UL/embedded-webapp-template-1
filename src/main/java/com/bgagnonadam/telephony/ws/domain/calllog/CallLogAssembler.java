package com.bgagnonadam.telephony.ws.domain.calllog;

import com.bgagnonadam.telephony.ws.api.calllog.dto.CallLogDto;

public class CallLogAssembler {
  public CallLogDto create(CallLog callLog) {
    CallLogDto callLogDto = new CallLogDto();
    callLogDto.id = callLog.id();
    callLogDto.telephoneNumber = callLog.telephoneNumber();
    callLogDto.date = callLog.date();
    callLogDto.durationInSeconds = callLog.durationInSeconds();
    return callLogDto;
  }
}
