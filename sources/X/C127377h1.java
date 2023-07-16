package X;

import android.view.View;

/* renamed from: X.7h1  reason: invalid class name and case insensitive filesystem */
public final class C127377h1 implements C41822MeD {
    public final int A00;
    public final int A01;
    public final int A02;
    public final M5L A03;
    public final Object A04;
    public final int A05;

    public static C127377h1 A00(View view, M5L m5l, int i, int i2) {
        view.measure(i, i2);
        return new C127377h1(m5l, i, i2, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final int AXU() {
        return 0;
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

    public static C127377h1 A01(M5L m5l, int i, int i2, int i3, int i4) {
        return new C127377h1(m5l, i, i2, i3, i4);
    }

    public final C41822MeD AXN(int i) {
        throw C18190wL.A0a("A MountableLayoutResult has no children");
    }

    public final int Aml() {
        return this.A00;
    }

    public final Object Are() {
        return this.A04;
    }

    public final M5L B6z() {
        return this.A03;
    }

    public final int BMC() {
        return this.A02;
    }

    public final int BMT(int i) {
        throw C18190wL.A0a("A MountableLayoutResult has no children");
    }

    public final int BMi(int i) {
        throw C18190wL.A0a("A MountableLayoutResult has no children");
    }

    public final int getHeight() {
        return this.A05;
    }

    public final int getWidth() {
        return this.A01;
    }

    public C127377h1(M5L m5l, Object obj, int i, int i2, int i3, int i4) {
        this.A03 = m5l;
        this.A01 = i3;
        this.A05 = i4;
        this.A02 = i;
        this.A00 = i2;
        this.A04 = obj;
    }

    public C127377h1(M5L m5l, int i, int i2, int i3, int i4) {
        this(m5l, (Object) null, i, i2, i3, i4);
    }
}
