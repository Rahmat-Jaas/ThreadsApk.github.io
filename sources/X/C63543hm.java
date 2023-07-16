package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape48S0300000_1_I2;
import com.instagram.brandedcontent.model.BrandedContentGatingInfo;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape6S1200000_1_I2;
import com.instagram.user.model.User;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3hm  reason: invalid class name and case insensitive filesystem */
public final class C63543hm {
    public static final SpannableStringBuilder A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str, int i) {
        AnonymousClass0wJ.A1Q(userSession, str);
        String A0k = AnonymousClass0wJ.A0k(context, 2131822614);
        SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0l(context, A0k, i));
        AnonymousClass3Zw.A01(A0E, new IDxCSpanShape6S1200000_1_I2(fragmentActivity, userSession, str, C18210wN.A01(context), 0), A0k);
        return A0E;
    }

    public static final SpannableStringBuilder A01(Context context, List list) {
        SpannableStringBuilder spannableStringBuilder;
        Object obj;
        C04220Ms.A0B(list, 1);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : list) {
            if (!((BrandedContentTag) next).A03) {
                A0v.add(next);
            }
        }
        int size = A0v.size();
        if (size == 1) {
            spannableStringBuilder = C18200wM.A0E(AnonymousClass0wJ.A0l(context, ((BrandedContentTag) A0v.get(0)).A02, 2131836087));
            obj = A0v.get(0);
        } else if (size != 2) {
            return C18200wM.A0E(context.getString(2131832119));
        } else {
            spannableStringBuilder = C18200wM.A0E(C18220wO.A0h(context, ((BrandedContentTag) A0v.get(0)).A02, ((BrandedContentTag) A0v.get(1)).A02, 2131832118));
            AnonymousClass3Zw.A00(spannableStringBuilder, new C18640xY(), ((BrandedContentTag) A0v.get(0)).A02);
            obj = A0v.get(1);
        }
        AnonymousClass3Zw.A00(spannableStringBuilder, new C18640xY(), ((BrandedContentTag) obj).A02);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder A02(Context context, List list, boolean z) {
        C04220Ms.A0B(context, 0);
        if (!z) {
            return new SpannableStringBuilder();
        }
        int size = list.size();
        if (size == 1) {
            SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0l(context, ((User) list.get(0)).BK7(), 2131836087));
            A07(A0E, list, 0);
            return A0E;
        } else if (size != 2) {
            return C18200wM.A0E(context.getString(2131832119));
        } else {
            SpannableStringBuilder A0E2 = C18200wM.A0E(C18220wO.A0h(context, ((User) list.get(0)).BK7(), ((User) list.get(1)).BK7(), 2131832118));
            A07(A0E2, list, 0);
            A07(A0E2, list, 1);
            return A0E2;
        }
    }

    public static final String A04(Context context, BrandedContentGatingInfo brandedContentGatingInfo) {
        String A0l;
        C04220Ms.A0B(brandedContentGatingInfo, 1);
        List list = brandedContentGatingInfo.A03;
        if (list == null) {
            list = AnonymousClass0ZV.A00;
        }
        int size = list.size();
        if (size == 1) {
            A0l = new Locale(Locale.getDefault().getDisplayLanguage(), C18190wL.A0p(list, 0)).getDisplayCountry();
        } else {
            A0l = AnonymousClass0wJ.A0l(context, Integer.valueOf(size), 2131822606);
        }
        C04220Ms.A06(A0l);
        return A0l;
    }

    public static final boolean A08(Context context, Fragment fragment, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        if (AnonymousClass0wJ.A0Y(userSession).A3Z()) {
            return false;
        }
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0L(2131821274);
        int i = 2131821271;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36326635821082318L)) {
            i = 2131821272;
        }
        A0W.A0K(i);
        A0W.A0T(new IDxCListenerShape48S0300000_1_I2(context, fragment, userSession, 10), AnonymousClass25l.BLUE_BOLD, 2131821273);
        A0W.A0O((DialogInterface.OnClickListener) null, 2131831869);
        AnonymousClass0wJ.A1K(A0W);
        return true;
    }

    public static final String A03(Context context, int i, long j, boolean z) {
        String str;
        long j2 = j * 1000;
        Calendar instance = Calendar.getInstance();
        C18220wO.A1Q(instance, j2);
        boolean z2 = true;
        if (instance.get(1) != Calendar.getInstance().get(1)) {
            z2 = false;
        }
        if (z) {
            if (z2) {
                str = "MMMM dd, hh:mm a";
            } else {
                str = "MMMM dd, yyyy, hh:mm a";
            }
        } else if (z2) {
            str = "MMMM dd";
        } else {
            str = "MMMM dd, yyyy";
        }
        String A0l = AnonymousClass0wJ.A0l(context, new SimpleDateFormat(str, C31103Gfm.A02()).format(Long.valueOf(j2)), i);
        C04220Ms.A06(A0l);
        return A0l;
    }

    public static final void A05(Activity activity, DialogInterface.OnClickListener onClickListener, UserSession userSession, String str, String str2) {
        AnonymousClass0wJ.A1O(userSession, str);
        C04220Ms.A0B(str2, 3);
        C25828Dsm A0W = C18190wL.A0W(activity);
        A0W.A02 = str;
        A0W.A0p(str2);
        C18190wL.A1R(A0W, activity, userSession, 10, 2131829574);
        A0W.A0O(onClickListener, 2131823054);
        AnonymousClass0wJ.A1K(A0W);
    }

    public static final void A06(Context context, C570539o r3, boolean z) {
        String str;
        C25828Dsm A0W = C18190wL.A0W(context);
        String str2 = r3.A01;
        if (str2 != null) {
            A0W.A02 = str2;
            String str3 = r3.A00;
            if (str3 != null) {
                A0W.A0p(str3);
                int i = 2131831976;
                if (z) {
                    i = 2131826643;
                }
                A0W.A0P(C64133jg.A00, i);
                AnonymousClass0wJ.A1K(A0W);
                return;
            }
            str = "displayMessage";
        } else {
            str = "displayTitle";
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder, List list, int i) {
        AnonymousClass3Zw.A00(spannableStringBuilder, new C18640xY(), ((User) list.get(i)).BK7());
    }
}
