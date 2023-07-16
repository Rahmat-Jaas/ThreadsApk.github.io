package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.instagram.service.session.UserSession;
import java.util.Iterator;

/* renamed from: X.3Qz  reason: invalid class name and case insensitive filesystem */
public final class C60903Qz {
    public static final String A00 = AnonymousClass2LB.A00();

    public static void A00(Context context, C11630kW r12, UserSession userSession, String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        String str7;
        StringBuilder sb = new StringBuilder(16);
        int i = 0;
        do {
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(C60953Rf.A02.nextInt(62)));
            i++;
        } while (i < 16);
        String obj = sb.toString();
        Context context2 = context;
        PackageManager packageManager = context.getPackageManager();
        Iterator it = C63443hU.A02().iterator();
        while (true) {
            if (!it.hasNext()) {
                str6 = null;
                break;
            }
            str6 = ((AnonymousClass255) it.next()).A01;
            if (("com.facebook.katana".equals(str6) || "com.facebook.wakizashi".equals(str6) || "com.facebook.lite".equals(str6)) && C09650fs.A09(packageManager, str6)) {
                break;
            }
        }
        String str8 = "msite";
        C11630kW r6 = r12;
        UserSession userSession2 = userSession;
        String str9 = str;
        if (str6 != null) {
            boolean equals = str6.equals("com.facebook.lite");
            if (equals) {
                str3 = null;
            }
            PackageManager packageManager2 = context.getPackageManager();
            Intent launchIntentForPackage = packageManager2.getLaunchIntentForPackage(str6);
            if (launchIntentForPackage != null) {
                if (!TextUtils.isEmpty(str3)) {
                    Intent A0B = C18190wL.A0B(str3);
                    if (!packageManager2.queryIntentActivities(A0B, 65600).isEmpty()) {
                        launchIntentForPackage = A0B;
                    }
                }
                launchIntentForPackage.putExtra("funlid", obj).putExtra("source_surface", str).putExtra("dest_intended_surface", "fb_homepage").putExtra("android.intent.extra.REFERRER", "android-app://com.instagram.android");
                C10650ih.A09(context, launchIntentForPackage);
            } else {
                C10450iM.A03("FamilyBridgesUtil", "Falling back to msite in openFacebookApp().");
                if (!TextUtils.isEmpty(str2)) {
                    if (str2 == null || str2.isEmpty()) {
                        str2 = A00;
                    }
                    C10650ih.A0B(context, new Intent("android.intent.action.VIEW", C18220wO.A0F(C18220wO.A0E(str2), "funlid", obj)));
                }
            }
            str8 = equals ? "android_fblite" : "android_fb4a";
        } else {
            if (str2 == null || str2.isEmpty()) {
                if (C09650fs.A06(context)) {
                    C09650fs.A01(context, "com.facebook.katana", str);
                    str8 = "app_store";
                } else {
                    str2 = null;
                    z = true;
                }
            }
            if (str2 == null || str2.isEmpty()) {
                str2 = A00;
            }
            Uri A0F = C18220wO.A0F(C18220wO.A0E(str2), "funlid", obj);
            if (z) {
                C37350Jpy A0Y = C18230wP.A0Y((Activity) context2, userSession, C171209wF.A14, A0F.toString());
                if (r12 != null) {
                    str7 = r12.getModuleName();
                } else {
                    str7 = null;
                }
                A0Y.A07(str7);
                A0Y.A04();
            } else {
                C10650ih.A0B(context, new Intent("android.intent.action.VIEW", A0F));
            }
        }
        C60953Rf.A01.AKp(new C25281mp(context2, r6, userSession2, str9, str8, obj, str4, str5));
    }
}
