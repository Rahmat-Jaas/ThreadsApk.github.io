package X;

import com.instagram.debug.devoptions.section.intf.DeveloperOptionsSection;
import com.instagram.service.session.UserSession;

/* renamed from: X.4BC  reason: invalid class name */
public final class AnonymousClass4BC implements DeveloperOptionsSection {
    public final /* synthetic */ Integer getTitleRes() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r4 = X.C07900cO.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if ((new com.facebook.profilo.ipc.TraceContext(r1).A02 & r2) == 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List getItems(com.instagram.service.session.UserSession r9, androidx.fragment.app.FragmentActivity r10) {
        /*
            r8 = this;
            boolean r5 = X.AnonymousClass0wJ.A1Z(r9, r10)
            X.0Uw r7 = X.C05680Uw.A0A
            r6 = 0
            if (r7 == 0) goto L_0x0034
            int r4 = X.C07900cO.A00
            r3 = 0
            r0 = 0
            com.facebook.profilo.ipc.TraceContext r2 = X.C05680Uw.A01(r7, r3, r4, r0)
            if (r2 == 0) goto L_0x0034
            java.lang.String r2 = r2.A0D
            if (r2 == 0) goto L_0x0034
            r2 = 400(0x190, float:5.6E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            int r2 = com.facebook.profilo.core.ProvidersRegistry.getBitMaskFor(r2)
            com.facebook.profilo.ipc.TraceContext r1 = X.C05680Uw.A01(r7, r3, r4, r0)
            if (r1 == 0) goto L_0x0033
            com.facebook.profilo.ipc.TraceContext r0 = new com.facebook.profilo.ipc.TraceContext
            r0.<init>((com.facebook.profilo.ipc.TraceContext) r1)
            int r0 = r0.A02
            r0 = r0 & r2
            r6 = 1
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            r6 = 2
        L_0x0034:
            java.lang.String r4 = "Loom memory trace"
            boolean r2 = X.C18180wK.A1V(r6)
            r1 = 35
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r0.<init>((java.lang.Object) r8, (int) r1)
            X.4MC r3 = new X.4MC
            r3.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r0, (java.lang.CharSequence) r4, (boolean) r2)
            r0 = 2
            if (r6 != r0) goto L_0x004b
            r3.A0E = r5
        L_0x004b:
            java.lang.String r1 = "Java allocations sampling size"
            r0 = 160(0xa0, float:2.24E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r9, r10, r0)
            X.4MA r2 = X.AnonymousClass4MA.A01(r0, r1)
            java.lang.String r1 = "Native allocations sampling size"
            r0 = 161(0xa1, float:2.26E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r9, r10, r0)
            X.4MA r0 = X.AnonymousClass4MA.A01(r0, r1)
            X.4oG[] r0 = new X.C81724oG[]{r3, r2, r0}
            java.util.List r0 = X.C06750aI.A17(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4BC.getItems(com.instagram.service.session.UserSession, androidx.fragment.app.FragmentActivity):java.util.List");
    }

    public final /* synthetic */ boolean isEnabled(UserSession userSession) {
        return true;
    }
}
