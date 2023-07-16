package X;

import android.animation.Animator;
import android.content.Context;
import android.util.SparseArray;
import com.instagram.barcelona.R;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.7K7  reason: invalid class name */
public final class AnonymousClass7K7 {
    public static final C82344pT A00 = new C130627qO();

    public static AnonymousClass3HX A00(Context context, SparseArray sparseArray, AnonymousClass7HV r7, C83454rP r8, String str) {
        SparseArray clone = r8.AFz().clone();
        for (int i = 0; i < sparseArray.size(); i++) {
            C86134wK.A1A(sparseArray, clone, i);
        }
        clone.put(R.id.bk_context_key_states, AnonymousClass0wJ.A0y());
        if (r7 == null) {
            r7 = new AnonymousClass7HV(C121997Jj.A03(new C127397h3(-1)), AnonymousClass73X.A00, AnonymousClass7r6.A00);
        }
        clone.put(R.id.bk_context_key_tree, r7);
        clone.put(R.id.bk_context_key_scoped_client_id_mapper, new C112216pC());
        clone.put(R.id.bk_context_key_animations, AnonymousClass0wJ.A0y());
        clone.put(R.id.bk_context_key_timers, AnonymousClass0wJ.A0y());
        clone.put(R.id.bk_context_key_logging_id, str);
        if (clone.get(R.id.bk_context_key_performance_logger) == null) {
            clone.put(R.id.bk_context_key_performance_logger, AnonymousClass7qZ.A00);
        }
        clone.put(R.id.bk_context_key_controller_by_server_id, Collections.synchronizedMap(AnonymousClass0wJ.A0y()));
        return new AnonymousClass3HX(context, clone, r8);
    }

    public static AnonymousClass7HV A01(AnonymousClass3HX r1) {
        return (AnonymousClass7HV) r1.A00(R.id.bk_context_key_tree);
    }

    public static C144578ij A02(AnonymousClass3HX r1, String str) {
        Map map = (Map) r1.A00(R.id.bk_context_key_data_modules);
        if (map == null) {
            return null;
        }
        return (C144578ij) map.get(str);
    }

    public static Object A03(AnonymousClass3HX r0, C127397h3 r1) {
        Object A04 = A04(r0, r1);
        A04.getClass();
        return A04;
    }

    public static Object A04(AnonymousClass3HX r3, C127397h3 r4) {
        Object A01 = r3.A01(A00, r4, R.id.bk_context_key_controller_associated_object);
        String A0M = r4.A0M();
        if (A0M != null) {
            ((Map) r3.A00(R.id.bk_context_key_controller_by_server_id)).put(A0M, A01);
        }
        return A01;
    }

    public static Object A05(AnonymousClass3HX r0, C127397h3 r1) {
        return A03(r0, r1);
    }

    public static void A06(Animator animator, AnonymousClass3HX r2) {
        ((AbstractMap) r2.A00(R.id.bk_context_key_animations)).values().remove(animator);
    }

    public static boolean A07(AnonymousClass3HX r2) {
        Boolean bool = (Boolean) r2.A01.get(R.id.bk_context_key_is_resolve_enabled_override);
        if (bool != null) {
            return bool.booleanValue();
        }
        return r2.A02.ATb().A03.A00;
    }
}
