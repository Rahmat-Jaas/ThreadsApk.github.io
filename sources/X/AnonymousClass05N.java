package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.05N  reason: invalid class name */
public final class AnonymousClass05N {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Fragment A05;
    public AnonymousClass061 A06;
    public AnonymousClass061 A07;
    public boolean A08;

    public AnonymousClass05N(Fragment fragment, int i, boolean z) {
        this.A00 = i;
        this.A05 = fragment;
        this.A08 = true;
        AnonymousClass061 r0 = AnonymousClass061.RESUMED;
        this.A07 = r0;
        this.A06 = r0;
    }

    public AnonymousClass05N(Fragment fragment, AnonymousClass061 r3) {
        this.A00 = 10;
        this.A05 = fragment;
        this.A08 = false;
        this.A07 = fragment.mMaxState;
        this.A06 = r3;
    }

    public AnonymousClass05N(Fragment fragment, int i) {
        this.A00 = i;
        this.A05 = fragment;
        this.A08 = false;
        AnonymousClass061 r0 = AnonymousClass061.RESUMED;
        this.A07 = r0;
        this.A06 = r0;
    }

    public AnonymousClass05N() {
    }
}
