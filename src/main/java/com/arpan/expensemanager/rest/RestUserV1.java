package com.arpan.expensemanager.rest;

import com.arpan.expensemanager.data.dto.UserDto;
import com.arpan.expensemanager.data.dto.UserResponse;
import com.arpan.expensemanager.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.arpan.expensemanager.common.Constants.FAILURE;
import static com.arpan.expensemanager.common.Constants.SUCCESS;

@RestController
@RequestMapping("/api/user/")
@RequiredArgsConstructor
public class RestUserV1 {

    private final UserService userService;

    @GetMapping("{id}")
    public ResponseEntity<UserResponse> retrieveUser(@PathVariable long id) {
        try {
            UserDto userDto = userService.retrieveUserDto(id);
            return new ResponseEntity<>(new UserResponse(userDto,
                    HttpStatus.OK.toString(), SUCCESS),
                    HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new UserResponse(null,
                    HttpStatus.INTERNAL_SERVER_ERROR.toString(), FAILURE),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping(value = "user",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserResponse> addUser(@RequestBody @Valid UserDto user) {
        UserDto userDto = userService.addUser(user);
        return new ResponseEntity<>(new UserResponse(userDto,
                HttpStatus.OK.toString(), SUCCESS),
                HttpStatus.OK);
    }
}
