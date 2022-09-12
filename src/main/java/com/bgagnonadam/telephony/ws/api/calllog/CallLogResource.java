package com.bgagnonadam.telephony.ws.api.calllog;


import com.bgagnonadam.telephony.ws.api.calllog.dto.CallLogDto;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/telephony/calllogs")
public interface CallLogResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  List<CallLogDto> getCallLogs();

  @DELETE
  @Path("{id}")
  void deleteCallLog(@PathParam("id") String id);
}
