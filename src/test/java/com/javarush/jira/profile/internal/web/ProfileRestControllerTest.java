package com.javarush.jira.profile.internal.web;

import com.javarush.jira.AbstractControllerTest;
import com.javarush.jira.login.AuthUser;
import com.javarush.jira.profile.internal.ProfileMapper;
import com.javarush.jira.profile.internal.ProfileRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


class ProfileRestControllerTest extends AbstractControllerTest {
    @InjectMocks
    private ProfileRestController profileRestController;
    private static final String REST_URL = "/api/profile";
    @Mock
    private ProfileMapper mapper;
    @Mock
    private ProfileRepository repository;

    @Test
    public void updateResponseStatusTest() {
        AuthUser authUser = Mockito.mock(AuthUser.class);

        perform(
                put(REST_URL)
                        .principal(authUser)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content())
                .andExpect(status().isNoContent());
    }

    @Test
    public void getResponseStatusTest() {

    }
}