package ru.practicum.shareit.user.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.practicum.shareit.user.dto.UserDto;
import ru.practicum.shareit.user.service.UserServiceImpl;

import java.util.List;


@RestController
@RequestMapping(path = "/users")
@Slf4j
@AllArgsConstructor
public class UserController {
    private final UserServiceImpl userService;

    @PostMapping
    public UserDto create(@Valid @RequestBody UserDto userDto) {
        log.info("Post-запрос на добавление пользователя");
        return ResponseEntity.ok().body(userService.create(userDto)).getBody();
    }

    @PatchMapping("/{userId}")
    public UserDto update(@RequestBody UserDto userDto, @PathVariable(value = "userId") Long userId) {
        log.info("Patch-запрос на обновление пользователя с id={}", userId);
        return ResponseEntity.ok().body(userService.update(userDto, userId)).getBody();
    }

    @GetMapping("/{userId}")
    public UserDto getUserById(@PathVariable Long userId) {
        log.info("Get-запрос на получение пользователя с id={}", userId);
        return ResponseEntity.ok().body(userService.getUserById(userId)).getBody();
    }

    @GetMapping
    public List<UserDto> getAllUsers() {
        log.info("Get-запрос на получение всех пользователей");
        return ResponseEntity.ok().body(userService.getAllUsers()).getBody();
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        log.info("Delete-запрос на удаление пользователя с id={}", id);
        userService.deleteUserById(id);
    }

}