package com.instagram.common.kotlindelegate.lifecycle;

import X.AnonymousClass060;
import X.AnonymousClass062;
import X.AnonymousClass065;
import X.AnonymousClass066;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.OnLifecycleEvent;

public abstract class AutoCleanup implements AnonymousClass065 {

    public final class Observer implements AnonymousClass065 {
        public final AnonymousClass062 A00;
        public final /* synthetic */ AutoCleanup A01;

        public Observer(AnonymousClass062 r2, AutoCleanup autoCleanup) {
            C04220Ms.A0B(r2, 2);
            this.A01 = autoCleanup;
            this.A00 = r2;
        }

        @OnLifecycleEvent(AnonymousClass060.ON_DESTROY)
        public final void onDestroy() {
            AutoCleanup autoCleanup = this.A01;
            LazyAutoCleanup lazyAutoCleanup = (LazyAutoCleanup) autoCleanup;
            lazyAutoCleanup.A00 = null;
            this.A00.A08(this);
            if (autoCleanup instanceof LazyAutoCleanup) {
                lazyAutoCleanup.A01 = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        return r2.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b A[SYNTHETIC, Splitter:B:16:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00() {
        /*
            r3 = this;
            r2 = r3
            com.instagram.common.kotlindelegate.lifecycle.LazyAutoCleanup r2 = (com.instagram.common.kotlindelegate.lifecycle.LazyAutoCleanup) r2
            monitor-enter(r2)
            X.066 r1 = r2.A02     // Catch:{ all -> 0x0042 }
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0014
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1     // Catch:{ all -> 0x0042 }
            android.view.View r0 = r1.mView     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0025
            X.066 r1 = r1.getViewLifecycleOwner()     // Catch:{ all -> 0x0042 }
        L_0x0014:
            X.062 r0 = r1.getLifecycle()     // Catch:{ all -> 0x0042 }
            X.0pE r0 = (X.C14340pE) r0     // Catch:{ all -> 0x0042 }
            X.061 r1 = r0.A00     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0025
            X.061 r0 = X.AnonymousClass061.INITIALIZED     // Catch:{ all -> 0x0042 }
            boolean r0 = r1.A00(r0)     // Catch:{ all -> 0x0042 }
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 != 0) goto L_0x002b
            r0 = 0
            monitor-exit(r2)
            return r0
        L_0x002b:
            java.lang.Object r0 = r2.A00     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x003e
            boolean r0 = r2.A01     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003e
            X.0ZU r0 = r2.A03     // Catch:{ all -> 0x0042 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ all -> 0x0042 }
            r2.A00 = r0     // Catch:{ all -> 0x0042 }
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x0042 }
        L_0x003e:
            monitor-exit(r2)
            java.lang.Object r0 = r2.A00
            return r0
        L_0x0042:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.kotlindelegate.lifecycle.AutoCleanup.A00():java.lang.Object");
    }

    public final Object A01() {
        boolean z = this instanceof NotNullLazyAutoCleanup;
        Object A00 = A00();
        if (!z || A00 != null) {
            return A00;
        }
        throw C18180wK.A0a("NotNullLazyAutoCleanup: accessing value after it is cleaned up");
    }

    public AutoCleanup(AnonymousClass066 r4) {
        if (r4 instanceof Fragment) {
            C18190wL.A1C(r4, ((Fragment) r4).mViewLifecycleOwnerLiveData, this, 15);
        } else {
            r4.getLifecycle().A07(new Observer(r4.getLifecycle(), this));
        }
    }
}
