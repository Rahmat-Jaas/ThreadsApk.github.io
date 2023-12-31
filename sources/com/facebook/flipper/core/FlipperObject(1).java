package com.facebook.flipper.core;

public final class FlipperObject {
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        throw new NullPointerException("toString");
    }

    public final int hashCode() {
        throw new NullPointerException("hashCode");
    }

    public final String toString() {
        throw new NullPointerException("toString");
    }
}
