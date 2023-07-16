package X;

import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4J9  reason: invalid class name */
public final class AnonymousClass4J9 implements C82924qU {
    public final Fragment A00;
    public final C11630kW A01;
    public final UserSession A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r7, 36321426025749267L) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BN1(android.net.Uri r10, android.os.Bundle r11) {
        /*
            r9 = this;
            com.instagram.service.session.UserSession r2 = r9.A02
            androidx.fragment.app.Fragment r0 = r9.A00
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0kW r0 = r9.A01
            X.3A8 r6 = new X.3A8
            r6.<init>(r1, r0, r2)
            com.instagram.service.session.UserSession r7 = r6.A02
            boolean r0 = X.AnonymousClass3WI.A02(r7)
            if (r0 == 0) goto L_0x0025
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36321426025749267(0x810a2500001b13, double:3.033154301102672E-306)
            boolean r0 = X.C63803iN.A0E(r2, r7, r0)
            r3 = 1
            if (r0 != 0) goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            boolean r0 = X.AnonymousClass3WI.A02(r7)
            if (r0 == 0) goto L_0x0036
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36321426025945876(0x810a2500031b14, double:3.0331543012270085E-306)
            X.C63803iN.A0E(r2, r7, r0)
        L_0x0036:
            java.lang.String r1 = "source"
            java.lang.String r0 = "Android"
            kotlin.Pair r8 = X.C18180wK.A0p(r1, r0)
            java.lang.String r0 = "is_hw_predefined_list_on"
            java.lang.String r5 = "True"
            kotlin.Pair r4 = X.C18180wK.A0p(r0, r5)
            if (r3 == 0) goto L_0x0071
            r1 = r5
        L_0x0049:
            java.lang.String r0 = "hw_predefined_list_state_changes"
            kotlin.Pair r3 = X.C18180wK.A0p(r0, r1)
            java.lang.String r0 = "is_hw_custom_list_on"
            kotlin.Pair r1 = X.C18180wK.A0p(r0, r5)
            r2 = 4
            java.lang.String r0 = "hw_custom_list_state_changes"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r5)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r8, r4, r3, r1, r0}
            java.util.HashMap r1 = X.AnonymousClass4WJ.A09(r0)
            java.lang.String r0 = "com.instagram.hidden_words.secure_consent_bottom_sheet.action"
            X.4A9 r0 = X.C63263h8.A00(r7, r0, r1)
            X.AnonymousClass4A9.A00(r0, r6, r2)
            X.C31155GhB.A03(r0)
            return
        L_0x0071:
            java.lang.String r1 = "False"
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4J9.BN1(android.net.Uri, android.os.Bundle):void");
    }

    public AnonymousClass4J9(Fragment fragment, C11630kW r2, UserSession userSession) {
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
