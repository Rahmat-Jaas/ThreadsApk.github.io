package com.instagram.model.mediasize;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass728;
import X.C04220Ms;
import X.C10450iM;
import X.C134797yO;
import X.C18210wN;
import X.C972768s;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import com.instagram.common.typedurl.ExpirableImageUrl;
import com.instagram.common.typedurl.ImageLoggingData;
import java.util.List;

public final class ExtendedImageUrl extends ExpirableImageUrl {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(83);
    public ImageLoggingData A00;
    public ExtendedImageUrl A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Long A05;
    public String A06;
    public String A07;
    public List A08;
    public List A09;
    public final String A0A;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExtendedImageUrl(String str, int i, int i2) {
        this((ExtendedImageUrl) null, Integer.valueOf(i), Integer.valueOf(i2), (Long) null, str, (String) null, (String) null, (List) null);
        C04220Ms.A0B(str, 1);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) obj;
            if (!C04220Ms.A0I(this.A0A, extendedImageUrl.A0A) || !C04220Ms.A0I(AgU(), extendedImageUrl.AgU()) || !C04220Ms.A0I(this.A01, extendedImageUrl.A01) || getWidth() != extendedImageUrl.getWidth() || getHeight() != extendedImageUrl.getHeight() || !C04220Ms.A0I(this.A07, extendedImageUrl.A07) || !C04220Ms.A0I(this.A08, extendedImageUrl.A08)) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        long j;
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(0);
        parcel.writeString(this.A0A);
        Long l = this.A05;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        parcel.writeLong(j);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(getWidth());
        parcel.writeInt(getHeight());
        parcel.writeString(this.A07);
        int i2 = 1;
        parcel.writeInt(AnonymousClass0wJ.A1W(this.A08) ? 1 : 0);
        List list = this.A08;
        if (list != null) {
            parcel.writeList(list);
        }
        parcel.writeString(this.A06);
        parcel.writeValue(this.A02);
        parcel.writeParcelable(this.A00, i);
        if (this.A09 == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        List list2 = this.A09;
        if (list2 != null) {
            parcel.writeList(list2);
        }
    }

    public final void A00() {
        String str = this.A0A;
        Integer num = this.A04;
        Integer num2 = this.A03;
        if (str == null) {
            C10450iM.A03(C18210wN.A0e(this), "ExtendedImageUrl url can't be null");
        }
        if (num == null || num2 == null) {
            C10450iM.A04("bad_image_url", AnonymousClass00U.A0L(C18210wN.A0e(this), " - null width/height"), 10000);
        }
        if (this.A04 == null) {
            this.A04 = -1;
        }
        if (this.A03 == null) {
            this.A03 = -1;
        }
        ExtendedImageUrl extendedImageUrl = this.A01;
        if (extendedImageUrl != null) {
            Integer num3 = extendedImageUrl.A04;
            if (num3 == null || num3.intValue() == -1) {
                num3 = Integer.valueOf(getWidth());
            }
            extendedImageUrl.A04 = num3;
            Integer num4 = extendedImageUrl.A03;
            if (num4 == null || num4.intValue() == -1) {
                num4 = Integer.valueOf(getHeight());
            }
            extendedImageUrl.A03 = num4;
            Boolean bool = extendedImageUrl.A02;
            if (bool == null) {
                bool = this.A02;
            }
            extendedImageUrl.A02 = bool;
            String str2 = extendedImageUrl.A07;
            if (str2 == null) {
                str2 = this.A07;
            }
            extendedImageUrl.A07 = str2;
            List list = extendedImageUrl.A08;
            if (list == null) {
                list = this.A08;
            }
            extendedImageUrl.A08 = list;
            ImageLoggingData imageLoggingData = extendedImageUrl.A00;
            if (imageLoggingData == null) {
                imageLoggingData = this.A00;
            }
            extendedImageUrl.A00 = imageLoggingData;
        }
    }

