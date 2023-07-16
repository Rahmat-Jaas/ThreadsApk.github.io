package com.instagram.business.controller.datamodel;

import X.AnonymousClass0wJ;
import X.C32572Cj;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

public class BusinessConversionFlowStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape9S0000000_I2_9(96);
    public final int A00;
    public final ImmutableList A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BusinessConversionFlowStatus)) {
            return false;
        }
        BusinessConversionFlowStatus businessConversionFlowStatus = (BusinessConversionFlowStatus) obj;
        return businessConversionFlowStatus.A00 == this.A00 && C32572Cj.A00(businessConversionFlowStatus.A01, this.A01);
    }

    public final BusinessConversionStep A00() {
        int i = this.A00;
        if (i <= -1) {
            return null;
        }
        ImmutableList immutableList = this.A01;
        if (i != immutableList.size()) {
            return (BusinessConversionStep) immutableList.get(i);
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeList(this.A01);
    }

    public BusinessConversionFlowStatus(Parcel parcel) {
        this.A00 = parcel.readInt();
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        parcel.readList(A0v, BusinessConversionStep.class.getClassLoader());
        builder.addAll((Iterable) A0v);
        this.A01 = builder.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3.isEmpty() != false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r4 > r1.size()) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BusinessConversionFlowStatus(java.util.List r3, int r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x000c
            boolean r1 = r3.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            com.google.common.collect.ImmutableList r1 = X.C18230wP.A0Q(r3, r0)
            r2.A01 = r1
            r0 = -1
            if (r4 < r0) goto L_0x001d
            int r1 = r1.size()
            r0 = 1
            if (r4 <= r1) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            X.AnonymousClass7Ko.A0C(r0)
            r2.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.controller.datamodel.BusinessConversionFlowStatus.<init>(java.util.List, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3.isEmpty() != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BusinessConversionFlowStatus(java.util.List r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x000c
            boolean r1 = r3.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0Q(r3, r0)
            r2.A01 = r0
            r0 = -1
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.controller.datamodel.BusinessConversionFlowStatus.<init>(java.util.List):void");
    }
}
