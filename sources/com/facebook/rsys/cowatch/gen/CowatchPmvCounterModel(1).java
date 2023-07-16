package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchPmvCounterModel {
    public final int currentCount;
    public final String lastMediaId;
    public final String lastMediaSource;
    public final boolean needsUpdatePeer;

    public static native CowatchPmvCounterModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchPmvCounterModel)) {
                return false;
            }
            CowatchPmvCounterModel cowatchPmvCounterModel = (CowatchPmvCounterModel) obj;
            String str = this.lastMediaId;
            String str2 = cowatchPmvCounterModel.lastMediaId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.lastMediaSource;
            String str4 = cowatchPmvCounterModel.lastMediaSource;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (!(this.currentCount == cowatchPmvCounterModel.currentCount && this.needsUpdatePeer == cowatchPmvCounterModel.needsUpdatePeer)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((C18210wN.A00(AnonymousClass0wJ.A06(this.lastMediaId)) + C18200wM.A09(this.lastMediaSource)) * 31) + this.currentCount) * 31) + (this.needsUpdatePeer ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchPmvCounterModel{lastMediaId=");
        A0s.append(this.lastMediaId);
        A0s.append(",lastMediaSource=");
        A0s.append(this.lastMediaSource);
        A0s.append(",currentCount=");
        A0s.append(this.currentCount);
        A0s.append(",needsUpdatePeer=");
        A0s.append(this.needsUpdatePeer);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchPmvCounterModel(String str, String str2, int i, boolean z) {
        this.lastMediaId = str;
        this.lastMediaSource = str2;
        this.currentCount = i;
        this.needsUpdatePeer = z;
    }
}
