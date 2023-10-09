package com.Nickode.exception;

import com.Nickode.entity.Nickey;

public class NotFoundPers extends RuntimeException {
    public NotFoundPers(Nickey id) {
        super("Could not find this person: " + id.toString());
    }
}
