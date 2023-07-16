package X;

import android.os.Bundle;

/* renamed from: X.4PM  reason: invalid class name */
public final class AnonymousClass4PM implements Runnable {
    public final /* synthetic */ C29231xY A00;

    public AnonymousClass4PM(C29231xY r1) {
        this.A00 = r1;
    }

    public final void run() {
        C58803Hi A01 = C62653aT.A01();
        C29231xY r3 = this.A00;
        Bundle bundle = r3.A00;
        if (bundle == null) {
            C04220Ms.A0E("twoFacResponseBundle");
            throw null;
        } else {
            AnonymousClass0wJ.A19(A01.A02(bundle.getStringArrayList("backup_codes"), r3.A01), r3.requireActivity(), AnonymousClass0wJ.A0U(r3.A07));
        }
    }
}
