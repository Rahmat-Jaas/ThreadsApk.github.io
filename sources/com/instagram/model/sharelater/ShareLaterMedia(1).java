package com.instagram.model.sharelater;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass24M;
import X.AnonymousClass2R5;
import X.C18180wK;
import X.C23920D1i;
import X.C28991Ffc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediatype.IgShareLaterMedia;
import com.instagram.model.venue.Venue;
import java.util.List;

public class ShareLaterMedia implements IgShareLaterMedia {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape14S0000000_I2_14(37);
    public ImageUrl A00;
    public AnonymousClass24M A01;
    public C28991Ffc A02;
    public Venue A03;
    public String A04;
    public String A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public final boolean BNl() {
        return false;
    }

    public final boolean BO2() {
        return false;
    }

    public final boolean Bgl() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final C23920D1i ARp() {
        return C23920D1i.DEFAULT;
    }

    public final boolean BNn() {
        return this.A08;
    }

    public final boolean BTl() {
        return this.A07;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A02.A00);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeBooleanArray(new boolean[]{this.A07});
        parcel.writeInt(this.A09 ? 1 : 0);
    }

    public ShareLaterMedia(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A02 = AnonymousClass2R5.A00(Integer.valueOf(parcel.readInt()));
        this.A00 = (ImageUrl) C18180wK.A0A(parcel, ImageUrl.class);
        this.A03 = (Venue) C18180wK.A0A(parcel, Venue.class);
        boolean z = false;
        this.A08 = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        boolean[] zArr = new boolean[AnonymousClass006.A00(1).length];
        parcel.readBooleanArray(zArr);
        this.A07 = zArr[0];
        this.A09 = parcel.readInt() != 0 ? true : z;
    }

    public final void CmC(boolean z) {
        this.A07 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0040, code lost:
        if (r3.A2e() == null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShareLaterMedia(X.BKU r3) {
        /*
            r2 = this;
            com.instagram.common.typedurl.ImageUrl r1 = r3.A22()
            r2.<init>()
            X.BZI r0 = r3.A26()
            if (r0 == 0) goto L_0x0015
            X.BZI r0 = r3.A26()
            java.lang.String r0 = r0.A0h
            r2.A04 = r0
        L_0x0015:
            java.lang.String r0 = r3.A33()
            r2.A05 = r0
            X.Ffc r0 = r3.Aup()
            r2.A02 = r0
            r2.A00 = r1
            com.instagram.model.venue.Venue r0 = r3.A2V()
            r2.A03 = r0
            boolean r0 = r3.A3r()
            r2.A08 = r0
            java.util.List r0 = r3.A3K()
            r2.A06 = r0
            java.lang.Double r0 = r3.A2d()
            if (r0 == 0) goto L_0x0042
            java.lang.Double r1 = r3.A2e()
            r0 = 1
            if (r1 != 0) goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            r2.A09 = r0
            X.24M r0 = r3.A2I()
            r2.A01 = r0
            r3.A4E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.sharelater.ShareLaterMedia.<init>(X.BKU):void");
    }
}
