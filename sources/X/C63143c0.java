package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.facebook.redex.IDxCSpanShape5S0200000_1_I2;
import com.instagram.common.accessibility.IDxCSpanShape14S0300000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.3c0  reason: invalid class name and case insensitive filesystem */
public final class C63143c0 {
    public static final Spanned A02(Context context, C209416t r7) {
        if (r7 == null) {
            return null;
        }
        String str = r7.A04;
        SpannableString spannableString = new SpannableString(AnonymousClass0wJ.A0l(context, str, 2131827401));
        int A0J = AnonymousClass8bP.A0J(spannableString, str, 0, false);
        spannableString.setSpan(new StyleSpan(1), A0J, C18220wO.A08(str) + A0J, 33);
        return spannableString;
    }

    public static final Spanned A03(Context context, C209416t r2, Integer num, String str, boolean z) {
        int i;
        Object[] objArr;
        C04220Ms.A0B(context, 0);
        String A04 = A04(context, r2, num, z);
        if (str == null && A04 == null) {
            return null;
        }
        Resources resources = context.getResources();
        if (A04 == null) {
            i = 2131827444;
            objArr = new Object[]{str};
        } else if (str == null) {
            i = 2131827445;
            objArr = new Object[]{A04};
        } else {
            i = 2131827443;
            objArr = new Object[]{str, A04};
        }
        return C16370sw.A00(resources, objArr, i);
    }

    public static final String A05(Context context, Integer num) {
        int i;
        C04220Ms.A0B(context, 0);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 80) {
            i = 2131837423;
        } else if (intValue == 40) {
            i = 2131837420;
        } else if (intValue != 10) {
            return null;
        } else {
            i = 2131837422;
        }
        return context.getString(i);
    }

    public static final SpannableStringBuilder A00(Activity activity, Context context, KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2, UserSession userSession) {
        String str;
        int i;
        int i2;
        UserSession userSession2 = userSession;
        boolean A1Z = C18200wM.A1Z(userSession2);
        KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I22 = ktCSuperShape0S1200000_I2;
        if (ktCSuperShape0S1200000_I2 == null) {
            return null;
        }
        SpannableStringBuilder A0E = C18200wM.A0E(ktCSuperShape0S1200000_I22.A02);
        List<C209316s> list = (List) ktCSuperShape0S1200000_I22.A00;
        int length = A0E.length();
        if (list != null && C18190wL.A1a(list)) {
            StyleSpan styleSpan = new StyleSpan(A1Z ? 1 : 0);
            for (C209316s r1 : list) {
                if (r1 != null && r1.A03 == A1Z && r1.A02 && length > 0 && (i = r1.A00) < length && (i2 = i + r1.A01) < length) {
                    A0E.setSpan(styleSpan, i, i2, 33);
                }
            }
        }
        List<C209016o> list2 = (List) ktCSuperShape0S1200000_I22.A01;
        if (list2 == null || !C18190wL.A1a(list2)) {
            return A0E;
        }
        for (C209016o r10 : list2) {
            if (r10 != null && r10.A03 == A1Z && r10.A04 && (str = r10.A02) != null) {
                int A01 = C18210wN.A01(context);
                IDxCSpanShape14S0300000_1_I2 iDxCSpanShape14S0300000_1_I2 = new IDxCSpanShape14S0300000_1_I2(new C008103m(16, (CharSequence) str), AnonymousClass006.A01, activity, r10, userSession2, str, A01, 0);
                int i3 = r10.A00;
                A0E.setSpan(iDxCSpanShape14S0300000_1_I2, i3, i3 + r10.A01, 18);
            }
        }
        return A0E;
    }

    public static final String A04(Context context, C209416t r3, Integer num, boolean z) {
        String str;
        if (r3 != null) {
            str = r3.A04;
        } else {
            str = null;
        }
        if (z) {
            return context.getString(2131827442);
        }
        if (r3 == null || r3.A00) {
            return str;
        }
        return A05(context, num);
    }

    public static final SpannableStringBuilder A01(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str, int i) {
        SpannableStringBuilder A0E = C18200wM.A0E(C18210wN.A0C(context.getResources(), str, i));
        AnonymousClass3Zw.A01(A0E, new IDxCSpanShape5S0200000_1_I2(1, userSession, fragmentActivity), str);
        return A0E;
    }
}
