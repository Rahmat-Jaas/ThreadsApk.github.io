package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxRCallbackShape874S0100000_1_I2;
import com.facebook.redex.IDxTListenerShape416S0100000_1_I2;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape13S0301000_I2_5;
import kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95;
import kotlin.jvm.internal.KtLambdaShape33S0200000_I2_17;

/* renamed from: X.1xU  reason: invalid class name and case insensitive filesystem */
public final class C29201xU extends C23411dm implements C82034oy, C33745Htj {
    public static final String __redex_internal_original_name = "BusinessOptionsFragment";
    public C28321u4 A00;
    public AnonymousClass47H A01;
    public C67193z5 A02;
    public final C04530Oa A03 = C80644m9.A00(this);
    public final C04530Oa A04;
    public final C82394pY A05;

    public final void BNY(Intent intent) {
        C04220Ms.A0B(intent, 0);
        C04220Ms.A0C(getRootActivity(), "null cannot be cast to non-null type com.instagram.mainactivity.delegate.IgMainActivity");
        throw C18210wN.A0W("getMediaCaptureActivityController");
    }

    public final void Cv8(File file, int i) {
        C04220Ms.A0B(file, 0);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass3Zy.A02(activity, file, i);
        }
    }

    public final void CvN(Intent intent, int i) {
        C04220Ms.A0B(intent, 0);
        C10650ih.A0E(intent, this, i);
    }

    public final String getModuleName() {
        return I17.A00(311);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28321u4 r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        AnonymousClass061 r4 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape13S0301000_I2_5(viewLifecycleOwner, r4, this, (C146958n9) null, 7), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public C29201xU() {
        KtLambdaShape115S0100000_I2_95 ktLambdaShape115S0100000_I2_95 = new KtLambdaShape115S0100000_I2_95(this, 23);
        C04530Oa A0l = C18240wQ.A0l(AnonymousClass006.A0C, new KtLambdaShape115S0100000_I2_95(this, 20), 21);
        this.A04 = C18220wO.A0M(new KtLambdaShape115S0100000_I2_95(A0l, 22), ktLambdaShape115S0100000_I2_95, new KtLambdaShape33S0200000_I2_17(46, (Object) null, A0l), C18210wN.A0l(AnonymousClass103.class));
        this.A05 = C18220wO.A0P(this, 71);
    }

    public static final void A0B(C29201xU r4) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C67193z5 r2 = r4.A02;
        if (r2 != null) {
            r2.A01(r4, "business", A0v, (List) ((AnonymousClass103) r4.A04.getValue()).A04.getValue());
        }
        r4.setItems(A0v);
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        int i = 2131822792;
        if (C59623Lo.A01(C18240wQ.A0V(r3).A01(AnonymousClass0wJ.A0X(this.A03)))) {
            i = 2131824635;
        }
        C23411dm.A05(this, r3, i);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-915856484);
        super.onCreate(bundle);
        C36622Sa.A00();
        C04530Oa r4 = this.A03;
        UserSession A0X = AnonymousClass0wJ.A0X(r4);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put(QPTooltipAnchor.A16, new C70874Gq());
        C04220Ms.A0B(A0X, 0);
        this.A01 = new AnonymousClass47H(A0X, A0y);
        C61833Vz A002 = C36622Sa.A00();
        UserSession A0X2 = AnonymousClass0wJ.A0X(r4);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0a;
        C36622Sa.A00();
        this.A00 = A002.A04(this, this, C61403Th.A00((C17701AKf) null, (AnonymousClass38Q) null, (AnonymousClass35B) null, (AnonymousClass35C) null, (C559435e) null, (C82894qR) null, (C82904qS) null, new IDxTListenerShape416S0100000_1_I2(this, 2), (C82914qT) null, this.A01, (C561335x) null, (Boolean) null), quickPromotionSlot, A0X2);
        C67193z5 r5 = new C67193z5(this, AnonymousClass0wJ.A0X(r4), this, this, I17.A00(311));
        this.A02 = r5;
        if (r5.A02()) {
            AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(r4)).A01(this.A05, KIH.class);
        }
        registerLifecycleListener(this.A01);
        registerLifecycleListener(this.A00);
        C14030oh.A09(-60227208, A022);
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(601381266);
        super.onDestroy();
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(this.A03)).A02(this.A05, KIH.class);
        unregisterLifecycleListener(this.A01);
        unregisterLifecycleListener(this.A00);
        C14030oh.A09(1835511153, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-2099526735);
        super.onResume();
        A0B(this);
        C63493hb.A05(requireContext(), AnonymousClass06E.A00(this), AnonymousClass0wJ.A0X(this.A03), new IDxRCallbackShape874S0100000_1_I2(this, 0));
        C14030oh.A09(1071916398, A022);
    }
}
