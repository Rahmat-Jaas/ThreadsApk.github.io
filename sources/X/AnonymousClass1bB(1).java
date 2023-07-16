package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1bB  reason: invalid class name */
public final class AnonymousClass1bB extends C34640IcN implements C82424pb {
    public static final String __redex_internal_original_name = "LearnMoreBottomSheetImpl";
    public UserSession A00;
    public C83934sE A01;
    public boolean A02 = false;
    public AnonymousClass21X A03;
    public C23874Czk A04;

    public final String getModuleName() {
        return "offensive_content_warning";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        C83934sE r0 = this.A01;
        if (r0 == null) {
            return false;
        }
        r0.BuB();
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(837692496);
        super.onCreate(bundle);
        Bundle A07 = C18250wR.A07(this);
        this.A00 = C18180wK.A0V(A07);
        this.A04 = (C23874Czk) A07.get("warning_type");
        this.A03 = (AnonymousClass21X) A07.get("content_warning_type");
        this.A02 = C18240wQ.A1S(requireArguments(), "is_launched_from_bottom_sheet");
        C14030oh.A09(-1066017309, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r0 != 0) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            r12 = this;
            r0 = 1398241146(0x5357777a, float:9.2542245E11)
            int r4 = X.C14030oh.A02(r0)
            android.content.Context r11 = r12.requireContext()
            r0 = 2131494025(0x7f0c0489, float:1.8611547E38)
            r3 = 0
            android.view.View r5 = r13.inflate(r0, r14, r3)
            r0 = 2131302520(0x7f091878, float:1.8223128E38)
            android.widget.TextView r6 = X.AnonymousClass0wJ.A0L(r5, r0)
            X.21X r0 = r12.A03
            r2 = 1
            if (r0 == 0) goto L_0x00e9
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x00ed
            if (r0 != r3) goto L_0x003e
            boolean r0 = X.C09650fs.A02(r11)
            if (r0 == 0) goto L_0x00e9
            r1 = 2131821996(0x7f1105ac, float:1.927675E38)
            r0 = 2131820557(0x7f11000d, float:1.9273832E38)
            java.lang.String r0 = r12.getString(r0)
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r12, r0, r1)
            r6.setText(r0)
        L_0x003e:
            r0 = 2131302513(0x7f091871, float:1.8223114E38)
            android.widget.TextView r10 = X.AnonymousClass0wJ.A0L(r5, r0)
            X.Czk r0 = r12.A04
            r9 = 18
            if (r0 == 0) goto L_0x005f
            int r0 = r0.ordinal()
            if (r0 == r3) goto L_0x00d4
            if (r0 != r2) goto L_0x005f
            X.21X r0 = r12.A03
            if (r0 == 0) goto L_0x00e1
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x00a5
            if (r0 == r3) goto L_0x00e1
        L_0x005f:
            r0 = 2131302514(0x7f091872, float:1.8223116E38)
            android.widget.TextView r6 = X.C18180wK.A0G(r5, r0)
            if (r6 == 0) goto L_0x009e
            r6.setVisibility(r3)
            r0 = 2131831958(0x7f112c96, float:1.9296956E38)
            java.lang.String r0 = r12.getString(r0)
            android.text.SpannableStringBuilder r2 = X.C18200wM.A0E(r0)
            int r1 = X.C18210wN.A01(r11)
            r0 = 58
            com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2 r1 = X.C18730xl.A00(r12, r1, r0)
            int r0 = r2.length()
            r2.setSpan(r1, r3, r0, r9)
            X.C18180wK.A0z(r6)
            r0 = 2131831959(0x7f112c97, float:1.9296958E38)
            java.lang.String r0 = r12.getString(r0)
            android.text.SpannableStringBuilder r1 = X.C18190wL.A0D(r0, r2)
            java.lang.String r0 = "."
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            r6.setText(r0)
        L_0x009e:
            r0 = -160006633(0xfffffffff6767e17, float:-1.24986566E33)
            X.C14030oh.A09(r0, r4)
            return r5
        L_0x00a5:
            r0 = 2131824483(0x7f110f63, float:1.9281795E38)
            java.lang.String r8 = r12.getString(r0)
            r0 = 2131837705(0x7f114309, float:1.9308613E38)
            java.lang.String r7 = X.AnonymousClass0wJ.A0o(r12, r8, r0)
            int r6 = r7.indexOf(r8)
            int r1 = X.C18210wN.A01(r11)
            r0 = 57
            com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2 r2 = X.C18730xl.A00(r12, r1, r0)
            android.text.SpannableStringBuilder r1 = X.C18200wM.A0E(r7)
            int r0 = X.C18220wO.A08(r8)
            int r0 = r0 + r6
            r1.setSpan(r2, r6, r0, r9)
            X.C18180wK.A0z(r10)
            r10.setText(r1)
            goto L_0x005f
        L_0x00d4:
            boolean r0 = X.C09650fs.A02(r11)
            r1 = 2131831956(0x7f112c94, float:1.9296952E38)
            if (r0 == 0) goto L_0x00e4
            r1 = 2131821995(0x7f1105ab, float:1.9276749E38)
            goto L_0x00e4
        L_0x00e1:
            r1 = 2131831957(0x7f112c95, float:1.9296954E38)
        L_0x00e4:
            r10.setText(r1)
            goto L_0x005f
        L_0x00e9:
            r0 = 2131831960(0x7f112c98, float:1.929696E38)
            goto L_0x00f0
        L_0x00ed:
            r0 = 2131837706(0x7f11430a, float:1.9308615E38)
        L_0x00f0:
            r6.setText(r0)
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1bB.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1858772486);
        super.onResume();
        View view = this.mView;
        view.getClass();
        AnonymousClass7JU.A04(view.findViewById(R.id.learn_more_title), 500);
        C14030oh.A09(-747979172, A022);
    }
}
