package com.facebook.redex;

import X.AnonymousClass265;
import X.AnonymousClass356;
import X.C07530bf;
import X.C21800C0z;
import X.C551031t;
import X.C82664q4;
import X.C84484tD;
import androidx.fragment.app.Fragment;

public class IDxDCallbackShape21S0500000_1_I2 implements C82664q4 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public final /* bridge */ /* synthetic */ void BrJ(Object obj) {
        Object obj2 = obj;
        if (this.A05 != 0) {
            AnonymousClass356 r3 = (AnonymousClass356) obj2;
            C551031t.A00 = r3;
            C07530bf r4 = (C07530bf) this.A03;
            ((C84484tD) this.A00).BNQ((Fragment) this.A01, (C21800C0z) this.A02, r3, r4, (AnonymousClass265) this.A04);
            return;
        }
        AnonymousClass356 r32 = (AnonymousClass356) obj2;
        C551031t.A00 = r32;
        C07530bf r42 = (C07530bf) this.A03;
        ((C84484tD) this.A00).BNd((Fragment) this.A01, (C21800C0z) this.A02, r32, r42, (AnonymousClass265) this.A04);
    }

    public IDxDCallbackShape21S0500000_1_I2(Fragment fragment, C21800C0z c0z, C84484tD r3, C07530bf r4, AnonymousClass265 r5, int i) {
        this.A05 = i;
        this.A00 = r3;
        this.A01 = fragment;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = c0z;
    }
}
