package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1hE  reason: invalid class name */
public final class AnonymousClass1hE extends C63873iU {
    public final /* synthetic */ C23351dd A00;

    public AnonymousClass1hE(C23351dd r1) {
        this.A00 = r1;
    }

    public final void onFail(AnonymousClass3XX r5) {
        boolean z;
        int A03 = C14030oh.A03(76146985);
        super.onFail(r5);
        AnonymousClass1j3 r0 = (AnonymousClass1j3) r5.A00;
        if (r0 != null) {
            z = "login_required".equals(r0.getErrorMessage());
        } else {
            z = false;
        }
        C23351dd r1 = this.A00;
        if (r1.isResumed() && !z && r1.getContext() != null) {
            C62973bE.A01(r1.getContext());
        }
        C14030oh.A0A(-1441183104, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C14030oh.A03(-1163856806);
        AnonymousClass1TH r7 = (AnonymousClass1TH) obj;
        int A032 = C14030oh.A03(714701979);
        C23351dd r1 = this.A00;
        if (r1.isResumed()) {
            AnonymousClass1fF r5 = r1.A01;
            r5.A03();
            List list = r7.A01;
            r5.A01 = list;
            r5.A00 = r7.A00;
            if (!list.isEmpty()) {
                for (AnonymousClass3DN r12 : r5.A01) {
                    r12.A0B = true;
                }
                r5.A05(r5.A07, r5.A02.getString(2131830142));
                AnonymousClass117 r13 = r5.A05;
                r13.A00 = r5.A01;
                r5.A05(r5.A04, r13);
            }
            if (!r5.A00.isEmpty()) {
                Iterator it = r5.A00.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ((AnonymousClass3DN) it.next()).A0B = false;
                }
                r5.A05(r5.A06, r5.A02.getString(2131830136));
                for (i = 0; i < r5.A00.size(); i++) {
                    AnonymousClass3DN r14 = (AnonymousClass3DN) r5.A00.get(i);
                    r14.A02 = i;
                    r5.A05(r5.A03, r14);
                }
            }
            r5.A04();
        }
        C14030oh.A0A(-607867247, A032);
        C14030oh.A0A(-427555063, A03);
    }
}
