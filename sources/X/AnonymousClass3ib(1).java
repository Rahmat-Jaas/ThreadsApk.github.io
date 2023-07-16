package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.TextAppearanceSpan;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceEventType;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.model.shopping.Product;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.3ib  reason: invalid class name */
public final class AnonymousClass3ib {
    public static final List A00 = C06750aI.A17("instagram_shopping_related_posts_grid", "rtc_call", "guide_add_items");

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.CharSequence A03(android.content.Context r5, com.instagram.model.shopping.Product r6, int r7, int r8) {
        /*
            r4 = 0
            com.instagram.api.schemas.ProductReviewStatus r0 = r6.A00()
            r2 = 4
            if (r0 != 0) goto L_0x003e
            r0 = -1
        L_0x0009:
            java.lang.String r1 = ""
            if (r0 == r2) goto L_0x001a
            r2 = 2
            if (r0 == r2) goto L_0x003a
            r2 = 3
            if (r0 != r2) goto L_0x001d
            r0 = 2131832915(0x7f113053, float:1.9298897E38)
        L_0x0016:
            java.lang.String r1 = r5.getString(r0)
        L_0x001a:
            X.C04220Ms.A09(r1)
        L_0x001d:
            com.instagram.api.schemas.ProductReviewStatus r2 = r6.A00()
            com.instagram.api.schemas.ProductReviewStatus r0 = com.instagram.api.schemas.ProductReviewStatus.PENDING
            if (r2 == r0) goto L_0x0026
            r7 = r8
        L_0x0026:
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r1)
            android.text.style.TextAppearanceSpan r2 = new android.text.style.TextAppearanceSpan
            r2.<init>(r5, r7)
            int r1 = r3.length()
            r0 = 33
            r3.setSpan(r2, r4, r1, r0)
            return r3
        L_0x003a:
            r0 = 2131832914(0x7f113052, float:1.9298895E38)
            goto L_0x0016
        L_0x003e:
            int r0 = r0.ordinal()
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ib.A03(android.content.Context, com.instagram.model.shopping.Product, int, int):java.lang.CharSequence");
    }

    public static final CharSequence A05(Context context, UserSession userSession, String str, boolean z) {
        C04220Ms.A0B(userSession, 3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("(").append(str).append(")");
        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, R.style.FullPriceSubtitleStyle), 0, spannableStringBuilder.length(), 33);
        if (z && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36315825388391230L)) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static final CharSequence A06(Context context, CharSequence charSequence, Integer num) {
        C04220Ms.A0B(charSequence, 0);
        if (num == null) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(context, num.intValue()), 0, spannableString.length(), 33);
        return spannableString;
    }

    public static final CharSequence A09(Context context, String str, String str2) {
        SpannableString spannableString = new SpannableString(A0A(str, Integer.valueOf(context.getColor(R.color.default_cta_dominate_color))));
        spannableString.setSpan(new TextAppearanceSpan(context, R.style.PriceIncentiveExperimentStyle), 0, spannableString.length(), 33);
        spannableString.setSpan(new TextAppearanceSpan(context, R.style.SalePriceDarkModeExperimentStyle), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString(str2);
        spannableString2.setSpan(new StrikethroughSpan(), 0, spannableString2.length(), 33);
        spannableString2.setSpan(new TextAppearanceSpan(context, R.style.StrikeThroughPriceIncentiveExperimentStyle), 0, spannableString2.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(spannableString).append(" ").append(spannableString2);
        return spannableStringBuilder;
    }

    public static final Integer A0B(UserSession userSession, User user) {
        List A1V;
        C04220Ms.A0B(userSession, 1);
        if (!user.A2x()) {
            if (user.A31()) {
                return AnonymousClass006.A00;
            }
            C21605BxB A0d = user.A0d();
            if (A0d != null && C18190wL.A1a(A0d.AsI())) {
                return AnonymousClass006.A01;
            }
            if (C19573AyZ.A06(userSession, user) && (A1V = AnonymousClass0wJ.A0Y(userSession).A1V()) != null && A1V.contains("ADD_SHOP")) {
                return AnonymousClass006.A0N;
            }
            if (C19573AyZ.A06(userSession, user) && user.Apo() && C17578AFm.A00(userSession)) {
                return AnonymousClass006.A0C;
            }
        }
        return AnonymousClass006.A0Y;
    }

    public static final void A0D(FragmentActivity fragmentActivity, UserSession userSession, User user, String str, String str2, boolean z) {
        String str3;
        AnonymousClass0wJ.A1M(userSession, 0, str);
        C04220Ms.A0B(fragmentActivity, 4);
        C84254sq AYV = user.A05.AYV();
        if (AYV == null || (str3 = AYV.Ax2()) == null) {
            str3 = "";
        }
        C25274Div.A00();
        String A0e = C18180wK.A0e();
        C04220Ms.A06(A0e);
        C11660kZ A002 = C12090lI.A00(userSession);
        C15730rn A01 = C15730rn.A01("instagram_shopping_cis_onboarding_click_entry_point", str);
        A01.A0D("entry_point", str2);
        A01.A0D("waterfall_id", A0e);
        A002.Cd7(A01);
        if (z) {
            Bundle A06 = C18180wK.A06();
            A06.putString("signup_nav_bar_title", str3);
            A06.putString("entry_point", str2);
            A06.putString("waterfall_id", A0e);
            A06.putString("prior_module", str);
            C63863iT.A08(fragmentActivity, A06, userSession, ModalActivity.class, "shopping_in_app_cis_onboarding");
            return;
        }
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(fragmentActivity, userSession);
        C19513Axa.A00.A0P();
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("prior_module", str);
        A0y.put("entry_point", str2);
        C25274Div.A00();
        A0y.put("waterfall_id", A0e);
        A0y.put("presentation_style", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        C62853b1.A04(A0Q, userSession, "com.bloks.www.bloks.commerce.integrity.system.entrypoint", str3, A0y);
    }

    public static final void A0E(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C04220Ms.A0B(fragmentActivity, 1);
        Fragment A002 = A00(userSession, fragmentActivity.getString(2131829233), str);
        if (A002 != null) {
            AnonymousClass0wJ.A19(A002, fragmentActivity, userSession);
        }
    }

    public static final void A0F(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C04220Ms.A0B(fragmentActivity, 1);
        String obj = AnonymousClass27g.INSTAGRAM.toString();
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        A0Q.A03 = A01(userSession, fragmentActivity.getString(2131832047), str, (String) null, obj);
        A0Q.A05();
    }

    public static final void A0G(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        C04220Ms.A0B(fragmentActivity, 3);
        C25274Div.A00();
        String A0e = C18180wK.A0e();
        C04220Ms.A06(A0e);
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(fragmentActivity, userSession);
        C19513Axa.A00.A0P();
        String A0k = AnonymousClass0wJ.A0k(fragmentActivity, 2131835812);
        K9R k9r = K9R.A00;
        IVw iVw = new IVw(k9r);
        if (str == null) {
            str = "";
        }
        iVw.A04("entry_point", str);
        iVw.A04("waterfall_id", A0e);
        if (str2 == null) {
            str2 = "";
        }
        iVw.A04("prior_module", str2);
        IVw A0M = C18180wK.A0M(k9r, iVw);
        HashMap A0y = AnonymousClass0wJ.A0y();
        C18200wM.A1T(A0M, A0y);
        C62853b1.A04(A0Q, userSession, "com.bloks.www.bloks.commerce.onboarding.adscredit.progress", A0k, A0y);
    }

    public static final void A0I(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        C04220Ms.A0B(fragmentActivity, 3);
        C25274Div.A00();
        String A0e = C18180wK.A0e();
        C04220Ms.A06(A0e);
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(fragmentActivity, userSession);
        C19513Axa.A00.A0P();
        String A0k = AnonymousClass0wJ.A0k(fragmentActivity, 2131835878);
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (str == null) {
            str = "";
        }
        A0y.put("entry_point", str);
        A0y.put("waterfall_id", A0e);
        if (str2 == null) {
            str2 = "";
        }
        A0y.put("prior_module", str2);
        A0y.put("presentation_style", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        C62853b1.A04(A0Q, userSession, "com.instagram.shopping.screens.seller_policy_migration", A0k, A0y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r12.length() == 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0J(androidx.fragment.app.FragmentActivity r21, com.instagram.service.session.UserSession r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            r8 = 0
            r7 = r21
            r15 = r22
            boolean r2 = X.AnonymousClass0wJ.A1Z(r15, r7)
            java.lang.String r0 = X.C122037Js.A01()
            X.C04220Ms.A06(r0)
            r12 = r23
            if (r23 == 0) goto L_0x001b
            int r3 = r12.length()
            r1 = 0
            if (r3 != 0) goto L_0x001c
        L_0x001b:
            r1 = 1
        L_0x001c:
            r23 = r1 ^ 1
            X.9zr r14 = X.C171719zr.A03
            r6 = 0
            r11 = r24
            r10 = r25
            r9 = r26
            r18 = r6
            r19 = r6
            r20 = r11
            r21 = r10
            r22 = r9
            r16 = r0
            r17 = r12
            X.C49552rZ.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r5 = 951398990(0x38b5324e, float:8.6401225E-5)
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            java.util.BitSet r13 = new java.util.BitSet
            r13.<init>(r2)
            java.lang.String r14 = "referrer_surface"
            r1.put(r14, r12)
            r13.set(r8)
            java.lang.String r12 = "orders_hub_session_id"
            r1.put(r12, r0)
            java.lang.String r0 = "additional_logging_data"
            r1.put(r0, r11)
            java.lang.String r0 = "deeplink_destination"
            r1.put(r0, r10)
            java.util.HashMap r10 = X.AnonymousClass0wJ.A0y()
            if (r26 == 0) goto L_0x009f
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r11 = 6
            java.util.List r0 = X.AnonymousClass8bP.A0f(r9, r0, r8, r11)
            java.util.Iterator r14 = r0.iterator()
        L_0x0078:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x009f
            java.lang.String r9 = X.C18180wK.A0k(r14)
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r12 = X.AnonymousClass8bP.A0f(r9, r0, r8, r11)
            int r9 = r12.size()
            r0 = 2
            if (r9 != r0) goto L_0x0078
            java.lang.Object r9 = r12.get(r8)
            java.lang.Object r0 = r12.get(r2)
            r10.put(r9, r0)
            goto L_0x0078
        L_0x009f:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00aa
            java.lang.String r0 = "deeplink_destination_params"
            r1.put(r0, r10)
        L_0x00aa:
            com.instagram.bloks.hosting.IgBloksScreenConfig r9 = X.C18190wL.A0N(r15)
            int r0 = r13.nextClearBit(r8)
            if (r0 < r2) goto L_0x00cf
            java.util.HashMap r2 = X.C37067Jjv.A02(r1)
            java.lang.String r1 = "com.bloks.www.orders_hub.home"
            X.3iE r0 = new X.3iE
            r0.<init>(r2, r4, r1)
            X.C63743iE.A0A(r0, r5)
            r0.A03 = r6
            r0.A02 = r6
            r0.A04 = r6
            r0.A0G(r3)
            r0.A0C(r7, r9)
            return
        L_0x00cf:
            java.lang.String r0 = "Missing Required Props"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ib.A0J(androidx.fragment.app.FragmentActivity, com.instagram.service.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void A0K(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        UserSession userSession2 = userSession;
        boolean A1Y = AnonymousClass0wJ.A1Y(userSession, fragmentActivity);
        String A01 = C122037Js.A01();
        C04220Ms.A06(A01);
        HashMap A0y = AnonymousClass0wJ.A0y();
        String str7 = str;
        A0y.put("order_id", str);
        String str8 = str2;
        A0y.put("referrer_surface", str8);
        String str9 = str3;
        A0y.put("order_item_ids", str9);
        A0y.put("orders_hub_session_id", A01);
        String str10 = str4;
        A0y.put("additional_logging_data", str10);
        String str11 = str5;
        A0y.put("deeplink_destination", str11);
        boolean z = true;
        if (str2 == null || str8.length() == 0 || str == null || str.length() == 0) {
            z = false;
        }
        C49552rZ.A00(C171719zr.A02, userSession2, A01, str8, str7, str9, str10, str11, str6, z);
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        C63743iE A02 = C63743iE.A02("com.bloks.www.orders_hub.order_details", A0y);
        A02.A00 = 951391000;
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        A0N.A0h = A1Y;
        C18220wO.A1B(C62853b1.A02(A0N, A02), A0Q, A1Y);
    }

    public static final void A0L(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        String str3;
        AnonymousClass0wJ.A1M(userSession, 0, str);
        C04220Ms.A0B(fragmentActivity, 4);
        String A0e = C18180wK.A0e();
        C04220Ms.A06(A0e);
        if (z) {
            str3 = "modal";
        } else {
            str3 = TraceEventType.Push;
        }
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        C19513Axa.A00.A0P();
        Bundle A06 = C18180wK.A06();
        C18210wN.A0x(A06, str2);
        A06.putString("waterfall_id", A0e);
        A06.putString("prior_module", str);
        A06.putString("presentation_style", str3);
        AnonymousClass1bA r0 = new AnonymousClass1bA();
        r0.setArguments(A06);
        A0Q.A03 = r0;
        A0Q.A07 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        A0Q.A05();
    }

    public static final void A0N(UserSession userSession, Activity activity, String str) {
        AnonymousClass0wJ.A1M(userSession, 1, str);
        if (AnonymousClass0wJ.A0Y(userSession).A2p()) {
            C63703i9 r2 = C63703i9.A00;
            if (!C63703i9.A00(r2, userSession).getBoolean("has_seen_influencers_nux_dialog", false)) {
                C19513Axa.A00.A0Z(activity, userSession, str, true);
                AnonymousClass0wJ.A13(C63703i9.A00(r2, userSession).edit(), "has_seen_influencers_nux_dialog", true);
            }
        }
    }

    public static final boolean A0O(UserSession userSession, User user) {
        C04220Ms.A0B(userSession, 1);
        Integer A0B = A0B(userSession, user);
        if (AnonymousClass006.A00 == A0B || AnonymousClass006.A0C == A0B || AnonymousClass006.A01 == A0B) {
            return true;
        }
        return false;
    }

    public static final Fragment A00(UserSession userSession, String str, String str2) {
        if (str2 == null) {
            return null;
        }
        Bundle A06 = C18180wK.A06();
        A06.putString("itemID", str2);
        C63343hJ.getInstance().getFragmentFactory();
        C71494Ja A01 = C63343hJ.A01(userSession);
        A01.CpK("IgPaymentsItemDetailsRoute");
        A01.A07 = str;
        A01.Cod(A06);
        Bundle ABD = A01.ABD();
        C34611Ibh ibh = new C34611Ibh();
        ibh.setArguments(ABD);
        return ibh;
    }

    public static final CharSequence A0A(CharSequence charSequence, Integer num) {
        if (num == null) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
        return spannableString;
    }

    public static final Fragment A01(UserSession userSession, String str, String str2, String str3, String str4) {
        Bundle A06 = C18180wK.A06();
        A06.putString("receiptID", str2);
        A06.putString("sessionID", str3);
        A06.putString("transactionSource", str4);
        C63343hJ.getInstance().getFragmentFactory();
        C71494Ja A01 = C63343hJ.A01(userSession);
        A01.CpK("IgPaymentsReceiptRoute");
        A01.A07 = str;
        A01.Cod(A06);
        Bundle ABD = A01.ABD();
        C34611Ibh ibh = new C34611Ibh();
        ibh.setArguments(ABD);
        return ibh;
    }

    public static final CharSequence A02(Context context, Product product) {
        boolean A0C = product.A0C();
        String A05 = product.A05();
        if (A0C) {
            C04220Ms.A06(A05);
            return A09(context, A05, product.A04());
        }
        C04220Ms.A06(A05);
        return A06(context, A05, Integer.valueOf(R.style.PriceIncentiveExperimentStyle));
    }

    public static final CharSequence A04(Context context, Product product, Integer num, Integer num2) {
        String A05 = product.A05();
        C04220Ms.A06(A05);
        String A04 = product.A04();
        if (!product.A0C()) {
            return A06(context, A05, num);
        }
        return A07(context, num2, A05, A04);
    }

    public static final CharSequence A07(Context context, Integer num, String str, String str2) {
        SpannableStringBuilder A0E = C18200wM.A0E(A0A(str, num));
        A0E.append(" ");
        int length = A0E.length();
        A0E.append(str2);
        A0E.setSpan(new StrikethroughSpan(), length, A0E.length(), 33);
        A0E.setSpan(new TextAppearanceSpan(context, R.style.FullPriceSubtitleStyle), length, A0E.length(), 33);
        return A0E;
    }

    public static final CharSequence A08(Context context, Integer num, String str, String str2) {
        SpannableString spannableString = new SpannableString(A0A(str, num));
        spannableString.setSpan(new TextAppearanceSpan(context, R.style.SalePriceDarkModeExperimentStyle), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString(str2);
        spannableString2.setSpan(new StrikethroughSpan(), 0, spannableString2.length(), 33);
        spannableString2.setSpan(new TextAppearanceSpan(context, R.style.FullPriceSubtitleStyle), 0, spannableString2.length(), 33);
        SpannableStringBuilder append = new SpannableStringBuilder().append(spannableString).append(" ").append(spannableString2);
        C04220Ms.A06(append);
        return append;
    }

    public static final void A0C(Fragment fragment, C170769vX r4, UserSession userSession, String str, boolean z) {
        boolean A1Z = C18200wM.A1Z(r4);
        if ((fragment instanceof C33745Htj) && fragment.getContext() != null) {
            Context context = fragment.getContext();
            C33745Htj htj = (C33745Htj) fragment;
            C04220Ms.A0B(htj, A1Z ? 1 : 0);
            if (context != null) {
                C25529DnJ.A02.A02(context, htj, userSession).Cuz(r4, C28923FeI.FOLLOWERS_SHARE);
                if (z) {
                    C31025Gdk.A01().A0Y = A1Z;
                }
                C31025Gdk.A01().A0E = str;
            }
        }
    }

    public static final void A0H(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        C25274Div.A00();
        String A0e = C18180wK.A0e();
        C04220Ms.A06(A0e);
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(fragmentActivity, userSession);
        C19513Axa.A00.A0P();
        Bundle A06 = C18180wK.A06();
        C18210wN.A0x(A06, str);
        A06.putString("waterfall_id", A0e);
        A06.putString("prior_module", str2);
        AnonymousClass1b9 r0 = new AnonymousClass1b9();
        r0.setArguments(A06);
        A0Q.A03 = r0;
        A0Q.A07 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        A0Q.A05();
    }

    public static final void A0M(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        C25274Div.A00();
        String A0e = C18180wK.A0e();
        C04220Ms.A06(A0e);
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(fragmentActivity, userSession);
        C19513Axa.A00.A0P();
        Bundle A06 = C18180wK.A06();
        C18210wN.A0x(A06, str);
        A06.putString("waterfall_id", A0e);
        A06.putString("prior_module", str2);
        A06.putBoolean("is_deferred_payout", z);
        AnonymousClass1b8 r0 = new AnonymousClass1b8();
        r0.setArguments(A06);
        A0Q.A03 = r0;
        A0Q.A07 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        A0Q.A05();
    }

    public static final boolean A0P(UserSession userSession, String str) {
        AnonymousClass0wJ.A1N(str, userSession);
        if (str.equals("rtc_call")) {
            return !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36316714446621996L);
        }
        return A00.contains(str);
    }
}
