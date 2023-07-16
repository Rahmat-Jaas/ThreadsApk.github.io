package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000100_I2;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6ut  reason: invalid class name and case insensitive filesystem */
public final class C115336ut {
    public long A00;
    public final int A01;
    public final List A02;
    public final ConcurrentMap A03 = new ConcurrentHashMap();
    public final C09810gi A04 = C09820gj.A00;
    public final UserSession A05;

    public final void A00(String str, String str2) {
        ConcurrentMap concurrentMap = this.A03;
        if (str2 == null) {
            str2 = "";
        }
        concurrentMap.put(str, str2);
    }

    public final void A01(String str, String str2) {
        this.A02.add(new KtCSuperShape0S2000100_I2(3, str, str2, System.currentTimeMillis()));
    }

    public C115336ut(UserSession userSession, int i) {
        this.A01 = i;
        this.A05 = userSession;
        List synchronizedList = Collections.synchronizedList(AnonymousClass0wJ.A0v());
        C04220Ms.A06(synchronizedList);
        this.A02 = synchronizedList;
    }

    public final void A02(short s) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.A00) {
            C10450iM.A07("QplSession", new RuntimeException());
            return;
        }
        AnonymousClass01V r3 = AnonymousClass01V.A0p;
        C04220Ms.A06(r3);
        int i = this.A01;
        r3.A0b(i, this.A00);
        for (KtCSuperShape0S2000100_I2 ktCSuperShape0S2000100_I2 : this.A02) {
            AnonymousClass01V r4 = AnonymousClass01V.A0p;
            C04220Ms.A06(r4);
            r4.markerPoint(i, ktCSuperShape0S2000100_I2.A02, ktCSuperShape0S2000100_I2.A01, ktCSuperShape0S2000100_I2.A00, TimeUnit.MILLISECONDS);
        }
        Iterator A0z = AnonymousClass0wJ.A0z(this.A03);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            String A0p = C18200wM.A0p(A0o);
            Object value = A0o.getValue();
            if (value instanceof String) {
                AnonymousClass01V r0 = AnonymousClass01V.A0p;
                C04220Ms.A06(r0);
                r0.markerAnnotate(i, A0p, (String) value);
            } else if (value instanceof Integer) {
                AnonymousClass01V r1 = AnonymousClass01V.A0p;
                C04220Ms.A06(r1);
                C04220Ms.A06(value);
                r1.markerAnnotate(i, A0p, AnonymousClass0wJ.A04(value));
            } else if (value instanceof Boolean) {
                AnonymousClass01V r12 = AnonymousClass01V.A0p;
                C04220Ms.A06(r12);
                C04220Ms.A06(value);
                r12.markerAnnotate(i, A0p, AnonymousClass0wJ.A1X(value));
            }
        }
        AnonymousClass01V r8 = AnonymousClass01V.A0p;
        C04220Ms.A06(r8);
        int i2 = i;
        r8.markerEnd(i2, s, currentTimeMillis, TimeUnit.MILLISECONDS);
    }
}
