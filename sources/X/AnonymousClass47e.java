package X;

import android.app.Activity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.47e  reason: invalid class name */
public final class AnonymousClass47e implements C10420iJ, C10390iG, AnonymousClass0i4, C84744tn {
    public boolean A00;
    public final List A01;
    public final AnonymousClass01V A02;

    public AnonymousClass47e(AnonymousClass01V r2, List list) {
        C04220Ms.A0B(list, 2);
        this.A02 = r2;
        this.A01 = list;
        C691847d.A02(this);
        C10410iI.A00.A00(this);
    }

    public final void BjV(Activity activity) {
    }

    public final void BjW(Activity activity) {
    }

    public final void BjX(Activity activity) {
    }

    public final void BjY(Activity activity) {
    }

    public final void Bjb(Activity activity) {
        C04220Ms.A0B(activity, 0);
        A00();
        if (activity instanceof C11630kW) {
            ((C11630kW) activity).getModuleName();
        }
        List list = this.A01;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            throw C18210wN.A0W("maybeUpdateAnalyticsModule");
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            it2.next();
            throw C18210wN.A0W("maybeStartQPLUserflow");
        }
    }

    public final void Bjc(Activity activity) {
    }

    public final void Bjd(Activity activity) {
    }

    private final void A00() {
        if (this.A00) {
            Iterator it = this.A01.iterator();
            if (it.hasNext()) {
                it.next();
                throw C18210wN.A0W("restartQPLUserflow");
            } else {
                this.A00 = false;
            }
        }
    }

    public final void C3y() {
        Iterator it = this.A01.iterator();
        if (it.hasNext()) {
            it.next();
            throw C18210wN.A0W("maybeStartQPLUserflow");
        }
    }

    public final void onAppBackgrounded() {
        int A03 = C14030oh.A03(1250062608);
        Iterator it = this.A01.iterator();
        if (it.hasNext()) {
            it.next();
            throw C18210wN.A0W("cancelQPLUserflow");
        }
        this.A00 = true;
        C14030oh.A0A(483369280, A03);
    }

    public final void onAppForegrounded() {
        int A03 = C14030oh.A03(-1652361008);
        A00();
        C14030oh.A0A(-530882941, A03);
    }

    public final void onSessionWillEnd() {
        C691847d.A03(this);
        C10410iI.A00.A01(this);
    }
}
