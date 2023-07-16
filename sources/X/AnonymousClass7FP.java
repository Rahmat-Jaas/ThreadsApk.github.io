package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7FP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7FP {
    public static int A00(C147838q0 r6, C146288ly r7, List list, int i) {
        AnonymousClass0wJ.A1O(r6, list);
        ArrayList A0t = C18200wM.A0t(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Integer num = AnonymousClass006.A01;
            A0t.add(new C123467Xa((C147148nT) list.get(i2), num, num));
        }
        return r7.Bg2(C147838q0.A00(r6), A0t, AnonymousClass7JT.A01(i)).getHeight();
    }

    public static int A01(C147838q0 r7, C146288ly r8, List list, int i) {
        AnonymousClass0wJ.A1O(r7, list);
        ArrayList A0t = C18200wM.A0t(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A0t.add(new C123467Xa((C147148nT) list.get(i2), AnonymousClass006.A01, AnonymousClass006.A00));
        }
        return r8.Bg2(C147838q0.A00(r7), A0t, AnonymousClass7JT.A00(i)).getWidth();
    }

    public static int A02(C147838q0 r7, C146288ly r8, List list, int i) {
        AnonymousClass0wJ.A1O(r7, list);
        ArrayList A0t = C18200wM.A0t(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A0t.add(new C123467Xa((C147148nT) list.get(i2), AnonymousClass006.A00, AnonymousClass006.A01));
        }
        return r8.Bg2(C147838q0.A00(r7), A0t, AnonymousClass7JT.A01(i)).getHeight();
    }

    public static int A03(C147838q0 r6, C146288ly r7, List list, int i) {
        AnonymousClass0wJ.A1O(r6, list);
        ArrayList A0t = C18200wM.A0t(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Integer num = AnonymousClass006.A00;
            A0t.add(new C123467Xa((C147148nT) list.get(i2), num, num));
        }
        return r7.Bg2(C147838q0.A00(r6), A0t, AnonymousClass7JT.A00(i)).getWidth();
    }
}
