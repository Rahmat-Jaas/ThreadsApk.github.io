package com.mapbox.mapboxsdk.location;

import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;
import java.util.Arrays;

public class LocationComponentOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape17S0000000_I2_17(89);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public int[] A0V;
    public float A0W;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ac, code lost:
        if (r1.equals(r0) == false) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 == r8) goto L_0x017a
            r5 = 0
            if (r8 == 0) goto L_0x00ae
            java.lang.Class r1 = r7.getClass()
            java.lang.Class r0 = r8.getClass()
            if (r1 != r0) goto L_0x00ae
            com.mapbox.mapboxsdk.location.LocationComponentOptions r8 = (com.mapbox.mapboxsdk.location.LocationComponentOptions) r8
            float r1 = r8.A00
            float r0 = r7.A00
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L_0x00ae
            int r1 = r7.A06
            int r0 = r8.A06
            if (r1 != r0) goto L_0x00ae
            int r1 = r7.A08
            int r0 = r8.A08
            if (r1 != r0) goto L_0x00ae
            int r1 = r7.A0B
            int r0 = r8.A0B
            if (r1 != r0) goto L_0x00ae
            int r1 = r7.A0C
            int r0 = r8.A0C
            if (r1 != r0) goto L_0x00ae
            int r1 = r7.A0A
            int r0 = r8.A0A
            if (r1 != r0) goto L_0x00ae
            int r1 = r7.A07
            int r0 = r8.A07
            if (r1 != r0) goto L_0x00ae
            int r1 = r7.A09
            int r0 = r8.A09
            if (r1 != r0) goto L_0x00ae
            float r1 = r8.A01
            float r0 = r7.A01
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L_0x00ae
            boolean r1 = r7.A0T
            boolean r0 = r8.A0T
            if (r1 != r0) goto L_0x00ae
            long r3 = r7.A0D
            long r1 = r8.A0D
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00ae
            float r1 = r8.A02
            float r0 = r7.A02
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L_0x00ae
            float r1 = r8.A03
            float r0 = r7.A03
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L_0x00ae
            boolean r1 = r7.A0U
            boolean r0 = r8.A0U
            if (r1 != r0) goto L_0x00ae
            float r1 = r8.A04
            float r0 = r7.A04
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L_0x00ae
            float r1 = r8.A05
            float r0 = r7.A05
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L_0x00ae
            float r1 = r8.A0W
            float r0 = r7.A0W
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L_0x00ae
            boolean r1 = r7.A0S
            boolean r0 = r8.A0S
            if (r1 != r0) goto L_0x00ae
            boolean r1 = r7.A0R
            boolean r0 = r8.A0R
            if (r1 != r0) goto L_0x00ae
            java.lang.String r1 = r7.A0K
            java.lang.String r0 = r8.A0K
            if (r1 == 0) goto L_0x00af
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00b2
        L_0x00ae:
            return r5
        L_0x00af:
            if (r0 == 0) goto L_0x00b2
            return r5
        L_0x00b2:
            java.lang.String r1 = r7.A0N
            java.lang.String r0 = r8.A0N
            if (r1 == 0) goto L_0x00bf
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00c2
            return r5
        L_0x00bf:
            if (r0 == 0) goto L_0x00c2
            return r5
        L_0x00c2:
            java.lang.String r1 = r7.A0O
            java.lang.String r0 = r8.A0O
            if (r1 == 0) goto L_0x00cf
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00d2
            return r5
        L_0x00cf:
            if (r0 == 0) goto L_0x00d2
            return r5
        L_0x00d2:
            java.lang.String r1 = r7.A0M
            java.lang.String r0 = r8.A0M
            if (r1 == 0) goto L_0x00df
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00e2
            return r5
        L_0x00df:
            if (r0 == 0) goto L_0x00e2
            return r5
        L_0x00e2:
            java.lang.String r1 = r7.A0J
            java.lang.String r0 = r8.A0J
            if (r1 == 0) goto L_0x00ef
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00f2
            return r5
        L_0x00ef:
            if (r0 == 0) goto L_0x00f2
            return r5
        L_0x00f2:
            java.lang.String r1 = r7.A0L
            java.lang.String r0 = r8.A0L
            if (r1 == 0) goto L_0x00ff
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0102
            return r5
        L_0x00ff:
            if (r0 == 0) goto L_0x0102
            return r5
        L_0x0102:
            java.lang.Integer r1 = r7.A0G
            java.lang.Integer r0 = r8.A0G
            if (r1 == 0) goto L_0x010f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0112
            return r5
        L_0x010f:
            if (r0 == 0) goto L_0x0112
            return r5
        L_0x0112:
            java.lang.Integer r1 = r7.A0I
            java.lang.Integer r0 = r8.A0I
            if (r1 == 0) goto L_0x011f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0122
            return r5
        L_0x011f:
            if (r0 == 0) goto L_0x0122
            return r5
        L_0x0122:
            java.lang.Integer r1 = r7.A0F
            java.lang.Integer r0 = r8.A0F
            if (r1 == 0) goto L_0x012f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0132
            return r5
        L_0x012f:
            if (r0 == 0) goto L_0x0132
            return r5
        L_0x0132:
            java.lang.Integer r1 = r7.A0H
            java.lang.Integer r0 = r8.A0H
            if (r1 == 0) goto L_0x013f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0142
            return r5
        L_0x013f:
            if (r0 == 0) goto L_0x0142
            return r5
        L_0x0142:
            java.lang.Integer r1 = r7.A0E
            java.lang.Integer r0 = r8.A0E
            if (r1 == 0) goto L_0x014f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0152
            return r5
        L_0x014f:
            if (r0 == 0) goto L_0x0152
            return r5
        L_0x0152:
            int[] r1 = r7.A0V
            int[] r0 = r8.A0V
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x00ae
            java.lang.String r1 = r7.A0P
            java.lang.String r0 = r8.A0P
            if (r1 == 0) goto L_0x0169
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x016c
            return r5
        L_0x0169:
            if (r0 == 0) goto L_0x016c
            return r5
        L_0x016c:
            java.lang.String r1 = r7.A0Q
            java.lang.String r0 = r8.A0Q
            if (r1 == 0) goto L_0x0177
            boolean r6 = r1.equals(r0)
            return r6
        L_0x0177:
            if (r0 == 0) goto L_0x017a
            r6 = 0
        L_0x017a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.location.LocationComponentOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f = this.A00;
        int i7 = 0;
        if (f != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int A072 = ((((((((((((((((((((((((((((((((((((i * 31) + this.A06) * 31) + this.A08) * 31) + C18220wO.A07(this.A0K)) * 31) + this.A0B) * 31) + C18220wO.A07(this.A0N)) * 31) + this.A0C) * 31) + C18220wO.A07(this.A0O)) * 31) + this.A0A) * 31) + C18220wO.A07(this.A0M)) * 31) + this.A07) * 31) + C18220wO.A07(this.A0J)) * 31) + this.A09) * 31) + C18220wO.A07(this.A0L)) * 31) + C18230wP.A05(this.A0G)) * 31) + C18230wP.A05(this.A0I)) * 31) + C18230wP.A05(this.A0F)) * 31) + C18230wP.A05(this.A0H)) * 31) + C18230wP.A05(this.A0E)) * 31;
        float f2 = this.A01;
        if (f2 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int A022 = (((((((A072 + i2) * 31) + (this.A0T ? 1 : 0)) * 31) + C18190wL.A02(this.A0D)) * 31) + Arrays.hashCode(this.A0V)) * 31;
        float f3 = this.A02;
        if (f3 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            i3 = Float.floatToIntBits(f3);
        } else {
            i3 = 0;
        }
        int i8 = (A022 + i3) * 31;
        float f4 = this.A03;
        if (f4 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            i4 = Float.floatToIntBits(f4);
        } else {
            i4 = 0;
        }
        int i9 = (((i8 + i4) * 31) + (this.A0U ? 1 : 0)) * 31;
        float f5 = this.A04;
        if (f5 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            i5 = Float.floatToIntBits(f5);
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        float f6 = this.A05;
        if (f6 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            i6 = Float.floatToIntBits(f6);
        } else {
            i6 = 0;
        }
        int A073 = (((((i10 + i6) * 31) + C18220wO.A07(this.A0P)) * 31) + C18220wO.A07(this.A0Q)) * 31;
        float f7 = this.A0W;
        if (f7 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            i7 = Float.floatToIntBits(f7);
        }
        return ((((A073 + i7) * 31) + (this.A0S ? 1 : 0)) * 31) + (this.A0R ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("LocationComponentOptions{accuracyAlpha=");
        A0s.append(this.A00);
        A0s.append(", accuracyColor=");
        A0s.append(this.A06);
        A0s.append(", backgroundDrawableStale=");
        A0s.append(this.A08);
        A0s.append(", backgroundStaleName=");
        A0s.append(this.A0K);
        A0s.append(", foregroundDrawableStale=");
        A0s.append(this.A0B);
        A0s.append(", foregroundStaleName=");
        A0s.append(this.A0N);
        A0s.append(", gpsDrawable=");
        A0s.append(this.A0C);
        A0s.append(", gpsName=");
        A0s.append(this.A0O);
        A0s.append(", foregroundDrawable=");
        A0s.append(this.A0A);
        A0s.append(", foregroundName=");
        A0s.append(this.A0M);
        A0s.append(", backgroundDrawable=");
        A0s.append(this.A07);
        A0s.append(", backgroundName=");
        A0s.append(this.A0J);
        A0s.append(", bearingDrawable=");
        A0s.append(this.A09);
        A0s.append(", bearingName=");
        A0s.append(this.A0L);
        A0s.append(", bearingTintColor=");
        A0s.append(this.A0G);
        A0s.append(", foregroundTintColor=");
        A0s.append(this.A0I);
        A0s.append(", backgroundTintColor=");
        A0s.append(this.A0F);
        A0s.append(", foregroundStaleTintColor=");
        A0s.append(this.A0H);
        A0s.append(", backgroundStaleTintColor=");
        A0s.append(this.A0E);
        A0s.append(", elevation=");
        A0s.append(this.A01);
        A0s.append(", enableStaleState=");
        A0s.append(this.A0T);
        A0s.append(", staleStateTimeout=");
        A0s.append(this.A0D);
        A0s.append(", padding=");
        A0s.append(Arrays.toString(this.A0V));
        A0s.append(", maxZoomIconScale=");
        A0s.append(this.A02);
        A0s.append(", minZoomIconScale=");
        A0s.append(this.A03);
        A0s.append(", trackingGesturesManagement=");
        A0s.append(this.A0U);
        A0s.append(", trackingInitialMoveThreshold=");
        A0s.append(this.A04);
        A0s.append(", trackingMultiFingerMoveThreshold=");
        A0s.append(this.A05);
        A0s.append(", layerAbove=");
        A0s.append(this.A0P);
        A0s.append("layerBelow=");
        A0s.append(this.A0Q);
        A0s.append("trackingAnimationDurationMultiplier=");
        A0s.append(this.A0W);
        return C18180wK.A0i("}", A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A08);
        C18190wL.A16(parcel, this.A0K, 1, 0);
        parcel.writeInt(this.A0B);
        C18190wL.A16(parcel, this.A0N, 1, 0);
        parcel.writeInt(this.A0C);
        C18190wL.A16(parcel, this.A0O, 1, 0);
        parcel.writeInt(this.A0A);
        C18190wL.A16(parcel, this.A0M, 1, 0);
        parcel.writeInt(this.A07);
        C18190wL.A16(parcel, this.A0J, 1, 0);
        parcel.writeInt(this.A09);
        C18190wL.A16(parcel, this.A0L, 1, 0);
        C18180wK.A0y(parcel, this.A0G, 1, 0);
        C18180wK.A0y(parcel, this.A0I, 1, 0);
        C18180wK.A0y(parcel, this.A0F, 1, 0);
        C18180wK.A0y(parcel, this.A0H, 1, 0);
        C18180wK.A0y(parcel, this.A0E, 1, 0);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeLong(this.A0D);
        parcel.writeIntArray(this.A0V);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeFloat(this.A04);
        parcel.writeFloat(this.A05);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0Q);
        parcel.writeFloat(this.A0W);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
    }

    public LocationComponentOptions(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int[] iArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = f;
        this.A06 = i;
        this.A08 = i2;
        this.A0K = str;
        this.A0B = i3;
        this.A0N = str2;
        this.A0C = i4;
        this.A0O = str3;
        this.A0A = i5;
        this.A0M = str4;
        this.A07 = i6;
        this.A0J = str5;
        this.A09 = i7;
        this.A0L = str6;
        this.A0G = num;
        this.A0I = num2;
        this.A0F = num3;
        this.A0H = num4;
        this.A0E = num5;
        this.A01 = f2;
        this.A0T = z;
        this.A0D = j;
        int[] iArr2 = iArr;
        if (iArr != null) {
            this.A0V = iArr2;
            this.A02 = f3;
            this.A03 = f4;
            this.A0U = z2;
            this.A04 = f5;
            this.A05 = f6;
            this.A0P = str7;
            this.A0Q = str8;
            this.A0W = f7;
            this.A0S = z3;
            this.A0R = z4;
            return;
        }
        throw C18210wN.A0W("Null padding");
    }
}
