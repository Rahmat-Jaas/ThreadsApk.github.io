package X;

import android.graphics.drawable.AnimationDrawable;
import com.instagram.profile.edit.controller.EditProfileFieldsController;

/* renamed from: X.4Pj  reason: invalid class name and case insensitive filesystem */
public final class C72704Pj implements Runnable {
    public final /* synthetic */ EditProfileFieldsController A00;

    public C72704Pj(EditProfileFieldsController editProfileFieldsController) {
        this.A00 = editProfileFieldsController;
    }

    public final void run() {
        AnimationDrawable animationDrawable = this.A00.progressBarAnimated;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }
}
