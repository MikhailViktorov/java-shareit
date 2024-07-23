package ru.practicum.shareit.item.comment.dto;

import lombok.*;
import ru.practicum.shareit.item.dto.ItemDto;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private Long id;
    @NotBlank
    private String text;
    private ItemDto item;
    private Long authorId;
    private String authorName;
    private LocalDateTime created;
}