    public final List Ag9() {
        return this.A08;
    }

    public final Long AgU() {
        long A002;
        Long l = this.A05;
        if (l == null) {
            return null;
        }
        long A012 = AnonymousClass728.A01(C972768s.MICROSECONDS, l.longValue());
        if ((((int) A012) & 1) != 1 || A012 == C134797yO.A00 || A012 == C134797yO.A01) {
            A002 = C134797yO.A00(C972768s.MILLISECONDS, A012);
        } else {
            A002 = A012 >> 1;
        }
        return Long.valueOf(A002);
    }

    public final /* bridge */ /* synthetic */ Object AhB() {
        return this.A01;
    }

    public final Boolean Aph() {
        return this.A02;
    }

    public final ImageLoggingData Asu() {
        return this.A00;
    }

    public final String B8q() {
        return this.A07;
    }

    public final List BCD() {
        return this.A09;
    }

    public final int getHeight() {
        Integer num = this.A03;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final String getUrl() {
        return this.A0A;
    }

    public final int getWidth() {
        Integer num = this.A04;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final int hashCode() {
        int hashCode = this.A0A.hashCode();
        AgU();
        ExtendedImageUrl extendedImageUrl = this.A01;
        if (extendedImageUrl != null) {
            extendedImageUrl.hashCode();
        }
        List list = this.A08;
        if (list != null) {
            list.hashCode();
        }
        return hashCode;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedImageUrl(X.AnonymousClass62X r10) {
        /*
            r9 = this;
            java.lang.String r0 = "url"
            java.lang.String r5 = r10.getStringValue(r0)
            if (r5 == 0) goto L_0x004b
            r0 = 64
            java.lang.String r0 = X.C18170wI.A00(r0)
            java.lang.Long r4 = r10.getOptionalTimeValue(r0)
            java.lang.Class<X.62X> r1 = X.AnonymousClass62X.class
            java.lang.String r0 = "fallback"
            com.facebook.pando.TreeJNI r0 = r10.getTreeValue(r0, r1)
            X.62X r0 = (X.AnonymousClass62X) r0
            if (r0 == 0) goto L_0x0049
            com.instagram.model.mediasize.ExtendedImageUrl r1 = new com.instagram.model.mediasize.ExtendedImageUrl
            r1.<init>((X.AnonymousClass62X) r0)
        L_0x0023:
            java.lang.String r0 = "width"
            java.lang.Integer r2 = r10.getOptionalIntValue(r0)
            java.lang.String r0 = "height"
            java.lang.Integer r3 = r10.getOptionalIntValue(r0)
            java.lang.String r0 = "scans_profile"
            java.lang.String r6 = r10.getStringValue(r0)
            java.lang.String r0 = "estimated_scans_sizes"
            com.google.common.collect.ImmutableList r8 = r10.getIntList(r0)
            java.lang.String r0 = "color_preview_hex"
            java.lang.String r7 = r10.getStringValue(r0)
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.A00()
            return
        L_0x0049:
            r1 = 0
            goto L_0x0023
        L_0x004b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.mediasize.ExtendedImageUrl.<init>(X.62X):void");
    }

    public ExtendedImageUrl(ExtendedImageUrl extendedImageUrl, Integer num, Integer num2, Long l, String str, String str2, String str3, List list) {
        C04220Ms.A0B(str, 1);
        this.A0A = str;
        this.A05 = l;
        this.A01 = extendedImageUrl;
        this.A04 = num;
        this.A03 = num2;
        this.A07 = str2;
        this.A08 = list;
        this.A06 = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedImageUrl(com.instagram.common.typedurl.ImageUrl r4) {
        /*
            r3 = this;
            java.lang.String r2 = r4.getUrl()
            X.C04220Ms.A06(r2)
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            r3.<init>(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.mediasize.ExtendedImageUrl.<init>(com.instagram.common.typedurl.ImageUrl):void");
    }
}
