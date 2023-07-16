package com.facebook.rsys.cowatch.gen;

import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchPlayerCaptionModel {
    public final String captionText;
    public final long endTimeMs;
    public final long startTimeMs;

    public static native CowatchPlayerCaptionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchPlayerCaptionModel)) {
            return false;
        }
        CowatchPlayerCaptionModel cowatchPlayerCaptionModel = (CowatchPlayerCaptionModel) obj;
        return this.startTimeMs == cowatchPlayerCaptionModel.startTimeMs && this.endTimeMs == cowatchPlayerCaptionModel.endTimeMs && this.captionText.equals(cowatchPlayerCaptionModel.captionText);
    }

    public final int hashCode() {
        long j = this.startTimeMs;
        int A00 = C18210wN.A00((int) (j ^ (j >>> 32)));
        long j2 = this.endTimeMs;
        return C18210wN.A05(this.captionText, (A00 + ((int) ((j2 >>> 32) ^ j2))) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchPlayerCaptionModel{startTimeMs=");
        A0s.append(this.startTimeMs);
        A0s.append(",endTimeMs=");
        A0s.append(this.endTimeMs);
        A0s.append(",captionText=");
        A0s.append(this.captionText);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchPlayerCaptionModel(long j, long j2, String str) {
        str.getClass();
        this.startTimeMs = j;
        this.endTimeMs = j2;
        this.captionText = str;
    }
}
