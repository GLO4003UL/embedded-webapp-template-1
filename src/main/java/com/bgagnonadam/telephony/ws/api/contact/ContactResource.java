package com.bgagnonadam.telephony.ws.api.contact;

import com.bgagnonadam.telephony.ws.api.contact.dto.ContactDto;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/telephony/contacts")
public interface ContactResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  List<ContactDto> getContacts();

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("{id}")
  ContactDto getContact(@PathParam("id") String id);

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  void addContact(ContactDto contactDto);

  @PUT
  @Path("{id}")
  void updateContact(@PathParam("id") String id,
                     ContactDto contactDto);

  @DELETE
  @Path("{id}")
  void deleteContact(@PathParam("id") String id);
}
