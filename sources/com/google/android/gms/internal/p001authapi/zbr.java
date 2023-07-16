package com.google.android.gms.internal.p001authapi;

import X.AnonymousClass412;
import X.AnonymousClass7CQ;
import X.C14030oh;
import X.C18240wQ;
import X.C86104wH;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: com.google.android.gms.internal.auth-api.zbr  reason: invalid package */
public abstract class zbr extends zbb implements zbs {
    public zbr() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
        C14030oh.A0A(-1823715120, C14030oh.A03(-1964069389));
    }

    public final boolean A01(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        UnsupportedOperationException unsupportedOperationException;
        int i4;
        int i5;
        int i6;
        int A03 = C14030oh.A03(-481026318);
        if (i == 1) {
            Status status = (Status) C86104wH.A0F(parcel, Status.CREATOR);
            Credential credential = (Credential) C86104wH.A0F(parcel, Credential.CREATOR);
            AnonymousClass7CQ.A00(parcel);
            if (this instanceof zbf) {
                i5 = C14030oh.A03(1695798971);
                ((zbf) this).A00.A07(new AnonymousClass412(credential, status));
                i6 = -2089579501;
            } else {
                i3 = C14030oh.A03(2033397653);
                unsupportedOperationException = C18240wQ.A0j();
                i4 = 1433453172;
                C14030oh.A0A(i4, i3);
                throw unsupportedOperationException;
            }
        } else if (i == 2) {
            Status status2 = (Status) C86104wH.A0F(parcel, Status.CREATOR);
            AnonymousClass7CQ.A00(parcel);
            if (this instanceof zbk) {
                i5 = C14030oh.A03(1445723329);
                ((BasePendingResult) ((zbk) this).A00).A07(status2);
                i6 = -795241570;
            } else {
                i5 = C14030oh.A03(161802624);
                ((zbf) this).A00.A07(new AnonymousClass412((Credential) null, status2));
                i6 = 1944923487;
            }
        } else if (i != 3) {
            C14030oh.A0A(-327185802, A03);
            return false;
        } else {
            C86104wH.A0F(parcel, Status.CREATOR);
            parcel.readString();
            AnonymousClass7CQ.A00(parcel);
            i3 = C14030oh.A03(-1337636334);
            unsupportedOperationException = C18240wQ.A0j();
            i4 = -947469640;
            C14030oh.A0A(i4, i3);
            throw unsupportedOperationException;
        }
        C14030oh.A0A(i6, i5);
        parcel2.writeNoException();
        C14030oh.A0A(-320535190, A03);
        return true;
    }
}
