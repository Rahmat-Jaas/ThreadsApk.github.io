package com.facebook.redex;

import X.AnonymousClass395;
import X.C41836MeS;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.Map;
import java.util.Set;

public class IDxPredicateShape214S0200000_1_I2 implements C41836MeS {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxPredicateShape214S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        if (2 - this.A02 != 0) {
            return ((AnonymousClass395) obj).A01.equals(((AnonymousClass395) this.A01).A01);
        }
        return !((Set) this.A01).contains(((Map) obj).get(FXPFAccessLibraryDebugFragment.UID));
    }
}
