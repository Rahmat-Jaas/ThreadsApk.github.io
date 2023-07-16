package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.monetization.impl.MonetizationFragmentFactoryImpl;

/* renamed from: X.1fA  reason: invalid class name */
public final class AnonymousClass1fA extends AnonymousClass9SC {
    public final /* synthetic */ AnonymousClass1bZ A00;
    public final /* synthetic */ C302720j A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1fA(C008103m r1, AnonymousClass1bZ r2, C302720j r3, Integer num, String str, int i) {
        super(r1, num, str, i);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void onClick(View view) {
        C302720j r2 = this.A01;
        C302720j r1 = C302720j.USER_NOT_ELIGIBLE_FOR_MONETIZATION;
        AnonymousClass1bZ r0 = this.A00;
        if (r2 == r1) {
            FragmentActivity requireActivity = r0.requireActivity();
            C04530Oa r12 = r0.A03;
            C25786Drz A0Q = C18180wK.A0Q(requireActivity, AnonymousClass0wJ.A0U(r12));
            C24182DCb.A00();
            C18180wK.A17(new MonetizationFragmentFactoryImpl().A00(UserMonetizationProductType.INCENTIVE_PLATFORM, AnonymousClass0wJ.A0X(r12), "not_eligible", false), A0Q);
            return;
        }
        C37350Jpy A0Y = C18230wP.A0Y(r0.requireActivity(), AnonymousClass0wJ.A0X(r0.A03), C171209wF.A1m, "https://help.instagram.com/331274061770840");
        A0Y.A07(AnonymousClass1bZ.__redex_internal_original_name);
        A0Y.A04();
    }
}
