package X;

import android.util.SparseArray;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* renamed from: X.3gz  reason: invalid class name and case insensitive filesystem */
public class C63203gz {
    public static IllegalArgumentException A02(Object obj, Object obj2, Map map) {
        AnonymousClass4WJ.A0E(map);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.bloks_ig_session, obj);
        sparseArray.put(R.id.bloks_ig_use_prelogin_json_parser, false);
        C04220Ms.A06(sparseArray.clone());
        C04220Ms.A0B(obj2, 0);
        return new IllegalArgumentException(String.format("No implementation bound to key: %s", new Object[]{1}));
    }

    public static HashMap A03(Object obj, Object obj2) {
        return AnonymousClass4WJ.A09(new Pair(obj, obj2));
    }

    public static Map A04(Object obj) {
        Pair pair = new Pair("ig_container_module", obj);
        Locale locale = Locale.US;
        C04220Ms.A08(locale);
        String lowerCase = "IG_OPEN_SUPPORT_INBOX".toLowerCase(locale);
        C04220Ms.A06(lowerCase);
        Pair pair2 = new Pair("trigger_event_type", lowerCase);
        String obj2 = C03480Iw.A00().toString();
        C04220Ms.A06(obj2);
        return AnonymousClass4WJ.A0I(pair, pair2, new Pair("trigger_session_id", obj2), new Pair("ixt_initial_screen_id", C03480Iw.A00().toString()));
    }

    public static final Map A05(Map map, AnonymousClass0YY r2) {
        if (map instanceof C73714Tp) {
            return A05(((C73714Tp) map).A00, r2);
        }
        return new C73714Tp(map, r2);
    }

    public static int A00(Object obj, AbstractCollection abstractCollection, Iterator it, List list, int i) {
        AnonymousClass3VA r1 = ((AnonymousClass3H2) it.next()).A01;
        String str = r1.A01.A02;
        list.add(AnonymousClass4WJ.A0H(new Pair(FXPFAccessLibraryDebugFragment.UID, str), new Pair("credential_type", obj), new Pair("token", r1.A00)));
        int i2 = i + 1;
        abstractCollection.add(C62623aQ.A00(str));
        return i2;
    }

    public static int A01(Object obj, AbstractCollection abstractCollection, Iterator it, List list, int i) {
        Pair pair = new Pair("account_type", "");
        AnonymousClass3VA r1 = ((AnonymousClass3H2) it.next()).A01;
        String str = r1.A01.A02;
        list.add(AnonymousClass4WJ.A0H(pair, new Pair(FXPFAccessLibraryDebugFragment.UID, str), new Pair("credential_type", obj), new Pair("token", r1.A00)));
        int i2 = i + 1;
        abstractCollection.add(C62623aQ.A00(str));
        return i2;
    }
}
