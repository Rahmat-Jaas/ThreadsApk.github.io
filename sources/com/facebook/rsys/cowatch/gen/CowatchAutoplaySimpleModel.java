package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchAutoplaySimpleModel {
    public final String mediaId;
    public final String mediaSource;
    public final long previewDurationMs;

    public static native CowatchAutoplaySimpleModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchAutoplaySimpleModel)) {
            return false;
        }
        CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel = (CowatchAutoplaySimpleModel) obj;
        return this.mediaId.equals(cowatchAutoplaySimpleModel.mediaId) && this.mediaSource.equals(cowatchAutoplaySimpleModel.mediaSource) && this.previewDurationMs == cowatchAutoplaySimpleModel.previewDurationMs;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.mediaSource, C18210wN.A00(this.mediaId.hashCode())) + C18190wL.A02(this.previewDurationMs);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchAutoplaySimpleModel{mediaId=");
        A0s.append(this.mediaId);
        A0s.append(",mediaSource=");
        A0s.append(this.mediaSource);
        A0s.append(",previewDurationMs=");
        A0s.append(this.previewDurationMs);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchAutoplaySimpleModel(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.mediaId = str;
        this.mediaSource = str2;
        this.previewDurationMs = j;
    }
}
