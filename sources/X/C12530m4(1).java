package X;

import android.content.Intent;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0m4  reason: invalid class name and case insensitive filesystem */
public final class C12530m4 {
    public final C10590ib A00;
    public final C10590ib A01;
    public final C10590ib A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06;
    public final Set A07;
    public final Set A08;
    public final Set A09;
    public final C10590ib A0A;
    public final Map A0B;

    public C12530m4(C10590ib r4, C10590ib r5, C10590ib r6, C10590ib r7, Map map, Map map2, Set set, Set set2, Set set3) {
        this.A05 = "com.facebook.services";
        this.A04 = "com.facebook.services.dev";
        this.A03 = "com.facebook.oxygen.services.fbns.PreloadedFbnsService";
        this.A08 = set2;
        this.A06 = map;
        this.A07 = set;
        this.A0B = map2;
        this.A0A = r4;
        this.A01 = r7;
        this.A00 = r5;
        this.A02 = r6;
        this.A09 = set3;
    }

    public final C13660o5 A00(Intent intent, C13160n8 r4) {
        Object obj = this.A0A.A00;
        if (obj != null) {
            C14480pU r0 = (C14480pU) ((C12500m1) obj).A00.get(0);
            r0.getClass();
            r0.A01 = r4;
            r0.A00 = intent;
            return r0.A00();
        }
        throw new RuntimeException("IntentConfigProvider not bound in Fbns Config Manager");
    }

    public final C13660o5 A01(Intent intent, C13160n8 r4) {
        Object obj = this.A0A.A00;
        if (obj != null) {
            C14480pU r0 = (C14480pU) ((C12500m1) obj).A00.get(0);
            r0.getClass();
            r0.A01 = r4;
            r0.A00 = intent;
            return r0.A00();
        }
        throw new RuntimeException("IntentConfigProvider not bound in Fbns Config Manager");
    }

    public C12530m4() {
    }
}
