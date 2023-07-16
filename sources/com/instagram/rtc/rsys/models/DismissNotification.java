package com.instagram.rtc.rsys.models;

import X.AnonymousClass00U;
import X.C18210wN;
import com.facebook.djinni.msys.infra.McfReference;

public class DismissNotification {
    public final int reason;
    public final String serverInfoData;

    public static native DismissNotification createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DismissNotification)) {
            return false;
        }
        DismissNotification dismissNotification = (DismissNotification) obj;
        return this.serverInfoData.equals(dismissNotification.serverInfoData) && this.reason == dismissNotification.reason;
    }

    public final int hashCode() {
        return C18210wN.A00(this.serverInfoData.hashCode()) + this.reason;
    }

    public final String toString() {
        return AnonymousClass00U.A07(this.reason, "DismissNotification{serverInfoData=", this.serverInfoData, ",reason=", "}");
    }

    public DismissNotification(String str, int i) {
        str.getClass();
        this.serverInfoData = str;
        this.reason = i;
    }
}
