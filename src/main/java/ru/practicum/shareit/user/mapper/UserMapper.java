package ru.practicum.shareit.user.mapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import ru.practicum.shareit.user.dto.UserDto;
import ru.practicum.shareit.user.model.User;

@Component
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserMapper {
    public UserDto toUserDto(User user) {
        return new UserDto(user.getId(), user.getName(), user.getEmail());

    }

    public User toUser(UserDto dto) {
        return new User(dto.getId(), dto.getName(), dto.getEmail());
    }
}
