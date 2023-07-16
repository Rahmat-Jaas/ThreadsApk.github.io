package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.1h9  reason: invalid class name */
public final class AnonymousClass1h9 extends C63873iU {
    public final /* synthetic */ AnonymousClass1iQ A00;

    public AnonymousClass1h9(AnonymousClass1iQ r1) {
        this.A00 = r1;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A03 = C14030oh.A03(-125043133);
        super.onFail(r3);
        C63813iO.A0F(((AnonymousClass1T3) r3.A00).A01);
        C14030oh.A0A(704414227, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(529948222);
        AnonymousClass1T3 r10 = (AnonymousClass1T3) obj;
        int A032 = C14030oh.A03(-29784227);
        super.onSuccess(r10);
        C63733iD A01 = C63733iD.A01();
        AnonymousClass1iQ r7 = this.A00;
        FragmentActivity fragmentActivity = r7.A00;
        A01.A0A = AnonymousClass0wJ.A0l(fragmentActivity, r10.A00, 2131829650);
        String string = fragmentActivity.getString(2131831976);
        C04220Ms.A0B(string, 0);
        A01.A0D = string;
        A01.A07 = new AnonymousClass4D5();
        A01.A0I = true;
        r7.A02.A07(A01.A0B());
        C14030oh.A0A(-1971647898, A032);
        C14030oh.A0A(-1264430188, A03);
    }
}
