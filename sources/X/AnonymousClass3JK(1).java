package X;

import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.3JK  reason: invalid class name */
public final class AnonymousClass3JK {
    public static /* synthetic */ void A00(ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass69R r10, String str, String str2, AnonymousClass0ZU r13, AnonymousClass0ZU r14, int i, boolean z) {
        IDxCListenerShape201S0100000_1_I2 iDxCListenerShape201S0100000_1_I2;
        int i2;
        int i3;
        if ((i & 8) != 0) {
            r13 = C74344aI.A00;
        }
        if ((i & 16) != 0) {
            r14 = C74354aJ.A00;
        }
        if ((i & 32) != 0) {
            str = null;
        }
        if ((i & 128) != 0) {
            str2 = null;
        }
        boolean A1R = C18240wQ.A1R(i & 256, z);
        boolean A1X = C18240wQ.A1X(r10);
        C18180wK.A1Q(r13, 3, r14);
        int i4 = r10.A03;
        Integer valueOf = Integer.valueOf(i4);
        if (((str != null && !AnonymousClass8bQ.A0n(str)) || i4 != 0) && valueOf != null) {
            if (str == null) {
                str = AnonymousClass0wJ.A0k(contextThemeWrapper, i4);
            }
            AnonymousClass7KT.A06(fragment, str);
        }
        AnonymousClass697 r0 = r10.A04;
        if (r0 != null) {
            AnonymousClass7KT.A04(fragment, r0);
        }
        AnonymousClass697 r2 = r10.A00;
        if (!(r2 == null || (i3 = r10.A01) == 0)) {
            AnonymousClass7KT.A05(fragment, r2, contextThemeWrapper.getString(i3));
        }
        boolean z2 = r10.A05;
        if (z2) {
            Fragment fragment2 = fragment.mParentFragment;
            C04220Ms.A0C(fragment2, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            AnonymousClass5qq r5 = (AnonymousClass5qq) fragment2;
            r5.A0R.CrD(r5, Boolean.valueOf(z2), AnonymousClass5qq.A0V[3]);
        }
        boolean z3 = r10.A06;
        if (z3) {
            Fragment fragment3 = fragment.mParentFragment;
            C04220Ms.A0C(fragment3, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            AnonymousClass5qq r52 = (AnonymousClass5qq) fragment3;
            r52.A0S.CrD(r52, Boolean.valueOf(z3), AnonymousClass5qq.A0V[7]);
        }
        int i5 = r10.A02;
        Integer valueOf2 = Integer.valueOf(i5);
        if (((str2 != null && !AnonymousClass8bQ.A0n(str2)) || i5 != 0) && valueOf2 != null) {
            if (str2 == null) {
                str2 = AnonymousClass0wJ.A0k(contextThemeWrapper, i5);
            }
            AnonymousClass7KT.A07(fragment, str2, (String) null);
        }
        if (!A1R) {
            A1X = r10.A07;
        }
        AnonymousClass7KT.A08(fragment, A1X);
        switch (r10.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 8:
            case 9:
            case 10:
            case 13:
            case 14:
            case 18:
                AnonymousClass7KT.A00(C18190wL.A0H(r14, 17), fragment);
                i2 = 18;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 15:
            case 16:
            case LangUtils.HASH_SEED /*17*/:
            case 19:
            case 20:
            case 21:
            case Rfc3492Idn.tmax /*26*/:
                AnonymousClass7KT.A00(C18190wL.A0H(r13, 19), fragment);
                iDxCListenerShape201S0100000_1_I2 = C18190wL.A0H(r14, 20);
                break;
            case 22:
            case 23:
            case 25:
                i2 = 22;
                break;
            case 24:
                AnonymousClass7KT.A00(C18190wL.A0H(r14, 21), fragment);
                return;
            default:
                throw C18190wL.A0a(AnonymousClass0wJ.A0t("Invalid navigation style: ", r10));
        }
        iDxCListenerShape201S0100000_1_I2 = C18190wL.A0H(r13, i2);
        AnonymousClass7KT.A01(iDxCListenerShape201S0100000_1_I2, fragment);
    }
}
