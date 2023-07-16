package com.instagram.login.smartlock.impl;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YF;
import X.AnonymousClass7lN;
import X.C013306f;
import X.C10300i6;
import X.C103846ap;
import X.C103876as;
import X.C105036cm;
import X.C108946jD;
import X.C13320nQ;
import X.C18200wM;
import X.C18220wO;
import X.C62783aj;
import X.C82664q4;
import X.C93175l8;
import X.C99306Ix;
import android.content.Context;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxDCallbackShape260S0200000_1_I2;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class SmartLockPluginImpl extends C62783aj {
    public boolean A00 = true;
    public final Map A01 = new WeakHashMap();
    public final Map A02 = new WeakHashMap();
    public final Map A03 = new WeakHashMap();

    public void getSmartLockBroker(FragmentActivity fragmentActivity, C82664q4 r3, C10300i6 r4) {
        getSmartLockBroker(fragmentActivity, r3, r4, false);
    }

    public boolean getShouldShowSmartLockForLogin() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r3 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C81514nv listenForSmsResponse(android.app.Activity r6, boolean r7) {
        /*
            r5 = this;
            java.util.Map r4 = r5.A03
            java.lang.Object r3 = r4.get(r6)
            X.4nv r3 = (X.C81514nv) r3
            if (r7 != 0) goto L_0x001c
            if (r3 == 0) goto L_0x0034
            r1 = r3
            X.0x4 r1 = (X.C18370x4) r1
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A03
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x001e
        L_0x001b:
            return r3
        L_0x001c:
            if (r3 == 0) goto L_0x0034
        L_0x001e:
            X.0x4 r3 = (X.C18370x4) r3
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A03
            boolean r0 = r1.get()
            if (r0 == 0) goto L_0x0034
            r0 = 0
            boolean r0 = r1.getAndSet(r0)
            if (r0 == 0) goto L_0x0034
            android.content.Context r0 = r3.A02
            r0.unregisterReceiver(r3)
        L_0x0034:
            X.5lD r3 = new X.5lD
            r3.<init>(r6)
            r0 = 0
            X.783 r2 = new X.783
            r2.<init>(r0)
            X.7la r0 = new X.7la
            r0.<init>(r3)
            r2.A01 = r0
            r1 = 1
            com.google.android.gms.common.Feature r0 = X.C103796ak.A02
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[]{r0}
            r2.A03 = r0
            X.76Q r0 = r2.A00()
            X.7HU r2 = X.C129167lR.A01(r3, r0, r1)
            X.0x4 r3 = new X.0x4
            r3.<init>(r6)
            X.418 r1 = new X.418
            r1.<init>(r3)
            java.util.concurrent.Executor r0 = X.C103456Zg.A00
            r2.A08(r1, r0)
            r4.put(r6, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.login.smartlock.impl.SmartLockPluginImpl.listenForSmsResponse(android.app.Activity, boolean):X.4nv");
    }

    public void setShouldShowSmartLockForLogin(boolean z) {
        this.A00 = z;
    }

    public void getSmartLockBroker(FragmentActivity fragmentActivity, C82664q4 r27, C10300i6 r28, boolean z) {
        Object obj;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C82664q4 r2 = r27;
        if (fragmentActivity == null) {
            obj = null;
        } else {
            Map map = this.A02;
            if (map.containsKey(fragmentActivity2)) {
                obj = map.get(fragmentActivity2);
            } else {
                Map map2 = this.A01;
                Set set = (Set) map2.get(fragmentActivity2);
                if (set != null) {
                    set.add(r2);
                    return;
                }
                HashSet A0u = C18200wM.A0u();
                A0u.add(r2);
                map2.put(fragmentActivity2, A0u);
                IDxDCallbackShape260S0200000_1_I2 iDxDCallbackShape260S0200000_1_I2 = new IDxDCallbackShape260S0200000_1_I2(1, this, fragmentActivity2);
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
                if (googleApiAvailability.A02(fragmentActivity2, 12451000) == 0) {
                    AnonymousClass3YF r4 = new AnonymousClass3YF(r28);
                    Context applicationContext = fragmentActivity2.getApplicationContext();
                    HashSet A0u2 = C18200wM.A0u();
                    HashSet A0u3 = C18200wM.A0u();
                    C013306f r20 = new C013306f();
                    C013306f r3 = new C013306f();
                    C93175l8 r13 = C103846ap.A01;
                    ArrayList A0v = AnonymousClass0wJ.A0v();
                    ArrayList A0v2 = AnonymousClass0wJ.A0v();
                    Looper mainLooper = applicationContext.getMainLooper();
                    String packageName = applicationContext.getPackageName();
                    String A0q = C18220wO.A0q(applicationContext);
                    C108946jD r1 = C103876as.A04;
                    C13320nQ.A02(r1, "Api must not be null");
                    r3.put(r1, (Object) null);
                    C13320nQ.A02(r1.A00, "Base client builder must not be null");
                    List emptyList = Collections.emptyList();
                    A0u3.addAll(emptyList);
                    A0u2.addAll(emptyList);
                    AnonymousClass7lN r14 = new AnonymousClass7lN(new IDxDCallbackShape260S0200000_1_I2(0, iDxDCallbackShape260S0200000_1_I2, r4), z);
                    int i = r14.A01;
                    A0v.add(r14);
                    r14.A00 = C99306Ix.A00(applicationContext, mainLooper, googleApiAvailability, r13, r14, new C105036cm(fragmentActivity2), packageName, A0q, A0v, A0v2, r20, r3, A0u2, A0u3, i);
                    r4.A00 = r14;
                    return;
                }
                iDxDCallbackShape260S0200000_1_I2.BrJ((Object) null);
                return;
            }
        }
        r2.BrJ(obj);
    }
}
