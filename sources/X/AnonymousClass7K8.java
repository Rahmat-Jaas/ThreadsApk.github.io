package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape158S0100000_I2_13;

/* renamed from: X.7K8  reason: invalid class name */
public abstract class AnonymousClass7K8 {
    public static WeakReference A00 = C86144wL.A0w((Object) null);
    public static final Map A01 = Collections.synchronizedMap(AnonymousClass0wJ.A0y());

    public static boolean A06(Context context, String... strArr) {
        for (String checkSelfPermission : strArr) {
            if (context.checkSelfPermission(checkSelfPermission) != 0) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass7K8() {
        throw null;
    }

    public static C971568d A00(Map map, String[] strArr) {
        C971568d r5 = C971568d.GRANTED;
        for (String str : strArr) {
            C971568d r2 = (C971568d) map.get(str);
            if (r2 == null) {
                r2 = C971568d.DENIED;
            }
            C971568d r1 = C971568d.DENIED_DONT_ASK_AGAIN;
            if (r2 == r1 || (r2 == C971568d.DENIED && r5 != r1)) {
                r5 = r2;
            }
        }
        return r5;
    }

    public static boolean A04(Context context) {
        String A002;
        if (Build.VERSION.SDK_INT >= 30) {
            A002 = C18170wI.A00(801);
        } else {
            A002 = AnonymousClass000.A00(1214);
        }
        return C18180wK.A1W(context.checkSelfPermission(A002));
    }

    public static void A01(Activity activity, C144608im r6, Runnable runnable, List list, Map map) {
        C86224wh r2;
        C86224wh r3 = (C86224wh) activity.getFragmentManager().findFragmentByTag("PermissionCallback");
        if (r3 != null) {
            r2 = r3;
        } else {
            r2 = new C86224wh();
        }
        C131737sh r0 = new C131737sh(r6, runnable, map);
        r2.A01 = (String[]) list.toArray(new String[0]);
        r2.A00 = r0;
        if (r3 == null) {
            activity.getFragmentManager().beginTransaction().add(r2, "PermissionCallback").commitAllowingStateLoss();
        }
    }

    public static boolean A02(Activity activity, C144608im r8, String[] strArr) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (String str : strArr) {
            if (C18180wK.A1W(activity.checkSelfPermission(str))) {
                A0y.put(str, C971568d.GRANTED);
            } else {
                A0v.add(str);
            }
        }
        if (A0v.isEmpty()) {
            r8.CAi(A0y);
            return false;
        }
        C24838Das das = (C24838Das) A00.get();
        if (das != null) {
            das.A00(new KtLambdaShape158S0100000_I2_13(new C110046l2(activity, r8, A0v, A0y), 8));
            return true;
        }
        A01(activity, r8, (Runnable) null, A0v, A0y);
        return true;
    }

    public static boolean A03(Activity activity, String str) {
        boolean A1W = C18180wK.A1W(activity.checkSelfPermission(str));
        boolean shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
        if (A1W || !shouldShowRequestPermissionRationale) {
            return false;
        }
        return true;
    }

    public static boolean A05(Context context, String str) {
        return C18180wK.A1W(context.checkSelfPermission(str));
    }
}
