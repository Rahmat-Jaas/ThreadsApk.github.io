package com.instagram.model.direct;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18240wQ;
import X.C18250wR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Collection;

public class DirectMessageSearchMessage implements DirectSearchResult {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(51);
    public long A00;
    public ImmutableList A01;
    public ImmutableList A02;
    public ImageUrl A03;
    public ImageUrl A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public final int describeContents() {
        return 0;
    }

    public final String AB0() {
        return StringFormatUtil.formatStrLocaleSafe("| %-30s | name: %-50s | thread id: %-60s|", "DirectMessageSearchMessage", this.A0B, this.A09);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeList(this.A01);
        parcel.writeList(this.A02);
        C18240wQ.A0v(parcel, this.A06);
        C18240wQ.A0v(parcel, this.A05);
    }

    public DirectMessageSearchMessage(Parcel parcel) {
        this.A07 = C18240wQ.A0c(parcel);
        this.A08 = C18240wQ.A0c(parcel);
        this.A0B = C18240wQ.A0c(parcel);
        Class<ImageUrl> cls = ImageUrl.class;
        Parcelable A0A2 = C18180wK.A0A(parcel, cls);
        A0A2.getClass();
        this.A03 = (ImageUrl) A0A2;
        this.A04 = (ImageUrl) C18180wK.A0A(parcel, cls);
        this.A00 = parcel.readLong();
        this.A09 = C18240wQ.A0c(parcel);
        this.A0A = C18240wQ.A0c(parcel);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        parcel.readList(A0v, HighlightRange.class.getClassLoader());
        this.A01 = ImmutableList.copyOf((Collection) A0v);
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        parcel.readList(A0v2, PendingRecipient.class.getClassLoader());
        this.A02 = ImmutableList.copyOf((Collection) A0v2);
        this.A06 = C18250wR.A0T(parcel);
        this.A05 = C18250wR.A0T(parcel);
    }

    public DirectMessageSearchMessage(ImmutableList immutableList, ImmutableList immutableList2, ImageUrl imageUrl, ImageUrl imageUrl2, Long l, Long l2, String str, String str2, String str3, String str4, String str5, long j) {
        this.A07 = str;
        this.A08 = str2;
        this.A0B = str3;
        this.A03 = imageUrl;
        this.A04 = imageUrl2;
        this.A00 = j;
        this.A09 = str4;
        this.A0A = str5;
        this.A01 = immutableList;
        this.A02 = immutableList2;
        this.A06 = l;
        this.A05 = l2;
    }
}
