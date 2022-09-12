package com.bgagnonadam.telephony.ws.infrastructure.contact;

import com.bgagnonadam.telephony.ws.domain.contact.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class ContactRepositoryInMemoryTest {
  private static final String CONTACT_ID = "id";

  @Mock
  private Contact contact;

  private ContactRepositoryInMemory contactRepositoryInMemory;

  @BeforeEach
  public void setUp() {
    contactRepositoryInMemory = new ContactRepositoryInMemory();
    given(contact.id()).willReturn(CONTACT_ID);
  }

  @Test
  public void givenContact_whenFindAll_ThenReturnContactInMemory() {
    //given
    contactRepositoryInMemory.save(contact);

    // when
    List<Contact> contacts = contactRepositoryInMemory.findAll();

    // then
    assertThat(contacts).containsExactly(contact);
  }
}
