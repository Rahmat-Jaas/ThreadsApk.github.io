package X;

import com.instagram.barcelona.R;
import com.instagram.common.lispy.lang.BloksScript;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6G6  reason: invalid class name */
public final class AnonymousClass6G6 {
    public static final Object A00(AnonymousClass601 r17, C63893iY r18) {
        Integer num;
        Map map;
        String A0o;
        AnonymousClass601 r1 = r17;
        C63893iY r3 = r18;
        boolean A1Z = AnonymousClass0wJ.A1Z(r3, r1);
        Object A0B = C63893iY.A0B(r3, 0);
        A0B.getClass();
        C18240wQ.A1I(A0B);
        C63893iY.A0B(r3, A1Z ? 1 : 0).getClass();
        ((Number) C63893iY.A0A(r3, 2)).longValue();
        Object A0B2 = C63893iY.A0B(r3, 3);
        A0B2.getClass();
        C127397h3 r32 = (C127397h3) A0B2;
        if (r32 == null || (A0o = C18230wP.A0o(r32)) == null) {
            num = null;
        } else {
            String A0u = C18220wO.A0u(Locale.ROOT, A0o);
            if (A0u.equals("PARALLEL_FETCH")) {
                num = AnonymousClass006.A00;
            } else if (A0u.equals("PREFETCH")) {
                num = AnonymousClass006.A01;
            } else if (A0u.equals("FETCH")) {
                num = AnonymousClass006.A0C;
            } else if (A0u.equals("HOISTED_PREFETCH")) {
                num = AnonymousClass006.A0N;
            } else {
                throw C18190wL.A0a(A0u);
            }
        }
        C04220Ms.A0C(num, "null cannot be cast to non-null type com.instagram.common.bloks.componentquery.BloksComponentQueryStore.BloksAsyncComponentQueryPurpose");
        r32.A0T(41, false);
        C109326jp A0L = r32.A0L(42);
        r32.A0T(40, false);
        if (A0L != null) {
            map = (Map) AnonymousClass70N.A00(C63893iY.A01, r1, A0L);
        } else {
            map = null;
        }
        AnonymousClass3HX r8 = r1.A00;
        if (r8 != null) {
            AnonymousClass7A1 r0 = r1.A01;
            if (r0 == null) {
                r0 = new AnonymousClass7A1();
            }
            if (map == null) {
                map = AnonymousClass4WJ.A0A();
            }
            AnonymousClass7A1 A00 = r0.A00(map);
            BloksScript bloksScript = r1.A03;
            List list = r1.A04;
            Map map2 = r1.A07;
            Set set = r1.A08;
            C82414pa r12 = r1.A02;
            C131627sW r2 = new AnonymousClass601(r1.A01, r8, A00, r1.A02, bloksScript, r12, r1.A04, r1.A06, r1.A05, list, map2, set).A03;
            CopyOnWriteArraySet copyOnWriteArraySet = r1.A03.A00;
            if (!copyOnWriteArraySet.isEmpty()) {
                r2.A00.addAll(copyOnWriteArraySet);
            }
            ((C144548ig) r8.A00(R.id.bk_context_key_async_component_store_provider)).get();
        }
        return null;
    }
}
