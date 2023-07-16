package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.redex.IDxTCallbackShape820S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape21S0200000_I2_5;
import kotlin.jvm.internal.KtLambdaShape41S0100000_I2_21;

/* renamed from: X.1cC  reason: invalid class name */
public final class AnonymousClass1cC extends C34640IcN implements C82424pb, C82034oy, C82254pK {
    public static final String __redex_internal_original_name = "PromoteUpdateAccountSpendLimitFragment";
    public C58923Id A00;
    public UserSession A01;
    public String A02;
    public final C04530Oa A03;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        r3.Cqb(2131833734);
        AnonymousClass4u2.A04(C18190wL.A0K(), r3, this, 179);
        r3.CtT(true);
    }

    public final String getModuleName() {
        return "promote_update_account_spend_limit_view";
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r3 = 0
            X.C04220Ms.A0B(r5, r3)
            java.lang.String r1 = r4.A02
            if (r1 != 0) goto L_0x000f
            java.lang.String r0 = "previousStep"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x000f:
            X.Iu2 r0 = X.C35394Iu2.A11
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.equals(r0)
            r2 = 8
            if (r0 == 0) goto L_0x0070
            r0 = 2131301911(0x7f091617, float:1.8221893E38)
            X.C18190wL.A18(r5, r0, r3)
            r0 = 2131304978(0x7f092212, float:1.8228114E38)
            X.C18190wL.A18(r5, r0, r2)
            r0 = 2131304920(0x7f0921d8, float:1.8227996E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r5, r0)
            r0 = 2131833739(0x7f11338b, float:1.9300569E38)
            r1.setText(r0)
            r0 = 2131304921(0x7f0921d9, float:1.8227998E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r5, r0)
            r0 = 2131833737(0x7f113389, float:1.9300565E38)
        L_0x0040:
            r1.setText(r0)
        L_0x0043:
            X.Iu2 r1 = X.C35394Iu2.A1B
            X.3Id r0 = new X.3Id
            r0.<init>(r5, r1)
            r4.A00 = r0
            r0.A00()
            X.3Id r2 = r4.A00
            if (r2 == 0) goto L_0x00c4
            android.content.Context r1 = r4.requireContext()
            r0 = 2131833735(0x7f113387, float:1.930056E38)
            java.lang.String r0 = r1.getString(r0)
            X.AnonymousClass2KF.A00(r4, r2, r0)
            X.3Id r1 = r4.A00
            if (r1 == 0) goto L_0x0069
            r0 = 1
            r1.A03(r0)
        L_0x0069:
            X.C18200wM.A1F(r4)
            super.onViewCreated(r5, r6)
            return
        L_0x0070:
            X.Iu2 r0 = X.C35394Iu2.A19
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0043
            r0 = 2131304448(0x7f092000, float:1.8227039E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r5, r0)
            X.Bza r0 = X.C24044D6t.A00(r0)
            android.view.View r1 = r0.BLC()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            X.0Oa r0 = r4.A03
            java.lang.Object r0 = r0.getValue()
            X.0zg r0 = (X.C19320zg) r0
            com.instagram.business.promote.model.PromoteData r0 = r0.A01
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0p
            X.C04220Ms.A05(r0)
            r1.setUrl(r0, r4)
            r0 = 2131304978(0x7f092212, float:1.8228114E38)
            X.C18190wL.A18(r5, r0, r3)
            r0 = 2131301911(0x7f091617, float:1.8221893E38)
            X.C18190wL.A18(r5, r0, r2)
            r0 = 2131304920(0x7f0921d8, float:1.8227996E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r5, r0)
            r0 = 2131833738(0x7f11338a, float:1.9300567E38)
            r1.setText(r0)
            r0 = 2131304921(0x7f0921d9, float:1.8227998E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r5, r0)
            r0 = 2131833736(0x7f113388, float:1.9300562E38)
            goto L_0x0040
        L_0x00c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cC.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final boolean onBackPressed() {
        String str = this.A02;
        if (str == null) {
            C04220Ms.A0E("previousStep");
            throw null;
        } else if (!str.equals(C35394Iu2.A11.toString())) {
            return false;
        } else {
            ((C19320zg) this.A03.getValue()).A01.A2Y = true;
            C18190wL.A1A(this);
            return false;
        }
    }

    public AnonymousClass1cC() {
        KtLambdaShape41S0100000_I2_21 ktLambdaShape41S0100000_I2_21 = new KtLambdaShape41S0100000_I2_21(this, 13);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape41S0100000_I2_21(new KtLambdaShape41S0100000_I2_21(this, 10), 11));
        this.A03 = C18220wO.A0M(new KtLambdaShape41S0100000_I2_21(A012, 12), ktLambdaShape41S0100000_I2_21, new KtLambdaShape21S0200000_I2_5(6, A012, (Object) null), C18210wN.A0l(C19320zg.class));
    }

    public final void BjA() {
        FragmentActivity requireActivity = requireActivity();
        UserSession userSession = this.A01;
        if (userSession == null) {
            C18210wN.A0m();
            throw null;
        } else {
            C37740K2a.A04(requireActivity, new IDxTCallbackShape820S0100000_1_I2(this, 0), userSession, true);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-337398522);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString(OptSvcAnalyticsStore.LOGGING_KEY_STEP);
            if (string != null) {
                this.A02 = string;
            } else {
                IllegalStateException A0b = AnonymousClass0wJ.A0b();
                C14030oh.A09(989727707, A022);
                throw A0b;
            }
        }
        UserSession userSession = ((C19320zg) this.A03.getValue()).A01.A0v;
        C04220Ms.A05(userSession);
        this.A01 = userSession;
        C14030oh.A09(553764036, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1038611858);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_update_account_spend_limit_view, viewGroup, false);
        C14030oh.A09(-1804638645, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-93126396);
        super.onDestroyView();
        C14030oh.A09(-2013533565, A022);
    }
}
