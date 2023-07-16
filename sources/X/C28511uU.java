package X;

import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;

/* renamed from: X.1uU  reason: invalid class name and case insensitive filesystem */
public final class C28511uU extends AnonymousClass9UH {
    public C34640IcN A00;
    public C10300i6 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28511uU(C12560m7 r2, C34640IcN icN, C10300i6 r4) {
        super(r2);
        C04220Ms.A0B(r4, 3);
        this.A00 = icN;
        this.A01 = r4;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A002 = AnonymousClass0wJ.A00(-1575950248, r3);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C62973bE.A02(activity, r3);
        }
        C14030oh.A0A(1441776536, A002);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(1404332675);
        C22111Tk r7 = (C22111Tk) obj;
        int A002 = AnonymousClass0wJ.A00(325514432, r7);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("get_challenge", "true");
        A0y.put("user_id", r7.A04);
        A0y.put("nonce_code", r7.A03);
        A0y.put("cni", r7.A02);
        A0y.put("challenge_context", r7.A01);
        C34640IcN icN = this.A00;
        AnonymousClass4A9 A003 = C63263h8.A00(this.A01, r7.A00, A0y);
        AnonymousClass4A9.A00(A003, this, 22);
        icN.schedule(A003);
        C14030oh.A0A(1338927497, A002);
        C14030oh.A0A(1454565288, A03);
    }
}
