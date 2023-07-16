package com.instagram.model.direct;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18240wQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Collection;

public class DirectMessageSearchThread implements DirectSearchResult {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(52);
    public ImmutableList A00;
    public ImageUrl A01;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public final int describeContents() {
        return 0;
    }

    public final String AB0() {
        return StringFormatUtil.formatStrLocaleSafe("| %-30s | title: %-50s | thread id: %-100s|", "DirectMessageSearchThread", this.A05, this.A04);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeList(this.A00);
    }

    public DirectMessageSearchThread(Parcel parcel) {
        this.A04 = C18240wQ.A0c(parcel);
        this.A03 = C18240wQ.A0c(parcel);
        this.A05 = C18240wQ.A0c(parcel);
        this.A06 = C18240wQ.A0c(parcel);
        Class<ImageUrl> cls = ImageUrl.class;
        Parcelable A0A = C18180wK.A0A(parcel, cls);
        A0A.getClass();
        this.A01 = (ImageUrl) A0A;
        this.A02 = (ImageUrl) C18180wK.A0A(parcel, cls);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        parcel.readList(A0v, PendingRecipient.class.getClassLoader());
        this.A00 = ImmutableList.copyOf((Collection) A0v);
    }

    public DirectMessageSearchThread(ImmutableList immutableList, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A01 = imageUrl;
        this.A02 = imageUrl2;
        this.A00 = immutableList;
    }
}
