package X;

import android.widget.CompoundButton;

/* renamed from: X.1uX  reason: invalid class name and case insensitive filesystem */
public final class C28531uX extends AnonymousClass9UH {
    public CompoundButton A00;
    public String A01;
    public boolean A02;
    public final /* synthetic */ C29351xp A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28531uX(CompoundButton compoundButton, C12560m7 r2, C29351xp r3, String str, boolean z) {
        super(r2);
        this.A03 = r3;
        this.A00 = compoundButton;
        this.A02 = z;
        this.A01 = str;
    }

    public final void onFail(AnonymousClass3XX r8) {
        int A032 = C14030oh.A03(-1421132911);
        C29351xp r5 = this.A03;
        C63813iO.A03(r5.A00, "reset_mute_failed", 2131837305, 0);
        CompoundButton compoundButton = this.A00;
        boolean z = this.A02;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = r5.A01;
        C18240wQ.A0y(compoundButton, z);
        compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        r5.A04.A02(r5.A05, this.A01, "toggle", false);
        C14030oh.A0A(1599297685, A032);
    }

    public final void onSuccess(Object obj) {
        int A032 = C14030oh.A03(1519889353);
        CompoundButton compoundButton = this.A00;
        boolean z = !this.A02;
        C29351xp r1 = this.A03;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = r1.A01;
        C18240wQ.A0y(compoundButton, z);
        compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        r1.A04.A02(r1.A05, this.A01, "toggle", true);
        C14030oh.A0A(-697694803, A032);
    }
}
