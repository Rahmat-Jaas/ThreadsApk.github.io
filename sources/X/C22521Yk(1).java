package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1Yk  reason: invalid class name and case insensitive filesystem */
public final class C22521Yk extends C34640IcN {
    public static final String __redex_internal_original_name = "MuteSettingsFragment";
    public UserSession A00;
    public User A01;
    public C50532t9 A02;
    public String A03;

    public static void A00(C22521Yk r5, Integer num) {
        C50522t8.A00(r5, r5.A00, r5.A01, num, (String) null, r5.A03);
    }

    public final String getModuleName() {
        return "media_mute_sheet";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1290277031);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C18180wK.A0V(requireArguments);
        User A0P = C18210wN.A0P(this.A00, requireArguments.getString("MuteSettingsFragment.ARG_DISPLAYED_USER_ID"));
        this.A01 = A0P;
        A0P.getClass();
        String string = requireArguments.getString("MuteSettingsFragment.ARG_SELECTED_FROM");
        this.A03 = string;
        string.getClass();
        C14030oh.A09(-1105498299, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(58435708);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.layout_mute_sheet);
        C14030oh.A09(44750186, A022);
        return A0H;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0119, code lost:
        if (X.AnonymousClass8AP.A0E(X.C63803iN.A0C(r8, r9, 36883461151195461L), X.C548730s.A00) != false) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            super.onViewCreated(r12, r13)
            r0 = 2131304465(0x7f092011, float:1.8227073E38)
            android.view.View r3 = r12.requireViewById(r0)
            r0 = 2131304466(0x7f092012, float:1.8227075E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r3, r0)
            r0 = 2131837572(0x7f114284, float:1.9308343E38)
            r1.setText(r0)
            r0 = 2131304467(0x7f092013, float:1.8227077E38)
            com.instagram.igds.components.switchbutton.IgSwitch r2 = X.C18250wR.A0N(r3, r0)
            r7 = 52
            com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2 r1 = new com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2
            r1.<init>(r7, r11, r2)
            com.instagram.user.model.User r0 = r11.A01
            boolean r0 = r0.A38()
            r2.setChecked(r0)
            r6 = 8
            com.facebook.redex.IDxTListenerShape181S0200000_1_I2 r0 = new com.facebook.redex.IDxTListenerShape181S0200000_1_I2
            r0.<init>((X.C63873iU) r1, (X.C22521Yk) r11, (int) r6)
            r2.A07 = r0
            X.AnonymousClass0wJ.A1N(r3, r2)
            r5 = 465(0x1d1, float:6.52E-43)
            X.AnonymousClass0wJ.A16(r3, r5, r2)
            r0 = 2131307508(0x7f092bf4, float:1.8233245E38)
            android.view.View r4 = r12.requireViewById(r0)
            r0 = 2131307509(0x7f092bf5, float:1.8233247E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r4, r0)
            r0 = 2131837573(0x7f114285, float:1.9308345E38)
            r1.setText(r0)
            r0 = 2131307510(0x7f092bf6, float:1.823325E38)
            com.instagram.igds.components.switchbutton.IgSwitch r3 = X.C18250wR.A0N(r4, r0)
            com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2 r2 = new com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2
            r2.<init>(r7, r11, r3)
            com.instagram.user.model.User r0 = r11.A01
            boolean r0 = r0.A39()
            r3.setChecked(r0)
            r1 = 9
            com.facebook.redex.IDxTListenerShape181S0200000_1_I2 r0 = new com.facebook.redex.IDxTListenerShape181S0200000_1_I2
            r0.<init>((X.C63873iU) r2, (X.C22521Yk) r11, (int) r1)
            r3.A07 = r0
            X.AnonymousClass0wJ.A1N(r4, r3)
            X.AnonymousClass0wJ.A16(r4, r5, r3)
            r0 = 2131303790(0x7f091d6e, float:1.8225704E38)
            android.view.View r4 = r12.requireViewById(r0)
            com.instagram.service.session.UserSession r9 = r11.A00
            r10 = 0
            X.0TJ r8 = X.C18250wR.A0D(r9, r10)
            r0 = 36317689404198828(0x8106bf00000fac, double:3.030791246588007E-306)
            boolean r0 = X.C63803iN.A0E(r8, r9, r0)
            if (r0 != 0) goto L_0x00ac
            r2 = 36320511197714453(0x81095000001815, double:3.032575760169739E-306)
            boolean r0 = X.C63803iN.A0E(r8, r9, r2)
            if (r0 == 0) goto L_0x00ff
            r0 = 36883461151195461(0x83095000010145, double:3.388587577568643E-306)
            java.lang.String r1 = X.C63803iN.A0C(r8, r9, r0)
            java.lang.String r0 = "CARDS"
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x00ff
        L_0x00ac:
            r0 = 2131303791(0x7f091d6f, float:1.8225706E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r4, r0)
            r0 = 2131837571(0x7f114283, float:1.930834E38)
            r1.setText(r0)
            r0 = 2131303792(0x7f091d70, float:1.8225708E38)
            com.instagram.igds.components.switchbutton.IgSwitch r3 = X.C18250wR.A0N(r4, r0)
            com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2 r2 = new com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2
            r2.<init>(r7, r11, r3)
            com.instagram.user.model.User r0 = r11.A01
            X.MeW r0 = r0.A05
            X.MeJ r0 = r0.Ajx()
            if (r0 == 0) goto L_0x00fd
            java.lang.Boolean r0 = r0.BWM()
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r0.booleanValue()
        L_0x00d9:
            r3.setChecked(r0)
            r1 = 7
            com.facebook.redex.IDxTListenerShape181S0200000_1_I2 r0 = new com.facebook.redex.IDxTListenerShape181S0200000_1_I2
            r0.<init>((X.C63873iU) r2, (X.C22521Yk) r11, (int) r1)
            r3.A07 = r0
            X.AnonymousClass0wJ.A1N(r4, r3)
            X.AnonymousClass0wJ.A16(r4, r5, r3)
        L_0x00ea:
            r0 = 2131303563(0x7f091c8b, float:1.8225244E38)
            android.widget.TextView r3 = X.AnonymousClass0wJ.A0L(r12, r0)
            com.instagram.user.model.User r0 = r11.A01
            boolean r0 = r0.A3S()
            if (r0 == 0) goto L_0x0120
            r3.setVisibility(r6)
            return
        L_0x00fd:
            r0 = 0
            goto L_0x00d9
        L_0x00ff:
            com.instagram.service.session.UserSession r9 = r11.A00
            X.C04220Ms.A0B(r9, r10)
            boolean r0 = X.C63803iN.A0E(r8, r9, r2)
            if (r0 == 0) goto L_0x011c
            java.lang.String[] r2 = X.C548730s.A00
            r0 = 36883461151195461(0x83095000010145, double:3.388587577568643E-306)
            java.lang.String r0 = X.C63803iN.A0C(r8, r9, r0)
            boolean r0 = X.AnonymousClass8AP.A0E(r0, r2)
            if (r0 == 0) goto L_0x011c
            goto L_0x00ac
        L_0x011c:
            r4.setVisibility(r6)
            goto L_0x00ea
        L_0x0120:
            android.content.Context r2 = X.C10600ic.A00
            java.lang.String r1 = X.C10170hq.A00(r2)
            r0 = 2131831597(0x7f112b2d, float:1.9296224E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r2, r1, r0)
            r3.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22521Yk.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
