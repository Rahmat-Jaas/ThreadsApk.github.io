package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.facebook.redex.IDxRListenerShape541S0100000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.42y  reason: invalid class name */
public final class AnonymousClass42y implements C84834tw, CallerContextable {
    public static final String __redex_internal_original_name = "IGPageLinkingUXFlowLifecycle";
    public final C304921n A00;
    public final UserSession A01;

    public final void CXg(FragmentActivity fragmentActivity, KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2, String str) {
        C04220Ms.A0B(str, 1);
        AnonymousClass1YX r1 = new AnonymousClass1YX();
        r1.setArguments(AnonymousClass2KZ.A00(ktCSuperShape0S3100000_I2, this.A00, str));
        AnonymousClass0wJ.A19(r1, fragmentActivity, this.A01);
    }

    public final void CXe(FragmentActivity fragmentActivity, KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2, String str) {
        AnonymousClass1YX r1 = new AnonymousClass1YX();
        r1.setArguments(AnonymousClass2KZ.A00(ktCSuperShape0S3100000_I2, this.A00, "location_page_info"));
        AnonymousClass0wJ.A19(r1, fragmentActivity, this.A01);
    }

    public AnonymousClass42y(C304921n r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final void CXf(Fragment fragment, KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2, String str) {
        AnonymousClass0wJ.A1N(fragment, str);
        CXg(fragment.requireActivity(), ktCSuperShape0S3100000_I2, str);
    }

    public final void CZo(FragmentActivity fragmentActivity, C82294pO r5) {
        fragmentActivity.getSupportFragmentManager().A0y(new IDxRListenerShape541S0100000_1_I2(r5, 2), fragmentActivity, "page_linking_request");
    }
}
