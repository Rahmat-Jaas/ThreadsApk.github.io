package X;

import java.io.File;

/* renamed from: X.1hf  reason: invalid class name and case insensitive filesystem */
public final class C24211hf extends C63873iU {
    public final /* synthetic */ String A00;

    public C24211hf(String str) {
        this.A00 = str;
    }

    public final void onFail(AnonymousClass3XX r3) {
        C14030oh.A0A(-1504826974, C14030oh.A03(-310946699));
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(365674649);
        new File(this.A00).delete();
        C14030oh.A0A(1050668038, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(978165537);
        C14030oh.A0A(-664842747, C14030oh.A03(-1490881168));
        C14030oh.A0A(2103741524, A03);
    }
}
