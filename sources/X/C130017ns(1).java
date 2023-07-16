package X;

/* renamed from: X.7ns  reason: invalid class name and case insensitive filesystem */
public final class C130017ns implements C83334rD {
    public final /* synthetic */ C127057gS A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public final void onFailure(Throwable th) {
        C04220Ms.A0B(th, 0);
        this.A00.A01.A00(this.A01, th);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean A1Z = C18190wL.A1Z(obj, true);
        C127057gS r4 = this.A00;
        if (A1Z) {
            C132427ts r1 = r4.A01;
            r1.A00.markerEnd(188226264, this.A01.hashCode(), 2);
            return;
        }
        C132427ts r3 = r4.A01;
        String str = this.A01;
        StringBuilder A0s = C18190wL.A0s("Failed to submit executor: runtime enabled=");
        A0s.append(r4.A06);
        A0s.append(", task name=");
        A0s.append(str);
        A0s.append(", task enabled=");
        A0s.append(this.A02);
        r3.A00(str, C18250wR.A0V(A0s.toString()));
    }

    public C130017ns(C127057gS r1, String str, boolean z) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = z;
    }
}
