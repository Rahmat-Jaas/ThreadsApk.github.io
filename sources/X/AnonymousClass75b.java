package X;

import java.util.Iterator;

/* renamed from: X.75b  reason: invalid class name */
public final class AnonymousClass75b {
    public final AnonymousClass84D A00 = new AnonymousClass84D();
    public final AnonymousClass84D A01 = new AnonymousClass84D();

    public static /* synthetic */ Object A00(AnonymousClass75b r12, Integer num, Integer num2, Integer num3, String str, String str2, String str3, C146958n9 r19, int i) {
        AnonymousClass84D r3;
        Object obj;
        String str4 = str3;
        Integer num4 = num2;
        Integer num5 = num;
        String str5 = str2;
        if ((i & 2) != 0) {
            str5 = null;
        }
        if ((i & 4) != 0) {
            num5 = null;
        }
        if ((i & 8) != 0) {
            num4 = AnonymousClass006.A01;
        }
        if ((i & 16) != 0) {
            num3 = AnonymousClass006.A01;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        C27420EnC enC = new C27420EnC(1, C25598DoY.A02(r19));
        enC.A0D();
        C110696m7 r5 = new C110696m7(num5, num4, str, str5, str4, enC);
        int intValue = num3.intValue();
        if (intValue == 0) {
            r3 = r12.A01;
        } else if (intValue == 1) {
            r3 = r12.A00;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        if (str4 != null) {
            Iterator it = r3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C04220Ms.A0I(((C110696m7) obj).A04, str4)) {
                    break;
                }
            }
            C110696m7 r1 = (C110696m7) obj;
            if (r1 != null) {
                r12.A01.remove((Object) r1);
                r12.A00.remove((Object) r1);
                AnonymousClass8s9 r13 = r1.A05;
                if (((C27420EnC) r13)._state instanceof C142598fH) {
                    r13.AC9((Throwable) null);
                }
            }
        }
        r3.add(r5);
        return enC.A0B();
    }
}
