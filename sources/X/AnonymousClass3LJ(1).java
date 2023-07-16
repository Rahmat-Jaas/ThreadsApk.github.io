package X;

import com.google.common.collect.ImmutableList;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.service.session.UserSession;

/* renamed from: X.3LJ  reason: invalid class name */
public final class AnonymousClass3LJ {
    public static final ImmutableList A00(AnonymousClass1S0 r5, C10300i6 r6, String str, boolean z, boolean z2) {
        ConversionStep conversionStep;
        C18180wK.A1Q(r6, 0, str);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        boolean z3 = !z2;
        if (str.length() != 0 && z3) {
            C313525q.A00(builder, ConversionStep.OPT_IN_EMAIL);
        }
        if (r5 == null || r5.A00) {
            C313525q.A00(builder, ConversionStep.EDIT_CONTACT);
        }
        if ((!(r6 instanceof UserSession) || !C06810aP.A01.A01(C05030Qo.A02(r6)).A2y()) && C67333zN.A04(r6)) {
            C313525q.A00(builder, ConversionStep.WHATS_APP_LINKING);
        }
        if (!z) {
            C313525q.A00(builder, ConversionStep.FACEBOOK_CONNECT);
        }
        ConversionStep conversionStep2 = ConversionStep.PAGE_SELECTION;
        C313525q r3 = C313525q.NEXT;
        C18250wR.A15(builder, r3, conversionStep2);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, r6, 36321816867773493L)) {
            conversionStep = ConversionStep.PROFESSIONAL_DASHBOARD;
        } else {
            conversionStep = ConversionStep.ONBOARDING_CHECKLIST;
        }
        C18250wR.A15(builder, r3, conversionStep);
        return C18250wR.A0F(builder);
    }

    public static final ImmutableList A01(C10300i6 r5, String str, boolean z, boolean z2) {
        boolean z3;
        ConversionStep conversionStep;
        C18180wK.A1P(r5, 0, str);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (C67333zN.A01(r5)) {
            C313525q.A00(builder, ConversionStep.SAFETY_STEP);
        }
        boolean z4 = !z2;
        if (str.length() != 0 && z4) {
            C313525q.A00(builder, ConversionStep.OPT_IN_EMAIL);
        }
        boolean z5 = r5 instanceof UserSession;
        if (z5) {
            z3 = C06810aP.A01.A01(C05030Qo.A02(r5)).A2y();
        } else {
            z3 = false;
        }
        boolean z6 = true;
        if (!z3 && C67333zN.A04(r5)) {
            C313525q.A00(builder, ConversionStep.WHATS_APP_LINKING);
        }
        if (!z5 || !C63803iN.A0E(AnonymousClass0TJ.A05, r5, 36321546285489046L) || !C35662Oi.A00(C05030Qo.A02(r5)).A00) {
            z6 = false;
        }
        if (!z && (z6 || AnonymousClass44X.A01(r5, AnonymousClass44X.A00(), "ig_android_access_library_creator_account_conversion_upsell"))) {
            AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
            if (C63803iN.A0E(r2, r5, 36316602777472223L) || C63803iN.A0E(r2, r5, 36316602777603296L)) {
                C313525q.A00(builder, ConversionStep.FACEBOOK_CONNECT);
            }
        }
        if (C63803iN.A0E(AnonymousClass0TJ.A05, r5, 36321816867773493L)) {
            conversionStep = ConversionStep.PROFESSIONAL_DASHBOARD;
        } else {
            conversionStep = ConversionStep.ONBOARDING_CHECKLIST;
        }
        C313525q.A00(builder, conversionStep);
        return C18250wR.A0F(builder);
    }
}
