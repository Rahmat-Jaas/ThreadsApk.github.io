package X;

import android.os.Bundle;
import android.widget.CompoundButton;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.request.IDxDCallbackShape59S0200000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1xe  reason: invalid class name and case insensitive filesystem */
public final class C29261xe extends C23411dm implements C21839C2o, C82034oy {
    public static final String __redex_internal_original_name = "PushNotificationOptionsRedesignFragment";
    public int A00 = 0;
    public C12560m7 A01;
    public UserSession A02;
    public AnonymousClass3VR A03;
    public String A04;
    public boolean A05 = false;
    public String A06;
    public final AnonymousClass3EZ A07 = new AnonymousClass3EZ(this);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public static void A0D(C29261xe r4) {
        IDxDCallbackShape59S0200000_1_I2 iDxDCallbackShape59S0200000_1_I2 = new IDxDCallbackShape59S0200000_1_I2(r4.A01, r4, r4.A07, 1);
        C32165H8c A002 = AnonymousClass3OP.A00(r4.A02, r4.A04);
        A002.A00 = iDxDCallbackShape59S0200000_1_I2;
        r4.schedule(A002);
    }

    public static void A0E(String str, List list) {
        if (str != null && !str.equals("")) {
            list.add(new C63293hC((CharSequence) str));
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A08(r2, this.A06);
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (java.lang.Boolean.TRUE.equals(r1) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0B(X.AnonymousClass3EZ r12, X.C29261xe r13, java.util.List r14, java.util.List r15) {
        /*
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            r5 = 0
            java.lang.Object r0 = r14.get(r5)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2) r0
            java.lang.String r7 = r0.A01
            java.util.Iterator r6 = r14.iterator()
            java.lang.String r2 = "off"
            r11 = r2
        L_0x0014:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r4 = r6.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5100000_I2) r4
            java.lang.String r3 = r4.A03
            if (r3 != 0) goto L_0x0025
            r3 = r2
        L_0x0025:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r4.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            r11 = r3
        L_0x0030:
            java.lang.String r0 = r4.A04
            X.C62563aI.A01(r3, r0, r9)
            goto L_0x0014
        L_0x0036:
            r6 = r13
            android.content.Context r1 = r13.getContext()
            com.instagram.service.session.UserSession r0 = r13.A02
            java.lang.String r8 = X.C63853iS.A05(r1, r0, r7)
            android.content.Context r0 = r13.getContext()
            java.lang.Boolean r1 = X.AnonymousClass3Zd.A01(r0, r8, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x005a
            if (r1 == 0) goto L_0x005a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r1)
            r10 = 0
            if (r0 == 0) goto L_0x005c
        L_0x005a:
            r10 = 1
            r2 = r11
        L_0x005c:
            X.3vp r4 = new X.3vp
            r5 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.3Sw r0 = new X.3Sw
            r0.<init>(r4, r2, r9)
            r15.add(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29261xe.A0B(X.3EZ, X.1xe, java.util.List, java.util.List):java.lang.String");
    }

    public static String A0C(AnonymousClass3EZ r6, C29261xe r7, List list, List list2) {
        String str = ((KtCSuperShape0S5100000_I2) C18240wQ.A0b(list)).A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KtCSuperShape0S5100000_I2 ktCSuperShape0S5100000_I2 = (KtCSuperShape0S5100000_I2) it.next();
            String str2 = ktCSuperShape0S5100000_I2.A04;
            Boolean bool = (Boolean) ktCSuperShape0S5100000_I2.A00;
            bool.getClass();
            list2.add(new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) new C65703v0(r6, r7, str), (CharSequence) str2, bool.booleanValue()));
        }
        return str;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1435794278);
        super.onCreate(bundle);
        this.A02 = C18180wK.A0V(this.mArguments);
        Bundle requireArguments = requireArguments();
        this.A04 = requireArguments.getString(TraceFieldType.ContentType);
        this.A06 = requireArguments.getString("page_title");
        this.A05 = requireArguments.getBoolean("scroll_to_video_chat");
        if (this.A06.equals("Live and IGTV")) {
            this.A06 = AnonymousClass0wJ.A0B(this).getString(2131829705);
        }
        this.A01 = this.mFragmentManager;
        this.A03 = new AnonymousClass3VR(this, this.A02);
        C14030oh.A09(452227114, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1137205713);
        super.onResume();
        A0D(this);
        C14030oh.A09(-2037051738, A022);
    }
}
