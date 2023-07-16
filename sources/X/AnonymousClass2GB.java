package X;

import android.content.Context;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* renamed from: X.2GB  reason: invalid class name */
public final class AnonymousClass2GB {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        Context context;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        Iterable iterable = (Iterable) C63893iY.A0B(r10, 0);
        boolean A01 = AnonymousClass3WF.A01(r10, A1Z ? 1 : 0);
        AnonymousClass3HX r0 = r9.A00;
        if (r0 == null || (context = r0.A00) == null) {
            return AnonymousClass0wJ.A0v();
        }
        AnonymousClass3R8.A00(context);
        if (iterable != null) {
            Set A0c = AnonymousClass00J.A0c(iterable);
            ArrayList<AnonymousClass3YK> A0v = AnonymousClass0wJ.A0v();
            for (Object next : (Iterable) C60913Rb.A02.getValue()) {
                AnonymousClass3YK r5 = (AnonymousClass3YK) next;
                if ((!A01 || System.currentTimeMillis() < Long.MAX_VALUE) && AnonymousClass00J.A0k(A0c, r5.A09)) {
                    A0v.add(next);
                }
            }
            ArrayList A0w = AnonymousClass0wJ.A0w(A0v);
            for (AnonymousClass3YK r92 : A0v) {
                Pair A0p = C18180wK.A0p(FXPFAccessLibraryDebugFragment.NAME, r92.A09);
                double d = r92.A06;
                List list = r92.A07.A00;
                Pair A0p2 = C18180wK.A0p("group_size", Double.valueOf((d / ((double) list.size())) * ((double) 100)));
                HashMap A0y = AnonymousClass0wJ.A0y();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    A0y.put(Integer.valueOf(i), C61163Sd.A00(list, i));
                }
                Pair A0p3 = C18180wK.A0p("groups", A0y);
                String str = AnonymousClass3YK.A00(r92).A01;
                int size2 = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (C04220Ms.A0I(C61163Sd.A00(list, i2), str)) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                A0w.add(AnonymousClass4WJ.A09(A0p, A0p2, A0p3, C18180wK.A0p("current_group_index", Integer.valueOf(i2))));
            }
            return A0w;
        }
        ArrayList<AnonymousClass3YK> A0v2 = AnonymousClass0wJ.A0v();
        for (Object next2 : (Iterable) C60913Rb.A02.getValue()) {
            if (!A01 || System.currentTimeMillis() < Long.MAX_VALUE) {
                A0v2.add(next2);
            }
        }
        ArrayList A0w2 = AnonymousClass0wJ.A0w(A0v2);
        for (AnonymousClass3YK r02 : A0v2) {
            A0w2.add(C63203gz.A03(FXPFAccessLibraryDebugFragment.NAME, r02.A09));
        }
        return A0w2;
    }
}
