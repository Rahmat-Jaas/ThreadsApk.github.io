package X;

import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.6Ix  reason: invalid class name and case insensitive filesystem */
public final class C99306Ix {
    public static AnonymousClass7AL A00(Context context, Looper looper, GoogleApiAvailability googleApiAvailability, C93175l8 r27, C148658rd r28, C105036cm r29, String str, String str2, ArrayList arrayList, ArrayList arrayList2, Map map, Map map2, Set set, Set set2, int i) {
        int i2;
        Map map3 = map2;
        C13320nQ.A06(C86164wN.A1R(map3), "must call addApi() to add at least one API");
        C129097lH r0 = C129097lH.A00;
        C108946jD r2 = C103846ap.A04;
        if (map3.containsKey(r2)) {
            r0 = (C129097lH) map3.get(r2);
        }
        C108946jD r4 = null;
        Set set3 = set;
        C110886mR r11 = new C110886mR(r0, str, str2, map, set3);
        Map map4 = r11.A04;
        C013306f r7 = new C013306f();
        C013306f r6 = new C013306f();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator A0x = C18220wO.A0x(map3);
        while (true) {
            Looper looper2 = looper;
            Context context2 = context;
            if (A0x.hasNext()) {
                C108946jD r22 = (C108946jD) A0x.next();
                Object obj = map3.get(r22);
                boolean A1W = AnonymousClass0wJ.A1W(map4.get(r22));
                r7.put(r22, Boolean.valueOf(A1W));
                C129137lM r1 = new C129137lM(r22, A1W);
                A0v.add(r1);
                C93175l8 r02 = r22.A00;
                C13320nQ.A01(r02);
                C148598rX A00 = r02.A00(context2, looper2, r1, r1, r11, obj);
                r6.put(r22.A01, A00);
                if (A00.CYG()) {
                    if (r4 == null) {
                        r4 = r22;
                    } else {
                        String str3 = r22.A02;
                        String str4 = r4.A02;
                        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(str3) + 21 + C86104wH.A0A(str4));
                        A0s.append(str3);
                        A0s.append(" cannot be used with ");
                        throw C18180wK.A0a(C18180wK.A0i(str4, A0s));
                    }
                }
            } else {
                if (r4 != null) {
                    Object[] objArr = {r4.A02};
                    if (!set3.equals(set2)) {
                        throw C18180wK.A0a(String.format("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr));
                    }
                }
                boolean z = false;
                boolean z2 = false;
                for (C148598rX r12 : r6.values()) {
                    z |= r12.CeJ();
                    z2 |= r12.CYG();
                }
                if (z) {
                    i2 = 1;
                    if (z2) {
                        i2 = 2;
                    }
                } else {
                    i2 = 3;
                }
                int i3 = i;
                ArrayList arrayList3 = A0v;
                C110886mR r17 = r11;
                C93285lJ r122 = new C93285lJ(context2, looper2, googleApiAvailability, r27, r17, arrayList3, arrayList, arrayList2, r7, r6, new ReentrantLock(), i3, i2);
                Set set4 = AnonymousClass7AL.A00;
                synchronized (set4) {
                    set4.add(r122);
                }
                if (i >= 0) {
                    C146168ll A01 = LifecycleCallback.A01(r29);
                    C93515lj r5 = (C93515lj) A01.AV4(C93515lj.class, "AutoManageHelper");
                    if (r5 == null) {
                        r5 = new C93515lj(A01);
                    }
                    SparseArray sparseArray = r5.A00;
                    C13320nQ.A07(C86124wJ.A1X(sparseArray.indexOfKey(i3)), C86104wH.A10("Already managing a GoogleApiClient with id ", C86114wI.A0s(54), i3));
                    Object obj2 = r5.A02.get();
                    String.valueOf(String.valueOf(obj2));
                    C129157lQ r13 = new C129157lQ(r28, r122, r5, i3);
                    r122.A0C.A01(r13);
                    sparseArray.put(i3, r13);
                    if (r5.A03 && obj2 == null) {
                        r122.toString();
                        r122.A05();
                    }
                }
                return r122;
            }
        }
    }
}
