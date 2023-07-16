package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass6C0;
import X.C117046y2;
import X.C122167Ky;
import X.C86124wJ;
import X.C97536Bt;
import X.C97586By;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(59);
    public final Attachment A00;
    public final ResidentKeyRequirement A01;
    public final Boolean A02;
    public final zzat A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        if (!C117046y2.A01(this.A00, authenticatorSelectionCriteria.A00) || !C117046y2.A01(this.A02, authenticatorSelectionCriteria.A02) || !C117046y2.A01(this.A03, authenticatorSelectionCriteria.A03)) {
            return false;
        }
        return C117046y2.A00(this.A01, authenticatorSelectionCriteria.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A03, this.A01});
    }

    public AuthenticatorSelectionCriteria(Boolean bool, String str, String str2, String str3) {
        Throwable th;
        Attachment attachment;
        zzat zzat;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            attachment = null;
        } else {
            try {
                Attachment[] values = Attachment.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        th = new C97536Bt(str);
                        break;
                    }
                    attachment = values[i];
                    if (str.equals(attachment.A00)) {
                        break;
                    }
                    i++;
                }
                throw th;
            } catch (C97536Bt | C97586By | AnonymousClass6C0 e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.A00 = attachment;
        this.A02 = bool;
        if (str2 == null) {
            zzat = null;
        } else {
            zzat = zzat.A00(str2);
        }
        this.A03 = zzat;
        if (str3 != null) {
            ResidentKeyRequirement[] values2 = ResidentKeyRequirement.values();
            int length2 = values2.length;
            int i2 = 0;
            while (i2 < length2) {
                residentKeyRequirement = values2[i2];
                if (!str3.equals(residentKeyRequirement.A00)) {
                    i2++;
                }
            }
            th = new C97586By(str3);
            throw th;
        }
        this.A01 = residentKeyRequirement;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String obj;
        String obj2;
        String obj3;
        int A002 = C122167Ky.A00(parcel);
        Attachment attachment = this.A00;
        if (attachment == null) {
            obj = null;
        } else {
            obj = attachment.toString();
        }
        boolean A0S = C122167Ky.A0S(parcel, obj);
        Boolean bool = this.A02;
        if (bool != null) {
            parcel.writeInt(262147);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        zzat zzat = this.A03;
        if (zzat == null) {
            obj2 = null;
        } else {
            obj2 = zzat.toString();
        }
        C122167Ky.A0H(parcel, obj2, 4, A0S);
        ResidentKeyRequirement residentKeyRequirement = this.A01;
        if (residentKeyRequirement == null) {
            obj3 = null;
        } else {
            obj3 = residentKeyRequirement.toString();
        }
        C122167Ky.A0H(parcel, obj3, 5, A0S);
        C122167Ky.A05(parcel, A002);
    }
}
