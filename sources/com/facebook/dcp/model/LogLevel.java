package com.facebook.dcp.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass8sP;
import kotlinx.serialization.Serializable;

@Serializable
public final class LogLevel extends AnonymousClass0Sf {
    public static final Companion Companion = new Companion();
    public final int A00;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return LogLevel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LogLevel(int i, int i2) {
        if ((i & 1) == 0) {
            this.A00 = 0;
        } else {
            this.A00 = i2;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof LogLevel) && this.A00 == ((LogLevel) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public LogLevel(int i) {
        this.A00 = i;
    }

    public LogLevel() {
        this(0);
    }
}
