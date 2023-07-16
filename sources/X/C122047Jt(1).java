package X;

import android.app.Application;
import android.content.Context;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.lispy.lang.BloksScript;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7Jt  reason: invalid class name and case insensitive filesystem */
public final class C122047Jt {
    public static AnonymousClass601 A01(AnonymousClass3HX r11, AnonymousClass7A1 r12, List list) {
        AnonymousClass3HX r3 = r11;
        C83454rP r1 = r11.A02;
        SparseArray sparseArray = r11.A01;
        C82414pa r7 = (C82414pa) sparseArray.get(R.id.bk_context_key_interpreter_extensions);
        if (r7 == null) {
            r7 = AnonymousClass794.A00().A0C;
        }
        C1197476t ATb = r1.ATb();
        return new AnonymousClass601(ATb.A01, r3, r12, ATb.A05, (BloksScript) null, r7, AnonymousClass006.A0C, (String) sparseArray.get(R.id.bk_context_key_logging_id), (String) null, list, (Map) null, (Set) null);
    }

    public static Object A02(Context context, C61323St r5, C83454rP r6, C63893iY r7, Map map) {
        AnonymousClass7HV r3 = new AnonymousClass7HV(new C121997Jj((AnonymousClass2LD) null, r5.A01, new C127397h3(-1), (String) null), AnonymousClass73X.A00, AnonymousClass7r6.A00);
        if (context instanceof Application) {
            C30967GcS.A02("BloksInterpreterHelper", "Creating BloksContext with Application Context. This may break the ability to execute navigation actions correctly");
        }
        AnonymousClass3HX A00 = AnonymousClass7K7.A00(context, C86154wM.A0D(), r3, r6, r5.A03);
        r3.A02(A00, new C130647qQ(), Collections.emptyMap());
        return C61043Rr.A00(A00(r5, A00, map), r7, r5.A02);
    }

    public static void A05(MotionEvent motionEvent, AnonymousClass509 r8, C109326jp r9) {
        C127397h3 r6 = r8.A08;
        AnonymousClass3VO r5 = new AnonymousClass3VO();
        r5.A02(r8.A07, 0);
        AnonymousClass3HX r4 = r8.A06;
        r5.A02(r4, 1);
        float x = motionEvent.getX();
        View view = r8.A04;
        r5.A02(Float.valueOf(x - view.getX()), 2);
        r5.A02(Float.valueOf(motionEvent.getY() - view.getY()), 3);
        A03(r4, r6, r5.A01(), r9);
    }

    public static void A06(C61323St r7, AnonymousClass601 r8, C109326jp r9, C109326jp r10, Map map) {
        AnonymousClass7EF r5;
        AnonymousClass7EF r6 = null;
        if (r9 == null) {
            r5 = null;
        } else {
            r5 = new AnonymousClass7EF(r8, r9);
        }
        if (r10 != null) {
            r6 = new AnonymousClass7EF(r8, r10);
        }
        AnonymousClass3HX r4 = r8.A00;
        if (r4 == null) {
            C30967GcS.A02("BloksAsyncAction", "Async action executed with a null Context");
            return;
        }
        AnonymousClass601 A00 = A00(r7, r4, map);
        C109326jp r1 = r7.A02;
        if (r1 != null) {
            Object A002 = C61043Rr.A00(A00, C86104wH.A0W(r4), r1);
            if (r5 != null) {
                AnonymousClass3VO A003 = AnonymousClass3VO.A00();
                A003.A02(A002, 0);
                r5.A00((AnonymousClass601) null, C86154wM.A0R(A003, r4, 1));
            }
        } else if (r6 != null) {
            r6.A00((AnonymousClass601) null, C86104wH.A0W(r4));
        }
    }

    public static AnonymousClass601 A00(C61323St r5, AnonymousClass3HX r6, Map map) {
        AnonymousClass76s r52 = r5.A01;
        AnonymousClass7K7.A01(r6).A07(new C121997Jj((AnonymousClass2LD) null, r52, new C127397h3(-1), (String) null), C121997Jj.A04(r52.A02, map));
        return AnonymousClass601.A00(r6, (BloksScript) null, (List) null);
    }

    public static Object A03(AnonymousClass3HX r2, C127397h3 r3, C63893iY r4, C109326jp r5) {
        return C61043Rr.A00(AnonymousClass601.A00(r2, r5.A01, r3.A07), r4, r5);
    }

    public static Object A04(C83454rP r3, C63893iY r4, C109326jp r5, String str) {
        return C61043Rr.A00(AnonymousClass601.A00(AnonymousClass7K7.A00(C18230wP.A08(), C86154wM.A0D(), (AnonymousClass7HV) null, r3, str), r5.A01, (List) null), r4, r5);
    }

    public static void A07(AnonymousClass3HX r1, C127397h3 r2, AnonymousClass3VO r3, C109326jp r4) {
        A03(r1, r2, r3.A01(), r4);
    }
}
