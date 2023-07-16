package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.model.mediatype.ProductType;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3fH  reason: invalid class name and case insensitive filesystem */
public final class C63153fH {
    public static final void A00(Context context, DialogInterface.OnDismissListener onDismissListener, ProductType productType, String str) {
        int i;
        AnonymousClass0wJ.A1M(str, 1, productType);
        int ordinal = productType.ordinal();
        if (ordinal == 9) {
            i = 2131826957;
        } else if (ordinal == 1) {
            i = 2131826950;
        } else if (ordinal == 13) {
            i = 2131826953;
        } else {
            throw new UnsupportedOperationException("Unknown product type");
        }
        C25828Dsm A0W = C18190wL.A0W(context);
        C18230wP.A11(context, A0W, R.drawable.ig_illustrations_illo_subscriber_crown_badge);
        A0W.A0L(2131826958);
        A0W.A0p(AnonymousClass0wJ.A0l(context, str, i));
        A0W.A0P(C64213js.A00, 2131826219);
        A0W.A0e(onDismissListener);
        AnonymousClass0wJ.A1K(A0W);
    }

    public static final void A01(Context context, SpannableStringBuilder spannableStringBuilder, boolean z) {
        Drawable drawable;
        boolean z2;
        int length;
        C04220Ms.A0B(context, 0);
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_icons_exceptions_crown_badge_purple_filled_12);
        if (drawable2 != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        int i = 0;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        if (z || !AnonymousClass0hB.A02(context)) {
            z2 = false;
            length = spannableStringBuilder.length();
        } else {
            z2 = true;
            length = 0;
        }
        spannableStringBuilder.insert(length, " ");
        if (z2) {
            spannableStringBuilder.insert(0, "\r");
        } else {
            i = spannableStringBuilder.length();
            spannableStringBuilder.append("\r");
        }
        spannableStringBuilder.setSpan(new F32(drawable), i, i + 1, 33);
    }

    public static final void A03(UserSession userSession, Context context) {
        C04220Ms.A0B(userSession, 0);
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0L(2131831580);
        A0W.A0K(2131831579);
        AnonymousClass25l r3 = AnonymousClass25l.DEFAULT;
        A0W.A0T((DialogInterface.OnClickListener) null, r3, 2131831976);
        A0W.A0W(new IDxCListenerShape77S0200000_1_I2(context, userSession, 28), r3, context.getResources().getString(2131829574), false);
        AnonymousClass0wJ.A1K(A0W);
        AnonymousClass495 A00 = AnonymousClass2O7.A00(userSession);
        long A0B = C18200wM.A0B(userSession);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A00.A00, "instagram_fan_club_music_attempted"), 1795);
        C18190wL.A1J(A0I, "camera", A0B);
        A0I.Bb4();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r7.A02 == X.C307022o.SUBSCRIBED) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(com.instagram.service.session.UserSession r6, com.instagram.user.model.User r7) {
        /*
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.String r1 = r6.getUserId()
            java.lang.String r0 = r7.getId()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0019
            X.22o r1 = r7.A02
            X.22o r0 = X.C307022o.SUBSCRIBED
            r5 = 1
            if (r1 != r0) goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            java.lang.String r2 = r7.getId()
            java.lang.String r1 = r7.BK7()
            com.instagram.fanclub.intf.UserPayFanclubUpsellParams r0 = new com.instagram.fanclub.intf.UserPayFanclubUpsellParams
            r0.<init>(r2, r1, r5)
            X.495 r1 = X.AnonymousClass2O7.A00(r6)
            java.lang.String r0 = r7.getId()
            long r3 = java.lang.Long.parseLong(r0)
            X.0nS r1 = r1.A00
            java.lang.String r0 = "viewer_profile_fanclub_banner_impression"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2921(0xb69, float:4.093E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "profile"
            X.C18190wL.A1J(r2, r0, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "show_learn_more"
            r2.A0Q(r0, r1)
            r2.Bb4()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63153fH.A04(com.instagram.service.session.UserSession, com.instagram.user.model.User):void");
    }

    public static final boolean A05(Context context) {
        String installerPackageName;
        if (context == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                installerPackageName = context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName();
            } else {
                installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            }
            return C04220Ms.A0I(installerPackageName, "com.amazon.venezia");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final void A02(Context context, User user, int i, boolean z) {
        C63733iD A01 = C63733iD.A01();
        A01.A0A = C18190wL.A0h(context.getResources(), user.BK7(), i);
        A01.A0E(AnonymousClass22b.CIRCULAR);
        A01.A06 = user.B4M();
        A01.A0C();
        if (z) {
            A01.A0F = context.getResources().getString(2131837613);
        }
        C63733iD.A09(C38040KHr.A01, A01);
    }
}
