package com.bgagnonadam.telephony.ws.api.contact;

import com.bgagnonadam.telephony.ws.api.contact.dto.ContactDto;
import com.bgagnonadam.telephony.ws.domain.contact.ContactService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.verify;


@ExtendWith(MockitoExtension.class)
public class ContactResourceImplTest {
  @Mock
  private ContactService contactService;
  @Mock
  private ContactDto contactDto;

  private ContactResource contactResource;

  @BeforeEach
  public void setUp() {
    contactResource = new ContactResourceImpl(contactService);
  }

  @Test
  public void whenFindAllContacts_thenDelegateToService() {
    // given
    given(contactService.findAllContacts()).willReturn(List.of(contactDto));

    // when
    List<ContactDto> contactDtos = contactResource.getContacts();

    // then
    assertThat(contactDtos).containsExactly(contactDto);
    verify(contactService).findAllContacts();
  }
}
