package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxMListenerShape500S0100000_1_I2;
import com.facebook.redex.IDxPCleanerShape530S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;
import com.instagram.urlhandlers.brandedcontent.BrandedContentUrlHandlerActivity;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2;
import kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4;
import kotlin.jvm.internal.KtLambdaShape38S0100000_I2_18;

/* renamed from: X.1be  reason: invalid class name and case insensitive filesystem */
public final class C22941be extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "BrandedContentSettingsFragment";
    public C28321u4 A00;
    public AnonymousClass0ZU A01 = new KtLambdaShape38S0100000_I2_18(this, 34);
    public final C04530Oa A02 = C62373Zc.A03(new KtLambdaShape38S0100000_I2_18(this, 28));
    public final C04530Oa A03 = C62373Zc.A03(new KtLambdaShape38S0100000_I2_18(this, 32));
    public final C04530Oa A04;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131822521);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        C18240wQ.A12((RecyclerView) AnonymousClass0wJ.A0J(view2, R.id.branded_content_settings_recycler_view), this.A02);
        AnonymousClass58F r5 = (AnonymousClass58F) this.A04.getValue();
        C18190wL.A1C(getViewLifecycleOwner(), r5.A04, this, 2);
        r5.A03();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape16S0201000_I2_2((Object) r5, (Object) this, (C146958n9) null, 40), C18200wM.A0M(this), 3);
        C61833Vz A002 = C36622Sa.A00();
        UserSession A0X = AnonymousClass0wJ.A0X(this.A03);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A08;
        C36622Sa.A00();
        C28321u4 A042 = A002.A04(this, this, C61403Th.A00((C17701AKf) null, (AnonymousClass38Q) null, (AnonymousClass35B) null, (AnonymousClass35C) null, (C559435e) null, (C82894qR) null, new IDxMListenerShape500S0100000_1_I2(this, 0), (C83704rq) null, new IDxPCleanerShape530S0100000_1_I2(this, 0), (AnonymousClass47H) null, (C561335x) null, (Boolean) null), quickPromotionSlot, A0X);
        this.A00 = A042;
        registerLifecycleListener(A042);
        C28321u4 r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("quickPromotionDelegate");
            throw null;
        } else {
            r0.A01();
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public C22941be() {
        KtLambdaShape38S0100000_I2_18 ktLambdaShape38S0100000_I2_18 = new KtLambdaShape38S0100000_I2_18(this, 33);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape38S0100000_I2_18(new KtLambdaShape38S0100000_I2_18(this, 29), 30));
        this.A04 = C18220wO.A0M(new KtLambdaShape38S0100000_I2_18(A012, 31), ktLambdaShape38S0100000_I2_18, new KtLambdaShape20S0200000_I2_4(43, (Object) null, (Object) A012), C18210wN.A0l(AnonymousClass58F.class));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null && intent.getBooleanExtra("EXTRA_IS_ONBOARDING_COMPLETE", false)) {
            ((AnonymousClass58F) this.A04.getValue()).A03();
        }
    }

    public final boolean onBackPressed() {
        if (requireActivity() instanceof BrandedContentUrlHandlerActivity) {
            C18190wL.A1A(this);
            return true;
        }
        getParentFragmentManager().A11((String) null, 0);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1443888562);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.branded_content_settings, viewGroup, false);
        C14030oh.A09(-2027261446, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(938483432);
        super.onDestroyView();
        C28321u4 r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("quickPromotionDelegate");
            throw null;
        }
        unregisterLifecycleListener(r0);
        C14030oh.A09(2047128845, A022);
    }
}
