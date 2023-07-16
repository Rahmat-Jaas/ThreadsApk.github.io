package X;

import com.instagram.base.activity.IgFragmentActivity;
import java.util.HashMap;

/* renamed from: X.1uf  reason: invalid class name and case insensitive filesystem */
public final class C28591uf extends AnonymousClass9UH {
    public IgFragmentActivity A00;
    public C10300i6 A01;
    public C12560m7 A02;

    public static void A00(C12560m7 r1, IgFragmentActivity igFragmentActivity, C32165H8c h8c, C10300i6 r4) {
        h8c.A00 = new C28591uf(r1, igFragmentActivity, r4);
        C31155GhB.A03(h8c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28591uf(C12560m7 r1, IgFragmentActivity igFragmentActivity, C10300i6 r3) {
        super(r1);
        AnonymousClass0wJ.A1Q(igFragmentActivity, r3);
        this.A02 = r1;
        this.A00 = igFragmentActivity;
        this.A01 = r3;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A002 = AnonymousClass0wJ.A00(13526840, r3);
        C62973bE.A02(this.A00, r3);
        C14030oh.A0A(19215318, A002);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(364843757);
        C22101Tj r7 = (C22101Tj) obj;
        int A002 = AnonymousClass0wJ.A00(-1923531883, r7);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("get_challenge", "true");
        A0y.put("user_id", r7.A04);
        A0y.put("nonce_code", r7.A03);
        A0y.put("cni", r7.A02);
        A0y.put("challenge_context", r7.A01);
        IgFragmentActivity igFragmentActivity = this.A00;
        AnonymousClass4A9 A003 = C63263h8.A00(this.A01, r7.A00, A0y);
        AnonymousClass4A9.A00(A003, this, 20);
        igFragmentActivity.schedule(A003);
        C14030oh.A0A(-1927168070, A002);
        C14030oh.A0A(1032321216, A03);
    }
}
