package ru.practicum.shareit.item;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import ru.practicum.shareit.item.controller.ItemController;
import ru.practicum.shareit.item.dto.CreateItemRequest;
import ru.practicum.shareit.item.dto.ItemDto;
import ru.practicum.shareit.item.service.ItemService;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = ItemController.class)
public class ItemControllerTest {
    /*
    @Autowired
    private ObjectMapper mapper;

    @MockBean
    private ItemService itemService;

    @Autowired
    private MockMvc mvc;
    private CreateItemRequest itemRequest;
    private ItemDto itemDto;
    private final EasyRandom er = new EasyRandom();

    @BeforeEach
    void setUp() {
        itemRequest = new CreateItemRequest();
        itemRequest.setName("testName");
        itemRequest.setDescription("testDescription");
        itemRequest.setAvailable(true);
        itemRequest.setRequestId(null);

        itemDto = new ItemDto();
        itemDto.setName("testName");
        itemDto.setDescription("testDescription");
        itemDto.setAvailable(true);
        itemDto.setId(1L);
    }

    @Test
    public void shouldCreateItem() throws Exception {
        when(itemService.create(any(), anyLong()))
                .thenReturn(itemDto);

        mvc.perform(
                        post("/items")
                                .header("X-Sharer-User-Id", "1")
                                .content(mapper.writeValueAsString(itemRequest))
                                .characterEncoding(StandardCharsets.UTF_8)
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(itemDto.getId()), Long.class))
                .andExpect(jsonPath("$.name", is(itemDto.getName())))
                .andExpect(jsonPath("$.description", is(itemDto.getDescription())))
                .andExpect(jsonPath("$.available", is(itemDto.getAvailable())));
    }

    @Test
    public void createFailedName() throws Exception {
        itemRequest.setName("");

        mvc.perform(
                        post("/items")
                                .content(mapper.writeValueAsString(itemRequest))
                                .characterEncoding(StandardCharsets.UTF_8)
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isBadRequest());
    }

    @Test
    public void createFailedDescription() throws Exception {
        itemRequest.setDescription("");

        mvc.perform(
                        post("/items")
                                .content(mapper.writeValueAsString(itemRequest))
                                .characterEncoding(StandardCharsets.UTF_8)
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isBadRequest());
    }

    @Test
    public void createFailedAvailable() throws Exception {
        itemRequest.setAvailable(null);

        mvc.perform(
                        post("/items")
                                .content(mapper.writeValueAsString(itemRequest))
                                .characterEncoding(StandardCharsets.UTF_8)
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isBadRequest());
    }

    @Test
    public void shouldUpdateItem() throws Exception {
        when(itemService.update(any(), anyLong(), anyLong()))
                .thenReturn(itemDto);

        mvc.perform(
                        patch("/items/1")
                                .header("X-Sharer-User-Id", "1")
                                .content(mapper.writeValueAsString(itemRequest))
                                .characterEncoding(StandardCharsets.UTF_8)
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(itemDto.getId()), Long.class))
                .andExpect(jsonPath("$.name", is(itemDto.getName())))
                .andExpect(jsonPath("$.description", is(itemDto.getDescription())))
                .andExpect(jsonPath("$.available", is(itemDto.getAvailable())));
    }

    @Test
    public void shouldSearch() throws Exception {
        when(itemService.searchItem(anyString()))
                .thenReturn(List.of(itemDto));

        mvc.perform(
                        get("/items/search?text=" + itemDto.getName())
                )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$.[0].id", is(itemDto.getId()), Long.class))
                .andExpect(jsonPath("$.[0].name", is(itemDto.getName())))
                .andExpect(jsonPath("$.[0].description", is(itemDto.getDescription())))
                .andExpect(jsonPath("$.[0].available", is(itemDto.getAvailable())));
    }



     */
}
