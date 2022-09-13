package com.bgagnonadam.telephony.ws.domain.calllog;

public record CallLog(
  String id,
  String telephoneNumber,
  String date,
  int durationInSeconds
) {}
