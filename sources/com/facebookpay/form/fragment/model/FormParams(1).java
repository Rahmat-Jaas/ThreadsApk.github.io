package com.facebookpay.form.fragment.model;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass697;
import X.AnonymousClass69W;
import X.C04220Ms;
import X.C18180wK;
import X.C18200wM;
import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class FormParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(71);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final CellParams A07;
    public final FeatureConfiguration A08;
    public final FormLoggingEvents A09;
    public final ListCellParams A0A;
    public final AnonymousClass697 A0B;
    public final AnonymousClass69W A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final String A0H;
    public final ArrayList A0I;
    public final List A0J;
    public final AnonymousClass0YY A0K;
    public final boolean A0L;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A06);
        C18180wK.A0y(parcel, this.A0F, 0, 1);
        C18180wK.A0y(parcel, this.A0E, 0, 1);
        Iterator A10 = C86124wJ.A10(parcel, this.A0I);
        while (A10.hasNext()) {
            C86124wJ.A1F(parcel, A10, i);
        }
        FormLoggingEvents formLoggingEvents = this.A09;
        if (formLoggingEvents == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formLoggingEvents.writeToParcel(parcel, i);
        }
        AnonymousClass697 r0 = this.A0B;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C86104wH.A1B(parcel, r0);
        }
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        ListCellParams listCellParams = this.A0A;
        if (listCellParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            listCellParams.writeToParcel(parcel, i);
        }
        FeatureConfiguration featureConfiguration = this.A08;
        if (featureConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            featureConfiguration.writeToParcel(parcel, i);
        }
        C18180wK.A0y(parcel, this.A0G, 0, 1);
        List list = this.A0J;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0v = C18200wM.A0v(parcel, list);
            while (A0v.hasNext()) {
                parcel.writeInt(AnonymousClass0wJ.A04(A0v.next()));
            }
        }
        parcel.writeParcelable(this.A07, i);
        Integer num = this.A0D;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            if (1 - num.intValue() != 0) {
                str = "ECP_ADD_ADDRESS";
            } else {
                str = "ECP_EDIT_ADDRESS";
            }
            parcel.writeString(str);
        }
        parcel.writeInt(this.A05);
        AnonymousClass69W r02 = this.A0C;
        if (r02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C86104wH.A1B(parcel, r02);
        }
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeSerializable((Serializable) this.A0K);
    }

    public FormParams(CellParams cellParams, FeatureConfiguration featureConfiguration, FormLoggingEvents formLoggingEvents, ListCellParams listCellParams, AnonymousClass697 r6, AnonymousClass69W r7, Integer num, Integer num2, Integer num3, Integer num4, String str, ArrayList arrayList, List list, AnonymousClass0YY r15, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A04 = i;
        this.A0H = str;
        this.A06 = i2;
        this.A0F = num;
        this.A0E = num2;
        this.A0I = arrayList;
        this.A09 = formLoggingEvents;
        this.A0B = r6;
        this.A03 = i3;
        this.A00 = i4;
        this.A02 = i5;
        this.A01 = i6;
        this.A0A = listCellParams;
        this.A08 = featureConfiguration;
        this.A0G = num3;
        this.A0J = list;
        this.A07 = cellParams;
        this.A0D = num4;
        this.A05 = i7;
        this.A0C = r7;
        this.A0L = z;
        this.A0K = r15;
    }
}
