package com.arpan.expensemanager.rest;

import com.arpan.expensemanager.data.dto.UserDto;
import com.arpan.expensemanager.data.dto.UserResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestUserV1IT extends BaseRestIT {

    @BeforeEach
    void setUp() {
        setup("/api/user/");
    }

    @Test
    void retrieveUser() throws Exception {
        UserResponse user = performPost(new UserDto(), "user", UserResponse.class);
    }
}
