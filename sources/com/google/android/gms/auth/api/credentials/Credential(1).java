package com.google.android.gms.auth.api.credentials;

import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C18190wL;
import X.C18210wN;
import X.C86124wJ;
import X.C86154wM;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ch.boye.httpclientandroidlib.HttpHost;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(64);
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Credential) {
                Credential credential = (Credential) obj;
                if (!TextUtils.equals(this.A01, credential.A01) || !TextUtils.equals(this.A02, credential.A02) || !C117046y2.A01(this.A00, credential.A00) || !TextUtils.equals(this.A03, credential.A03) || !TextUtils.equals(this.A04, credential.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86154wM.A05(this.A01, this.A02, this.A00, this.A03, this.A04);
    }

    public Credential(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        List unmodifiableList;
        C13320nQ.A02(str, "credential identifier cannot be null");
        String trim = str.trim();
        C13320nQ.A05(trim, "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && (HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!C18210wN.A1W(z)) {
                    throw C18190wL.A0a("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.A02 = str2;
                this.A00 = uri;
                if (list == null) {
                    unmodifiableList = Collections.emptyList();
                } else {
                    unmodifiableList = Collections.unmodifiableList(list);
                }
                this.A07 = unmodifiableList;
                this.A01 = trim;
                this.A03 = str3;
                this.A04 = str4;
                this.A05 = str5;
                this.A06 = str6;
                return;
            }
            throw C18190wL.A0a("Password and AccountType are mutually exclusive");
        }
        throw C18190wL.A0a("Password must not be empty if set");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0R = C122167Ky.A0R(parcel, this.A01);
        C122167Ky.A0H(parcel, this.A02, 2, A0R);
        C122167Ky.A0D(parcel, this.A00, 3, i, A0R);
        C122167Ky.A0K(parcel, this.A07, 4, A0R);
        C122167Ky.A0H(parcel, this.A03, 5, A0R);
        C122167Ky.A0H(parcel, this.A04, 6, A0R);
        C122167Ky.A0H(parcel, this.A05, 9, A0R);
        C122167Ky.A0H(parcel, this.A06, 10, A0R);
        C122167Ky.A05(parcel, A002);
    }
}
