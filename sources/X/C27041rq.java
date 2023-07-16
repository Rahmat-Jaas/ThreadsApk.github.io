package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0301000_I2_4;
import kotlin.jvm.internal.KtLambdaShape161S0100000_I2_16;
import kotlin.jvm.internal.KtLambdaShape32S0200000_I2_16;
import kotlin.jvm.internal.KtLambdaShape91S0100000_I2_71;

/* renamed from: X.1rq  reason: invalid class name and case insensitive filesystem */
public final class C27041rq extends AnonymousClass5xM {
    public static final String __redex_internal_original_name = "CreatorRevshareSettingsFragment";
    public final C04530Oa A00;

    public final void A0A() {
    }

    public final void configureActionBar(AnonymousClass4u2 r4) {
        C04220Ms.A0B(r4, 0);
        int i = 2131828571;
        if (((CA6) this.A00.getValue()).A00.ordinal() == 1) {
            i = 2131828535;
        }
        r4.Cqb(i);
        C25764Drc A0K = C18240wQ.A0K();
        A0K.A05 = R.drawable.instagram_settings_pano_outline_24;
        A0K.A04 = 2131828570;
        r4.A7Q(C18190wL.A0L(A0K, this, 40));
        r4.CtT(true);
    }

    public final String getModuleName() {
        return "creator_revshare_setting";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass061 r4 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4(viewLifecycleOwner, r4, this, (C146958n9) null, 41), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final UserMonetizationProductType A07() {
        return ((CA6) this.A00.getValue()).A01;
    }

    public final void A0B() {
        Object value;
        KtCSuperShape0S2020000_I2 ktCSuperShape0S2020000_I2;
        CA6 ca6 = (CA6) this.A00.getValue();
        C86074wE r6 = ca6.A08;
        do {
            value = r6.getValue();
            ktCSuperShape0S2020000_I2 = (KtCSuperShape0S2020000_I2) value;
        } while (!r6.ADi(value, new KtCSuperShape0S2020000_I2(ktCSuperShape0S2020000_I2.A00, ktCSuperShape0S2020000_I2.A01, true, ktCSuperShape0S2020000_I2.A02)));
        ca6.A03.A01(ca6.A01, new KtLambdaShape161S0100000_I2_16(ca6, 25));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (r1.A03 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(boolean r8) {
        /*
            r7 = this;
            X.0Oa r0 = r7.A00
            java.lang.Object r0 = r0.getValue()
            X.CA6 r0 = (X.CA6) r0
            X.4wE r6 = r0.A08
        L_0x000a:
            java.lang.Object r5 = r6.getValue()
            r1 = r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2) r1
            if (r8 != 0) goto L_0x0018
            boolean r0 = r1.A03
            r4 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r4 = 1
        L_0x0019:
            java.lang.String r3 = r1.A00
            java.lang.String r2 = r1.A01
            boolean r1 = r1.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2020000_I2
            r0.<init>(r3, r2, r4, r1)
            boolean r0 = r6.ADi(r5, r0)
            if (r0 == 0) goto L_0x000a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27041rq.A0D(boolean):void");
    }

    public C27041rq() {
        KtLambdaShape91S0100000_I2_71 ktLambdaShape91S0100000_I2_71 = new KtLambdaShape91S0100000_I2_71(this, 25);
        C04530Oa A01 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape91S0100000_I2_71(new KtLambdaShape91S0100000_I2_71(this, 26), 27));
        this.A00 = C18220wO.A0M(new KtLambdaShape91S0100000_I2_71(A01, 28), ktLambdaShape91S0100000_I2_71, new KtLambdaShape32S0200000_I2_16(0, (Object) null, A01), C18210wN.A0l(CA6.class));
    }
}
