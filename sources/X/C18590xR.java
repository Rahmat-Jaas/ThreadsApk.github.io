package X;

import android.os.Handler;
import android.os.Message;
import com.instagram.profile.edit.controller.EditProfileFieldsController;

/* renamed from: X.0xR  reason: invalid class name and case insensitive filesystem */
public final class C18590xR extends Handler {
    public final C559335d A00;

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            EditProfileFieldsController editProfileFieldsController = this.A00.A00;
            if (editProfileFieldsController.usernameField != null) {
                String A0n = AnonymousClass0wJ.A0n(editProfileFieldsController.A06().A00);
                C32165H8c A002 = C63503hc.A00(editProfileFieldsController.A03(), editProfileFieldsController.A06, A0n, false);
                A002.A00 = new AnonymousClass1hG(editProfileFieldsController, A0n);
                C31155GhB.A01(editProfileFieldsController.A03(), editProfileFieldsController.A05, A002);
            }
        }
    }

    public C18590xR(C559335d r1) {
        this.A00 = r1;
    }
}
