package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.nux.cal.model.ConnectContent;

/* renamed from: X.1iA  reason: invalid class name */
public final class AnonymousClass1iA extends C63873iU {
    public final String A00;
    public final /* synthetic */ AnonymousClass1cR A01;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(1066697213);
        ConnectContent connectContent = (ConnectContent) obj;
        int A032 = C14030oh.A03(-1343214298);
        AnonymousClass1cR r1 = this.A01;
        if (r1.getActivity() != null) {
            FragmentActivity requireActivity = r1.requireActivity();
            String str = this.A00;
            AnonymousClass3Zp.A00(requireActivity, r1.A06, new C70454Es(connectContent, this), C306222g.PROFILE_PIC, connectContent, str, 123);
        }
        C14030oh.A0A(1014496587, A032);
        C14030oh.A0A(-1549392627, A03);
    }

    public AnonymousClass1iA(AnonymousClass1cR r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public final void onFail(AnonymousClass3XX r3) {
        C14030oh.A0A(-1179718887, C14030oh.A03(729791868));
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-1866106479);
        super.onFinish();
        C18330wh r0 = this.A01.A07;
        if (r0 != null) {
            r0.hide();
        }
        C14030oh.A0A(-1859096720, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(1986759605);
        super.onStart();
        C18330wh r0 = this.A01.A07;
        if (r0 != null) {
            C13950oZ.A00(r0);
        }
        C14030oh.A0A(-2123472451, A03);
    }
}
