package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.service.session.UserSession;

/* renamed from: X.1m2  reason: invalid class name */
public final class AnonymousClass1m2 extends BF4 {
    public final /* synthetic */ AnonymousClass1c1 A00;
    public final /* synthetic */ AnonymousClass17E A01;

    public AnonymousClass1m2(AnonymousClass1c1 r1, AnonymousClass17E r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final boolean COg(View view) {
        String str = this.A01.A03;
        AnonymousClass1c1 r1 = this.A00;
        if (str == null) {
            AnonymousClass1c1.A01(r1);
            return true;
        }
        C18543AhJ A012 = AnonymousClass3LM.A01();
        C04530Oa r0 = r1.A04;
        UserSession A0X = AnonymousClass0wJ.A0X(r0);
        FragmentActivity requireActivity = r1.requireActivity();
        C19223Ask ask = new C19223Ask(ClipsViewerSource.A0d, AnonymousClass0wJ.A0X(r0));
        ask.A0b = str;
        ask.A0q = true;
        ask.A0n = false;
        A012.A06(requireActivity, ask.A01(), A0X);
        return true;
    }
}
