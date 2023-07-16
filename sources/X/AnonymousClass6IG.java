package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.6IG  reason: invalid class name */
public final class AnonymousClass6IG {
    public static final void A00(Fragment fragment, AnonymousClass8e7 r4) {
        String str;
        if (r4 instanceof C128367jS) {
            C04220Ms.A06(AnonymousClass7Kz.A06().A03.get());
            C128367jS r42 = (C128367jS) r4;
            String str2 = r42.A01;
            Fragment A00 = ((C113376rI) AnonymousClass7Kz.A06().A02.get()).A00(r42.A00, str2);
            if (A00 != null) {
                Object obj = AnonymousClass7Kz.A06().A03.get();
                C04220Ms.A06(obj);
                AnonymousClass0wJ.A19(A00, fragment.requireActivity(), ((C106066eR) obj).A00);
                return;
            }
            throw AnonymousClass0wJ.A0b();
        } else if (r4 instanceof C128347jQ) {
            C128347jQ r43 = (C128347jQ) r4;
            Fragment fragment2 = fragment.mParentFragment;
            if (fragment2 instanceof AnonymousClass5qp) {
                str = "null cannot be cast to non-null type com.facebookpay.msc.bottomsheet.BSCBottomSheetDialogFragment";
            } else if (!(fragment2 instanceof AnonymousClass52K) || r43.A00) {
                Object obj2 = AnonymousClass7Kz.A06().A03.get();
                C04220Ms.A06(obj2);
                C18180wK.A0Q(fragment.requireActivity(), ((C106066eR) obj2).A00).A0D((String) null, 0);
                return;
            } else {
                str = "null cannot be cast to non-null type com.facebookpay.msc.widget.dialog.BSCDialogFragment";
            }
            C04220Ms.A0C(fragment2, str);
            ((AnonymousClass099) fragment2).A06();
        } else if (r4 instanceof C128357jR) {
            AnonymousClass7Kz.A0N().A00(fragment.requireContext(), ((C128357jR) r4).A00);
        }
    }
}
