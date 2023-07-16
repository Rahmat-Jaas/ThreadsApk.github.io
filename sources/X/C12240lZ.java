package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.0lZ  reason: invalid class name and case insensitive filesystem */
public final class C12240lZ implements AnonymousClass0WE {
    public final /* synthetic */ C05800Wc A00;
    public final /* synthetic */ C18070w4 A01;
    public final /* synthetic */ C02970Dp A02;
    public final /* synthetic */ String A03;

    public C12240lZ(C05800Wc r1, C18070w4 r2, C02970Dp r3, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = str;
    }

    public final void DAa(AnonymousClass0WQ r16, AnonymousClass0Jz r17, String str, int i, long j, long j2) {
        String obj;
        C18070w4 r2 = this.A01;
        long j3 = j;
        String str2 = str;
        r2.A09.put(str2, Long.valueOf(j3));
        C05800Wc r4 = this.A00;
        int markerId = r4.getMarkerId();
        String A0V = AnonymousClass00U.A0V(this.A03, ":", str2);
        long BGw = r4.BGw() + j;
        int i2 = (int) j3;
        Map emptyMap = Collections.emptyMap();
        if (r16 == null) {
            obj = null;
        } else {
            obj = r16.toString();
        }
        List asList = Arrays.asList(new String[]{"markerPointData", obj});
        List emptyList = Collections.emptyList();
        C02970Dp r0 = this.A02;
        C18070w4 r42 = new C18070w4(A0V, "", r0.A06, asList, emptyList, emptyMap, markerId, i2, BGw);
        List list = r0.A07;
        synchronized (list) {
            list.add(r42);
        }
    }
}
