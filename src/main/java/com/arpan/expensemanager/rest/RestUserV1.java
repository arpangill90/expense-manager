package com.arpan.expensemanager.rest;

import com.arpan.expensemanager.data.dto.BaseResponse;
import com.arpan.expensemanager.data.dto.UserDto;
import com.arpan.expensemanager.data.dto.UserResponse;
import com.arpan.expensemanager.exception.ErrorResponse;
import com.arpan.expensemanager.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

import static com.arpan.expensemanager.common.Constants.FAILURE;
import static com.arpan.expensemanager.common.Constants.SUCCESS;

@RestController
@RequestMapping("/api/user/")
@RequiredArgsConstructor
public class RestUserV1 {

    private final UserService userService;

    @GetMapping("{id}")
    public ResponseEntity<BaseResponse<?>> retrieveUser(@PathVariable long id) {
        try {
            UserDto userDto = userService.retrieveUserDto(id);
            return new ResponseEntity<>(new UserResponse(userDto,
                    HttpStatus.OK.toString(), SUCCESS, LocalDateTime.now()),
                    HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new ErrorResponse("ERROR",
                    HttpStatus.INTERNAL_SERVER_ERROR.toString(), FAILURE, LocalDateTime.now()),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping("user")
    public ResponseEntity<UserResponse> addUser(@RequestBody @Valid UserDto user) {
        UserDto userDto = userService.addUser(user);
        return new ResponseEntity<>(new UserResponse(userDto,
                HttpStatus.OK.toString(), SUCCESS, LocalDateTime.now()),
                HttpStatus.OK);
    }
}
