package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.facebook.redex.IDxDListenerShape644S0100000_1_I2;
import com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4Aj  reason: invalid class name */
public final class AnonymousClass4Aj implements C33745Htj, CallerContextable {
    public static AnonymousClass296 A0A = null;
    public static C318629g A0B = null;
    public static String A0C = null;
    public static String A0D = null;
    public static final Handler A0E = AnonymousClass0wJ.A0F();
    public static final CallerContext A0F = CallerContext.A00(AnonymousClass4Aj.class);
    public static final String __redex_internal_original_name = "UpdateProfilePictureHelper";
    public AnonymousClass3GB A00;
    public C82164pB A01;
    public C84584tU A02;
    public User A03;
    public Integer A04;
    public final Fragment A05;
    public final C12560m7 A06;
    public final AnonymousClass24Z A07;
    public final C684643x A08;
    public final UserSession A09;

    public static void A00() {
        A0A = null;
        A0B = null;
        A0C = null;
        A0D = null;
    }

    public static void A05(Fragment fragment, AnonymousClass1iX r4, UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J("accounts/remove_profile_picture/");
        A0O.A04.A02 = new AnonymousClass41R(userSession);
        C32165H8c A0T = C18180wK.A0T(A0O, C21711Rw.class, C59343Kl.class);
        A0T.A00 = r4;
        C18220wO.A1C(fragment, A0T);
    }

    public final /* synthetic */ void Cv8(File file, int i) {
    }

    public static void A01(Uri uri, AnonymousClass4Aj r11, int i) {
        String A082 = AnonymousClass00U.A08(System.currentTimeMillis(), "");
        Fragment fragment = r11.A05;
        Context context = fragment.getContext();
        C002801h.A02(context, "cannot operate with null context");
        UserSession userSession = r11.A09;
        H8a A002 = C33322Fg.A00(context, uri, userSession, A082, i);
        A002.A00 = new AnonymousClass1lU(new AnonymousClass1iX(fragment, r11.A06, r11.A00, r11.A01, userSession, r11.A03), new GXN(), userSession, A082);
        C31155GhB.A03(A002);
    }

