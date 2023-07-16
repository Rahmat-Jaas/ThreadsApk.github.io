package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxFStoreShape873S0100000_1_I2;
import com.instagram.nux.cal.model.ConnectContent;

/* renamed from: X.1hI  reason: invalid class name */
public final class AnonymousClass1hI extends C63873iU {
    public final String A00;
    public final /* synthetic */ AnonymousClass1cQ A01;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-1026592139);
        ConnectContent connectContent = (ConnectContent) obj;
        int A002 = AnonymousClass0wJ.A00(-203295133, connectContent);
        AnonymousClass1cQ r1 = this.A01;
        if (r1.getActivity() != null) {
            if (r1.A01 == null) {
                C04220Ms.A0E("calHelper");
                throw null;
            }
            FragmentActivity requireActivity = r1.requireActivity();
            String str = this.A00;
            AnonymousClass3Zp.A00(requireActivity, AnonymousClass0wJ.A0U(r1.A06), new IDxFStoreShape873S0100000_1_I2(connectContent, 1), C306222g.IG_FB_NUX_FIND_FRIENDS, connectContent, str, 3233);
        }
        C14030oh.A0A(-1371348043, A002);
        C14030oh.A0A(-146085279, A03);
    }

    public AnonymousClass1hI(AnonymousClass1cQ r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public final void onFail(AnonymousClass3XX r3) {
        C14030oh.A0A(2021313158, C14030oh.A03(-704489549));
    }
}
