package com.bgagnonadam.telephony.ws.domain.contact;

import com.bgagnonadam.telephony.ws.api.contact.dto.ContactDto;

import java.util.UUID;

public class ContactAssembler {
  public Contact create(ContactDto contactDto) {
    return create(UUID.randomUUID().toString(), contactDto);
  }

  public Contact create(String id, ContactDto contactDto) {
    return new Contact(id, contactDto.telephoneNumber, contactDto.address, contactDto.name);
  }

  public ContactDto create(Contact contact) {
    ContactDto contactDto = new ContactDto();
    contactDto.id = contact.id();
    contactDto.name = contact.name();
    contactDto.address = contact.address();
    contactDto.telephoneNumber = contact.telephoneNumber();
    return contactDto;
  }
}
