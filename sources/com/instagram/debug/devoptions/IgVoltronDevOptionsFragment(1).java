package com.instagram.debug.devoptions;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass4MC;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C10300i6;
import X.C12560m7;
import X.C13450nj;
import X.C13480nm;
import X.C13510np;
import X.C14030oh;
import X.C18200wM;
import X.C18220wO;
import X.C18240wQ;
import X.C18250wR;
import X.C23411dm;
import X.C28979FfK;
import X.C36813Jf5;
import X.C37200JmN;
import X.C82034oy;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

public final class IgVoltronDevOptionsFragment extends C23411dm implements C82034oy {
    public C10300i6 session;

    public void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        r3.Cqb(2131825585);
        C12560m7 r0 = this.mFragmentManager;
        boolean z = false;
        if (r0 != null && r0.A0I() > 0) {
            z = true;
        }
        r3.CtT(z);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A0k = C18240wQ.A0k(r6);
        for (C28979FfK ffK : C28979FfK.values()) {
            String name = ffK.name();
            C37200JmN.A00();
            AnonymousClass4MC.A06(new IgVoltronDevOptionsFragment$onViewCreated$1$1(this, ffK), name, A0k, true);
        }
        setItems(A0k);
    }

    public void setSession(C10300i6 r2) {
        C04220Ms.A0B(r2, 0);
        this.session = r2;
    }

    public C10300i6 getSession() {
        C10300i6 r0 = this.session;
        if (r0 != null) {
            return r0;
        }
        C18250wR.A0l();
        throw null;
    }

    public static final /* synthetic */ void access$deleteModule(IgVoltronDevOptionsFragment igVoltronDevOptionsFragment, C28979FfK ffK) {
        igVoltronDevOptionsFragment.deleteModule(ffK);
        throw null;
    }

    private final void deleteModule(C28979FfK ffK) {
        C37200JmN A00 = C37200JmN.A00();
        synchronized (A00) {
            synchronized (C13510np.A00()) {
            }
            C13480nm r0 = A00.A00;
            r0.getClass();
            C13450nj.A00(r0.A01);
        }
        System.exit(0);
        throw C18250wR.A0V("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* access modifiers changed from: private */
    public final void loadModule(C28979FfK ffK) {
        C37200JmN A00 = C37200JmN.A00();
        C10300i6 session2 = getSession();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C18240wQ.A1Q(A0v, new C28979FfK[]{ffK});
        A00.A02(session2, new C36813Jf5((C12560m7) null, new IgVoltronDevOptionsFragment$loadModule$1(this), AnonymousClass006.A00, A0v));
    }

    public String getModuleName() {
        String A0q = C18220wO.A0q(this);
        C04220Ms.A06(A0q);
        return A0q;
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1241526858);
        super.onCreate(bundle);
        setSession(C18200wM.A0V(this));
        C14030oh.A09(-1179659917, A02);
    }
}