    public static void A02(Fragment fragment, C12560m7 r1) {
        if (fragment.mView != null) {
            C18240wQ.A11(r1, ReactProgressBarViewManager.PROP_PROGRESS);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (X.C63803iN.A0E(r3, r4, 36320524082616354L) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        if (r15.A34() != false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        r4 = X.C35832Oz.A00(r14);
        r3 = X.C35832Oz.A00(r14).A01;
        r7 = X.AnonymousClass0TJ.A06;
        r6 = X.C63803iN.A0E(r7, r3, 36314803186305183L);
        r5 = r4.A01;
        r3 = X.AnonymousClass0TJ.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0093, code lost:
        if (X.C63803iN.A0E(r3, r5, 2342157812399868061L) == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        if (r4.A00.A02 == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
        if (X.AnonymousClass49I.A00(r4, false) != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        if (r6 != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        if (X.C63803iN.A0E(r3, r5, 36314794596239511L) != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        if (r4.A01(r6) == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b5, code lost:
        r7 = r11.requireActivity();
        r6 = "9";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bb, code lost:
        X.C04220Ms.A0B(r14, 1);
        r1 = X.C35832Oz.A00(r14);
        r5 = X.AnonymousClass01V.A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        if (r5 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        r5.markerStart(857807376);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ce, code lost:
        r4 = r1.A01;
        r8 = X.AnonymousClass0TJ.A06;
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dc, code lost:
        if (X.C63803iN.A0E(r8, r4, 2342157812400130209L) == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00de, code lost:
        r8 = X.AnonymousClass0TJ.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00eb, code lost:
        if (X.C63803iN.A0E(r8, r4, 36314803186370720L) == false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ed, code lost:
        r0 = X.AnonymousClass39J.A02;
        r4 = new X.C26131q6((android.app.Activity) r7, (X.C10300i6) r14);
        r0.A00 = r4;
        r4.A00 = 2;
        X.C04220Ms.A06(r5);
        r5.markerStart(857803746);
        r5.markerAnnotate(857803746, "flow", "9");
        r4.A04(r6, (java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010d, code lost:
        if (X.C04220Ms.A0I(r6, "9") == false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0118, code lost:
        if (X.C63803iN.A0E(r3, r14, 36317405936356974L) != false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0123, code lost:
        if (X.C63803iN.A0E(r3, r14, 36317405936553585L) == false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0125, code lost:
        r0 = "IG_PROFILE_PHOTO_CHANGE_UPSELL";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0127, code lost:
        X.AnonymousClass6SU.A00(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0158, code lost:
        X.AnonymousClass0wJ.A13(X.C28161tl.A03(r14), "fx_cal_profile_pic_is_upsell_seen", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0168, code lost:
        if (X.C04220Ms.A0I(r6, "21") == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016a, code lost:
        r0 = "IG_IMPORT_FROM_FB_UPSELL";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0177, code lost:
        if (X.C63803iN.A0E(r3, r4, 2342157812400195746L) == false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0179, code lost:
        X.C04220Ms.A06(r5);
        r5.markerStart(857807444);
        r5.markerAnnotate(857807444, "flow", "9");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0187, code lost:
        r4 = com.instagram.modal.ModalActivity.class;
        r10 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0195, code lost:
        if (X.C35832Oz.A00(r14).A01(false) == false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0197, code lost:
        r10 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0199, code lost:
        r1 = X.C63743iE.A02("com.bloks.www.fxim.sync.start", X.C63203gz.A03("params", X.AnonymousClass00U.A0S("{server_params: {\"opt_in_flow_type\":", ", \"requested_screen_component_type\":1}}", r10)));
        r0 = X.C18190wL.A0N(r14);
        r0.A0g = false;
        X.C63863iT.A08(r7, X.C62853b1.A00(r0, r1), r14, r4, "bloks");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01bc, code lost:
        X.C04220Ms.A0B(r14, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d3, code lost:
        if (((X.AnonymousClass48x) r14.A01(X.AnonymousClass48x.class, new kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55(r14, 49))).A00() == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d5, code lost:
        r7 = r11.requireActivity();
        r6 = "21";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ee, code lost:
        if (r15.A34() == false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f6, code lost:
        if (r15 != null) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(androidx.fragment.app.Fragment r11, X.AnonymousClass3GB r12, X.C82164pB r13, com.instagram.service.session.UserSession r14, com.instagram.user.model.User r15) {
        /*
            if (r15 == 0) goto L_0x0005
            r15.A1t(r14)
        L_0x0005:
            boolean r0 = r11.isAdded()
            r2 = 1
            if (r0 == 0) goto L_0x012a
            if (r15 == 0) goto L_0x01dd
            r0 = 0
            X.C04220Ms.A0B(r14, r0)
            kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56 r0 = new kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56
            r0.<init>(r14, r2)
            java.lang.Class<X.49d> r7 = X.C695749d.class
            java.lang.Object r6 = r14.A01(r7, r0)
            X.49d r6 = (X.C695749d) r6
            boolean r5 = r6.A00
            com.instagram.service.session.UserSession r4 = r6.A01
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36321546285882266(0x810a4100101b9a, double:3.0332303540950294E-306)
            boolean r0 = X.C63803iN.A0E(r3, r4, r0)
            if (r0 == 0) goto L_0x003a
            X.49Q r1 = X.C35662Oi.A00(r4)
            java.lang.String r0 = "IG_PROFILE_PHOTO_CHANGE_CHAINING"
            boolean r5 = r1.A06(r0)
        L_0x003a:
            X.0TJ r8 = X.AnonymousClass0TJ.A06
            r0 = 36320524082747428(0x81095300021824, double:3.032583908716476E-306)
            boolean r0 = X.C63803iN.A0E(r8, r4, r0)
            if (r0 != 0) goto L_0x01dd
            boolean r0 = X.C695749d.A00(r6)
            if (r0 != 0) goto L_0x01dd
            X.1z6 r6 = X.C35692Ol.A00(r4)
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r7)
            java.lang.String r0 = "ig_android_linking_cache_fx_ac_eligibility_linkage_check"
            boolean r0 = r6.A05(r1, r0)
            if (r0 != 0) goto L_0x01dd
            if (r5 == 0) goto L_0x01dd
            r0 = 36320524082616354(0x81095300001822, double:3.0325839086335845E-306)
            boolean r0 = X.C63803iN.A0E(r3, r4, r0)
            if (r0 == 0) goto L_0x01dd
        L_0x006a:
            boolean r0 = r15.A34()
            if (r0 != 0) goto L_0x01bc
            X.49I r4 = X.C35832Oz.A00(r14)
            X.49I r0 = X.C35832Oz.A00(r14)
            com.instagram.service.session.UserSession r3 = r0.A01
            X.0TJ r7 = X.AnonymousClass0TJ.A06
            r0 = 36314803186305183(0x81041f0002089f, double:3.0289659907701996E-306)
            boolean r6 = X.C63803iN.A0E(r7, r3, r0)
            com.instagram.service.session.UserSession r5 = r4.A01
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 2342157812399868061(0x2081041f0000089d, double:4.061179422946372E-152)
            boolean r0 = X.C63803iN.A0E(r3, r5, r0)
            r1 = 0
            if (r0 == 0) goto L_0x00af
            X.3BS r0 = r4.A00
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00af
            boolean r0 = X.AnonymousClass49I.A00(r4, r1)
            if (r0 != 0) goto L_0x00af
            if (r6 != 0) goto L_0x00a4
            r3 = r7
        L_0x00a4:
            r0 = 36314794596239511(0x81041d00000897, double:3.028960558378079E-306)
            boolean r0 = X.C63803iN.A0E(r3, r5, r0)
            if (r0 != 0) goto L_0x00b5
        L_0x00af:
            boolean r0 = r4.A01(r6)
            if (r0 == 0) goto L_0x01bc
        L_0x00b5:
            androidx.fragment.app.FragmentActivity r7 = r11.requireActivity()
            java.lang.String r6 = "9"
        L_0x00bb:
            r9 = 0
            X.C04220Ms.A0B(r14, r2)
            r10 = 2
            X.49I r1 = X.C35832Oz.A00(r14)
            X.01V r5 = X.AnonymousClass01V.A0p
            if (r5 == 0) goto L_0x00ce
            r0 = 857807376(0x33211a10, float:3.7509437E-8)
            r5.markerStart(r0)
        L_0x00ce:
            com.instagram.service.session.UserSession r4 = r1.A01
            X.0TJ r8 = X.AnonymousClass0TJ.A06
            r3 = r8
            r0 = 2342157812400130209(0x2081041f000408a1, double:4.061179423168651E-152)
            boolean r0 = X.C63803iN.A0E(r8, r4, r0)
            if (r0 == 0) goto L_0x00e0
            X.0TJ r8 = X.AnonymousClass0TJ.A05
        L_0x00e0:
            r0 = 36314803186370720(0x81041f000308a0, double:3.0289659908116454E-306)
            boolean r0 = X.C63803iN.A0E(r8, r4, r0)
            java.lang.String r8 = "9"
            if (r0 == 0) goto L_0x016d
            X.39J r0 = X.AnonymousClass39J.A02
            X.1q6 r4 = new X.1q6
            r4.<init>((android.app.Activity) r7, (X.C10300i6) r14)
            r0.A00 = r4
            r4.A00 = r10
            X.C04220Ms.A06(r5)
            r1 = 857803746(0x33210be2, float:3.749654E-8)
            r5.markerStart(r1)
            java.lang.String r0 = "flow"
            r5.markerAnnotate((int) r1, (java.lang.String) r0, (java.lang.String) r8)
            r4.A04(r6, r9, r9)
        L_0x0109:
            boolean r0 = X.C04220Ms.A0I(r6, r8)
            if (r0 == 0) goto L_0x0162
            r0 = 36317405936356974(0x81067d00000e6e, double:3.0306119803833854E-306)
            boolean r0 = X.C63803iN.A0E(r3, r14, r0)
            if (r0 != 0) goto L_0x0158
            r0 = 36317405936553585(0x81067d00030e71, double:3.030611980507723E-306)
            boolean r0 = X.C63803iN.A0E(r3, r14, r0)
            if (r0 == 0) goto L_0x0158
            java.lang.String r0 = "IG_PROFILE_PHOTO_CHANGE_UPSELL"
        L_0x0127:
            X.AnonymousClass6SU.A00(r14, r0)
        L_0x012a:
            if (r12 == 0) goto L_0x0139
            X.4qz r4 = r12.A09
            r3 = 0
            r0 = 5
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0111000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0111000_I2
            r1.<init>((java.lang.Object) r12, (X.C146958n9) r3, (int) r0, (boolean) r2)
            r0 = 3
            X.C25237DiI.A00(r3, r3, r1, r4, r0)
        L_0x0139:
            X.E4k r2 = X.C26220E4k.A00(r14)
            X.D36 r1 = X.D36.PHOTO
            X.D3A r0 = X.D3A.POST
            r2.A09(r0, r1)
            X.01V r2 = X.AnonymousClass01V.A0p
            r1 = 18297178(0x117315a, float:2.7769728E-38)
            r0 = 2
            r2.markerEnd(r1, r0)
            android.os.Handler r1 = A0E
            X.4S9 r0 = new X.4S9
            r0.<init>(r11, r13, r14)
            r1.post(r0)
            return
        L_0x0158:
            android.content.SharedPreferences$Editor r1 = X.C28161tl.A03(r14)
            java.lang.String r0 = "fx_cal_profile_pic_is_upsell_seen"
            X.AnonymousClass0wJ.A13(r1, r0, r2)
            goto L_0x012a
        L_0x0162:
            java.lang.String r0 = "21"
            boolean r0 = X.C04220Ms.A0I(r6, r0)
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = "IG_IMPORT_FROM_FB_UPSELL"
            goto L_0x0127
        L_0x016d:
            r0 = 2342157812400195746(0x2081041f000508a2, double:4.061179423224221E-152)
            boolean r0 = X.C63803iN.A0E(r3, r4, r0)
            r9 = 0
            if (r0 == 0) goto L_0x0187
            X.C04220Ms.A06(r5)
            r1 = 857807444(0x33211a54, float:3.750968E-8)
            r5.markerStart(r1)
            java.lang.String r0 = "flow"
            r5.markerAnnotate((int) r1, (java.lang.String) r0, (java.lang.String) r8)
        L_0x0187:
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            java.lang.String r5 = "com.bloks.www.fxim.sync.start"
            X.49I r0 = X.C35832Oz.A00(r14)
            boolean r0 = r0.A01(r9)
            r10 = 9
            if (r0 == 0) goto L_0x0199
            r10 = 10
        L_0x0199:
            java.lang.String r1 = "{server_params: {\"opt_in_flow_type\":"
            java.lang.String r0 = ", \"requested_screen_component_type\":1}}"
            java.lang.String r1 = X.AnonymousClass00U.A0S(r1, r0, r10)
            java.lang.String r0 = "params"
            java.util.HashMap r0 = X.C63203gz.A03(r0, r1)
            X.3iE r1 = X.C63743iE.A02(r5, r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.C18190wL.A0N(r14)
            r0.A0g = r9
            android.os.Bundle r1 = X.C62853b1.A00(r0, r1)
            java.lang.String r0 = "bloks"
            X.C63863iT.A08(r7, r1, r14, r4, r0)
            goto L_0x0109
        L_0x01bc:
            r0 = 0
            X.C04220Ms.A0B(r14, r0)
            r0 = 49
            kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55 r1 = new kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55
            r1.<init>(r14, r0)
            java.lang.Class<X.48x> r0 = X.AnonymousClass48x.class
            java.lang.Object r0 = r14.A01(r0, r1)
            X.48x r0 = (X.AnonymousClass48x) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x012a
            androidx.fragment.app.FragmentActivity r7 = r11.requireActivity()
            java.lang.String r6 = "21"
            goto L_0x00bb
        L_0x01dd:
            androidx.fragment.app.FragmentActivity r0 = r11.requireActivity()
            android.content.Context r3 = r0.getApplicationContext()
            if (r15 == 0) goto L_0x01f0
            boolean r1 = r15.A34()
            r0 = 2131833011(0x7f1130b3, float:1.9299092E38)
            if (r1 != 0) goto L_0x01f3
        L_0x01f0:
            r0 = 2131833008(0x7f1130b0, float:1.9299086E38)
        L_0x01f3:
            X.C63813iO.A00(r3, r0)
            if (r15 == 0) goto L_0x012a
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Aj.A04(androidx.fragment.app.Fragment, X.3GB, X.4pB, com.instagram.service.session.UserSession, com.instagram.user.model.User):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r9.A01.A02() == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (r9.A04.A04() == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (X.C63713iA.A0B() == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(android.content.Context r21) {
        /*
            r20 = this;
            r4 = r20
            com.instagram.service.session.UserSession r2 = r4.A09
            X.49I r1 = X.C35832Oz.A00(r2)
            X.3BS r0 = new X.3BS
            r0.<init>()
            r1.A00 = r0
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r0 = 2342154608354329248(0x20810135000102a0, double:4.0584626641210145E-152)
            boolean r3 = X.C63803iN.A0E(r8, r2, r0)
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x002b
            boolean r3 = X.C63713iA.A0A()
            if (r3 == 0) goto L_0x002b
            boolean r3 = X.C63713iA.A0B()
            r14 = 1
            if (r3 != 0) goto L_0x002c
        L_0x002b:
            r14 = 0
        L_0x002c:
            r13 = r14 ^ 1
            X.3GB r9 = r4.A00
            if (r9 == 0) goto L_0x003b
            X.GX6 r3 = r9.A01
            boolean r3 = r3.A02()
            r12 = 1
            if (r3 != 0) goto L_0x003c
        L_0x003b:
            r12 = 0
        L_0x003c:
            if (r14 == 0) goto L_0x0153
            java.lang.Boolean r3 = X.C63713iA.A06()
            boolean r11 = r3.booleanValue()
        L_0x0046:
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            r15 = 0
            r3 = r21
            if (r14 == 0) goto L_0x014a
            X.4vf r7 = X.C63713iA.A01()
            java.lang.String r5 = r7.B6j()
            if (r5 == 0) goto L_0x0289
            java.lang.String r10 = r7.B6j()
        L_0x005d:
            r5 = 6
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r7 = X.C18200wM.A0R(r3, r4, r5)
            X.39h r5 = new X.39h
            r5.<init>(r7, r10, r15)
            r6.add(r5)
            if (r13 == 0) goto L_0x0081
            r5 = 2131828973(0x7f1120ed, float:1.9290902E38)
            java.lang.String r10 = r3.getString(r5)
            r5 = 42
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r7 = X.C18190wL.A0H(r4, r5)
            X.39h r5 = new X.39h
            r5.<init>(r7, r10, r15)
            r6.add(r5)
        L_0x0081:
            if (r12 == 0) goto L_0x00ad
            if (r9 == 0) goto L_0x0098
            X.GX6 r5 = r9.A01
            boolean r5 = r5.A02()
            if (r5 == 0) goto L_0x0098
            com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository r5 = r9.A04
            boolean r7 = r5.A04()
            r5 = 2131826647(0x7f1117d7, float:1.9286184E38)
            if (r7 != 0) goto L_0x009b
        L_0x0098:
            r5 = 2131837542(0x7f114266, float:1.9308282E38)
        L_0x009b:
            java.lang.String r9 = r3.getString(r5)
            r5 = 43
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r7 = X.C18190wL.A0H(r4, r5)
            X.39h r5 = new X.39h
            r5.<init>(r7, r9, r15)
            r6.add(r5)
        L_0x00ad:
            if (r11 == 0) goto L_0x00cd
            if (r14 == 0) goto L_0x0141
            X.4vf r7 = X.C63713iA.A01()
            java.lang.String r5 = r7.Ao8()
            if (r5 == 0) goto L_0x0282
            java.lang.String r10 = r7.Ao8()
        L_0x00bf:
            r5 = 7
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r9 = X.C18200wM.A0R(r3, r4, r5)
            r7 = 1
            X.39h r5 = new X.39h
            r5.<init>(r9, r10, r7)
            r6.add(r5)
        L_0x00cd:
            if (r14 == 0) goto L_0x00eb
            X.4vf r7 = X.C63713iA.A01()
            java.lang.String r5 = r7.B6m()
            if (r5 == 0) goto L_0x027b
            java.lang.String r9 = r7.B6m()
            r5 = 8
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r7 = X.C18200wM.A0R(r3, r4, r5)
            X.39h r5 = new X.39h
            r5.<init>(r7, r9, r15)
            r6.add(r5)
        L_0x00eb:
            X.4Cj r5 = new X.4Cj
            r5.<init>(r4)
            X.5z0 r7 = X.C63713iA.A00
            if (r7 == 0) goto L_0x015f
            java.lang.Object r7 = r7.A01
            if (r7 == 0) goto L_0x015f
            X.4vW r7 = (X.C85634vW) r7
            X.4uh r7 = r7.AUa()
            if (r7 == 0) goto L_0x015f
            X.5z0 r7 = X.C63713iA.A00
            java.lang.Object r7 = r7.A01
            X.4vW r7 = (X.C85634vW) r7
            X.4uh r7 = r7.AUa()
            boolean r7 = r7.Apn()
            if (r7 == 0) goto L_0x015f
            X.3Iu r7 = new X.3Iu
            r7.<init>(r2)
            java.lang.String r1 = X.C63713iA.A07()
            java.lang.String r0 = X.C63713iA.A08()
            r7.A0A(r1, r0)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r2)
            java.lang.String r0 = X.C18250wR.A0a(r0)
            android.net.Uri r0 = X.C15430rJ.A01(r0)
            com.instagram.common.typedurl.ImageUrl r0 = X.AnonymousClass3WG.A00(r0)
            r7.A05(r0)
            java.util.Iterator r1 = r6.iterator()
        L_0x0137:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x021f
            A07(r7, r1)
            goto L_0x0137
        L_0x0141:
            r5 = 2131834717(0x7f11375d, float:1.9302552E38)
            java.lang.String r10 = r3.getString(r5)
            goto L_0x00bf
        L_0x014a:
            r5 = 2131831680(0x7f112b80, float:1.9296392E38)
            java.lang.String r10 = r3.getString(r5)
            goto L_0x005d
        L_0x0153:
            com.instagram.user.model.User r3 = r4.A03
            boolean r3 = r3.A34()
            boolean r11 = X.C18180wK.A1W(r3)
            goto L_0x0046
        L_0x015f:
            boolean r7 = X.C63803iN.A0E(r8, r2, r0)
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x01ee
            boolean r7 = X.C63713iA.A0A()
            if (r7 == 0) goto L_0x01ee
            boolean r7 = X.C63713iA.A0B()
            if (r7 == 0) goto L_0x01ee
            boolean r0 = X.C63803iN.A0E(r8, r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0233
            X.2A7 r0 = X.AnonymousClass2A7.A0E
            X.29l r1 = X.C319129l.EDIT_PHOTO_REMINDER
            X.C63243h6.A03(r0, r1, r2)
            X.2A7 r0 = X.AnonymousClass2A7.A0D
            X.C63243h6.A03(r0, r1, r2)
            X.3Iu r7 = new X.3Iu
            r7.<init>(r2)
            java.lang.String r1 = X.C63713iA.A07()
            java.lang.String r0 = X.C63713iA.A08()
            r7.A0A(r1, r0)
            com.google.common.collect.ImmutableList r0 = X.C63713iA.A00()
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            X.83w r1 = r0.iterator()
        L_0x01a3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r0 = r1.next()
            X.4vI r0 = (X.C85504vI) r0
            com.google.common.collect.ImmutableList r0 = r0.AOa()
            r8.addAll(r0)
            goto L_0x01a3
        L_0x01b7:
            boolean r1 = r8.isEmpty()
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x01d5
            java.lang.Object r1 = r8.get(r15)
            X.4vH r1 = (X.C85494vH) r1
            java.lang.String r1 = r1.B4V()
            if (r1 == 0) goto L_0x01d5
            java.lang.Object r0 = r8.get(r15)
            X.4vH r0 = (X.C85494vH) r0
            java.lang.String r0 = r0.B4V()
        L_0x01d5:
            android.net.Uri r0 = X.C15430rJ.A01(r0)
            com.instagram.common.typedurl.ImageUrl r0 = X.AnonymousClass3WG.A00(r0)
            r7.A05(r0)
            java.util.Iterator r1 = r6.iterator()
        L_0x01e4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0229
            A07(r7, r1)
            goto L_0x01e4
        L_0x01ee:
            X.2A7 r1 = X.AnonymousClass2A7.A0B
            X.29l r0 = X.C319129l.CHANGE_PROFILE_PICTURE_FIRST_TIME
            X.C63243h6.A03(r1, r0, r2)
            X.3Iu r3 = new X.3Iu
            r3.<init>(r2)
            r0 = 2131823223(0x7f110a77, float:1.927924E38)
            r3.A00(r0)
            java.util.Iterator r1 = r6.iterator()
        L_0x0204:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x020e
            A07(r3, r1)
            goto L_0x0204
        L_0x020e:
            r3.A02 = r5
            X.3ag r1 = new X.3ag
            r1.<init>(r3)
            androidx.fragment.app.Fragment r0 = r4.A05
            android.content.Context r0 = r0.requireContext()
            r1.A04(r0)
            goto L_0x0233
        L_0x021f:
            X.29l r1 = X.C319129l.BIZ_EDIT_PHOTO_PASSIVE
            X.C04220Ms.A0B(r2, r15)
            X.2A7 r0 = X.AnonymousClass2A7.A0D
            X.C63243h6.A02(r0, r1, r2)
        L_0x0229:
            r7.A02 = r5
            X.3ag r0 = new X.3ag
            r0.<init>(r7)
            r0.A04(r3)
        L_0x0233:
            com.instagram.user.model.User r0 = r4.A03
            java.lang.String r0 = r0.A14()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            r16 = 0
            X.AnonymousClass312.A00 = r16
            r0 = 2
            com.instagram.common.api.base.IDxACallbackShape44S0000000_1_I2 r4 = new com.instagram.common.api.base.IDxACallbackShape44S0000000_1_I2
            r4.<init>(r0)
            X.3zb r3 = X.C67463zb.A00()
            X.3zb r1 = X.C67463zb.A00()
            java.lang.String r0 = "identity_id"
            r3.A05(r0, r5)
            boolean r0 = X.AnonymousClass0wJ.A1W(r5)
            X.8l9 r10 = X.C63233h2.A03(r0)
            java.util.Map r12 = com.facebook.graphql.calls.GraphQlCallInput.A03(r3)
            java.util.Map r13 = com.facebook.graphql.calls.GraphQlCallInput.A03(r1)
            java.lang.Class<com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl> r14 = com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl.class
            java.lang.String r11 = "IGFxImBusinessReminderQuery"
            java.lang.String r19 = "business_presence"
            com.facebook.pando.PandoGraphQLRequest r9 = new com.facebook.pando.PandoGraphQLRequest
            r17 = r15
            r18 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.8mD r0 = X.C18230wP.A0N(r9)
            X.AnonymousClass3WK.A02(r0, r4, r2)
            return
        L_0x027b:
            java.lang.String r0 = "Missing required content to build the FX Reminder Dialog."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0282:
            java.lang.String r0 = "Missing required content to build the FX Reminder Dialog."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0289:
            java.lang.String r0 = "Missing required content to build the FX Reminder Dialog."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Aj.A08(android.content.Context):void");
    }

    public final void A09(Intent intent, int i, int i2, boolean z) {
        TreeJNI treeValue;
        if (!z && i2 != 0) {
            Fragment fragment = this.A05;
            AnonymousClass0hL.A02(new AnonymousClass0hN(), new File(fragment.requireContext().getFilesDir(), "avatar_temp/").getAbsolutePath(), (Set) null);
            if (i2 != -1) {
                return;
            }
            if (i == 64206) {
                C67363zQ.A06(intent, this.A09, new IDxDListenerShape644S0100000_1_I2(this, 0), i2);
                return;
            } else if (!(i != 10001 || intent == null || intent.getAction() == null)) {
                String action = intent.getAction();
                Context context = fragment.getContext();
                UserSession userSession = this.A09;
                AnonymousClass4CY r8 = new AnonymousClass4CY(this, action);
                IGFxImBusinessReminderQueryResponseImpl.FxIdentityManagement.BciReminderContent A002 = AnonymousClass312.A00();
                if (A002 == null || (treeValue = A002.getTreeValue("photo_sync_reminder(identity_id:$identity_id)", IGFxImBusinessReminderQueryResponseImpl.FxIdentityManagement.BciReminderContent.PhotoSyncReminder.class)) == null || treeValue.getStringValue("header") == null || treeValue.getStringValue("confirm_cta") == null || treeValue.getStringValue("cancel_cta") == null || treeValue.getStringValue("subtext") == null) {
                    r8.BrW();
                    return;
                }
                C319129l r6 = C319129l.BIZ_EDIT_PHOTO;
                String stringValue = treeValue.getStringValue("header");
                String stringValue2 = treeValue.getStringValue("subtext");
                String stringValue3 = treeValue.getStringValue("confirm_cta");
                String stringValue4 = treeValue.getStringValue("cancel_cta");
                if (context != null) {
                    C25828Dsm A0W = C18190wL.A0W(context);
                    A0W.A02 = stringValue;
                    A0W.A0p(stringValue2);
                    A0W.A0Y(C18250wR.A0E(r8, r6, userSession, 25), AnonymousClass25l.BLUE_BOLD, stringValue3, true);
                    A0W.A0b(new IDxCListenerShape77S0200000_1_I2(29, (Object) r6, (Object) userSession), stringValue4);
                    Dialog A0G = A0W.A0G();
                    C63243h6.A02(AnonymousClass2A7.A0D, r6, userSession);
                    C13950oZ.A00(A0G);
                    return;
                }
                return;
            }
        }
        A00();
    }

    public final void BNY(Intent intent) {
        this.A05.requireActivity().getParent().getClass();
        throw C18210wN.A0W("getMediaCaptureActivityController");
    }

    public final void CvN(Intent intent, int i) {
        UserSession userSession = this.A09;
        KK7 A002 = KK7.A00(userSession);
        Fragment fragment = this.A05;
        A002.A09(fragment.getActivity(), "new_profile_photo");
        C60493Pi.A01(userSession, this.A04);
        Context context = fragment.getContext();
        if (context != null && C25529DnJ.A02.A03(context, intent)) {
            C10650ih.A0E(intent, fragment, i);
        }
    }

    public AnonymousClass4Aj(Fragment fragment, C12560m7 r4, C82164pB r5, UserSession userSession, User user, Integer num) {
        AnonymousClass24Z r0;
        C684643x r02;
        AnonymousClass3GB r1 = this.A00;
        if (r1 != null && r1.A01.A02()) {
            r1.A04.A04();
        }
        A00();
        this.A09 = userSession;
        this.A05 = fragment;
        this.A06 = r4;
        this.A02 = C25529DnJ.A02.A02(fragment.getContext(), this, userSession);
        this.A03 = user;
        this.A01 = r5;
        this.A04 = num;
        if (num == AnonymousClass006.A0s) {
            A0A = AnonymousClass296.IG_EDIT_PROFILE;
            r0 = AnonymousClass24Z.EDIT_PROFILE;
        } else if (num == AnonymousClass006.A0r) {
            A0A = AnonymousClass296.IG_PROFILE_PHOTO_LONG_PRESS;
            r0 = AnonymousClass24Z.LONG_PRESS_PROFILE;
        } else {
            r0 = AnonymousClass24Z.NONE;
        }
        this.A07 = r0;
        AnonymousClass3GB A002 = AnonymousClass2FZ.A00(fragment.requireActivity(), userSession);
        this.A00 = A002;
        if (A002 != null) {
            r02 = A002.A02;
        } else {
            r02 = null;
        }
        this.A08 = r02;
    }

    public static void A03(Fragment fragment, C12560m7 r2) {
        if (fragment.isResumed() && !r2.A0F && r2.A0O(ReactProgressBarViewManager.PROP_PROGRESS) == null) {
            new AnonymousClass1XX().A0A(r2, ReactProgressBarViewManager.PROP_PROGRESS);
        }
    }

    public static void A06(C82164pB r8, UserSession userSession, String str) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("filter_name", A0C);
        A0y.put("tool_name", A0D);
        if (str != null) {
            A0y.put(TraceFieldType.ErrorCode, str);
        }
        Long.parseLong(userSession.getUserId());
        C35712On.A00(AnonymousClass29S.PROFILE_PICTURE_UPDATED, A0A, A0B, AnonymousClass2A6.A06, userSession, (String) null, A0y);
        if (r8 != null) {
            r8.D8w();
        }
        A00();
    }

    public static void A07(C58963Iu r3, Iterator it) {
        C569839h r0 = (C569839h) it.next();
        boolean z = r0.A02;
        String str = r0.A01;
        View.OnClickListener onClickListener = r0.A00;
        if (z) {
            r3.A08(str, onClickListener);
        } else {
            r3.A09(str, onClickListener);
        }
    }
}
