package com.instagram.business.controller.datamodel;

import X.C18180wK;
import X.C313525q;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;
import java.util.Arrays;

public class BusinessConversionStep implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape9S0000000_I2_9(97);
    public final C313525q A00;
    public final ConversionStep A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BusinessConversionStep)) {
            return false;
        }
        BusinessConversionStep businessConversionStep = (BusinessConversionStep) obj;
        return businessConversionStep.A01 == this.A01 && businessConversionStep.A00 == this.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00.A00);
    }

    public BusinessConversionStep(Parcel parcel) {
        C313525q r0;
        this.A01 = (ConversionStep) C18180wK.A0A(parcel, ConversionStep.class);
        if (parcel.readInt() == 1) {
            r0 = C313525q.SKIP;
        } else {
            r0 = C313525q.NEXT;
        }
        this.A00 = r0;
    }

    public BusinessConversionStep(C313525q r1, ConversionStep conversionStep) {
        this.A01 = conversionStep;
        this.A00 = r1;
    }
}
