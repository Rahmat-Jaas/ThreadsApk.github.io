package androidx.core.app;

import X.AnonymousClass01A;
import X.AnonymousClass02G;
import X.AnonymousClass061;
import X.AnonymousClass062;
import X.AnonymousClass066;
import X.C002000x;
import X.C14030oh;
import X.C14340pE;
import X.C86234wi;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

public abstract class ComponentActivity extends Activity implements AnonymousClass066, AnonymousClass02G {
    public C002000x mExtraDataMap = new C002000x();
    public C14340pE mLifecycleRegistry = new C14340pE(this);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r1 < r0) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean shouldSkipDump(java.lang.String[] r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L_0x000f
            int r0 = r3.length
            if (r0 <= 0) goto L_0x000f
            r1 = r3[r2]
            int r0 = r1.hashCode()
            switch(r0) {
                case -645125871: goto L_0x0036;
                case 100470631: goto L_0x0029;
                case 472614934: goto L_0x0026;
                case 1159329357: goto L_0x0010;
                case 1455016274: goto L_0x001d;
                default: goto L_0x000f;
            }
        L_0x000f:
            return r2
        L_0x0010:
            java.lang.String r0 = "--contentcapture"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            goto L_0x0042
        L_0x001d:
            java.lang.String r0 = "--autofill"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0044
            return r2
        L_0x0026:
            java.lang.String r0 = "--list-dumpables"
            goto L_0x002b
        L_0x0029:
            java.lang.String r0 = "--dump-dumpable"
        L_0x002b:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            boolean r2 = X.C120447Av.A01()
            return r2
        L_0x0036:
            java.lang.String r0 = "--translation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
        L_0x0042:
            if (r1 < r0) goto L_0x000f
        L_0x0044:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.ComponentActivity.shouldSkipDump(java.lang.String[]):boolean");
    }

    public abstract AnonymousClass062 getLifecycle();

    public AnonymousClass01A getExtraData(Class cls) {
        return (AnonymousClass01A) this.mExtraDataMap.get(cls);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C14340pE r2 = this.mLifecycleRegistry;
        AnonymousClass061 r1 = AnonymousClass061.CREATED;
        C14340pE.A05("markState");
        r2.A0A(r1);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(AnonymousClass01A r3) {
        this.mExtraDataMap.put(r3.getClass(), r3);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return superDispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public void onCreate(Bundle bundle) {
        int A00 = C14030oh.A00(-1405646941);
        super.onCreate(bundle);
        C86234wi.A00(this);
        C14030oh.A07(1408521919, A00);
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
