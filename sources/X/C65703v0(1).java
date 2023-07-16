package X;

import android.widget.CompoundButton;

/* renamed from: X.3v0  reason: invalid class name and case insensitive filesystem */
public final class C65703v0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ AnonymousClass3EZ A00;
    public final /* synthetic */ C29261xe A01;
    public final /* synthetic */ String A02;

    public C65703v0(AnonymousClass3EZ r1, C29261xe r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        AnonymousClass3EZ r3 = this.A00;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        r3.A00(str, this.A02, "toggle");
    }
}
