package com.google.android.gms.fido.u2f.api.common;

import X.AnonymousClass0wJ;
import X.C122167Ky;
import X.C13320nQ;
import X.C18170wI;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C86114wI;
import X.C86124wJ;
import X.C86164wN;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class RegisteredKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(82);
    public String A00;
    public final KeyHandle A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r0 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0033
            boolean r0 = r5 instanceof com.google.android.gms.fido.u2f.api.common.RegisteredKey
            r2 = 0
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.fido.u2f.api.common.RegisteredKey r5 = (com.google.android.gms.fido.u2f.api.common.RegisteredKey) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 != 0) goto L_0x0025
            if (r0 != 0) goto L_0x0024
        L_0x0012:
            com.google.android.gms.fido.u2f.api.common.KeyHandle r1 = r4.A01
            com.google.android.gms.fido.u2f.api.common.KeyHandle r0 = r5.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 != 0) goto L_0x002c
            if (r0 == 0) goto L_0x0033
        L_0x0024:
            return r2
        L_0x0025:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0012
            return r2
        L_0x002c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0033
            return r2
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.u2f.api.common.RegisteredKey.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A06 = C18220wO.A06(this.A01, (AnonymousClass0wJ.A06(this.A00) + 31) * 31);
        return (A06 * 31) + C18200wM.A09(this.A02);
    }

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        C13320nQ.A01(keyHandle);
        this.A01 = keyHandle;
        this.A00 = str;
        this.A02 = str2;
    }

    public final String toString() {
        try {
            JSONObject A0y = C18230wP.A0y();
            KeyHandle keyHandle = this.A01;
            A0y.put("keyHandle", Base64.encodeToString(keyHandle.A03, 11));
            ProtocolVersion protocolVersion = keyHandle.A01;
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                C86164wN.A1H(protocolVersion, ClientCookie.VERSION_ATTR, A0y);
            }
            List list = keyHandle.A02;
            if (list != null) {
                C86164wN.A1H(list, "transports", A0y);
            }
            String str = this.A00;
            if (str != null) {
                A0y.put(C18170wI.A00(322), str);
            }
            String str2 = this.A02;
            if (str2 != null) {
                A0y.put("appId", str2);
            }
            return A0y.toString();
        } catch (JSONException e) {
            throw C86114wI.A0k(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0Q = C122167Ky.A0Q(parcel, this.A01, i);
        C122167Ky.A0H(parcel, this.A00, 3, A0Q);
        C122167Ky.A0G(parcel, this.A02, A002, A0Q);
    }
}
