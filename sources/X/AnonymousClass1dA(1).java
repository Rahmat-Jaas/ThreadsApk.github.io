package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1dA  reason: invalid class name */
public final class AnonymousClass1dA extends C34640IcN implements AnonymousClass4tS, C82824qK {
    public static final String __redex_internal_original_name = "SACWelcomeFragment";
    public RegFlowExtras A00;
    public C24721jv A01;
    public C07530bf A02;
    public ProgressButton A03;

    public final boolean BXY() {
        return true;
    }

    public final void C9G() {
        RegFlowExtras regFlowExtras = this.A00;
        String str = regFlowExtras.A0Z;
        str.getClass();
        C07530bf r8 = this.A02;
        C67283zI.A02(C18250wR.A08(), this, this, (C82804qI) null, this, regFlowExtras, this.A01, r8, AnonymousClass2AT.A0E.A00, str, (String) null, false);
    }

    public final void CDH(boolean z) {
    }

    public final String getModuleName() {
        return "sac_welcome_page";
    }

    public final void AHz() {
        this.A03.setEnabled(false);
    }

    public final void AJV() {
        this.A03.setEnabled(true);
    }

    public final C313625r Aiy() {
        return C313625r.SAC;
    }

    public final AnonymousClass265 BDt() {
        return AnonymousClass2AT.A0E.A00;
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void Cth(String str, Integer num) {
        C25828Dsm A0W = C18190wL.A0W(requireActivity());
        A0W.A0p(str);
        C18180wK.A1N(A0W, this, 146, 2131831976);
        A0W.A0r(true);
        AnonymousClass0wJ.A1K(A0W);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1918730900);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = AnonymousClass0RA.A0C.A04(requireArguments);
        Parcelable parcelable = requireArguments.getParcelable("RegFlowExtras.EXTRA_KEY");
        AnonymousClass7Ko.A07(parcelable, "Registration extras cannot be null in SAC flow!");
        this.A00 = (RegFlowExtras) parcelable;
        if (getContext() != null) {
            C63463hW.A04(getContext(), this.A02, C63463hW.A02(), C313625r.SAC, this.A00.A02(), AnonymousClass006.A00, false, false, false, false);
        }
        C14030oh.A09(1675386570, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0087, code lost:
        if (r3 == false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r19, android.view.ViewGroup r20, android.os.Bundle r21) {
        /*
            r18 = this;
            r0 = 1552809224(0x5c8dfd08, float:3.1972946E17)
            int r2 = X.C14030oh.A02(r0)
            r0 = 2131496674(0x7f0c0ee2, float:1.861692E38)
            r4 = r19
            r1 = r20
            android.view.View r0 = X.AnonymousClass0wJ.A0H(r4, r1, r0)
            android.view.ViewGroup r3 = X.C18190wL.A0E(r0)
            r1 = 2131496685(0x7f0c0eed, float:1.8616942E38)
            r11 = 1
            r4.inflate(r1, r3, r11)
            r1 = r18
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            if (r3 == 0) goto L_0x003c
            r3 = 2131298907(0x7f090a5b, float:1.82158E38)
            android.widget.ImageView r4 = X.C18200wM.A0J(r0, r3)
            com.instagram.registration.model.RegFlowExtras r3 = r1.A00
            boolean r3 = r3.A0s
            if (r3 == 0) goto L_0x0138
            r3 = 2131231942(0x7f0804c6, float:1.807998E38)
            r4.setImageResource(r3)
            r3 = 0
        L_0x0039:
            r4.setVisibility(r3)
        L_0x003c:
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            if (r3 == 0) goto L_0x005b
            r3 = 2131309114(0x7f09323a, float:1.8236503E38)
            android.widget.TextView r6 = X.AnonymousClass0wJ.A0L(r0, r3)
            com.instagram.registration.model.RegFlowExtras r3 = r1.A00
            java.lang.String r5 = r3.A0Z
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            android.content.res.Resources r4 = r3.getResources()
            r3 = 2131838060(0x7f11446c, float:1.9309333E38)
            X.C18200wM.A19(r4, r6, r5, r3)
        L_0x005b:
            r3 = 2131309113(0x7f093239, float:1.82365E38)
            android.widget.TextView r6 = X.AnonymousClass0wJ.A0L(r0, r3)
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            if (r3 == 0) goto L_0x0097
            com.instagram.registration.model.RegFlowExtras r4 = r1.A00
            boolean r3 = X.C67283zI.A06(r4)
            if (r3 == 0) goto L_0x0125
            java.lang.String r8 = r4.A0M
            java.lang.String r7 = r4.A0Z
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            android.content.res.Resources r5 = r3.getResources()
            com.instagram.registration.model.RegFlowExtras r4 = r1.A00
            boolean r3 = r4.A0s
            if (r3 == 0) goto L_0x0089
            boolean r3 = r4.A0x
            r4 = 2131838057(0x7f114469, float:1.9309327E38)
            if (r3 != 0) goto L_0x008c
        L_0x0089:
            r4 = 2131838058(0x7f11446a, float:1.9309329E38)
        L_0x008c:
            java.lang.String[] r3 = new java.lang.String[]{r8, r7}
            android.text.Spanned r3 = X.C16370sw.A01(r5, r3, r4)
            r6.setText(r3)
        L_0x0097:
            com.instagram.ui.widget.progressbutton.ProgressButton r5 = X.C18210wN.A0O(r0)
            r1.A03 = r5
            X.0bf r4 = r1.A02
            r17 = 2131824229(0x7f110e65, float:1.928128E38)
            r9 = 0
            X.1jv r3 = new X.1jv
            r12 = r3
            r14 = r4
            r15 = r1
            r16 = r5
            r13 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            r1.A01 = r3
            r1.registerLifecycleListener(r3)
            r3 = 2131304602(0x7f09209a, float:1.8227351E38)
            android.widget.TextView r5 = X.AnonymousClass0wJ.A0L(r0, r3)
            com.instagram.registration.model.RegFlowExtras r4 = r1.A00
            boolean r3 = X.C67283zI.A06(r4)
            if (r3 != 0) goto L_0x0113
            boolean r3 = r4.A0s
            if (r3 != 0) goto L_0x0113
            android.content.Context r4 = r1.requireContext()
            X.0bf r6 = r1.A02
            com.instagram.registration.model.RegFlowExtras r3 = r1.A00
            java.lang.String r3 = r3.A0X
            X.25r r7 = X.C313625r.SAC
            r12 = 0
            r8 = r3
            r10 = r9
            r11 = r12
        L_0x00d6:
            X.C63553hn.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.instagram.registration.model.RegFlowExtras r4 = r1.A00
            boolean r3 = X.C67283zI.A06(r4)
            if (r3 == 0) goto L_0x010c
            boolean r3 = r4.A0s
            if (r3 != 0) goto L_0x010c
            r3 = 2131307194(0x7f092aba, float:1.8232608E38)
            android.widget.TextView r6 = X.AnonymousClass0wJ.A0L(r0, r3)
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            if (r3 == 0) goto L_0x010c
            r6.setVisibility(r12)
            com.instagram.registration.model.RegFlowExtras r3 = r1.A00
            java.lang.String r5 = r3.A0Z
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            android.content.res.Resources r4 = r3.getResources()
            r3 = 2131835978(0x7f113c4a, float:1.930511E38)
            X.C18200wM.A19(r4, r6, r5, r3)
            r3 = 89
            X.AnonymousClass0wJ.A17(r6, r3, r1)
        L_0x010c:
            r1 = 714819083(0x2a9b460b, float:2.7582133E-13)
            X.C14030oh.A09(r1, r2)
            return r0
        L_0x0113:
            android.content.Context r4 = r1.requireContext()
            X.0bf r6 = r1.A02
            com.instagram.registration.model.RegFlowExtras r3 = r1.A00
            java.lang.String r8 = r3.A0X
            X.25r r7 = X.C313625r.SAC
            java.lang.String r9 = r3.A0M
            java.lang.String r10 = r3.A0Z
            r12 = 0
            goto L_0x00d6
        L_0x0125:
            boolean r3 = r4.A0s
            if (r3 != 0) goto L_0x0131
            r3 = 2131838056(0x7f114468, float:1.9309324E38)
            r6.setText(r3)
            goto L_0x0097
        L_0x0131:
            r3 = 8
            r6.setVisibility(r3)
            goto L_0x0097
        L_0x0138:
            r3 = 8
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1dA.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1484398714);
        super.onDestroyView();
        this.A03 = null;
        unregisterLifecycleListener(this.A01);
        C14030oh.A09(442922813, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass3YT.A00.A01(this.A02, C313625r.SAC, AnonymousClass2AT.A0E.A00.A01);
    }
}
