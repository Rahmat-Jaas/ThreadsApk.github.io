package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.redex.IDxConsumerShape376S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2;
import java.util.ArrayList;

/* renamed from: X.1we  reason: invalid class name and case insensitive filesystem */
public final class C29061we extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "NudityDetectionSettingsFragment";
    public C30618GNg A00;
    public AnonymousClass3A7 A01;
    public final C04530Oa A02 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131831921);
    }

    public final String getModuleName() {
        return "nudity_detection_settings";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass3A7 r1 = new AnonymousClass3A7(AnonymousClass0wJ.A0X(this.A02));
        this.A01 = r1;
        this.A00 = new C30618GNg();
        A0v.add(AnonymousClass4MC.A05(this, 21, 2131831921, r1.A01.A00(1)));
        Context requireContext = requireContext();
        String A0k = AnonymousClass0wJ.A0k(requireContext, 2131829574);
        String A0N = AnonymousClass00U.A0N(requireContext.getString(2131831922), A0k, ' ');
        IDxCSpanShape187S0100000_1_I2 A002 = C18730xl.A00(this, C18210wN.A01(requireContext), 21);
        SpannableStringBuilder A0E = C18200wM.A0E(A0N);
        AnonymousClass3Zw.A00(A0E, A002, A0k);
        C63293hC r12 = new C63293hC(A0E);
        r12.A00 = R.style.PrivacyTextStyle;
        A0v.add(r12);
        setItems(A0v);
    }

    public static final void A0B(C29061we r6, boolean z) {
        AnonymousClass3A7 r0 = r6.A01;
        if (r0 == null) {
            C04220Ms.A0E("manager");
            throw null;
        }
        C69954Bp r5 = new C69954Bp(r6, z);
        C37010Jil jil = r0.A00;
        AnonymousClass3A4 A002 = AnonymousClass2NO.A00(r0.A02);
        jil.A02(new IDxConsumerShape376S0100000_1_I2(r5, 1), A002.A00.A0F(new AnonymousClass48Y(A002, 1, 1, z)));
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(1757973307);
        super.onDestroy();
        AnonymousClass3A7 r0 = this.A01;
        if (r0 == null) {
            C04220Ms.A0E("manager");
            throw null;
        }
        r0.A00.A01();
        C14030oh.A09(-1166531287, A022);
    }
}
