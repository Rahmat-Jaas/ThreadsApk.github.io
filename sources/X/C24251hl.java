package X;

import android.content.Context;

/* renamed from: X.1hl  reason: invalid class name and case insensitive filesystem */
public final class C24251hl extends C63873iU {
    public Context A00;
    public final C18330wh A01;
    public final String A02;

    public C24251hl(Context context, C18330wh r3, String str) {
        this.A00 = context;
        this.A02 = str;
        this.A01 = r3;
        C18330wh.A02(context, r3, 2131834979);
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A03 = C14030oh.A03(-1442676191);
        C62973bE.A02(this.A00, r3);
        C14030oh.A0A(319223241, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-314105232);
        this.A01.hide();
        super.onFinish();
        C14030oh.A0A(-1275840680, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-62375715);
        C13950oZ.A00(this.A01);
        super.onStart();
        C14030oh.A0A(1305427561, A03);
    }
}
