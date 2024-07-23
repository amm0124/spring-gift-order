package gift.dto;

import jakarta.validation.constraints.NotNull;

public record CategoryRequestDTO(
        @NotNull String name,
        @NotNull String color,
        String description,
        @NotNull String imageUrl
) {
}
