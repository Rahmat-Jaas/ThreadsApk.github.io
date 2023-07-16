package X;

import com.facebook.flexlayout.layoutoutput.LayoutOutput;

/* renamed from: X.7gy  reason: invalid class name and case insensitive filesystem */
public final class C127347gy implements C41822MeD {
    public final int A00;
    public final int A01;
    public final LayoutOutput A02;
    public final M5L A03;

    public final Object Are() {
        return null;
    }

    public final int Azh() {
        return 0;
    }

    public final int Azi() {
        return 0;
    }

    public final int Azj() {
        return 0;
    }

    public final int Azk() {
        return 0;
    }

    public final C41822MeD AXN(int i) {
        return (C41822MeD) this.A02.measureResults[i];
    }

    public final int AXU() {
        return this.A02.measureResults.length;
    }

    public final int Aml() {
        return this.A00;
    }

    public final M5L B6z() {
        return this.A03;
    }

    public final int BMC() {
        return this.A01;
    }

    public final int BMT(int i) {
        return (int) this.A02.arr[C18240wQ.A1Z().length + (i * AnonymousClass006.A00(4).length)];
    }

    public final int BMi(int i) {
        return (int) this.A02.arr[C18240wQ.A1Z().length + (i * AnonymousClass006.A00(4).length) + 1];
    }

    public final int getHeight() {
        return (int) this.A02.arr[1];
    }

    public final int getWidth() {
        return (int) this.A02.arr[0];
    }

    public C127347gy(LayoutOutput layoutOutput, M5L m5l, int i, int i2) {
        this.A02 = layoutOutput;
        this.A03 = m5l;
        this.A01 = i;
        this.A00 = i2;
    }
}
