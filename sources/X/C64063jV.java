package X;

import android.content.DialogInterface;

/* renamed from: X.3jV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64063jV implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass3EZ A00;
    public final /* synthetic */ C29261xe A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C64063jV(AnonymousClass3EZ r1, C29261xe r2, String str, String str2, String str3, boolean z) {
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = z;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C29261xe r6 = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        String str3 = this.A04;
        boolean z = this.A05;
        this.A00.A00(str, str2, "radio");
        if (!C09660ft.A01(r6.getContext())) {
            C63853iS.A0B(r6.getContext());
        } else if (!z) {
            C63853iS.A0E(r6.getContext(), str3);
        }
    }
}
