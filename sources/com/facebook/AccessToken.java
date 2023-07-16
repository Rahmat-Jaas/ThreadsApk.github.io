package com.facebook;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass3J9;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C60943Re;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.PCreatorCreatorShape0S0000000_I2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public final class AccessToken implements Parcelable {
    public static final Integer A08 = AnonymousClass006.A01;
    public static final Date A09;
    public static final Date A0A = new Date();
    public static final Date A0B;
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape0S0000000_I2(65);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Date A04;
    public final Date A05;
    public final Set A06;
    public final Set A07;

    public static Date A00(Bundle bundle, Date date) {
        long parseLong;
        long time;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get("expires_in");
        if (obj instanceof Long) {
            parseLong = C18190wL.A08(obj);
        } else {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        if (parseLong == 0) {
            time = Long.MAX_VALUE;
        } else {
            time = date.getTime() + (parseLong * 1000);
        }
        return new Date(time);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (this.A04.equals(accessToken.A04) && this.A07.equals(accessToken.A07) && this.A06.equals(accessToken.A06) && this.A02.equals(accessToken.A02) && this.A00 == accessToken.A00 && this.A05.equals(accessToken.A05)) {
            String str = this.A01;
            String str2 = accessToken.A01;
            if (str != null ? str.equals(str2) : str2 == null) {
                if (this.A03.equals(accessToken.A03)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A02, (((C18210wN.A00(this.A04.hashCode()) + this.A07.hashCode()) * 31) + this.A06.hashCode()) * 31);
        Integer num = this.A00;
        int A052 = C18220wO.A05(num, AnonymousClass3J9.A01(num), A072);
        return C18210wN.A05(this.A03, (AnonymousClass0wJ.A05(this.A05, A052) + AnonymousClass0wJ.A06(this.A01)) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A0s = C18190wL.A0s("{AccessToken");
        A0s.append(" token:");
        if (this.A02 == null) {
            str = "null";
        } else {
            str = "ACCESS_TOKEN_REMOVED";
        }
        A0s.append(str);
        A0s.append(" permissions:");
        Set set = this.A07;
        if (set == null) {
            str2 = "null";
        } else {
            A0s.append("[");
            A0s.append(TextUtils.join(", ", set));
            str2 = "]";
        }
        A0s.append(str2);
        return C18180wK.A0i("}", A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A04.getTime());
        parcel.writeStringList(C18200wM.A0s(this.A07));
        parcel.writeStringList(C18200wM.A0s(this.A06));
        parcel.writeString(this.A02);
        parcel.writeString(AnonymousClass3J9.A01(this.A00));
        parcel.writeLong(this.A05.getTime());
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }

    public AccessToken(Parcel parcel) {
        this.A04 = new Date(parcel.readLong());
        ArrayList A0v = AnonymousClass0wJ.A0v();
        parcel.readStringList(A0v);
        this.A07 = Collections.unmodifiableSet(new HashSet(A0v));
        A0v.clear();
        parcel.readStringList(A0v);
        this.A06 = Collections.unmodifiableSet(new HashSet(A0v));
        this.A02 = parcel.readString();
        this.A00 = AnonymousClass3J9.A00(parcel.readString());
        this.A05 = new Date(parcel.readLong());
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        A0B = date;
        A09 = date;
    }

    public AccessToken(String str, String str2) {
        this(AnonymousClass006.A15, str, C60943Re.A02, str2, (Collection) null, (Collection) null, (Date) null, (Date) null);
    }

    public AccessToken(Integer num, String str, String str2, String str3, Collection collection, Collection collection2, Date date, Date date2) {
        HashSet A0u;
        HashSet A0u2;
        this.A04 = date == null ? A09 : date;
        if (collection != null) {
            A0u = new HashSet(collection);
        } else {
            A0u = C18200wM.A0u();
        }
        this.A07 = Collections.unmodifiableSet(A0u);
        if (collection2 != null) {
            A0u2 = new HashSet(collection2);
        } else {
            A0u2 = C18200wM.A0u();
        }
        this.A06 = Collections.unmodifiableSet(A0u2);
        this.A02 = str;
        this.A00 = num == null ? A08 : num;
        this.A05 = date2 == null ? A0A : date2;
        this.A01 = str2;
        this.A03 = str3;
    }
}
