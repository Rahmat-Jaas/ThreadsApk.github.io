package com.facebook.rsys.rooms.gen;

import X.AnonymousClass00U;
import X.C18190wL;
import com.facebook.djinni.msys.infra.McfReference;

public class LogMetadata {
    public final long eventTime;

    public static native LogMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LogMetadata) && this.eventTime == ((LogMetadata) obj).eventTime;
        }
        return true;
    }

    public final int hashCode() {
        return 527 + C18190wL.A02(this.eventTime);
    }

    public final String toString() {
        return AnonymousClass00U.A0T("LogMetadata{eventTime=", "}", this.eventTime);
    }

    public LogMetadata(long j) {
        this.eventTime = j;
    }
}
