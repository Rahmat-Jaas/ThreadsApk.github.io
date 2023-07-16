package X;

import com.facebook.endtoend.EndToEnd;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S1210000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7eE  reason: invalid class name and case insensitive filesystem */
public final class C125887eE implements C143318gW {
    public final C1199677v A00;

    public final void BiS(AnonymousClass68S r17, C143308gV r18, String str) {
        String str2;
        String str3;
        QuickPerformanceLogger quickPerformanceLogger;
        int i;
        String str4;
        C143308gV r0 = r18;
        AnonymousClass68S r5 = r17;
        switch (r0.AgJ().intValue()) {
            case 0:
                C1199677v r02 = this.A00;
                r02.A00.markerStart(C1199677v.A00(r02, r5), 0, false);
                return;
            case 1:
                C1199677v r03 = this.A00;
                r03.A00.markerEnd(C1199677v.A00(r03, r5), 0, 2);
                return;
            case 2:
                AnonymousClass5KB r04 = (AnonymousClass5KB) r0;
                C1199677v r7 = this.A00;
                Exception exc = r04.A00;
                String str5 = r04.A01;
                Throwable cause = exc.getCause();
                if ((cause == null || (str2 = cause.getMessage()) == null) && (str2 = exc.getMessage()) == null) {
                    str2 = "failure_reason_unknown";
                }
                List A07 = C81074n3.A07(exc.toString(), ":", 0);
                if (C18190wL.A1a(A07)) {
                    String A0q = C18190wL.A0q(A07, 0);
                    C04220Ms.A0B(A0q, 2);
                    r7.A00.markerAnnotate(C1199677v.A00(r7, r5), 0, "failure_exception_type", A0q);
                }
                r7.A01(r5, str2, str5);
                return;
            case 3:
                AnonymousClass5KC r05 = (AnonymousClass5KC) r0;
                this.A00.A01(r5, r05.A01, r05.A00);
                return;
            case 4:
                KtCSuperShape1S2110000_I2 ktCSuperShape1S2110000_I2 = (KtCSuperShape1S2110000_I2) r0;
                C1199677v r4 = this.A00;
                String str6 = ktCSuperShape1S2110000_I2.A02;
                String str7 = ktCSuperShape1S2110000_I2.A01;
                boolean z = ktCSuperShape1S2110000_I2.A03;
                C04220Ms.A0B(str6, 1);
                if (!z || EndToEnd.isRunningEndToEndTest() || r4.A01) {
                    r4.A00.markerPoint(C1199677v.A00(r4, r5), 0, str6, str7);
                    return;
                }
                return;
            case 6:
                KtCSuperShape1S2110000_I2 ktCSuperShape1S2110000_I22 = (KtCSuperShape1S2110000_I2) r0;
                C1199677v r42 = this.A00;
                String str8 = ktCSuperShape1S2110000_I22.A02;
                String str9 = ktCSuperShape1S2110000_I22.A01;
                boolean z2 = ktCSuperShape1S2110000_I22.A03;
                C04220Ms.A0B(str8, 1);
                if (!z2 || EndToEnd.isRunningEndToEndTest() || r42.A01) {
                    r42.A00.markerAnnotate(C1199677v.A00(r42, r5), 0, str8, str9);
                    return;
                }
                return;
            case 7:
                KtCSuperShape1S1210000_I2 ktCSuperShape1S1210000_I2 = (KtCSuperShape1S1210000_I2) r0;
                C1199677v r3 = this.A00;
                String str10 = ktCSuperShape1S1210000_I2.A02;
                Map map = (Map) ktCSuperShape1S1210000_I2.A01;
                C04220Ms.A0B(str10, 1);
                if (EndToEnd.isRunningEndToEndTest() || r3.A01) {
                    AnonymousClass0WQ r11 = new AnonymousClass0WQ();
                    if (map != null) {
                        Iterator A0z = AnonymousClass0wJ.A0z(map);
                        while (A0z.hasNext()) {
                            Map.Entry A0o = C18180wK.A0o(A0z);
                            r11.A00(C18200wM.A0p(A0o), C18230wP.A0u(A0o), 1);
                        }
                    }
                    r3.A00.markerPoint(C1199677v.A00(r3, r5), 0, 7, str10, r11, 0, TimeUnit.MILLISECONDS, 0);
                    return;
                }
                r3.A00.markerPoint(C1199677v.A00(r3, r5), 0, str10);
                return;
            case 8:
                KtCSuperShape1S1210000_I2 ktCSuperShape1S1210000_I22 = (KtCSuperShape1S1210000_I2) r0;
                C1199677v r2 = this.A00;
                str3 = ktCSuperShape1S1210000_I22.A02;
                Map map2 = (Map) ktCSuperShape1S1210000_I22.A01;
                AnonymousClass0wJ.A1M(str3, 1, map2);
                if (EndToEnd.isRunningEndToEndTest() || r2.A01) {
                    quickPerformanceLogger = r2.A00;
                    i = C1199677v.A00(r2, r5);
                    HashMap A0y = AnonymousClass0wJ.A0y();
                    Set entrySet = map2.entrySet();
                    ArrayList A0w = AnonymousClass0wJ.A0w(entrySet);
                    Iterator it = entrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry A0o2 = C18180wK.A0o(it);
                        A0w.add(C18180wK.A0p(A0o2.getKey(), A0o2.getValue().toString()));
                    }
                    AnonymousClass4WJ.A0J(A0w, A0y);
                    str4 = C18190wL.A0n(A0y);
                    break;
                } else {
                    return;
                }
            case 9:
                KtCSuperShape1S1210000_I2 ktCSuperShape1S1210000_I23 = (KtCSuperShape1S1210000_I2) r0;
                C1199677v r22 = this.A00;
                str3 = ktCSuperShape1S1210000_I23.A02;
                Object obj = ktCSuperShape1S1210000_I23.A01;
                AnonymousClass0wJ.A1M(str3, 1, obj);
                if (EndToEnd.isRunningEndToEndTest() || r22.A01) {
                    quickPerformanceLogger = r22.A00;
                    i = C1199677v.A00(r22, r5);
                    str4 = obj.toString();
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        quickPerformanceLogger.markerAnnotate(i, 0, str3, str4);
    }

    public C125887eE(C1199677v r1) {
        this.A00 = r1;
    }
}
