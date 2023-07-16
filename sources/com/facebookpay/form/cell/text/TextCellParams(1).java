package com.facebookpay.form.cell.text;

import X.AnonymousClass0wJ;
import X.AnonymousClass3JE;
import X.C110616lz;
import X.C116906xk;
import X.C18180wK;
import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import X.C91895h1;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.text.formatter.TextFormatter;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

public class TextCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(57);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final TextFormatter A04;
    public final TextFieldHandler A05;
    public final FBPayIcon A06;
    public final ImmutableList A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public final int describeContents() {
        return 0;
    }

    public TextCellParams(Parcel parcel) {
        super(parcel);
        this.A0F = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0E = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        String readString = parcel.readString();
        readString.getClass();
        Integer A002 = C116906xk.A00(readString);
        A002.getClass();
        this.A0C = A002;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C86134wK.A17(parcel, TextValidatorParams.class, A0v);
        this.A07 = ImmutableList.copyOf((Collection) A0v);
        this.A05 = (TextFieldHandler) C86114wI.A0e(parcel, TextFieldHandler.class);
        this.A06 = (FBPayIcon) C18180wK.A0A(parcel, FBPayIcon.class);
        this.A0A = Boolean.valueOf(AnonymousClass3JE.A00(parcel));
        this.A02 = parcel.readInt();
        this.A0B = Boolean.valueOf(AnonymousClass3JE.A00(parcel));
        this.A04 = (TextFormatter) C86114wI.A0e(parcel, TextFormatter.class);
        this.A0D = parcel.readString();
        this.A08 = Boolean.valueOf(AnonymousClass3JE.A00(parcel));
        this.A09 = Boolean.valueOf(AnonymousClass3JE.A00(parcel));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(C116906xk.A01(this.A0C));
        parcel.writeList(this.A07);
        parcel.writeValue(this.A05);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A0A.booleanValue() ? 1 : 0);
        parcel.writeInt(this.A0B.booleanValue() ? 1 : 0);
        parcel.writeValue(this.A04);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A08.booleanValue() ? 1 : 0);
        parcel.writeInt(this.A09.booleanValue() ? 1 : 0);
    }

    public TextCellParams(C91895h1 r2) {
        super((C110616lz) r2);
        this.A0F = r2.A0F;
        this.A03 = r2.A03;
        this.A0E = r2.A0E;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
        this.A0C = r2.A0C;
        this.A07 = r2.A07;
        this.A05 = r2.A05;
        this.A06 = r2.A06;
        this.A0A = r2.A0A;
        this.A02 = r2.A02;
        this.A0B = r2.A0B;
        this.A04 = r2.A04;
        this.A0D = r2.A0D;
        this.A08 = r2.A08;
        this.A09 = r2.A09;
    }
}
