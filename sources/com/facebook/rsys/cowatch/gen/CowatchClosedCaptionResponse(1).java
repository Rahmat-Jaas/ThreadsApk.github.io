package com.facebook.rsys.cowatch.gen;

import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchClosedCaptionResponse {
    public final long endTime;
    public final long startTime;
    public final String text;

    public static native CowatchClosedCaptionResponse createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchClosedCaptionResponse)) {
            return false;
        }
        CowatchClosedCaptionResponse cowatchClosedCaptionResponse = (CowatchClosedCaptionResponse) obj;
        return this.startTime == cowatchClosedCaptionResponse.startTime && this.endTime == cowatchClosedCaptionResponse.endTime && this.text.equals(cowatchClosedCaptionResponse.text);
    }

    public final int hashCode() {
        long j = this.startTime;
        int A00 = C18210wN.A00((int) (j ^ (j >>> 32)));
        long j2 = this.endTime;
        return C18210wN.A05(this.text, (A00 + ((int) ((j2 >>> 32) ^ j2))) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchClosedCaptionResponse{startTime=");
        A0s.append(this.startTime);
        A0s.append(",endTime=");
        A0s.append(this.endTime);
        A0s.append(",text=");
        A0s.append(this.text);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchClosedCaptionResponse(long j, long j2, String str) {
        str.getClass();
        this.startTime = j;
        this.endTime = j2;
        this.text = str;
    }
}
