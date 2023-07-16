package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxListenerShape412S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.kotlindelegate.lifecycle.NotNullLazyAutoCleanup;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0200000_I2_4;
import kotlin.jvm.internal.KtLambdaShape63S0100000_I2_43;

/* renamed from: X.1bt  reason: invalid class name and case insensitive filesystem */
public final class C23081bt extends C34640IcN implements C82424pb, C82034oy {
    public static final /* synthetic */ AnonymousClass0A5[] A06 = C18220wO.A1b(C23081bt.class, "actionBar", "getActionBar()Lcom/instagram/actionbar/ActionBarService;");
    public static final String __redex_internal_original_name = "EncryptedBackupsIntroFragment";
    public AnonymousClass34C A00;
    public IgdsBottomButtonLayout A01;
    public IgdsHeadline A02;
    public final NotNullLazyAutoCleanup A03;
    public final C04530Oa A04 = C80644m9.A00(this);
    public final C04530Oa A05;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        AnonymousClass4u2.A04(C18190wL.A0K(), r3, this, 359);
        r3.Crs("");
        r3.CtT(true);
    }

    public final String getModuleName() {
        return "encrypted_backups_intro";
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r4 = 0
            X.C04220Ms.A0B(r9, r4)
            super.onViewCreated(r9, r10)
            r0 = 2131297589(0x7f090535, float:1.8213127E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r9, r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r0
            r8.A01 = r0
            r0 = 2131301361(0x7f0913f1, float:1.8220778E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r9, r0)
            com.instagram.igds.components.headline.IgdsHeadline r0 = (com.instagram.igds.components.headline.IgdsHeadline) r0
            r8.A02 = r0
            r0 = 2131299002(0x7f090aba, float:1.8215993E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r9, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.AnonymousClass3Zi.A01(r0, r8)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r8.A01
            java.lang.String r2 = "bottomButtons"
            r7 = 0
            if (r1 == 0) goto L_0x0061
            r0 = 360(0x168, float:5.04E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r8, r0)
            r1.setPrimaryActionOnClickListener(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r8.A01
            if (r1 == 0) goto L_0x0061
            r0 = 361(0x169, float:5.06E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r8, r0)
            r1.setSecondaryActionOnClickListener(r0)
            X.0Oa r0 = r8.A04
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.49L r0 = X.AnonymousClass2MV.A00(r0)
            java.lang.Integer r1 = r0.A01()
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r3 = 1
            boolean r2 = X.C18180wK.A1Z(r1, r0)
            X.34C r0 = r8.A00
            if (r0 != 0) goto L_0x0065
            java.lang.String r2 = "ebUserPrefs"
        L_0x0061:
            X.C04220Ms.A0E(r2)
            throw r7
        L_0x0065:
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = "eb_education_soft_block_times_shown"
            int r0 = r1.getInt(r0, r4)
            if (r2 == 0) goto L_0x0080
            r0 = 2131832552(0x7f112ee8, float:1.9298161E38)
        L_0x0072:
            java.lang.String r1 = r8.getString(r0)
        L_0x0076:
            com.instagram.igds.components.headline.IgdsHeadline r0 = r8.A02
            java.lang.String r6 = "headline"
            if (r0 != 0) goto L_0x008e
            X.C04220Ms.A0E(r6)
            throw r7
        L_0x0080:
            if (r0 != 0) goto L_0x0086
            r0 = 2131832553(0x7f112ee9, float:1.9298163E38)
            goto L_0x0072
        L_0x0086:
            if (r0 != r3) goto L_0x008c
            r0 = 2131832554(0x7f112eea, float:1.9298165E38)
            goto L_0x0072
        L_0x008c:
            r1 = r7
            goto L_0x0076
        L_0x008e:
            r0.setHeadline((java.lang.CharSequence) r1)
            if (r2 == 0) goto L_0x00ce
            r0 = 2131826354(0x7f1116b2, float:1.928559E38)
            java.lang.String r5 = r8.getString(r0)
            r0 = 2131826358(0x7f1116b6, float:1.9285598E38)
            java.lang.String r4 = r8.getString(r0)
            r0 = 2131826357(0x7f1116b5, float:1.9285596E38)
            java.lang.String r3 = r8.getString(r0)
        L_0x00a8:
            X.C04220Ms.A09(r3)
            android.content.Context r0 = r8.requireContext()
            X.3Ya r2 = X.C62263Ya.A00(r0)
            r0 = 2131826353(0x7f1116b1, float:1.9285588E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131232771(0x7f080803, float:1.808166E38)
            r2.A03(r5, r1, r0)
            r0 = 2131232278(0x7f080616, float:1.808066E38)
            r2.A03(r4, r3, r0)
            com.instagram.igds.components.headline.IgdsHeadline r1 = r8.A02
            if (r1 != 0) goto L_0x00d8
            X.C04220Ms.A0E(r6)
            throw r7
        L_0x00ce:
            r5 = r7
            r4 = r7
            r0 = 2131826356(0x7f1116b4, float:1.9285594E38)
            java.lang.String r3 = r8.getString(r0)
            goto L_0x00a8
        L_0x00d8:
            java.util.List r0 = r2.A02()
            r1.setBulletList(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23081bt.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void afterOnViewCreated() {
        String str;
        String str2;
        C04530Oa r4 = this.A05;
        C18180wK.A18(this, new KtSLambdaShape9S0200000_I2_4(this, (C146958n9) null, 42), AnonymousClass7C4.A02(((AnonymousClass10F) r4.getValue()).A04));
        if (AnonymousClass3Zi.A03(this)) {
            configureActionBar((E2V) this.A03.A01());
        }
        AnonymousClass10F r5 = (AnonymousClass10F) r4.getValue();
        int A042 = C18190wL.A04(r5.A02.A00, "eb_education_soft_block_times_shown");
        AnonymousClass1oR r42 = r5.A01;
        AnonymousClass01V r2 = r42.A00;
        int A002 = r42.A00();
        if (!r2.isMarkerOn(A002)) {
            r2.markerStart(A002);
        }
        r42.A03("SETUP_TYPE", "PIN");
        AnonymousClass49L r3 = r5.A00;
        Integer A012 = r3.A01();
        Integer num = AnonymousClass006.A0C;
        if (A012 == num) {
            r42.A02("HARD_BLOCK_IMPRESSION");
            str = "HARD_BLOCK";
        } else {
            r42.A02("SOFT_BLOCK_IMPRESSION");
            str = "SOFT_BLOCK";
        }
        if (r3.A01() != num) {
            if (A042 == 0) {
                str2 = "SOFT_BLOCK_1";
            } else {
                str2 = "SOFT_BLOCK_2";
            }
            r42.A03("TOUCHPOINT", str2);
            r42.A03("LOGGED_IN_ACCOUNTS", String.valueOf(r5.A03.A0B()));
        }
        r42.A03("ENTRY_POINT", str);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public final boolean onBackPressed() {
        if (AnonymousClass2MV.A00(AnonymousClass0wJ.A0X(this.A04)).A01() != AnonymousClass006.A0C) {
            return false;
        }
        requireActivity().setResult(106183331);
        return ((AnonymousClass10F) this.A05.getValue()).A00();
    }

    public C23081bt() {
        KtLambdaShape63S0100000_I2_43 A0e = C18250wR.A0e(this, 21);
        C04530Oa A0x = C18200wM.A0x(AnonymousClass006.A0C, C18250wR.A0e(this, 18), 19);
        this.A05 = C18220wO.A0M(C18250wR.A0e(A0x, 20), A0e, C18250wR.A0d(A0x, (Object) null, 9), C18210wN.A0l(AnonymousClass10F.class));
        this.A03 = new NotNullLazyAutoCleanup(this, C18250wR.A0e(this, 17));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(2047443668);
        this.A00 = new AnonymousClass34C(AnonymousClass0wJ.A0X(this.A04));
        super.onCreate(bundle);
        C14030oh.A09(1440581607, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-663813020);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.encrypted_backups_intro_layout, false);
        C14030oh.A09(-1960312881, A022);
        return A0D;
    }

    public final void onResume() {
        C25745DrH A0a;
        int A022 = C14030oh.A02(1803381525);
        super.onResume();
        if (AnonymousClass3Zi.A02(this) && (A0a = C18230wP.A0a(this)) != null) {
            ((C35189Ipf) A0a).A0B = new IDxListenerShape412S0100000_1_I2(this, 1);
        }
        C14030oh.A09(1454243869, A022);
    }
}
