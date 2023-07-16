package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpHost;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.redex.IDxCListenerShape420S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape9S0500000_1_I2;
import com.instagram.api.sessionscoped.IDxACallbackShape102S0100000_1_I2;
import com.instagram.bugreporter.BugReport;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.3hb  reason: invalid class name and case insensitive filesystem */
public final class C63493hb {
    public static void A03(Activity activity, UserSession userSession) {
        Bundle A0E = AnonymousClass0wJ.A0E(userSession);
        A0E.putBoolean("only_show_push", true);
        C62423Zt.A03(userSession, "settings", "notifications_entered");
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36319725218698587L)) {
            C63743iE.A09(activity, C18190wL.A0N(userSession), C63743iE.A02("com.igcarbon.settings.notifications", new C73994Vj()), 2131831918);
            return;
        }
        C25786Drz A0Q = AnonymousClass0wJ.A0Q((FragmentActivity) activity, userSession);
        C18190wL.A10();
        A0Q.A0A(A0E, new C29251xd());
        A0Q.A05();
    }

    public static void A06(Context context, AnonymousClass06E r8, UserSession userSession, C83754rw r10, String str, boolean z) {
        Long A01;
        String str2;
        C17040uC A00 = C17040uC.A00();
        boolean z2 = z;
        if (z) {
            A01 = A00.A02(true);
        } else {
            A01 = A00.A01(true);
        }
        String valueOf = String.valueOf(A01.longValue());
        UserSession userSession2 = userSession;
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/set_presence_disabled/");
        if (z) {
            str2 = "0";
        } else {
            str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        A0N.A0O(str, str2);
        A0N.A0P(TraceFieldType.RequestID, valueOf);
        C32165H8c A0T = C18180wK.A0T(A0N, AnonymousClass1T9.class, C60063Nm.class);
        A0T.A00 = new AnonymousClass1hX(context, userSession2, r10, str, z2);
        C31155GhB.A01(context, r8, A0T);
    }

    public static void A01(Activity activity, AnonymousClass25S r8, UserSession userSession, String str, String str2) {
        AnonymousClass3IL r1 = new AnonymousClass3IL();
        String userId = userSession.getUserId();
        C04220Ms.A0B(userId, 0);
        r1.A09 = userId;
        C04220Ms.A0B(r8, 0);
        r1.A00 = r8;
        r1.A07 = C103066Xr.A00.A02.A00;
        r1.A08 = KK7.A02(userSession);
        BugReport A00 = r1.A00();
        AnonymousClass3GE r12 = new AnonymousClass3GE(activity);
        r12.A01 = str2;
        r12.A00 = str;
        r12.A06 = !C34442Jo.A00();
        new AnonymousClass1jI(activity, (Bitmap) null, A00, r12.A00(), (C61593Uj) null, userSession).A02(new Void[0]);
    }

    public static void A05(Context context, AnonymousClass06E r5, UserSession userSession, C83754rw r7) {
        AnonymousClass362 r3 = new AnonymousClass362(r7);
        H1T A0O = C18180wK.A0O(userSession);
        A0O.A0J("accounts/get_presence_disabled/");
        C32165H8c A0T = C18180wK.A0T(A0O, AnonymousClass1T9.class, C60063Nm.class);
        A0T.A00 = new IDxACallbackShape102S0100000_1_I2(userSession, r3, 2);
        C31155GhB.A01(context, r5, A0T);
    }

    public static void A07(Context context, C10300i6 r2, String str, String str2) {
        if (!str.startsWith(HttpHost.DEFAULT_SCHEME_NAME)) {
            str = AnonymousClass3W8.A02(context, AnonymousClass3h3.A02(str));
        }
        C18210wN.A0t(context, r2, new C36941JhV(str), str2);
    }

    public static void A00(Activity activity, AnonymousClass25S r14, UserSession userSession) {
        Activity activity2 = activity;
        AnonymousClass25S r7 = r14;
        UserSession userSession2 = userSession;
        if (!C34442Jo.A00()) {
            C37383Jqm.A00(activity2, C34412Jl.A00(activity2, r7, userSession2, (String) null, KK7.A02(userSession), C103066Xr.A00.A02.A00, true, false), C18210wN.A0L(userSession).A00());
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        C04220Ms.A0B(userSession, 1);
        C58533Ga r5 = new C58533Ga(userSession, (String) null);
        r5.A01(AnonymousClass006.A01);
        AnonymousClass3ZB r3 = new AnonymousClass3ZB(activity);
        r3.A0D.setText(2131834818);
        r3.A06.setVisibility(0);
        r3.A02(new IDxCListenerShape9S0500000_1_I2(3, activity, applicationContext, r14, r5, userSession), new CharSequence[]{applicationContext.getString(2131820796), applicationContext.getString(2131835484), applicationContext.getString(2131834026)});
        IDxCListenerShape420S0100000_1_I2 iDxCListenerShape420S0100000_1_I2 = new IDxCListenerShape420S0100000_1_I2(r5, 10);
        I1U i1u = r3.A0E;
        i1u.setOnCancelListener(iDxCListenerShape420S0100000_1_I2);
        i1u.setCanceledOnTouchOutside(true);
        C13950oZ.A00(r3.A00());
    }

    public static void A02(Activity activity, UserSession userSession) {
        HashMap A0y;
        String str;
        if (!AnonymousClass0wJ.A0Y(userSession).Apo() || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321241342155395L)) {
            boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36319579189810409L);
            A0y = AnonymousClass0wJ.A0y();
            if (A0E) {
                str = "com.bloks.www.bloks.ig.activity_status_screen";
            } else {
                str = "com.instagram.portable_settings.privacy.activity_status";
            }
        } else {
            A0y = AnonymousClass0wJ.A0y();
            str = "com.instagram.portable_settings.privacy.business_activity_status";
        }
        C63743iE.A08(activity, C18190wL.A0N(userSession), C63743iE.A02(str, A0y), 2131827929);
    }

    public static void A04(Activity activity, UserSession userSession, String str, String str2) {
        Bundle A0E = AnonymousClass0wJ.A0E(userSession);
        C62423Zt.A03(userSession, "notifications", AnonymousClass00U.A0L(str, "_entered"));
        C25786Drz A0Q = AnonymousClass0wJ.A0Q((FragmentActivity) activity, userSession);
        A0Q.A0A(A0E, C111986om.A01.A00().A04(userSession.token, str, str2));
        A0Q.A05();
    }
}
