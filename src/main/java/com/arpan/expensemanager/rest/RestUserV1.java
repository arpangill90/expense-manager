package com.arpan.expensemanager.rest;

import com.arpan.expensemanager.data.dto.BaseResponse;
import com.arpan.expensemanager.data.dto.UserDto;
import com.arpan.expensemanager.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/user/")
@RequiredArgsConstructor
public class RestUserV1 {

    private final UserService userService;

    @GetMapping("{id}")
    public ResponseEntity<BaseResponse> retrieveUser(@PathVariable long id) {
        UserDto userDto = userService.retrieveUserDto(id);
        return new ResponseEntity<>(new BaseResponse(userDto,
                HttpStatus.OK.toString(), "SUCCESS", LocalDateTime.now()),
                HttpStatus.OK);
    }

    @PostMapping("user")
    public ResponseEntity<BaseResponse> addUser(@RequestBody @Valid UserDto user) {
        UserDto userDto = userService.addUser(user);
        return new ResponseEntity<>(new BaseResponse(userDto,
                HttpStatus.OK.toString(), "SUCCESS", LocalDateTime.now()),
                HttpStatus.OK);
    }
}
