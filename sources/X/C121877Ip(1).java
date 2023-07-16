package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7Ip  reason: invalid class name and case insensitive filesystem */
public final class C121877Ip {
    public static boolean A05(User user) {
        return (C59623Lo.A00(user) || C59623Lo.A01(user)) && AnonymousClass0wJ.A1W(user.A08());
    }

    public static C146558mR A00(SMBPartnerType sMBPartnerType, User user) {
        if (sMBPartnerType == null) {
            return null;
        }
        if (sMBPartnerType.equals(SMBPartnerType.GIFT_CARD)) {
            return user.A0B();
        }
        if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
            return user.A09();
        }
        if (sMBPartnerType.equals(SMBPartnerType.DONATION)) {
            return user.A05.BCU();
        }
        return null;
    }

    public static String A01(Context context, SMBPartnerType sMBPartnerType, String str) {
        int i;
        boolean equals = str.equals("sticker");
        boolean equals2 = sMBPartnerType.equals(SMBPartnerType.GIFT_CARD);
        if (equals) {
            if (equals2) {
                i = 2131821113;
            } else if (!sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                return null;
            } else {
                i = 2131821042;
            }
        } else if (equals2) {
            i = 2131821112;
        } else if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
            i = 2131821041;
        } else if (!sMBPartnerType.equals(SMBPartnerType.DONATION)) {
            return null;
        } else {
            i = 2131821047;
        }
        return context.getString(i);
    }

    public static String A02(SMBPartnerType sMBPartnerType) {
        if (sMBPartnerType == null) {
            return "";
        }
        int ordinal = sMBPartnerType.ordinal();
        if (ordinal == 3) {
            return "https://help.instagram.com/3180219732057386";
        }
        if (ordinal == 2) {
            return "https://help.instagram.com/661624171320775";
        }
        if (ordinal == 1) {
            return "https://help.instagram.com/242451420235904";
        }
        throw C86134wK.A0s(AnonymousClass00U.A0L(AnonymousClass000.A00(43), sMBPartnerType.toString()));
    }

    public static String A03(C109206jd r3) {
        ImmutableList of;
        String str;
        ImmutableList of2;
        ImmutableList of3;
        StringBuilder A0s = C18190wL.A0s("https://");
        List list = r3.A02;
        if (list != null) {
            of = ImmutableList.copyOf((Collection) list);
        } else {
            of = ImmutableList.of();
        }
        if (of != null) {
            List list2 = r3.A02;
            if (list2 != null) {
                of2 = ImmutableList.copyOf((Collection) list2);
            } else {
                of2 = ImmutableList.of();
            }
            if (!of2.isEmpty()) {
                List list3 = r3.A02;
                if (list3 != null) {
                    of3 = ImmutableList.copyOf((Collection) list3);
                } else {
                    of3 = ImmutableList.of();
                }
                str = (String) of3.get(0);
                return C18180wK.A0i(str, A0s);
            }
        }
        A0s.append(r3.A01.toLowerCase(Locale.US));
        str = ".com";
        return C18180wK.A0i(str, A0s);
    }

    public static boolean A04(FragmentActivity fragmentActivity, ActionButtonPartnerType actionButtonPartnerType, SMBPartnerType sMBPartnerType, String str) {
        PackageManager packageManager;
        Intent intent = new Intent("android.intent.action.VIEW", C15430rJ.A01(str));
        String A00 = C18170wI.A00(36);
        Intent addCategory = intent.addCategory(A00);
        String A002 = I17.A00(485);
        Intent addFlags = addCategory.addCategory(A002).addFlags(335544320);
        if (SMBPartnerType.DONATION.equals(sMBPartnerType)) {
            return C10650ih.A0A(fragmentActivity, addFlags);
        }
        if ((!SMBPartnerType.FOOD_DELIVERY.equals(sMBPartnerType) && actionButtonPartnerType != ActionButtonPartnerType.FBE) || (packageManager = fragmentActivity.getPackageManager()) == null) {
            return false;
        }
        Intent action = C18230wP.A0B().addCategory(A00).addCategory(A002).setAction("android.intent.action.VIEW");
        Intent A0B = C86164wN.A0B(new Intent(action), str);
        Intent A0B2 = C86164wN.A0B(new Intent(action), "http://example.com");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(A0B, Constants.LOAD_RESULT_PGO_ATTEMPTED);
        List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(A0B2, Constants.LOAD_RESULT_PGO_ATTEMPTED);
        HashSet A0u = C18200wM.A0u();
        for (ResolveInfo resolveInfo : queryIntentActivities2) {
            A0u.add(resolveInfo.activityInfo.packageName);
        }
        for (ResolveInfo next : queryIntentActivities) {
            if (!A0u.contains(next.activityInfo.packageName)) {
                if (C09650fs.A09(packageManager, next.activityInfo.packageName)) {
                    return C10650ih.A0B(fragmentActivity, addFlags);
                }
                return false;
            }
        }
        return false;
    }
}
