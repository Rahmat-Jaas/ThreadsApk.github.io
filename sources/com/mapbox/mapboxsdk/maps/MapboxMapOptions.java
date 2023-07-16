package com.mapbox.mapboxsdk.maps;

import X.C18180wK;
import X.C18220wO;
import X.C18230wP;
import X.C86104wH;
import X.C86134wK;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import java.util.Arrays;

public class MapboxMapOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape17S0000000_I2_17(90);
    public double A00;
    public double A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public float A0H;
    public int A0I;
    public Drawable A0J;
    public CameraPosition A0K;
    public String A0L;
    public String A0M = "sans-serif";
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R = false;
    public int[] A0S;
    public int[] A0T;
    public int[] A0U;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r1.equals(r0) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 1
            if (r5 == r6) goto L_0x0030
            r4 = 0
            if (r6 == 0) goto L_0x0030
            java.lang.Class r1 = r5.getClass()
            java.lang.Class r0 = r6.getClass()
            if (r1 != r0) goto L_0x0030
            com.mapbox.mapboxsdk.maps.MapboxMapOptions r6 = (com.mapbox.mapboxsdk.maps.MapboxMapOptions) r6
            boolean r1 = r5.A0O
            boolean r0 = r6.A0O
            if (r1 != r0) goto L_0x0030
            boolean r1 = r5.A07
            boolean r0 = r6.A07
            if (r1 != r0) goto L_0x0030
            boolean r1 = r5.A09
            boolean r0 = r6.A09
            if (r1 != r0) goto L_0x0030
            android.graphics.drawable.Drawable r1 = r5.A0J
            android.graphics.drawable.Drawable r0 = r6.A0J
            if (r1 == 0) goto L_0x0031
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0034
        L_0x0030:
            return r4
        L_0x0031:
            if (r0 == 0) goto L_0x0034
            return r4
        L_0x0034:
            int r1 = r5.A04
            int r0 = r6.A04
            if (r1 != r0) goto L_0x0030
            boolean r1 = r5.A0A
            boolean r0 = r6.A0A
            if (r1 != r0) goto L_0x0030
            int r1 = r5.A05
            int r0 = r6.A05
            if (r1 != r0) goto L_0x0030
            int r1 = r5.A03
            int r0 = r6.A03
            if (r1 != r0) goto L_0x0030
            boolean r1 = r5.A06
            boolean r0 = r6.A06
            if (r1 != r0) goto L_0x0030
            int r1 = r5.A02
            int r0 = r6.A02
            if (r1 != r0) goto L_0x0030
            double r2 = r6.A01
            double r0 = r5.A01
            int r0 = java.lang.Double.compare(r2, r0)
            if (r0 != 0) goto L_0x0030
            double r2 = r6.A00
            double r0 = r5.A00
            int r0 = java.lang.Double.compare(r2, r0)
            if (r0 != 0) goto L_0x0030
            boolean r1 = r5.A0D
            boolean r0 = r6.A0D
            if (r1 != r0) goto L_0x0030
            boolean r1 = r5.A0E
            boolean r0 = r6.A0E
            if (r1 != r0) goto L_0x0030
            boolean r1 = r5.A0F
            boolean r0 = r6.A0F
            if (r1 != r0) goto L_0x0030
            boolean r1 = r5.A0G
            boolean r0 = r6.A0G
            if (r1 != r0) goto L_0x0030
            boolean r1 = r5.A08
            boolean r0 = r6.A08
            if (r1 != r0) goto L_0x0030
            boolean r1 = r5.A0C
            boolean r0 = r6.A0C
            if (r1 != r0) goto L_0x0030
            com.mapbox.mapboxsdk.camera.CameraPosition r1 = r5.A0K
            com.mapbox.mapboxsdk.camera.CameraPosition r0 = r6.A0K
            if (r1 == 0) goto L_0x009d
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a0
            return r4
        L_0x009d:
            if (r0 == 0) goto L_0x00a0
            return r4
        L_0x00a0:
            int[] r1 = r5.A0T
            int[] r0 = r6.A0T
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x0030
            int[] r1 = r5.A0U
            int[] r0 = r6.A0U
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x0030
            int[] r1 = r5.A0S
            int[] r0 = r6.A0S
            java.util.Arrays.equals(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.MapboxMapOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        int A052 = (((((((((((((((((((((((((C18230wP.A05(this.A0K) * 31) + (this.A0O ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + this.A04) * 31) + C18230wP.A05(this.A0J)) * 31) + Arrays.hashCode(this.A0T)) * 31) + (this.A0A ? 1 : 0)) * 31) + this.A05) * 31) + Arrays.hashCode(this.A0U)) * 31) + this.A03) * 31) + (this.A06 ? 1 : 0)) * 31) + this.A02) * 31) + Arrays.hashCode(this.A0S);
        int A062 = C86134wK.A06(A052 * 31, Double.doubleToLongBits(this.A01));
        int A063 = (((((((((((((((((((((C86104wH.A06(A062 * 31, Double.doubleToLongBits(this.A00)) + (this.A0D ? 1 : 0)) * 31) + (this.A0E ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + (this.A0G ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + C18220wO.A07(this.A0L)) * 31) + (this.A0P ? 1 : 0)) * 31) + (this.A0Q ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0R ? 1 : 0)) * 31;
        String str = this.A0M;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((A063 + i) * 31) + ((int) this.A0H)) * 31) + (this.A0N ? 1 : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A0K, i);
        parcel.writeByte(this.A0O ? (byte) 1 : 0);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeInt(this.A04);
        parcel.writeIntArray(this.A0T);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        Drawable drawable = this.A0J;
        Bitmap bitmap = null;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    Drawable mutate = constantState.newDrawable().mutate();
                    bitmap = Bitmap.createBitmap(mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    mutate.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    mutate.draw(canvas);
                }
            }
        }
        parcel.writeParcelable(bitmap, i);
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
        parcel.writeInt(this.A05);
        parcel.writeIntArray(this.A0U);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeIntArray(this.A0S);
        parcel.writeInt(this.A03);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A00);
        parcel.writeByte(this.A0D ? (byte) 1 : 0);
        parcel.writeByte(this.A0E ? (byte) 1 : 0);
        parcel.writeByte(this.A0F ? (byte) 1 : 0);
        parcel.writeByte(this.A0G ? (byte) 1 : 0);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeString(this.A0L);
        parcel.writeByte(this.A0P ? (byte) 1 : 0);
        parcel.writeByte(this.A0Q ? (byte) 1 : 0);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeByte(this.A0R ? (byte) 1 : 0);
        parcel.writeString(this.A0M);
        parcel.writeFloat(this.A0H);
        parcel.writeInt(this.A0I);
        parcel.writeByte(this.A0N ? (byte) 1 : 0);
    }

    public MapboxMapOptions(Parcel parcel) {
        boolean A1Y = C86104wH.A1Y(this);
        boolean z = false;
        this.A0N = A1Y;
        this.A0K = (CameraPosition) C18180wK.A0A(parcel, CameraPosition.class);
        this.A0O = C18180wK.A1V(parcel.readByte());
        this.A07 = C18180wK.A1V(parcel.readByte());
        this.A04 = parcel.readInt();
        this.A0T = parcel.createIntArray();
        this.A09 = C18180wK.A1V(parcel.readByte());
        Bitmap bitmap = (Bitmap) C18180wK.A0A(parcel, getClass());
        if (bitmap != null) {
            this.A0J = new BitmapDrawable(bitmap);
        }
        this.A0A = C18180wK.A1V(parcel.readByte());
        this.A05 = parcel.readInt();
        this.A0U = parcel.createIntArray();
        this.A06 = C18180wK.A1V(parcel.readByte());
        this.A02 = parcel.readInt();
        this.A0S = parcel.createIntArray();
        this.A03 = parcel.readInt();
        this.A01 = parcel.readDouble();
        this.A00 = parcel.readDouble();
        this.A0D = C18180wK.A1V(parcel.readByte());
        this.A0E = C18180wK.A1V(parcel.readByte());
        this.A0F = C18180wK.A1V(parcel.readByte());
        this.A0G = C18180wK.A1V(parcel.readByte());
        this.A08 = C18180wK.A1V(parcel.readByte());
        this.A0C = C18180wK.A1V(parcel.readByte());
        this.A0L = parcel.readString();
        this.A0P = C18180wK.A1V(parcel.readByte());
        this.A0Q = C18180wK.A1V(parcel.readByte());
        this.A0B = C18180wK.A1V(parcel.readByte());
        this.A0R = parcel.readByte() != 0 ? true : z;
        this.A0M = parcel.readString();
        this.A0H = parcel.readFloat();
        this.A0I = parcel.readInt();
        this.A0N = parcel.readByte() == 0 ? false : A1Y;
    }

    public MapboxMapOptions() {
        boolean A1Y = C86104wH.A1Y(this);
        this.A0N = A1Y;
    }
}
