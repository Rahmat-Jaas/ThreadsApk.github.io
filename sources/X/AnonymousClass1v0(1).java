package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1v0  reason: invalid class name */
public final class AnonymousClass1v0 extends C18660xa {
    public final /* synthetic */ C22901ba A00;

    public AnonymousClass1v0(C22901ba r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        C22901ba r4 = this.A00;
        C10300i6 A0U = AnonymousClass0wJ.A0U(r4.A01);
        boolean A1V = C18210wN.A1V(A0U);
        String string = r4.requireContext().getString(2131820963);
        Bundle A06 = C18180wK.A06();
        IgBloksScreenConfig A0N = C18190wL.A0N(A0U);
        A0N.A0S = string;
        IgBloksScreenConfig.A03(A06, A0N);
        C66843yQ.A03(A06, new C66843yQ((SparseArray) null, (C83284r8) null, (C83284r8) null, (Object) null, "com.instagram.privacy.activity_center.activity_center_entry_business_screen", (String) null, (HashMap) null, AnonymousClass0wJ.A0v(), (Map) null, (Map) null, (Map) null, -1, A1V ? 1 : 0, -1, -1, A1V, A1V), A1V);
        C63863iT A02 = C63863iT.A02(r4.requireActivity(), A06, A0U, ModalActivity.class, "bloks");
        A02.A0F();
        C63863iT.A0D(r4, A02);
    }
}
