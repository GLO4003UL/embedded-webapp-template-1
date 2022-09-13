package com.bgagnonadam.telephony.ws.domain.calllog;

import com.bgagnonadam.telephony.ws.api.calllog.dto.CallLogDto;

public class CallLogAssembler {
  public CallLogDto create(CallLog callLog) {
    return new CallLogDto(callLog.id(), callLog.telephoneNumber(), callLog.date(), callLog.durationInSeconds());
  }
}
