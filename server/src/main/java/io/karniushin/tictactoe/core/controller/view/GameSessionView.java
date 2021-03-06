package io.karniushin.tictactoe.core.controller.view;

import java.util.UUID;

import io.karniushin.tictactoe.core.domain.GameStatus;

public class GameSessionView {

    private final UUID gameId;

    private final String gameName;

    private String owner;

    private final GameStatus status;

    private final Integer threshold;

    private final Long lastTurn;

    private String winner;

    public GameSessionView(final UUID gameId, final String gameName, final GameStatus status, final Integer threshold, final Long lastTurn) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.status = status;
        this.threshold = threshold;
        this.lastTurn = lastTurn;
    }

    public UUID getGameId() {
        return gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(final String owner) {
        this.owner = owner;
    }

    public GameStatus getStatus() {
        return status;
    }

    public Long getLastTurn() {
        return lastTurn;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(final String winner) {
        this.winner = winner;
    }
}
