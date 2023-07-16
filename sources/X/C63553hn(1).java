package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.registration.ui.NotificationBar;

/* renamed from: X.3hn  reason: invalid class name and case insensitive filesystem */
public final class C63553hn {
    public static void A04(Bundle bundle, C12560m7 r4) {
        AnonymousClass01J r2 = new AnonymousClass01J(r4);
        r4.A11((String) null, 1);
        C63463hW.A03();
        r2.A0D(C18250wR.A0O(bundle), R.id.layout_container_main);
        r2.A00();
    }

    public static void A08(NotificationBar notificationBar, String str) {
        if (!"".equals(str)) {
            Context context = notificationBar.getContext();
            notificationBar.A04(str, context.getColor(R.color.igds_error_or_destructive), context.getColor(R.color.igds_elevated_background));
        }
    }

    public static String A00(String str, String str2) {
        String stripSeparators;
        if (!TextUtils.isEmpty(str2) && (stripSeparators = PhoneNumberUtils.stripSeparators(AnonymousClass00U.A0V(str, " ", str2))) != null) {
            return stripSeparators;
        }
        return "";
    }

    public static void A01(Context context, View view, ImageView imageView) {
        int A08 = C09860go.A08(context);
        Drawable drawable = imageView.getDrawable();
        drawable.getClass();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int i = (int) (((float) A08) * 0.45f);
        imageView.getLayoutParams().width = Math.min(intrinsicWidth, i);
        if (view != null) {
            view.getLayoutParams().width = imageView.getLayoutParams().width + C18240wQ.A01(context, 48);
        }
    }

    public static void A02(Context context, TextView textView, C10300i6 r7) {
        String string = context.getString(2131829280);
        String A0l = AnonymousClass0wJ.A0l(context, string, 2131824343);
        int A01 = C18210wN.A01(context);
        textView.setHighlightColor(0);
        SpannableStringBuilder A0E = C18200wM.A0E(A0l);
        String A02 = AnonymousClass3W8.A02(context, "https://www.facebook.com/help/instagram/261704639352628?ref=learn_more");
        C04220Ms.A06(A02);
        AnonymousClass3Zw.A01(A0E, new C29381xu(context, r7, A02, A01), string);
        textView.setText(A0E);
        C18180wK.A0z(textView);
    }

    public static void A03(Context context, TextView textView, C10300i6 r9, C313625r r10, String str, String str2, String str3, boolean z, boolean z2) {
        int i;
        Object[] objArr;
        String string = context.getString(2131829285);
        String string2 = context.getString(2131829282);
        String string3 = context.getString(2131829281);
        if (z) {
            i = 2131835342;
            objArr = new Object[]{str2, str3, string, string2, string3};
        } else {
            if ("eu".equals(str)) {
                i = 2131829277;
                if (C313625r.SAC.equals(r10)) {
                    i = 2131835340;
                }
            } else if (!"row".equals(str)) {
                String string4 = context.getString(2131829285);
                String string5 = context.getString(2131829284);
                String A0h = C18220wO.A0h(context, string4, string5, 2131829276);
                int color = context.getColor(R.color.igds_secondary_text);
                textView.setHighlightColor(0);
                SpannableStringBuilder A0E = C18200wM.A0E(A0h);
                AnonymousClass3Zw.A01(A0E, new C29381xu(context, r9, AnonymousClass3h3.A02("/legal/terms/"), color), string4);
                AnonymousClass3Zw.A01(A0E, new C29381xu(context, r9, AnonymousClass3h3.A02("/legal/privacy/"), color), string5);
                textView.setText(A0E);
                C18180wK.A0z(textView);
                textView.setTextColor(color);
                return;
            } else if (C313625r.SAC.equals(r10)) {
                i = 2131835341;
            } else {
                i = 2131829278;
                if (z2) {
                    i = 2131829279;
                }
            }
            objArr = new Object[]{string, string2, string3};
        }
        String string6 = context.getString(i, objArr);
        int A01 = C18210wN.A01(context);
        textView.setHighlightColor(0);
        SpannableStringBuilder A0E2 = C18200wM.A0E(string6);
        String A02 = AnonymousClass3W8.A02(context, "https://help.instagram.com/581066165581870");
        C04220Ms.A06(A02);
        AnonymousClass3Zw.A01(A0E2, new C29381xu(context, r9, A02, A01), string);
        String A022 = AnonymousClass3W8.A02(context, "https://help.instagram.com/519522125107875");
        C04220Ms.A06(A022);
        AnonymousClass3Zw.A01(A0E2, new C29381xu(context, r9, A022, A01), string2);
        String A023 = AnonymousClass3W8.A02(context, "https://i.instagram.com/legal/cookies/");
        C04220Ms.A06(A023);
        AnonymousClass3Zw.A01(A0E2, new C29381xu(context, r9, A023, A01), string3);
        textView.setText(A0E2);
        C18180wK.A0z(textView);
    }

    public static void A05(View view, Fragment fragment, C10300i6 r5, C313625r r6, AnonymousClass265 r7, boolean z) {
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.log_in_button);
        C18200wM.A18(AnonymousClass0wJ.A0B(fragment), A0L, 2131821308);
        A0L.setOnClickListener(new C64673rQ(fragment, r5, r6, r7, z));
    }

    public static void A06(TextView textView) {
        if (TextUtils.isEmpty(C18210wN.A0c(textView))) {
            textView.requestFocus();
            C09860go.A0K(textView);
            return;
        }
        C09860go.A0I(textView);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r4 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(androidx.fragment.app.Fragment r2, X.C12560m7 r3, java.lang.String r4, java.lang.String r5) {
        /*
            androidx.fragment.app.Fragment r0 = r3.A0O(r5)
            X.01J r1 = new X.01J
            if (r0 != 0) goto L_0x0018
            r1.<init>(r3)
            r0 = 2131302403(0x7f091803, float:1.8222891E38)
            r1.A0G(r2, r5, r0)
        L_0x0011:
            r1.A0K(r4)
        L_0x0014:
            r1.A01()
            return
        L_0x0018:
            r1.<init>(r3)
            r0 = 1
            r3.A11(r4, r0)
            r0 = 2131302403(0x7f091803, float:1.8222891E38)
            r1.A0G(r2, r5, r0)
            if (r4 == 0) goto L_0x0014
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63553hn.A07(androidx.fragment.app.Fragment, X.0m7, java.lang.String, java.lang.String):void");
    }
}
