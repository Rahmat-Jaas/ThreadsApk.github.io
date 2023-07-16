package X;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3ic  reason: invalid class name and case insensitive filesystem */
public final class C63913ic {
    public static final Fragment A00(AnonymousClass3HX r1) {
        C04220Ms.A0B(r1, 0);
        return (Fragment) r1.A00(R.id.bloks_ig_fragment);
    }

    public static final Fragment A02(AnonymousClass601 r1) {
        C04220Ms.A0B(r1, 0);
        return A01(r1);
    }

    public static final FragmentActivity A04(AnonymousClass3HX r1) {
        C04220Ms.A0B(r1, 0);
        return (FragmentActivity) r1.A00(R.id.bloks_ig_fragment_activity);
    }

    public static final FragmentActivity A06(AnonymousClass601 r1) {
        C04220Ms.A0B(r1, 0);
        return A05(r1);
    }

    public static final C11630kW A09(AnonymousClass3HX r1) {
        C04220Ms.A0B(r1, 0);
        return (C11630kW) r1.A00(R.id.bloks_ig_analytics_module);
    }

    public static final C11630kW A0B(AnonymousClass601 r1) {
        C04220Ms.A0B(r1, 0);
        return A0A(r1);
    }

    public static AnonymousClass3HX A0C(AnonymousClass601 r1) {
        C04220Ms.A0B(r1, 0);
        return A0D(r1);
    }

    public static final AnonymousClass3HX A0D(AnonymousClass601 r1) {
        C04220Ms.A0B(r1, 0);
        AnonymousClass3HX r0 = r1.A00;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final C10300i6 A0E(AnonymousClass3HX r1) {
        C04220Ms.A0B(r1, 0);
        return (C10300i6) r1.A00(R.id.bloks_ig_session);
    }

    public static final C10300i6 A0G(AnonymousClass601 r1) {
        C04220Ms.A0B(r1, 0);
        return A0F(r1);
    }

    public static final C30938GbW A0I(AnonymousClass3HX r2) {
        C04220Ms.A0B(r2, 0);
        return (C30938GbW) r2.A01.get(R.id.bloks_viewpoint_manager);
    }

    public static final Object A0K(AnonymousClass601 r6, C109326jp r7, Object... objArr) {
        int i = 0;
        C04220Ms.A0B(r6, 0);
        if (r7 == null) {
            return null;
        }
        AnonymousClass3VO A00 = AnonymousClass3VO.A00();
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            i++;
            A00.A03(objArr[i2], i3);
            i2++;
            i3 = i;
        }
        return C61043Rr.A00(r6, new C63893iY(A00.A00), r7);
    }

    public static final String A0M(Object obj) {
        C04220Ms.A0B(obj, 0);
        if ((obj instanceof Number) || !(obj instanceof Boolean)) {
            return obj.toString();
        }
        if (AnonymousClass0wJ.A1X(obj)) {
            return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        return "0";
    }

    public static final HashMap A0N(Map map) {
        String A0M;
        C04220Ms.A0B(map, 0);
        HashMap A0y = AnonymousClass0wJ.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object key = A0o.getKey();
            Object value = A0o.getValue();
            String A0M2 = A0M(key);
            if (value == null) {
                A0M = null;
            } else {
                A0M = A0M(value);
            }
            A0y.put(A0M2, A0M);
        }
        return A0y;
    }

    public static Fragment A01(AnonymousClass601 r0) {
        return A00(A0D(r0));
    }

    public static final Fragment A03(AnonymousClass601 r1) {
        return (Fragment) A0C(r1).A01.get(R.id.bloks_ig_fragment);
    }

    public static FragmentActivity A05(AnonymousClass601 r0) {
        return A04(A0D(r0));
    }

    public static final C12560m7 A07(AnonymousClass601 r1) {
        return (C12560m7) A0C(r1).A00(R.id.bloks_ig_fragment_manager);
    }

    public static final C130667qT A08(AnonymousClass601 r0) {
        return (C130667qT) A0C(r0).A02;
    }

    public static C11630kW A0A(AnonymousClass601 r0) {
        return A09(A0D(r0));
    }

    public static C10300i6 A0F(AnonymousClass601 r0) {
        return A0E(A0D(r0));
    }

    public static final C145538kf A0H(AnonymousClass601 r1) {
        return (C145538kf) A0C(r1).A00(R.id.bloks_ig_scheduler);
    }

    public static UserSession A0J(AnonymousClass601 r0) {
        return C05030Qo.A02(A0G(r0));
    }

    public static final Object A0L(AnonymousClass601 r1, Class cls, int i) {
        return cls.cast(((SparseArray) A0C(r1).A00(R.id.bloks_ig_object_store_deprecated)).get(i));
    }

    public static final void A0O(AnonymousClass3HX r1, C21800C0z c0z) {
        AnonymousClass0wJ.A1N(r1, c0z);
        Fragment A00 = A00(r1);
        C04220Ms.A0C(A00, "null cannot be cast to non-null type com.instagram.common.fragment.lifecyclelistener.FragmentLifecycleListenable");
        ((C83474rR) A00).registerLifecycleListener(c0z);
    }

    public static final void A0P(AnonymousClass3HX r1, C21800C0z c0z) {
        AnonymousClass0wJ.A1N(r1, c0z);
        Fragment A00 = A00(r1);
        C04220Ms.A0C(A00, "null cannot be cast to non-null type com.instagram.common.fragment.lifecyclelistener.FragmentLifecycleListenable");
        ((C83474rR) A00).unregisterLifecycleListener(c0z);
    }

    public static final void A0Q(AnonymousClass601 r0, C21800C0z c0z) {
        A0O(A0C(r0), c0z);
    }

    public static final void A0R(AnonymousClass601 r0, C21800C0z c0z) {
        A0P(A0C(r0), c0z);
    }
}
