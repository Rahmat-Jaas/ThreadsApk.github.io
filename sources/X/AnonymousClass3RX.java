package X;

import android.app.Activity;
import android.content.Context;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3RX  reason: invalid class name */
public final class AnonymousClass3RX {
    public static final Map A00 = AnonymousClass4WJ.A0H(C18180wK.A0p(1, "android.permission.GET_ACCOUNTS"), C18180wK.A0p(2, "android.permission.READ_CONTACTS"), C18180wK.A0p(3, "android.permission.READ_PHONE_STATE"), C18180wK.A0p(4, "android.permission.READ_PHONE_NUMBERS"));
    public static final Map A01 = AnonymousClass4WJ.A0H(C18180wK.A0p(1, "android.permission.GET_ACCOUNTS"), C18180wK.A0p(2, "android.permission.READ_CONTACTS"), C18180wK.A0p(3, "android.permission.READ_PHONE_STATE"));

    public static final Object A00(AnonymousClass601 r7, C63893iY r8) {
        Context context;
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r7);
        Object A0B = C63893iY.A0B(r8, 0);
        A0B.getClass();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = ((AbstractCollection) A0B).iterator();
        while (it.hasNext()) {
            Object A0f = C18200wM.A0f(A00, AnonymousClass0wJ.A04(it.next()));
            if (A0f != null) {
                A0v.add(A0f);
            }
        }
        String[] strArr = (String[]) A0v.toArray(new String[0]);
        r8.A0H(A1Z ? 1 : 0);
        AnonymousClass3HX r0 = r7.A00;
        if (r0 == null || (context = r0.A00) == null) {
            return false;
        }
        Activity activity = (Activity) context;
        Activity parent = activity.getParent();
        if (parent != null) {
            activity = parent;
        }
        AnonymousClass7K8.A02(activity, AnonymousClass485.A00, (String[]) Arrays.copyOf(strArr, strArr.length));
        return null;
    }
}
