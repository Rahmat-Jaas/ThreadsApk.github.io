package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.fbpay.logging.LoggingContext;
import com.instagram.barcelona.R;
import java.util.LinkedHashMap;

/* renamed from: X.5j6  reason: invalid class name */
public final class AnonymousClass5j6 extends AnonymousClass567 implements C145328kK {
    public ContextThemeWrapper A00;
    public View A01;
    public Button A02;
    public AnonymousClass5AC A03;
    public AnonymousClass57U A04;
    public ECPHandler A05;
    public LoggingContext A06;

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0164, code lost:
        if (r1 != false) goto L_0x0166;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            r7 = 0
            X.C04220Ms.A0B(r12, r7)
            super.onViewCreated(r12, r13)
            android.os.Bundle r0 = r11.requireArguments()
            java.lang.String r6 = "logging_context"
            android.os.Parcelable r0 = r0.getParcelable(r6)
            if (r0 == 0) goto L_0x020f
            com.fbpay.logging.LoggingContext r0 = (com.fbpay.logging.LoggingContext) r0
            r11.A06 = r0
            androidx.fragment.app.FragmentActivity r0 = r11.getActivity()
            if (r0 == 0) goto L_0x00c6
            X.AnonymousClass7KT.A03(r11)
            r0 = 2131300750(0x7f09118e, float:1.8219538E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r12, r0)
            r11.A01 = r0
            android.content.Context r2 = r11.requireContext()
            android.view.View r1 = r11.A01
            r5 = 0
            if (r1 != 0) goto L_0x0038
            java.lang.String r0 = "footerDivider"
            X.C04220Ms.A0E(r0)
            throw r5
        L_0x0038:
            r0 = 19
            X.C121047Dv.A00(r2, r1, r0, r7)
            r0 = 2131298931(0x7f090a73, float:1.821585E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r12, r0)
            android.widget.Button r1 = (android.widget.Button) r1
            r11.A02 = r1
            if (r1 != 0) goto L_0x0050
            java.lang.String r0 = "confirmButton"
            X.C04220Ms.A0E(r0)
            throw r5
        L_0x0050:
            r0 = 37
            X.C86104wH.A1C(r1, r0, r11)
            r0 = 2131302644(0x7f0918f4, float:1.822338E38)
            android.view.View r4 = r12.requireViewById(r0)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r0 = 1
            X.C18200wM.A1H(r4, r0)
            r4.setItemAnimator(r5)
            com.fbpay.logging.LoggingContext r2 = r11.A06
            java.lang.String r3 = "loggingContext"
            if (r2 != 0) goto L_0x006f
            X.C04220Ms.A0E(r3)
            throw r5
        L_0x006f:
            r0 = 14
            kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2 r1 = new kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2
            r1.<init>((int) r0, (java.lang.Object) r11, (java.lang.Object) r4)
            r0 = 28
            kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1 r0 = X.C86154wM.A11(r4, r11, r0)
            X.5gM r9 = new X.5gM
            r9.<init>(r2, r0, r1)
            com.fbpay.logging.LoggingContext r0 = r11.A06
            if (r0 != 0) goto L_0x0089
            X.C04220Ms.A0E(r3)
            throw r5
        L_0x0089:
            X.5g3 r8 = new X.5g3
            r8.<init>(r0)
            com.fbpay.logging.LoggingContext r2 = r11.A06
            if (r2 != 0) goto L_0x0096
            X.C04220Ms.A0E(r3)
            throw r5
        L_0x0096:
            r1 = 17
            kotlin.jvm.internal.KtLambdaShape48S0200000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape48S0200000_I2
            r0.<init>(r1, r4, r11)
            X.5g8 r3 = new X.5g8
            r3.<init>(r2, r0)
            X.69U r0 = r9.A02
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r9)
            X.69U r0 = r8.A02
            kotlin.Pair r1 = X.C18180wK.A0p(r0, r8)
            X.69U r0 = r3.A02
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r3)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r2, r1, r0}
            java.util.Map r1 = X.AnonymousClass4WJ.A0H(r0)
            X.5AC r0 = new X.5AC
            r0.<init>(r1)
            r11.A03 = r0
            r4.setAdapter(r0)
        L_0x00c6:
            r5 = 0
            X.58M r0 = X.C116896xj.A01(r11, r5)
            X.587 r1 = r0.A1O
            X.7aX r0 = new X.7aX
            r0.<init>(r1)
            X.7IU r1 = X.AnonymousClass7IU.A00(r0, r11)
            java.lang.Class<X.57U> r0 = X.AnonymousClass57U.class
            X.3ak r3 = r1.A01(r0)
            X.57U r3 = (X.AnonymousClass57U) r3
            r11.A04 = r3
            java.lang.String r10 = "confirmationViewModel"
            if (r3 != 0) goto L_0x00e8
            X.C04220Ms.A0E(r10)
            throw r5
        L_0x00e8:
            android.os.Bundle r8 = r11.requireArguments()
            java.lang.String r0 = "ECP_CONFIRMATION_FRAGMENT_PARAMS"
            android.os.Parcelable r1 = r8.getParcelable(r0)
            boolean r0 = r1 instanceof com.facebookpay.confirmation.model.ECPConfirmationParams
            if (r0 == 0) goto L_0x0115
            if (r1 == 0) goto L_0x0115
            X.7Kx r2 = X.AnonymousClass7Kx.A0A(r1)
        L_0x00fc:
            r3.A00 = r2
            X.56r r1 = r3.A04
            java.lang.String r9 = "confirmationParams"
            X.7ST r0 = X.AnonymousClass7ST.A00
            X.7Kx r0 = X.AnonymousClass7Kx.A03(r0, r2)
            r1.A0H(r0)
            X.56r r2 = r3.A05
            X.7Kx r1 = r3.A00
            if (r1 != 0) goto L_0x0120
            X.C04220Ms.A0E(r9)
            throw r5
        L_0x0115:
            java.lang.String r0 = "No confirmation params provided!"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            X.7Kx r2 = X.AnonymousClass7Kx.A0B(r5, r0)
            goto L_0x00fc
        L_0x0120:
            X.7SU r0 = X.AnonymousClass7SU.A00
            X.7Kx r0 = X.AnonymousClass7Kx.A03(r0, r1)
            r2.A0H(r0)
            X.56r r1 = r3.A06
            X.7Kx r0 = r3.A00
            if (r0 != 0) goto L_0x0133
            X.C04220Ms.A0E(r9)
            throw r5
        L_0x0133:
            r4 = 1
            X.7Kx r0 = X.AnonymousClass7Kx.A07(r0, r3, r4)
            r1.A0H(r0)
            android.os.Parcelable r6 = r8.getParcelable(r6)
            if (r6 == 0) goto L_0x020a
            com.fbpay.logging.LoggingContext r6 = (com.fbpay.logging.LoggingContext) r6
            X.7Kx r1 = r3.A00
            if (r1 != 0) goto L_0x014b
            X.C04220Ms.A0E(r9)
            throw r5
        L_0x014b:
            boolean r0 = X.AnonymousClass7Kx.A0R(r1)
            if (r0 == 0) goto L_0x019f
            X.7ke r2 = X.AnonymousClass7JJ.A00()
            java.lang.Object r0 = X.AnonymousClass7Kx.A0D(r1)
            com.facebookpay.confirmation.model.ECPConfirmationParams r0 = (com.facebookpay.confirmation.model.ECPConfirmationParams) r0
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x0166
            boolean r1 = X.AnonymousClass8bQ.A0n(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0167
        L_0x0166:
            r0 = 1
        L_0x0167:
            r9 = r0 ^ 1
            X.587 r0 = r3.A07
            java.util.LinkedHashMap r8 = X.AnonymousClass7Kr.A07(r0)
            X.C04220Ms.A0B(r6, r7)
            com.facebook.quicklog.QuickPerformanceLogger r7 = r2.A01
            r3 = 223884226(0xd5833c2, float:6.662244E-31)
            java.lang.String r0 = "CONFIRMATION_SCREEN_DISPLAY"
            r7.markerPoint(r3, r0)
            X.09x r1 = r2.A00
            java.lang.String r0 = "client_load_ecpconfirmation_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 285(0x11d, float:4.0E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            r1 = 3
            kotlin.jvm.internal.KtLambdaShape5S0210000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape5S0210000_I2
            r0.<init>(r1, r6, r8, r9)
            X.C128957ke.A04(r2, r6, r0)
            r0 = 2
            r7.markerEnd(r3, r0)
        L_0x0197:
            X.57U r0 = r11.A04
            if (r0 != 0) goto L_0x01cf
            X.C04220Ms.A0E(r10)
            throw r5
        L_0x019f:
            boolean r0 = X.AnonymousClass7Kx.A0O(r1)
            if (r0 == 0) goto L_0x0197
            X.7ke r2 = X.AnonymousClass7JJ.A00()
            java.lang.Throwable r1 = r1.A02
            X.587 r0 = r3.A07
            java.util.LinkedHashMap r3 = X.AnonymousClass7Kr.A07(r0)
            X.C86114wI.A1P(r1, r3)
            X.C04220Ms.A0B(r6, r7)
            X.09x r1 = r2.A00
            java.lang.String r0 = "client_load_ecpconfirmation_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 283(0x11b, float:3.97E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            r1 = 5
            kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2 r0 = new kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r3)
            X.C128957ke.A04(r2, r6, r0)
            goto L_0x0197
        L_0x01cf:
            X.M5J r1 = r0.A01
            r0 = 151(0x97, float:2.12E-43)
            X.C86104wH.A1F(r11, r1, r0)
            X.57U r0 = r11.A04
            if (r0 != 0) goto L_0x01de
            X.C04220Ms.A0E(r10)
            throw r5
        L_0x01de:
            X.M5J r1 = r0.A03
            r0 = 152(0x98, float:2.13E-43)
            X.C86104wH.A1F(r11, r1, r0)
            com.facebook.redex.IDxDListenerShape321S0100000_2_I2 r1 = new com.facebook.redex.IDxDListenerShape321S0100000_2_I2
            r1.<init>(r11, r4)
            androidx.fragment.app.Fragment r0 = r11.mParentFragment
            java.lang.String r2 = "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment"
            X.C04220Ms.A0C(r0, r2)
            X.5qq r0 = (X.AnonymousClass5qq) r0
            r0.A00 = r1
            r0 = 2
            com.facebook.redex.IDxDListenerShape321S0100000_2_I2 r1 = new com.facebook.redex.IDxDListenerShape321S0100000_2_I2
            r1.<init>(r11, r0)
            androidx.fragment.app.Fragment r0 = r11.mParentFragment
            X.C04220Ms.A0C(r0, r2)
            X.099 r0 = (X.AnonymousClass099) r0
            android.app.Dialog r0 = r0.A02
            if (r0 == 0) goto L_0x0209
            r0.setOnDismissListener(r1)
        L_0x0209:
            return
        L_0x020a:
            java.lang.IllegalStateException r5 = X.AnonymousClass0wJ.A0b()
            throw r5
        L_0x020f:
            java.lang.IllegalStateException r5 = X.AnonymousClass0wJ.A0b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5j6.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A03(AnonymousClass5j6 r2, LoggingContext loggingContext, String str, String str2) {
        C128957ke A002 = AnonymousClass7JJ.A00();
        AnonymousClass57U r0 = r2.A04;
        if (r0 == null) {
            C04220Ms.A0E("confirmationViewModel");
            throw null;
        }
        LinkedHashMap A07 = AnonymousClass7Kr.A07(r0.A07);
        if (str2 != null) {
            A07.put("upsell_action_type", str2);
        }
        C128957ke.A03(C18180wK.A0I(C86104wH.A0K(C128957ke.A00(A002, str), "user_click_ecpconfirmation_atomic"), 2838), loggingContext, A07, str, 14);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1397617637);
        ContextThemeWrapper A002 = AnonymousClass567.A00(this, layoutInflater);
        this.A00 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.ecp_confirmation_fragment, viewGroup, false);
        C14030oh.A09(-1225890251, A022);
        return inflate;
    }

    public final /* synthetic */ boolean Bnq(LoggingContext loggingContext, Integer num) {
        return false;
    }

    public final void CkR(ECPHandler eCPHandler) {
        this.A05 = eCPHandler;
    }
}
