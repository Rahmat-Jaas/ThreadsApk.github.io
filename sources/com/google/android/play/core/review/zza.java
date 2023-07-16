package com.google.android.play.core.review;

import X.C18180wK;
import X.C18210wN;
import X.C86114wI;
import android.app.PendingIntent;

public final class zza extends ReviewInfo {
    public final PendingIntent A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ReviewInfo) {
                zza zza = (zza) ((ReviewInfo) obj);
                if (!this.A00.equals(zza.A00) || this.A01 != zza.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.A00.hashCode() ^ 1000003) * 1000003;
        int i = 1231;
        if (true != this.A01) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.A00.toString();
        boolean z = this.A01;
        StringBuilder A0s = C86114wI.A0s(obj.length() + 40);
        A0s.append("ReviewInfo{pendingIntent=");
        A0s.append(obj);
        A0s.append(", isNoOp=");
        A0s.append(z);
        return C18180wK.A0i("}", A0s);
    }

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.A00 = pendingIntent;
            this.A01 = z;
            return;
        }
        throw C18210wN.A0W("Null pendingIntent");
    }
}
