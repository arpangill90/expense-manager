package com.arpan.expensemanager.rest;

import com.arpan.expensemanager.data.dto.UserDto;
import com.arpan.expensemanager.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/")
@RequiredArgsConstructor
public class RestUserV1 {

    private final UserService userService;

    @GetMapping("{id}")
    public ResponseEntity<UserDto> retrieveUser(@PathVariable long id) {
            return new ResponseEntity<>(userService.retrieveUserDto(id), HttpStatus.OK);
    }

    @PostMapping("user")
    public ResponseEntity<UserDto> addUser(@RequestBody @Valid UserDto user) {
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
    }
}
