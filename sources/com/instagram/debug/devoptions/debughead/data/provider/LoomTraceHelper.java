package com.instagram.debug.devoptions.debughead.data.provider;

import X.AnonymousClass00U;
import X.C05550Ue;
import X.C05560Uf;
import X.C05680Uw;
import X.C07900cO;
import X.C08280d6;
import X.C63813iO;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.facebook.profilo.ipc.TraceConfigExtras;
import com.facebook.profilo.ipc.TraceContext;
import com.instagram.debug.devoptions.apiperf.LoomTraceProvider;
import com.instagram.debug.devoptions.debughead.data.delegates.LoomTraceDelegate;

public class LoomTraceHelper implements LoomTraceProvider {
    public static LoomTraceHelper sInstance;
    public final Context mAppContext;
    public LoomTraceDelegate mDelegate;
    public boolean mIsTracing;

    public static synchronized LoomTraceHelper getInstance(Context context) {
        LoomTraceHelper loomTraceHelper;
        synchronized (LoomTraceHelper.class) {
            loomTraceHelper = sInstance;
            if (loomTraceHelper == null) {
                loomTraceHelper = new LoomTraceHelper(context);
                sInstance = loomTraceHelper;
            }
        }
        return loomTraceHelper;
    }

    public void startTrace() {
        C05680Uw r4;
        if (!this.mIsTracing && (r4 = C05680Uw.A0A) != null) {
            C05550Ue.A00().A01((TraceConfigExtras) null, C08280d6.A00);
            C05560Uf.A00(r4);
            r4.A09(0, C07900cO.A00, 1);
        }
        this.mIsTracing = true;
    }

    public void stopTrace() {
        TraceContext A01;
        if (this.mIsTracing) {
            C05680Uw r4 = C05680Uw.A0A;
            String str = null;
            if (!(r4 == null || (A01 = C05680Uw.A01(r4, (Object) null, C07900cO.A00, 0)) == null)) {
                str = A01.A0D;
            }
            String A0L = AnonymousClass00U.A0L("a2 ", str);
            C05680Uw r3 = C05680Uw.A0A;
            if (r3 != null) {
                r3.A08(C07900cO.A00, 0);
            }
            LoomTraceDelegate loomTraceDelegate = this.mDelegate;
            if (loomTraceDelegate != null) {
                loomTraceDelegate.onLoomTraceCompleted();
            }
            ClipboardManager clipboardManager = (ClipboardManager) this.mAppContext.getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText(A0L, A0L));
            }
            C63813iO.A0A(this.mAppContext, 2131836900, 1);
        }
        this.mIsTracing = false;
    }

    public LoomTraceHelper(Context context) {
        this.mAppContext = context;
    }

    public void setDelegate(LoomTraceDelegate loomTraceDelegate) {
        this.mDelegate = loomTraceDelegate;
    }
}
