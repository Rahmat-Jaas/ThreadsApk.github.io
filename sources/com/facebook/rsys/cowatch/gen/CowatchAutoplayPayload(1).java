package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18240wQ;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchAutoplayPayload {
    public final String mediaId;
    public final String mediaSource;
    public final long previewDurationMs;
    public final String sourceMediaId;
    public final String sourceMediaSource;

    public static native CowatchAutoplayPayload createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchAutoplayPayload)) {
            return false;
        }
        CowatchAutoplayPayload cowatchAutoplayPayload = (CowatchAutoplayPayload) obj;
        return this.mediaId.equals(cowatchAutoplayPayload.mediaId) && this.mediaSource.equals(cowatchAutoplayPayload.mediaSource) && this.previewDurationMs == cowatchAutoplayPayload.previewDurationMs && this.sourceMediaId.equals(cowatchAutoplayPayload.sourceMediaId) && this.sourceMediaSource.equals(cowatchAutoplayPayload.sourceMediaSource);
    }

    public final int hashCode() {
        int A00 = C18210wN.A00(this.mediaId.hashCode());
        return C18210wN.A05(this.sourceMediaSource, AnonymousClass0wJ.A07(this.sourceMediaId, (AnonymousClass0wJ.A07(this.mediaSource, A00) + C18190wL.A02(this.previewDurationMs)) * 31));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchAutoplayPayload{mediaId=");
        A0s.append(this.mediaId);
        A0s.append(",mediaSource=");
        A0s.append(this.mediaSource);
        A0s.append(",previewDurationMs=");
        A0s.append(this.previewDurationMs);
        A0s.append(",sourceMediaId=");
        A0s.append(this.sourceMediaId);
        A0s.append(",sourceMediaSource=");
        A0s.append(this.sourceMediaSource);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchAutoplayPayload(String str, String str2, long j, String str3, String str4) {
        C18240wQ.A1L(str, str2, str3);
        str4.getClass();
        this.mediaId = str;
        this.mediaSource = str2;
        this.previewDurationMs = j;
        this.sourceMediaId = str3;
        this.sourceMediaSource = str4;
    }
}
