package com.instagram.arlink.fragment;

import X.C15020qa;
import X.C18180wK;
import X.C30798GVt;
import X.G74;
import android.os.Bundle;
import com.facebook.react.modules.statusbar.StatusBarModule;
import java.nio.ByteBuffer;

public class YUVImageData {
    public int A00;
    public int A01;
    public int A02;
    public Bundle A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;

    private native void nativeConvertARGBToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    public YUVImageData(C30798GVt gVt) {
        int i;
        int i2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i3;
        int i4;
        int i5;
        G74[] g74Arr;
        C15020qa.A0A("arlink");
        C30798GVt gVt2 = gVt;
        int i6 = gVt2.A01;
        if (i6 == 1) {
            G74[] g74Arr2 = gVt2.A0B;
            if (g74Arr2 != null && g74Arr2.length == 1) {
                i = gVt2.A02;
                int i7 = gVt2.A00;
                ByteBuffer byteBuffer = g74Arr2[0].A02;
                if (byteBuffer != null) {
                    int i8 = i * i7;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i8);
                    int i9 = i8 >> 2;
                    ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i9);
                    ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(i9);
                    i2 = i >> 1;
                    nativeConvertARGBToI420(byteBuffer, g74Arr2[0].A01, allocateDirect, i, allocateDirect2, i2, allocateDirect3, i2, i, i7);
                    byte[] bArr4 = new byte[allocateDirect.remaining()];
                    allocateDirect.get(bArr4);
                    byte[] bArr5 = new byte[allocateDirect2.remaining()];
                    allocateDirect2.get(bArr5);
                    byte[] bArr6 = new byte[allocateDirect3.remaining()];
                    allocateDirect3.get(bArr6);
                    bArr = bArr4;
                    bArr2 = bArr5;
                    bArr3 = bArr6;
                    i3 = i2;
                    i4 = i;
                    i5 = i7;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (i6 == 35 && (g74Arr = gVt2.A0B) != null && g74Arr.length == 3) {
            G74 g74 = g74Arr[0];
            ByteBuffer byteBuffer2 = g74.A02;
            byteBuffer2.getClass();
            bArr = new byte[byteBuffer2.remaining()];
            g74.A02.get(bArr);
            i = g74.A01;
            G74 g742 = g74Arr[1];
            ByteBuffer byteBuffer3 = g742.A02;
            byteBuffer3.getClass();
            bArr2 = new byte[byteBuffer3.remaining()];
            g742.A02.get(bArr2);
            i3 = g742.A01;
            G74 g743 = g74Arr[2];
            ByteBuffer byteBuffer4 = g743.A02;
            byteBuffer4.getClass();
            bArr3 = new byte[byteBuffer4.remaining()];
            g743.A02.get(bArr3);
            i2 = g743.A01;
            i4 = gVt2.A02;
            i5 = gVt2.A00;
        } else {
            return;
        }
        A00(bArr, bArr2, bArr3, i, i3, i2, i4, i5);
    }

    private void A00(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5) {
        this.A06 = bArr;
        this.A04 = bArr2;
        this.A05 = bArr3;
        this.A02 = i;
        this.A01 = i4;
        this.A00 = i5;
        Bundle A062 = C18180wK.A06();
        this.A03 = A062;
        A062.putByteArray("Y_DATA", bArr);
        this.A03.putByteArray("U_DATA", bArr2);
        this.A03.putByteArray("V_DATA", bArr3);
        this.A03.putInt("Y_STRIDE", i);
        this.A03.putInt("U_STRIDE", i2);
        this.A03.putInt("V_STRIDE", i3);
        this.A03.putInt("WIDTH", i4);
        this.A03.putInt(StatusBarModule.HEIGHT_KEY, i5);
    }

    public YUVImageData(Bundle bundle) {
        this.A03 = bundle;
        byte[] byteArray = bundle.getByteArray("Y_DATA");
        byteArray.getClass();
        this.A06 = byteArray;
        byte[] byteArray2 = bundle.getByteArray("U_DATA");
        byteArray2.getClass();
        this.A04 = byteArray2;
        byte[] byteArray3 = bundle.getByteArray("V_DATA");
        byteArray3.getClass();
        this.A05 = byteArray3;
        this.A02 = bundle.getInt("Y_STRIDE");
        bundle.getInt("U_STRIDE");
        bundle.getInt("V_STRIDE");
        this.A01 = bundle.getInt("WIDTH");
        this.A00 = bundle.getInt(StatusBarModule.HEIGHT_KEY);
    }
}
