package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.redex.IDxCListenerShape122S0000000_1_I2;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3zP  reason: invalid class name and case insensitive filesystem */
public final class C67353zP implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67353zP.class);
    public static final String __redex_internal_original_name = "BusinessConversionUtils";

    public static AnonymousClass254 A01(Context context, UserSession userSession, User user, int i, boolean z) {
        switch (i) {
            case 0:
                if (z) {
                    return AnonymousClass254.MESSAGE;
                }
                break;
            case 1:
                if (z && C121877Ip.A05(user)) {
                    return AnonymousClass254.SUPPORT;
                }
            case 2:
                if (user.A13() != null && user.A3E()) {
                    return AnonymousClass254.CALL_TO_ACTION;
                }
            case 3:
                if (z && A09(userSession, user)) {
                    return AnonymousClass254.SHOP;
                }
            case 4:
                if (!TextUtils.isEmpty(user.A1D())) {
                    if (user.A0m() == AnonymousClass006.A01) {
                        return AnonymousClass254.CALL;
                    }
                    return AnonymousClass254.TEXT;
                }
                break;
            case 5:
                if (user.A3b()) {
                    return AnonymousClass254.NATIVE_CALL;
                }
                break;
            case 6:
                if (!TextUtils.isEmpty(user.A1C())) {
                    return AnonymousClass254.EMAIL;
                }
                break;
            case 8:
                if (z && A08(userSession, user)) {
                    return AnonymousClass254.DONATE;
                }
            case 9:
                if (A07(context, userSession, user)) {
                    return AnonymousClass254.WHATSAPP;
                }
                break;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r4.A3E() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r2, com.instagram.service.session.UserSession r3, com.instagram.user.model.User r4, boolean r5, boolean r6) {
        /*
            if (r4 != 0) goto L_0x0004
            r1 = 0
        L_0x0003:
            return r1
        L_0x0004:
            java.lang.String r0 = r4.A13()
            if (r0 == 0) goto L_0x0011
            boolean r0 = r4.A3E()
            r1 = 1
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            java.lang.String r0 = r4.A1C()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001e
            int r1 = r1 + 1
        L_0x001e:
            java.lang.String r0 = r4.A1D()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002a
            int r1 = r1 + 1
        L_0x002a:
            boolean r0 = A07(r2, r3, r4)
            if (r0 == 0) goto L_0x0032
            int r1 = r1 + 1
        L_0x0032:
            if (r5 == 0) goto L_0x0054
            java.lang.String r0 = r4.A0u()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = r4.A0s()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = r4.A0t()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0054
        L_0x0052:
            int r1 = r1 + 1
        L_0x0054:
            if (r6 == 0) goto L_0x006e
            boolean r0 = A09(r3, r4)
            if (r0 == 0) goto L_0x005e
            int r1 = r1 + 1
        L_0x005e:
            boolean r0 = A08(r3, r4)
            if (r0 == 0) goto L_0x0066
            int r1 = r1 + 1
        L_0x0066:
            boolean r0 = X.C121877Ip.A05(r4)
            if (r0 == 0) goto L_0x006e
            int r1 = r1 + 1
        L_0x006e:
            boolean r0 = r4.A3b()
            if (r0 == 0) goto L_0x0003
            int r1 = r1 + 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67353zP.A00(android.content.Context, com.instagram.service.session.UserSession, com.instagram.user.model.User, boolean, boolean):int");
    }

    public static String A03(Activity activity) {
        UserSession userSession;
        String userId;
        if (!(activity instanceof C84654td)) {
            return null;
        }
        C10300i6 A0U = AnonymousClass0wJ.A0U(((BusinessConversionActivity) ((C84654td) activity)).A0A);
        if (!(A0U instanceof UserSession) || (userSession = (UserSession) A0U) == null || (userId = userSession.getUserId()) == null) {
            return "0";
        }
        return userId;
    }

    public static String A02() {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("0", "ADMINISTER");
        A0y.put(RealtimeSubscription.GRAPHQL_MQTT_VERSION, "500");
        A0y.put("2", "3");
        A0y.put("3", "true");
        ArrayList A0k = C18240wQ.A0k(A0y.size());
        for (Object next : A0y.keySet()) {
            A0k.add(StringFormatUtil.formatStrLocaleSafe("\"%s\":\"%s\"", next, A0y.get(next)));
        }
        return StringFormatUtil.formatStrLocaleSafe("{%s}", (Object) AnonymousClass0hA.A04(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A0k));
    }

    public static String A04(Context context, String str, String str2, String str3) {
        int i;
        Object[] objArr;
        if (TextUtils.isEmpty(str3)) {
            return "";
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty) {
            if (isEmpty2) {
                return str3;
            }
            i = 2131835985;
            objArr = new Object[]{str3, str2};
        } else if (isEmpty2) {
            i = 2131835984;
            objArr = new Object[]{str, str3};
        } else {
            i = 2131827733;
            objArr = new Object[]{str, str3, str2};
        }
        return context.getString(i, objArr);
    }

    public static void A05(Context context, TextView textView, C10300i6 r9, String str, String str2, String str3) {
        Context context2 = context;
        int color = context.getColor(R.color.igds_secondary_text);
        int A02 = C18220wO.A02(context, R.attr.textColorBoldLink);
        SpannableStringBuilder A0E = C18200wM.A0E(str2);
        String A01 = AnonymousClass3W8.A01(context2, str3);
        AnonymousClass0wJ.A1Q(r9, A01);
        AnonymousClass3Zw.A01(A0E, new C29401xz(context2, r9, (AnonymousClass36D) null, A01, A02), str);
        textView.setText(A0E);
        C18180wK.A0z(textView);
        textView.setTextColor(color);
    }

    public static void A06(Context context, String str) {
        String A0l = AnonymousClass0wJ.A0l(context, str, 2131832110);
        String A0l2 = AnonymousClass0wJ.A0l(context, str, 2131832111);
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A02 = A0l2;
        A0W.A0p(A0l);
        A0W.A0P(new IDxCListenerShape122S0000000_1_I2(0), 2131831976);
        AnonymousClass0wJ.A1K(A0W);
    }

    public static boolean A07(Context context, UserSession userSession, User user) {
        if (C19573AyZ.A06(userSession, user)) {
            return user.A2y();
        }
        if (!user.A2y() || !Boolean.TRUE.equals(user.A05.BBS())) {
            return false;
        }
        if (C09650fs.A07(context) || C09650fs.A09(context.getPackageManager(), AnonymousClass000.A00(147))) {
            return true;
        }
        return false;
    }

    public static boolean A08(UserSession userSession, User user) {
        if (!user.A3I() || !user.A32()) {
            return false;
        }
        if (user.A0b() != null && user.A0b().AZG() != null && Boolean.TRUE.equals(user.A0b().AZG().AW8())) {
            return true;
        }
        if (!Boolean.TRUE.equals(AnonymousClass0wJ.A0Y(userSession).A05.BRG()) || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36316400914009181L)) {
            return false;
        }
        return true;
    }

    public static boolean A09(UserSession userSession, User user) {
        if ((user.A0U() != SellerShoppableFeedType.PROFILE_SHOP || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36323607869136855L)) && (AnonymousClass3ib.A0B(userSession, user) == AnonymousClass006.A0N || AnonymousClass3ib.A0O(userSession, user))) {
            return true;
        }
        return false;
    }

    public static boolean A0A(User user) {
        Boolean B7P;
        boolean A1U = (!TextUtils.isEmpty(user.A1C())) ^ C18210wN.A1U(user.A1D());
        if (!user.A3a() || !user.A30() || !A1U || user.A0n() == null || user.A0n().intValue() >= 100000 || (B7P = user.A05.B7P()) == null || !B7P.booleanValue()) {
            return false;
        }
        return true;
    }
}
