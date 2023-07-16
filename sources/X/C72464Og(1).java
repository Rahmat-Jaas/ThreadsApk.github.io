package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.drafts.ClipsDraftsFragment;

/* renamed from: X.4Og  reason: invalid class name and case insensitive filesystem */
public final class C72464Og implements Runnable {
    public final /* synthetic */ ClipsDraftsFragment A00;

    public C72464Og(ClipsDraftsFragment clipsDraftsFragment) {
        this.A00 = clipsDraftsFragment;
    }

    public final void run() {
        ClipsDraftsFragment clipsDraftsFragment = this.A00;
        FragmentActivity activity = clipsDraftsFragment.getActivity();
        if (activity == null || !activity.isDestroyed()) {
            C18330wh r0 = clipsDraftsFragment.A06;
            if (r0 == null) {
                C04220Ms.A0E("progressDialog");
                throw null;
            } else {
                r0.hide();
            }
        }
    }
}
