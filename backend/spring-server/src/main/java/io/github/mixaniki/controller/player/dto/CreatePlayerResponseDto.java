package io.github.mixaniki.controller.player.dto;

import io.github.mixaniki.entity.type.PlayerPositionType;

public record CreatePlayerResponseDto(Long id, String firstName, String lastName, int height, String nationality, String logo, PlayerPositionType positionType) {
}
