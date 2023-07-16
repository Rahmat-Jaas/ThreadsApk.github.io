package X;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape20S0300000_1_I2;
import com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape45S0200000_1_I2;
import com.instagram.fxcal.browser.FxChromeCustomTabsActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Kt  reason: invalid class name and case insensitive filesystem */
public final class C59423Kt {
    public static final Object A00(AnonymousClass601 r11, C63893iY r12) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r11);
        Object A0B = C63893iY.A0B(r12, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A0B;
        String str2 = (String) C63893iY.A0C(r12, "null cannot be cast to non-null type kotlin.String", A1Z ? 1 : 0);
        C109326jp A06 = C63893iY.A06(r12, 2);
        Fragment A03 = C63913ic.A03(r11);
        FragmentActivity A05 = C63913ic.A05(r11);
        if (A05 instanceof BaseFragmentActivity) {
            ((BaseFragmentActivity) A05).A0E(new IDxLListenerShape20S0300000_1_I2(4, (Object) A05, (Object) r11, (Object) A06));
            UserSession A02 = C05030Qo.A02(C63913ic.A0F(r11));
            C04220Ms.A0B(A02, A1Z);
            C04220Ms.A0B(str, 0);
            C04220Ms.A0B(str2, 0);
            String A0n = C18230wP.A0n(C63913ic.A0A(r11));
            C171209wF r1 = C171209wF.A1A;
            C04220Ms.A0B(A05, 0);
            if (C18190wL.A1a(AnonymousClass3X4.A00(C18230wP.A09(A05), str))) {
                Intent A04 = C18250wR.A04(C18230wP.A09(A05), FxChromeCustomTabsActivity.class);
                A04.putExtra("url_param", str);
                C18230wP.A12(A04, A02);
                C10650ih.A08(A05, A04, 2884);
                return null;
            }
            C37350Jpy A0Y = C18230wP.A0Y(A05, A02, r1, str);
            A0Y.A0G = A1Z;
            A0Y.A06(A02.getUserId());
            if (AnonymousClass0hA.A08((CharSequence) null) || AnonymousClass0hA.A08(str2)) {
                A0Y.A07 = str;
                A0Y.A08 = str2;
                A0Y.A0E = A1Z;
                A0Y.A07(A0n);
                A0Y.A0M = A1Z;
                A0Y.A0F = A1Z;
                C37350Jpy.A01((Fragment) null, A0Y, 2884);
                return null;
            }
            IllegalArgumentException A0a = C18190wL.A0a("IAB oAuth cannot have both redirectUrl and redirectScheme set");
            C10450iM.A07("ig_auth_not_supported_param", A0a);
            throw A0a;
        } else if (A03 == null) {
            return null;
        } else {
            C63913ic.A0Q(r11, new IDxLListenerShape45S0200000_1_I2(r11, A06, 3));
            UserSession A022 = C05030Qo.A02(C63913ic.A0F(r11));
            C04220Ms.A0B(A022, A1Z);
            C04220Ms.A0B(str, 0);
            C04220Ms.A0B(str2, 0);
            String A0n2 = C18230wP.A0n(C63913ic.A0A(r11));
            C171209wF r13 = C171209wF.A1A;
            if (C18190wL.A1a(AnonymousClass3X4.A00(A03.requireContext(), str))) {
                Intent A042 = C18250wR.A04(A03.requireContext(), FxChromeCustomTabsActivity.class);
                A042.putExtra("url_param", str);
                C18230wP.A12(A042, A022);
                C10650ih.A0E(A042, A03, 2884);
                return null;
            }
            FragmentActivity activity = A03.getActivity();
            if (activity == null) {
                return null;
            }
            C37350Jpy A0Y2 = C18230wP.A0Y(activity, A022, r13, str);
            A0Y2.A0G = A1Z;
            A0Y2.A06(A022.getUserId());
            if (AnonymousClass0hA.A08((CharSequence) null) || AnonymousClass0hA.A08(str2)) {
                A0Y2.A07 = str;
                A0Y2.A08 = str2;
                A0Y2.A0E = A1Z;
                A0Y2.A07(A0n2);
                A0Y2.A0M = A1Z;
                A0Y2.A0F = A1Z;
                A0Y2.A05(A03, 2884);
                return null;
            }
            IllegalArgumentException A0a2 = C18190wL.A0a("IAB oAuth cannot have both redirectUrl and redirectScheme set");
            C10450iM.A07("ig_auth_not_supported_param", A0a2);
            throw A0a2;
        }
    }

    public static final void A01(Intent intent, AnonymousClass601 r6, C109326jp r7, int i) {
        String str;
        Uri uri;
        String str2 = null;
        if (intent != null) {
            str = intent.getStringExtra("KEY_URL");
        } else {
            str = null;
        }
        if (!AnonymousClass0hA.A08(str)) {
            uri = C15430rJ.A01(str);
        } else {
            uri = null;
        }
        AnonymousClass3VO A00 = AnonymousClass3VO.A00();
        if (i == -1 && uri != null) {
            str2 = uri.toString();
        }
        C61043Rr.A00(r6, C63893iY.A04(A00, str2, 0), r7);
    }
}
