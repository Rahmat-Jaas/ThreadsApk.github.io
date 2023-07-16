package X;

import android.content.Context;

/* renamed from: X.4FU  reason: invalid class name */
public final class AnonymousClass4FU implements C84194si {
    public final Context A00;
    public final C82864qO A01;
    public final boolean A02;

    public AnonymousClass4FU(Context context, C82864qO r3, boolean z) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
        this.A02 = z;
        this.A01 = r3;
    }

    public final String AUg() {
        return "generic";
    }

    public final String AUe() {
        int i = 2131832995;
        if (this.A02) {
            i = 2131832955;
        }
        return AnonymousClass0wJ.A0k(this.A00, i);
    }

    public final void onClick() {
        this.A01.C7L("message_button");
    }
}
