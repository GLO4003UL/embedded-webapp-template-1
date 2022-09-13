package com.bgagnonadam.telephony.ws.infrastructure.calllog;

import com.bgagnonadam.telephony.ws.domain.calllog.CallLog;

import java.util.List;

public class CallLogDevDataFactory {

  public List<CallLog> createMockData() {
    CallLog callLog1 = new CallLog();
    callLog1.setId("1");
    callLog1.setTelephoneNumber("514-999-0000");
    callLog1.setDate("2016-07-31T16:45:00Z");
    callLog1.setDurationInSeconds(65);

    CallLog callLog2 = new CallLog();
    callLog2.setId("2");
    callLog2.setTelephoneNumber("418-682-3092");
    callLog2.setDate("2016-06-31T15:29:00Z");
    callLog2.setDurationInSeconds(99);

    CallLog callLog3 = new CallLog();
    callLog3.setId("3");
    callLog3.setTelephoneNumber("581-671-0992");
    callLog3.setDate("2016-07-30T08:32:33Z");
    callLog3.setDurationInSeconds(22);

    return List.of(callLog1, callLog2, callLog3);
  }
}
