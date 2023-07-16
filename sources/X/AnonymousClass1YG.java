package X;

import android.os.Bundle;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.nux.cal.model.FXCalAgeInfo;
import com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent;
import java.io.Serializable;

/* renamed from: X.1YG  reason: invalid class name */
public final class AnonymousClass1YG extends C34640IcN {
    public static final String __redex_internal_original_name = "AgeMismatchFragment";
    public C10300i6 A00;
    public C306222g A01;
    public ConnectContent A02;
    public FXCalAgeInfo A03;
    public FXCalAgeInfo A04;
    public FXCalAgeRestrictionScreenContent A05;
    public Integer A06;
    public String A07;
    public String A08;

    public final String getModuleName() {
        return "age_mismatch";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-2126972393);
        super.onCreate(bundle);
        this.A00 = C18190wL.A0S(C18250wR.A07(this));
        this.A02 = (ConnectContent) C18240wQ.A0D(requireArguments(), "argument_content");
        this.A06 = C36522Rq.A00(C18190wL.A0j(requireArguments(), "argument_flow"));
        Serializable serializable = requireArguments().getSerializable("argument_entry_point");
        serializable.getClass();
        this.A01 = (C306222g) serializable;
        FXCalAgeRestrictionScreenContent fXCalAgeRestrictionScreenContent = this.A02.A01;
        fXCalAgeRestrictionScreenContent.getClass();
        this.A05 = fXCalAgeRestrictionScreenContent;
        this.A07 = null;
        this.A08 = null;
        FXCalAgeInfo fXCalAgeInfo = fXCalAgeRestrictionScreenContent.A00;
        fXCalAgeInfo.getClass();
        FXCalAgeInfo fXCalAgeInfo2 = fXCalAgeRestrictionScreenContent.A01;
        fXCalAgeInfo2.getClass();
        if (fXCalAgeInfo.A00 > fXCalAgeInfo2.A00) {
            this.A04 = fXCalAgeInfo2;
            this.A03 = fXCalAgeInfo;
        } else {
            this.A04 = fXCalAgeInfo;
            this.A03 = fXCalAgeInfo2;
        }
        C14030oh.A09(956589729, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0104, code lost:
        if (r1 == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0116, code lost:
        if (r1 == false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011d, code lost:
        if (X.C18210wN.A1W(r0) != false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0155, code lost:
        if (r1 == false) goto L_0x0157;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            r0 = -98938887(0xfffffffffa1a4ff9, float:-2.0030894E35)
            int r3 = X.C14030oh.A02(r0)
            r0 = 2131492965(0x7f0c0065, float:1.8609397E38)
            r9 = 0
            android.view.View r5 = r11.inflate(r0, r12, r9)
            r0 = 2131308181(0x7f092e95, float:1.823461E38)
            android.view.View r1 = X.C18180wK.A0E(r5, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent r0 = r10.A05
            java.lang.String r0 = r0.A04
            r0.getClass()
            r1.setText(r0)
            r0 = 2131297530(0x7f0904fa, float:1.8213008E38)
            android.view.View r1 = X.C18180wK.A0E(r5, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent r0 = r10.A05
            java.lang.String r0 = r0.A02
            r0.getClass()
            r1.setText(r0)
            r0 = 2131301589(0x7f0914d5, float:1.822124E38)
            android.view.View r4 = X.C18180wK.A0E(r5, r0)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r4 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r4
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            X.0yt r8 = new X.0yt
            r8.<init>(r0)
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A04
            java.lang.String r0 = r0.A04
            r0.getClass()
            r8.setPrimaryText(r0)
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A04
            java.lang.String r0 = r0.A05
            r0.getClass()
            r8.setSecondaryText(r0)
            r6 = 1
            r1 = 2131306729(0x7f0928e9, float:1.8231665E38)
            android.widget.TextView r2 = X.C18180wK.A0G(r8, r1)
            java.lang.CharSequence r0 = r2.getText()
            if (r0 == 0) goto L_0x0072
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0072
            r2.setVisibility(r9)
        L_0x0072:
            r4.addView(r8)
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            X.0yt r2 = new X.0yt
            r2.<init>(r0)
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A03
            java.lang.String r0 = r0.A04
            r0.getClass()
            r2.setPrimaryText(r0)
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A03
            java.lang.String r0 = r0.A05
            r0.getClass()
            r2.setSecondaryText(r0)
            android.widget.TextView r7 = X.C18180wK.A0G(r2, r1)
            java.lang.CharSequence r0 = r7.getText()
            r1 = 0
            if (r0 == 0) goto L_0x00a6
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00a6
            r7.setVisibility(r9)
        L_0x00a6:
            r4.addView(r2)
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A04
            java.lang.Boolean r0 = r0.A01
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00b6
            r1 = 1
        L_0x00b6:
            boolean r0 = X.C18210wN.A1W(r1)
            if (r0 == 0) goto L_0x014a
            r8.setChecked(r6)
            com.instagram.nux.cal.model.FXCalAgeInfo r1 = r10.A04
        L_0x00c1:
            java.lang.String r0 = r1.A02
            r0.getClass()
            r10.A07 = r0
            java.lang.String r0 = r1.A03
            r0.getClass()
            r10.A08 = r0
        L_0x00cf:
            r2 = 2131304563(0x7f092073, float:1.8227272E38)
            android.view.View r1 = X.C18180wK.A0E(r5, r2)
            com.instagram.common.ui.base.IgButton r1 = (com.instagram.common.ui.base.IgButton) r1
            X.4MJ r0 = new X.4MJ
            r0.<init>(r1, r10)
            r4.A02 = r0
            android.view.View r4 = X.C18180wK.A0E(r5, r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent r0 = r10.A05
            java.lang.String r0 = r0.A03
            r0.getClass()
            r4.setText(r0)
            com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent r1 = r10.A05
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r1.A00
            r0.getClass()
            com.instagram.nux.cal.model.FXCalAgeInfo r2 = r1.A01
            r2.getClass()
            java.lang.Boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0106
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0107
        L_0x0106:
            r0 = 0
        L_0x0107:
            boolean r0 = X.C18210wN.A1W(r0)
            if (r0 != 0) goto L_0x011f
            java.lang.Boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0118
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0119
        L_0x0118:
            r0 = 0
        L_0x0119:
            boolean r0 = X.C18210wN.A1W(r0)
            if (r0 == 0) goto L_0x0122
        L_0x011f:
            r4.setEnabled(r6)
        L_0x0122:
            r0 = 568(0x238, float:7.96E-43)
            X.AnonymousClass0wJ.A16(r4, r0, r10)
            X.3YT r4 = X.AnonymousClass3YT.A00
            X.0i6 r2 = r10.A00
            X.22g r0 = r10.A01
            int r1 = r0.ordinal()
            if (r1 == r6) goto L_0x0147
            r0 = 2
            if (r1 == r0) goto L_0x0144
            X.265 r0 = X.AnonymousClass265.A0z
        L_0x0138:
            java.lang.String r0 = r0.A01
            r4.A02(r2, r0)
            r0 = -866245146(0xffffffffcc5e25e6, float:-5.8234776E7)
            X.C14030oh.A09(r0, r3)
            return r5
        L_0x0144:
            X.265 r0 = X.AnonymousClass265.A0M
            goto L_0x0138
        L_0x0147:
            X.265 r0 = X.AnonymousClass265.A0P
            goto L_0x0138
        L_0x014a:
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A03
            java.lang.Boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0157
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0158
        L_0x0157:
            r0 = 0
        L_0x0158:
            boolean r0 = X.C18210wN.A1W(r0)
            if (r0 == 0) goto L_0x00cf
            r2.setChecked(r6)
            com.instagram.nux.cal.model.FXCalAgeInfo r1 = r10.A03
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YG.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
