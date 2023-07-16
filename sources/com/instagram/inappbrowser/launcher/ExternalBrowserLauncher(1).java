package com.instagram.inappbrowser.launcher;

import X.AnonymousClass006;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass2BM;
import X.AnonymousClass3BT;
import X.C10450iM;
import X.C10650ih;
import X.C15430rJ;
import X.C16240si;
import X.C18180wK;
import X.C18200wM;
import X.C18240wQ;
import X.C28161tl;
import X.C36890Jge;
import X.C63803iN;
import X.C65863w7;
import X.C73594Ta;
import X.C73604Tb;
import X.I17;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import ch.boye.httpclientandroidlib.HttpHost;
import com.facebook.common.dextricks.Constants;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ExternalBrowserLauncher {
    public static final C16240si A06 = new C36890Jge("IgSecureUriParser").A01;
    public List A00 = AnonymousClass0wJ.A0v();
    public List A01 = AnonymousClass0wJ.A0v();
    public boolean A02;
    public final Context A03;
    public final PackageManager A04;
    public final UserSession A05;

    public static String A00(String str, String str2) {
        String value = new UrlQuerySanitizer(str).getValue(str2);
        if (value == null) {
            return str;
        }
        int indexOf = str.indexOf(str2);
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(str.charAt(indexOf - 1));
        A0r.append(str2);
        A0r.append("=");
        return str.replace(C18180wK.A0i(value, A0r), "");
    }

    public static boolean A01(ExternalBrowserLauncher externalBrowserLauncher, String str) {
        UserSession userSession = externalBrowserLauncher.A05;
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        String A0C = C63803iN.A0C(r3, userSession, 36883534165573958L);
        int intValue = C63803iN.A07(r3, userSession, 36602059188932392L).intValue();
        C63803iN.A0E(r3, userSession, 36320584212289615L);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(A0C)) {
            String[] split = A0C.split("[,; ]+");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str2 = split[i];
                if (TextUtils.isEmpty(str2) || !str.contains(str2)) {
                    i++;
                } else if (intValue != 1) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final AnonymousClass3BT A02(Uri uri) {
        ArrayList A0v;
        int indexOf;
        PackageManager packageManager = this.A04;
        if (packageManager == null) {
            A0v = AnonymousClass0wJ.A0v();
        } else {
            String str = null;
            Intent addCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE");
            Intent addCategory2 = new Intent("android.intent.action.VIEW", uri.buildUpon().scheme(HttpHost.DEFAULT_SCHEME_NAME).build()).addCategory("android.intent.category.BROWSABLE");
            ResolveInfo resolveActivity = packageManager.resolveActivity(addCategory, Constants.LOAD_RESULT_PGO_ATTEMPTED);
            if (!(resolveActivity == null && (resolveActivity = packageManager.resolveActivity(addCategory2, Constants.LOAD_RESULT_PGO_ATTEMPTED)) == null)) {
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                activityInfo.getClass();
                str = activityInfo.packageName;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE"), Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            A0v = AnonymousClass0wJ.A0v();
            for (ResolveInfo next : queryIntentActivities) {
                ActivityInfo activityInfo2 = next.activityInfo;
                activityInfo2.getClass();
                String str2 = activityInfo2.packageName;
                boolean equals = str2.equals(str);
                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                A0v2.add(str2);
                TextUtils.isEmpty(AnonymousClass2BM.A00(this.A03, A0v2));
                List list = this.A01;
                if (!list.contains(next.activityInfo.packageName)) {
                    indexOf = Integer.MAX_VALUE;
                } else {
                    indexOf = list.indexOf(next.activityInfo.packageName);
                }
                A0v.add(new AnonymousClass3BT(str2, equals, this.A00.contains(next.activityInfo.packageName), indexOf));
            }
        }
        if (A0v.isEmpty()) {
            return null;
        }
        Collections.sort(A0v, C73594Ta.A00);
        C65863w7 r5 = C65863w7.A00;
        ArrayList A0v3 = AnonymousClass0wJ.A0v();
        for (Object next2 : A0v) {
            if (r5.test(next2)) {
                A0v3.add(next2);
            }
        }
        Collections.sort(A0v3, C73604Tb.A00);
        if (!A0v3.isEmpty()) {
            return (AnonymousClass3BT) C18240wQ.A0b(A0v3);
        }
        return null;
    }

    public final Integer A03(String str) {
        boolean z;
        UserSession userSession = this.A05;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r2, userSession, 36315949942639511L)) {
            return AnonymousClass006.A00;
        }
        if (C63803iN.A0E(r2, userSession, 36315949942836122L)) {
            return AnonymousClass006.A0C;
        }
        String A002 = I17.A00(226);
        Uri A012 = C15430rJ.A01(str);
        boolean z2 = false;
        if (!A012.getQueryParameterNames().contains(I17.A00(225))) {
            z = false;
        } else {
            long A052 = C18180wK.A05(C28161tl.A04(userSession), "sys_browser_last_open_time");
            int i = 30;
            try {
                if (A012.getQueryParameterNames().contains(A002)) {
                    String queryParameter = A012.getQueryParameter(A002);
                    queryParameter.getClass();
                    i = Integer.parseInt(queryParameter);
                }
            } catch (NullPointerException | NumberFormatException e) {
                C10450iM.A06(I17.A00(555), "Can't parse external browser redirect frequency url param", e);
            }
            if (C18240wQ.A09(A052) < ((long) i) * 86400000) {
                z2 = true;
            }
            z = !z2;
        }
        if (z) {
            return AnonymousClass006.A0j;
        }
        return AnonymousClass006.A0A;
    }

    public final boolean A04(String str, String str2) {
        Uri uri;
        if (this.A02 && this.A04 != null && (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2))) {
            if (!TextUtils.isEmpty(str)) {
                uri = C15430rJ.A00(A06, str, true);
                if (uri == null) {
                    return false;
                }
            } else {
                str2.getClass();
                uri = C15430rJ.A01(str2);
            }
            AnonymousClass3BT A022 = A02(uri);
            if (A022 != null) {
                return C10650ih.A09(this.A03, new Intent("android.intent.action.VIEW", uri).setPackage(A022.A01).addCategory("android.intent.category.BROWSABLE"));
            }
        }
        return false;
    }

    public ExternalBrowserLauncher(Context context, UserSession userSession) {
        this.A03 = context;
        this.A04 = context.getPackageManager();
        this.A05 = userSession;
    }
}
