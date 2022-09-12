package com.bgagnonadam.telephony.ws.domain.contact;

import com.bgagnonadam.telephony.ws.api.contact.dto.ContactDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ContactServiceTest {

  @Mock
  private Contact contact;
  @Mock
  private ContactDto contactDto;
  @Mock
  private ContactRepository contactRepository;
  @Mock
  private ContactAssembler contactAssembler;

  private ContactService contactService;

  @BeforeEach
  public void setUp() {
    contactService = new ContactService(contactRepository, contactAssembler);
  }

  @Test
  public void givenContactsInRepository_whenFindAllContacts_thenReturnDtos()
    throws Exception {
    // given
    given(contactRepository.findAll()).willReturn(List.of(contact));
    given(contactAssembler.create(contact)).willReturn(contactDto);

    // when
    List<ContactDto> contactDtos = contactService.findAllContacts();

    // then
    assertThat(contactDtos).contains(contactDto);
    verify(contactRepository).findAll();
    verify(contactAssembler).create(contact);
  }
}
