package X;

import com.instagram.user.model.User;

/* renamed from: X.1hn  reason: invalid class name and case insensitive filesystem */
public final class C24271hn extends C63873iU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C22651Yx A02;

    public C24271hn(C22651Yx r1, String str, int i) {
        this.A02 = r1;
        this.A01 = str;
        this.A00 = i;
    }

    public final void onFail(AnonymousClass3XX r6) {
        int A002 = AnonymousClass0wJ.A00(1757384366, r6);
        super.onFail(r6);
        C22651Yx r3 = this.A02;
        C22651Yx.A02(r3);
        C22651Yx.A05(r3, new AnonymousClass4YX(r3, this.A01, this.A00));
        C14030oh.A0A(-593695459, A002);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(1809772276);
        C22651Yx.A03(this.A02);
        C14030oh.A0A(718207245, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-410686279);
        C85794vm r7 = (C85794vm) obj;
        int A002 = AnonymousClass0wJ.A00(1653951653, r7);
        super.onSuccess(r7);
        C22651Yx r3 = this.A02;
        C22651Yx.A02(r3);
        C22651Yx.A01(r3);
        User user = ((AnonymousClass32n) r7.D7H()).A00;
        C04530Oa r1 = r3.A0N;
        C18210wN.A1J(AnonymousClass0wJ.A0X(r1), user);
        user.A1t(AnonymousClass0wJ.A0U(r1));
        r3.A0B = true;
        r3.requireActivity().mOnBackPressedDispatcher.A02();
        C14030oh.A0A(-444979524, A002);
        C14030oh.A0A(-1335581394, A03);
    }
}
