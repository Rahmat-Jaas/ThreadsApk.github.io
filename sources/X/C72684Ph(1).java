package X;

import com.instagram.profile.edit.controller.EditProfileFieldsController;

/* renamed from: X.4Ph  reason: invalid class name and case insensitive filesystem */
public final class C72684Ph implements Runnable {
    public final /* synthetic */ EditProfileFieldsController A00;

    public C72684Ph(EditProfileFieldsController editProfileFieldsController) {
        this.A00 = editProfileFieldsController;
    }

    public final void run() {
        EditProfileFieldsController editProfileFieldsController = this.A00;
        if (editProfileFieldsController.bioField != null && editProfileFieldsController.A04().isAttachedToWindow()) {
            C25553Dnn A01 = AnonymousClass4DS.A01(editProfileFieldsController.A03(), C18190wL.A0g(editProfileFieldsController.A03().getResources(), 2131826648));
            A01.A02(editProfileFieldsController.A04(), 0, 0, true);
            A01.A03(D0f.ABOVE_ANCHOR);
            A01.A04(AnonymousClass3TC.A05);
            A01.A0B = false;
            A01.A0A = true;
            AnonymousClass4DQ.A01(A01, editProfileFieldsController, 10);
        }
    }
}
