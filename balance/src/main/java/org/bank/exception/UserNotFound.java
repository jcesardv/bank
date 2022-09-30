package org.bank.exception;

import java.util.UUID;

public class UserNotFound extends RuntimeException{
    private static final long serialVersionUID = 874387341803198776L;

    public UserNotFound(UUID userId) {
        super("Could not find user with id " + userId);
    }
}
