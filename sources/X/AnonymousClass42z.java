package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.42z  reason: invalid class name */
public final class AnonymousClass42z implements C84834tw, CallerContextable {
    public static final String __redex_internal_original_name = "IGWALinkingUXFlowLifecycle";
    public final C304921n A00;
    public final UserSession A01;

    public final void CXe(FragmentActivity fragmentActivity, KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2, String str) {
    }

    public final void CXg(FragmentActivity fragmentActivity, KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2, String str) {
        C04220Ms.A0B(str, 1);
        AnonymousClass1YX r2 = new AnonymousClass1YX();
        r2.setArguments(AnonymousClass2KZ.A00(ktCSuperShape0S3100000_I2, this.A00, str));
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, this.A01);
        A0Q.A07 = ktCSuperShape0S3100000_I2.A01;
        A0Q.A03 = r2;
        A0Q.A05();
    }

    public final void CZo(FragmentActivity fragmentActivity, C82294pO r2) {
    }

    public AnonymousClass42z(C304921n r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final void CXf(Fragment fragment, KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2, String str) {
        AnonymousClass0wJ.A1N(fragment, str);
        CXg(fragment.requireActivity(), ktCSuperShape0S3100000_I2, str);
    }
}
