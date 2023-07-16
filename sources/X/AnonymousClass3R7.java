package X;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.3R7  reason: invalid class name */
public final class AnonymousClass3R7 {
    public static boolean A00;

    public static void A00(DialogInterface.OnClickListener onClickListener, C34640IcN icN, ImageUrl imageUrl, C07530bf r13, AnonymousClass265 r14, String str, String str2, String str3, String str4) {
        if (!A00) {
            A00 = true;
            C25828Dsm A0V = AnonymousClass0wJ.A0V(icN);
            A0V.A0l(imageUrl, icN);
            String str5 = str2;
            A0V.A02 = AnonymousClass0wJ.A0o(icN, str5, 2131837737);
            A0V.A0K(2131837734);
            A0V.A0c(new C64093ja(icN, r13, r14, str5, str, str3, str4), AnonymousClass0wJ.A0o(icN, str5, 2131837735));
            A0V.A0a(onClickListener, icN.getString(2131837736));
            A0V.A0e(new C64343kC());
            AnonymousClass0wJ.A1K(A0V);
        }
    }

    public static void A01(C34640IcN icN, AnonymousClass45S r10, RegFlowExtras regFlowExtras, C07530bf r12, AnonymousClass265 r13) {
        String str;
        ImageUrl imageUrl;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ImageUrl imageUrl2;
        AnonymousClass1TY r1 = r10.A00;
        if (r1 != null) {
            str = r1.A01;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (r1 != null) {
                imageUrl = r1.A00;
            } else {
                imageUrl = null;
            }
            if (!AnonymousClass3WG.A02(imageUrl)) {
                if (r1 != null) {
                    str2 = r1.A02;
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    if (r1 != null) {
                        str3 = r1.A03;
                    } else {
                        str3 = null;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        regFlowExtras.A0j = true;
                        if (r1 != null) {
                            str4 = r1.A02;
                        } else {
                            str4 = null;
                        }
                        if (r1 != null) {
                            str5 = r1.A03;
                        } else {
                            str5 = null;
                        }
                        if (r1 != null) {
                            str6 = r1.A01;
                            imageUrl2 = r1.A00;
                        } else {
                            str6 = null;
                            imageUrl2 = null;
                        }
                        A00(C18220wO.A0O(regFlowExtras, 125), icN, imageUrl2, r12, r13, str4, str5, str6, regFlowExtras.A0A);
                    }
                }
            }
        }
    }
}
