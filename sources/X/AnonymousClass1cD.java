package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.barcelona.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape21S0200000_I2_5;
import kotlin.jvm.internal.KtLambdaShape41S0100000_I2_21;

/* renamed from: X.1cD  reason: invalid class name */
public final class AnonymousClass1cD extends C34640IcN implements C82424pb, C82034oy, C82254pK {
    public static final String __redex_internal_original_name = "PromoteBeneficiaryAndPayerFragment";
    public Drawable A00;
    public Drawable A01;
    public C58923Id A02;
    public UserSession A03;
    public String A04;
    public final C04530Oa A05 = C62373Zc.A03(new KtLambdaShape41S0100000_I2_21(this, 19));
    public final C04530Oa A06;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        r3.Cqb(2131833164);
        AnonymousClass4u2.A04(C18190wL.A0K(), r3, this, 187);
        r3.CtT(true);
    }

    public final String getModuleName() {
        return "promote_beneficiary_and_payer_view";
    }

    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008d, code lost:
        if (r0 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008f, code lost:
        r0 = "errorIcon";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0092, code lost:
        r2.setImageDrawable(r0);
        r1 = X.AnonymousClass0wJ.A0L(r8, com.instagram.barcelona.R.id.beneficiary_input);
        r1.setText(((X.C19360zk) r5.getValue()).A00);
        r1.addTextChangedListener(new com.facebook.redex.IDxObjectShape170S0200000_1_I2(0, r2, r7));
        r2 = (android.widget.ImageView) X.AnonymousClass0wJ.A0J(r8, com.instagram.barcelona.R.id.payer_status_icon);
        r0 = ((X.C19360zk) r5.getValue()).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c0, code lost:
        if (r0 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c6, code lost:
        if (r0.length() == 0) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c8, code lost:
        r0 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ca, code lost:
        if (r0 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00cd, code lost:
        r0 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cf, code lost:
        if (r0 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d2, code lost:
        r2.setImageDrawable(r0);
        r1 = X.AnonymousClass0wJ.A0L(r8, com.instagram.barcelona.R.id.payer_input);
        r1.setText(((X.C19360zk) r5.getValue()).A01);
        r1.addTextChangedListener(new com.facebook.redex.IDxObjectShape170S0200000_1_I2(1, r2, r7));
        r4 = X.C35394Iu2.A0F;
        r0 = new X.C58923Id(r8, r4);
        r7.A02 = r0;
        r0.A00();
        r2 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00fd, code lost:
        if (r2 == null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ff, code lost:
        X.AnonymousClass2KF.A00(r7, r2, requireContext().getString(2131833165));
        r3 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x010f, code lost:
        if (r3 == null) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0111, code lost:
        r2 = (X.C19360zk) r5.getValue();
        r0 = r2.A00;
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x011a, code lost:
        if (r0 == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0120, code lost:
        if (r0.length() == 0) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0122, code lost:
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0124, code lost:
        if (r0 == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x012a, code lost:
        if (r0.length() == 0) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012c, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x012d, code lost:
        r3.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0130, code lost:
        X.C18200wM.A1F(r7);
        ((X.C37741K2b) r7.A05.getValue()).A0P(r4.toString());
        super.onViewCreated(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0145, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x014a, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0082, code lost:
        if (r0 == null) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r4 = 0
            android.content.Context r1 = X.C18240wQ.A0A(r7, r8, r4)
            r0 = 2131833166(0x7f11314e, float:1.9299406E38)
            java.lang.String r5 = X.AnonymousClass0wJ.A0k(r1, r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131833167(0x7f11314f, float:1.9299408E38)
            r3 = 1
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r1, r5, r0)
            android.text.SpannableStringBuilder r2 = X.C18200wM.A0E(r0)
            int r1 = X.C18180wK.A00(r7)
            r0 = 6
            X.C18730xl.A01(r2, r7, r5, r1, r0)
            r0 = 2131304922(0x7f0921da, float:1.8228E38)
            android.widget.TextView r0 = X.AnonymousClass0wJ.A0L(r8, r0)
            r0.setText(r2)
            X.C18180wK.A0z(r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131232571(0x7f08073b, float:1.8081255E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            java.lang.String r6 = "Required value was null."
            if (r2 == 0) goto L_0x0150
            r7.A01 = r2
            android.content.Context r1 = r7.requireContext()
            r0 = 2131100067(0x7f0601a3, float:1.7812505E38)
            X.C63393hP.A03(r1, r2, r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131232441(0x7f0806b9, float:1.8080991E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            if (r2 == 0) goto L_0x014b
            r7.A00 = r2
            android.content.Context r1 = r7.requireContext()
            r0 = 2131100117(0x7f0601d5, float:1.7812606E38)
            X.C63393hP.A03(r1, r2, r0)
            r0 = 2131297380(0x7f090464, float:1.8212703E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            X.0Oa r5 = r7.A06
            java.lang.Object r0 = r5.getValue()
            X.0zk r0 = (X.C19360zk) r0
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x008b
            int r0 = r0.length()
            if (r0 == 0) goto L_0x008b
            android.graphics.drawable.Drawable r0 = r7.A00
            if (r0 != 0) goto L_0x0092
        L_0x0084:
            java.lang.String r0 = "checkIcon"
        L_0x0086:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x008b:
            android.graphics.drawable.Drawable r0 = r7.A01
            if (r0 != 0) goto L_0x0092
        L_0x008f:
            java.lang.String r0 = "errorIcon"
            goto L_0x0086
        L_0x0092:
            r2.setImageDrawable(r0)
            r0 = 2131297377(0x7f090461, float:1.8212697E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r8, r0)
            java.lang.Object r0 = r5.getValue()
            X.0zk r0 = (X.C19360zk) r0
            java.lang.String r0 = r0.A00
            r1.setText(r0)
            com.facebook.redex.IDxObjectShape170S0200000_1_I2 r0 = new com.facebook.redex.IDxObjectShape170S0200000_1_I2
            r0.<init>(r4, r2, r7)
            r1.addTextChangedListener(r0)
            r0 = 2131304073(0x7f091e89, float:1.8226278E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r8, r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.Object r0 = r5.getValue()
            X.0zk r0 = (X.C19360zk) r0
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x00cd
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00cd
            android.graphics.drawable.Drawable r0 = r7.A00
            if (r0 != 0) goto L_0x00d2
            goto L_0x0084
        L_0x00cd:
            android.graphics.drawable.Drawable r0 = r7.A01
            if (r0 != 0) goto L_0x00d2
            goto L_0x008f
        L_0x00d2:
            r2.setImageDrawable(r0)
            r0 = 2131304071(0x7f091e87, float:1.8226274E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r8, r0)
            java.lang.Object r0 = r5.getValue()
            X.0zk r0 = (X.C19360zk) r0
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            com.facebook.redex.IDxObjectShape170S0200000_1_I2 r0 = new com.facebook.redex.IDxObjectShape170S0200000_1_I2
            r0.<init>(r3, r2, r7)
            r1.addTextChangedListener(r0)
            X.Iu2 r4 = X.C35394Iu2.A0F
            X.3Id r0 = new X.3Id
            r0.<init>(r8, r4)
            r7.A02 = r0
            r0.A00()
            X.3Id r2 = r7.A02
            if (r2 == 0) goto L_0x0146
            android.content.Context r1 = r7.requireContext()
            r0 = 2131833165(0x7f11314d, float:1.9299404E38)
            java.lang.String r0 = r1.getString(r0)
            X.AnonymousClass2KF.A00(r7, r2, r0)
            X.3Id r3 = r7.A02
            if (r3 == 0) goto L_0x0130
            java.lang.Object r2 = r5.getValue()
            X.0zk r2 = (X.C19360zk) r2
            java.lang.String r0 = r2.A00
            r1 = 0
            if (r0 == 0) goto L_0x012d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x012d
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L_0x012d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x012d
            r1 = 1
        L_0x012d:
            r3.A03(r1)
        L_0x0130:
            X.C18200wM.A1F(r7)
            X.0Oa r0 = r7.A05
            java.lang.Object r1 = r0.getValue()
            X.K2b r1 = (X.C37741K2b) r1
            java.lang.String r0 = r4.toString()
            r1.A0P(r0)
            super.onViewCreated(r8, r9)
            return
        L_0x0146:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x014b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        L_0x0150:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cD.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void BjA() {
        String str;
        C04530Oa r3 = this.A06;
        C19360zk r2 = (C19360zk) r3.getValue();
        PromoteData promoteData = r2.A02;
        promoteData.A1q = true;
        promoteData.A0z = r2.A00;
        promoteData.A11 = r2.A01;
        ((C37741K2b) this.A05.getValue()).A0E(C35394Iu2.A0F, ((C19360zk) r3.getValue()).A02);
        String str2 = this.A04;
        if (str2 == null) {
            str = "previousStep";
        } else {
            if (str2.equals(C35394Iu2.A19.toString())) {
                C18190wL.A19(this);
            }
            C62883b4.A03();
            C34613Ibj ibj = new C34613Ibj();
            FragmentActivity activity = getActivity();
            UserSession userSession = this.A03;
            if (userSession == null) {
                str = "userSession";
            } else {
                C18230wP.A19(ibj, C18180wK.A0Q(activity, userSession));
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        UserSession userSession = this.A03;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public AnonymousClass1cD() {
        KtLambdaShape41S0100000_I2_21 ktLambdaShape41S0100000_I2_21 = new KtLambdaShape41S0100000_I2_21(this, 23);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape41S0100000_I2_21(new KtLambdaShape41S0100000_I2_21(this, 20), 21));
        this.A06 = C18220wO.A0M(new KtLambdaShape41S0100000_I2_21(A012, 22), ktLambdaShape41S0100000_I2_21, new KtLambdaShape21S0200000_I2_5(7, A012, (Object) null), C18210wN.A0l(C19360zk.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-2086088463);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString(OptSvcAnalyticsStore.LOGGING_KEY_STEP);
            if (string != null) {
                this.A04 = string;
            } else {
                IllegalStateException A0b = AnonymousClass0wJ.A0b();
                C14030oh.A09(1668439938, A022);
                throw A0b;
            }
        }
        UserSession userSession = ((C19360zk) this.A06.getValue()).A02.A0v;
        C04220Ms.A05(userSession);
        this.A03 = userSession;
        C14030oh.A09(1778796137, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(774019845);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_beneficiary_and_payer_view, viewGroup, false);
        C14030oh.A09(-776821347, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1871407683);
        super.onDestroyView();
        C14030oh.A09(1991881752, A022);
    }
}
