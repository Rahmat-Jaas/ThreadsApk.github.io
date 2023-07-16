package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Date;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0200000_I2_4;
import kotlin.jvm.internal.KtLambdaShape62S0100000_I2_42;
import kotlin.jvm.internal.KtLambdaShape63S0100000_I2_43;

/* renamed from: X.1xC  reason: invalid class name and case insensitive filesystem */
public final class C29161xC extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "EncryptedBackupsSettingsFragment";
    public AnonymousClass0ZU A00 = new KtLambdaShape62S0100000_I2_42(this, 45);
    public AnonymousClass0ZU A01;
    public final C63613hu A02;
    public final AnonymousClass4MA A03;
    public final AnonymousClass4MA A04;
    public final C04530Oa A05;
    public final C04530Oa A06;
    public final C04530Oa A07;
    public final C04530Oa A08 = C80644m9.A00(this);
    public final C04530Oa A09;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131835587);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18190wL.A1C(getViewLifecycleOwner(), A0C(this).A00, this, 21);
        C18180wK.A18(this, new KtSLambdaShape9S0200000_I2_4(this, (C146958n9) null, 40), A0C(this).A0C);
    }

    public static final C195210b A0C(C29161xC r0) {
        return (C195210b) r0.A09.getValue();
    }

    private final CharSequence A0D(C24115D9m d9m) {
        int i;
        int i2;
        Object[] objArr;
        if (C04220Ms.A0I(d9m, C22878Chq.A00)) {
            i = 2131826823;
        } else if (d9m instanceof C22877Chp) {
            Context requireContext = requireContext();
            long j = ((C22877Chp) d9m).A00;
            int intValue = AnonymousClass2LZ.A00(new Date(), j).intValue();
            if (intValue == 0) {
                return C31171Ghr.A02(j, "MMM d, yyyy");
            }
            if (intValue == 1) {
                i2 = 2131838155;
            } else if (intValue == 2) {
                i2 = 2131836853;
            } else if (intValue == 4 || intValue == 5) {
                i2 = 2131824779;
                objArr = new Object[]{C31171Ghr.A02(j, "MMM d"), C31171Ghr.A06(requireContext, j)};
                String string = requireContext.getString(i2, objArr);
                C04220Ms.A06(string);
                return string;
            } else {
                throw C18180wK.A0a("Unsupported relative time period");
            }
            objArr = new Object[]{C31171Ghr.A06(requireContext, j)};
            String string2 = requireContext.getString(i2, objArr);
            C04220Ms.A06(string2);
            return string2;
        } else if (C04220Ms.A0I(d9m, AnonymousClass1oV.A00)) {
            i = 2131826824;
        } else if (C04220Ms.A0I(d9m, AnonymousClass1oW.A00)) {
            return "";
        } else {
            throw AnonymousClass4VZ.A00();
        }
        return C18180wK.A0g(this, i);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A08);
    }

    public C29161xC() {
        KtLambdaShape62S0100000_I2_42 ktLambdaShape62S0100000_I2_42 = new KtLambdaShape62S0100000_I2_42(this, 44);
        KtLambdaShape63S0100000_I2_43 A0e = C18250wR.A0e(this, 6);
        Integer num = AnonymousClass006.A0C;
        C04530Oa A0x = C18200wM.A0x(num, A0e, 7);
        this.A05 = C18220wO.A0M(C18250wR.A0e(A0x, 8), ktLambdaShape62S0100000_I2_42, C18250wR.A0d(A0x, (Object) null, 7), C18210wN.A0l(C8A.class));
        this.A01 = C18250wR.A0e(this, 13);
        KtLambdaShape63S0100000_I2_43 A0e2 = C18250wR.A0e(this, 12);
        C04530Oa A0x2 = C18200wM.A0x(num, C18250wR.A0e(this, 9), 10);
        this.A09 = C18220wO.A0M(C18250wR.A0e(A0x2, 11), A0e2, C18250wR.A0d(A0x2, (Object) null, 8), C18210wN.A0l(C195210b.class));
        this.A07 = C62373Zc.A03(C18250wR.A0e(this, 3));
        this.A06 = AnonymousClass0OY.A02(new KtLambdaShape62S0100000_I2_42(this, 46));
        this.A02 = new C63613hu((CharSequence) "[FB-Only]");
        this.A03 = AnonymousClass4MA.A01(C18190wL.A0H(this, 357), "Reset Inbox Onboarding");
        this.A04 = AnonymousClass4MA.A01(C18190wL.A0H(this, 358), "Reset Inbox Restore");
    }

    public static final SpannableStringBuilder A0B(C29161xC r3, AnonymousClass0ZU r4, int i) {
        String A0k = AnonymousClass0wJ.A0k(r3.requireContext(), 2131826781);
        String A0l = AnonymousClass0wJ.A0l(r3.requireContext(), A0k, i);
        C04220Ms.A06(A0l);
        SpannableStringBuilder A0E = C18200wM.A0E(A0l);
        AnonymousClass3Zw.A02(A0E, r4, A0k, 8);
        return A0E;
    }

    public static final ArrayList A0E(KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2, C29161xC r6) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass49L.A00(r6.A06), 36320232025102165L)) {
            C63293hC r1 = new C63293hC(2131826780);
            r1.A00 = R.style.igds_emphasized_body_1;
            r1.A02 = R.dimen.account_permission_section_vertical_padding;
            A0v.add(r1);
            C62153Xk r12 = new C62153Xk(r6.getString(2131826822));
            r12.A04 = r6.A0D((C24115D9m) ktCSuperShape0S0200000_I2.A01);
            A0v.add(r12);
            C62153Xk r13 = new C62153Xk(r6.getString(2131826821));
            r13.A04 = r6.A0D((C24115D9m) ktCSuperShape0S0200000_I2.A00);
            A0v.add(r13);
        }
        return A0v;
    }

    public static final ArrayList A0F(C29161xC r5, C305922a r6) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass49L.A00(r5.A06), 36320232027527022L)) {
            AnonymousClass4MA r1 = new AnonymousClass4MA(C65233su.A00, 2131835350, R.color.igds_primary_text);
            r1.A01 = R.drawable.instagram_reshare_off_pano_outline_24;
            A0v.add(r1);
        }
        A0v.add(new AnonymousClass4MA(C18200wM.A0R(r5, r6, 72), 2131835589, R.color.igds_primary_text));
        C23411dm.A07(r5, A0v, 48, 2131835590);
        return A0v;
    }

    public final void afterOnResume() {
        super.afterOnResume();
        C195210b A0C = A0C(this);
        EAB.A02(A0C.A06);
        ((AnonymousClass01V) C18190wL.A0f(((C694348n) A0C.A0A.getValue()).A01)).markerStart(724775184);
        AnonymousClass1oT r0 = A0C(this).A05;
        AnonymousClass01V r2 = r0.A00;
        int A002 = r0.A00();
        if (!r2.isMarkerOn(A002)) {
            r2.markerStart(A002);
        }
    }
}
