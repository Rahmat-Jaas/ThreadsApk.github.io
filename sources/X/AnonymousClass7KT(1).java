package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebookpay.widget.navibar.NavigationBar;

/* renamed from: X.7KT  reason: invalid class name */
public final class AnonymousClass7KT {
    public static final /* synthetic */ AnonymousClass7KT A00 = new AnonymousClass7KT();

    public static final void A02(Fragment fragment) {
        C04220Ms.A0B(fragment, 0);
        Fragment fragment2 = fragment.mParentFragment;
        C04220Ms.A0C(fragment2, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
        ((AnonymousClass099) fragment2).A06();
    }

    public static final void A03(Fragment fragment) {
        boolean z;
        Fragment fragment2 = fragment.mParentFragment;
        C04220Ms.A0C(fragment2, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.BottomSheetDialogController");
        AnonymousClass5qq r2 = (AnonymousClass5qq) ((C147048nI) fragment2);
        NavigationBar navigationBar = r2.A06;
        if (navigationBar != null) {
            navigationBar.setVisibility(8);
            z = false;
        } else {
            z = true;
        }
        r2.A07 = z;
    }

    public static final void A00(View.OnClickListener onClickListener, Fragment fragment) {
        AnonymousClass5qq A0S = C86134wK.A0S(fragment);
        C86114wI.A1L(A0S, onClickListener, A0S.A0F, AnonymousClass5qq.A0V, 11);
    }

    public static final void A01(View.OnClickListener onClickListener, Fragment fragment) {
        AnonymousClass5qq A0S = C86134wK.A0S(fragment);
        C86114wI.A1L(A0S, onClickListener, A0S.A0O, AnonymousClass5qq.A0V, 14);
    }

    public static final void A04(Fragment fragment, AnonymousClass697 r4) {
        AnonymousClass5qq A0S = C86134wK.A0S(fragment);
        C86114wI.A1L(A0S, r4, A0S.A0C, AnonymousClass5qq.A0V, 1);
    }

    public static final void A05(Fragment fragment, AnonymousClass697 r4, String str) {
        AnonymousClass5qq A0S = C86134wK.A0S(fragment);
        C86024w9 r1 = A0S.A0E;
        AnonymousClass0A5[] r2 = AnonymousClass5qq.A0V;
        C86114wI.A1L(A0S, r4, r1, r2, 2);
        C86114wI.A1L(A0S, str, A0S.A0D, r2, 16);
    }

    public static final void A06(Fragment fragment, String str) {
        AnonymousClass5qq A0S = C86134wK.A0S(fragment);
        C86114wI.A1L(A0S, str, A0S.A0Q, AnonymousClass5qq.A0V, 0);
    }

    public static final void A07(Fragment fragment, String str, String str2) {
        AnonymousClass5qq A0S = C86134wK.A0S(fragment);
        C86024w9 r1 = A0S.A0P;
        AnonymousClass0A5[] r2 = AnonymousClass5qq.A0V;
        C86114wI.A1L(A0S, str, r1, r2, 6);
        C86114wI.A1L(A0S, str2, A0S.A0N, r2, 18);
    }

    public static final void A08(Fragment fragment, boolean z) {
        AnonymousClass5qq A0S = C86134wK.A0S(fragment);
        C86124wJ.A1U(A0S, A0S.A0B, AnonymousClass5qq.A0V, 19, z);
    }
}
