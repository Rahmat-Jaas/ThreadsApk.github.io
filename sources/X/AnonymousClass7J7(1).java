package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.7J7  reason: invalid class name */
public final class AnonymousClass7J7 {
    public final LmH A00;
    public final C143468gn A01;
    public final AnonymousClass7Di A02;
    public final Object A03;

    public static AnonymousClass7J7 A01(Context context, AnonymousClass7J7 r7, C143478go r8, Object obj, int i, int i2, int i3) {
        AnonymousClass7J7 A032;
        C41228M0s.A01("RC Create Tree");
        Pair Cem = r8.Cem((C143468gn) null, new C107206gM(new C127877hr(), obj), (Object) null, Collections.emptyList());
        if (A04((C143468gn) Cem.first, r7, i2, i3)) {
            AnonymousClass7Di r4 = r7.A02;
            A032 = new AnonymousClass7J7(r7.A00, (C143468gn) Cem.first, r4, Cem.second);
        } else {
            A032 = A03(A00(context, r7, obj, (M4z[]) null, i), (C143468gn) Cem.first, Cem.second, i2, i3);
        }
        C41228M0s.A00();
        return A032;
    }

    public static boolean A04(C143468gn r5, AnonymousClass7J7 r6, int i, int i2) {
        AnonymousClass7Di r3;
        if (r6 == null || (r3 = r6.A02) == null || r5 != r6.A01) {
            return false;
        }
        int i3 = r3.A02;
        Rect rect = r3.A04.A04;
        return AnonymousClass7I7.A02(i3, i, rect.width()) && AnonymousClass7I7.A02(r3.A00, i2, rect.height());
    }

    public static C112976qV A00(Context context, AnonymousClass7J7 r2, Object obj, M4z[] m4zArr, int i) {
        LmH lmH;
        if (r2 == null || (lmH = r2.A00) == null) {
            lmH = null;
        }
        return new C112976qV(context, new C41190Lyh(lmH), obj, m4zArr, i);
    }

    public static AnonymousClass7J7 A02(C112976qV r18, C41822MeD meD, C143468gn r20, Object obj, int i, int i2) {
        ArrayList arrayList;
        int length;
        C112976qV r3 = r18;
        Context context = r3.A04;
        M4z[] m4zArr = r3.A06;
        C41228M0s.A01("Reducer.reduceTree");
        if (m4zArr == null || (length = m4zArr.length) == 0) {
            arrayList = null;
        } else {
            arrayList = C18240wQ.A0k(length);
            int i3 = 0;
            do {
                arrayList.add(new Pair(m4zArr[i3], new MH4()));
                i3++;
            } while (i3 < length);
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C41822MeD meD2 = meD;
        Rect rect = new Rect(0, 0, meD2.getWidth(), meD2.getHeight());
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        RenderTreeNode A002 = M2L.A00(rect, meD2, (RenderTreeNode) null, M2L.A00);
        A0v.add(A002);
        M2L.A01(context, meD2, A002, A0v, arrayList, 0, 0);
        C41228M0s.A00();
        return new AnonymousClass7J7(r3.A00().A01, r20, new AnonymousClass7Di(A002, arrayList, (RenderTreeNode[]) A0v.toArray(new RenderTreeNode[A0v.size()]), i, i2, -1), obj);
    }

    public static AnonymousClass7J7 A03(C112976qV r3, C143468gn r4, Object obj, int i, int i2) {
        C41228M0s.A01("RC Layout");
        C112976qV r2 = r3;
        C41822MeD ABY = r4.ABY(r3, i, i2);
        C41228M0s.A00();
        C41228M0s.A01("RC Reduce");
        AnonymousClass7J7 A022 = A02(r2, ABY, r4, obj, i, i2);
        C41228M0s.A00();
        r2.A01 = null;
        return A022;
    }

    public AnonymousClass7J7(LmH lmH, C143468gn r2, AnonymousClass7Di r3, Object obj) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = lmH;
        this.A03 = obj;
    }
}
