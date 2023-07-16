package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.3Xw  reason: invalid class name and case insensitive filesystem */
public final class C62233Xw {
    public final ActivityOptions A00;

    public static C62233Xw A00(Activity activity, View view) {
        return new C62233Xw(ActivityOptions.makeSceneTransitionAnimation(activity, view, I17.A00(763)));
    }

    public final Bundle A01() {
        return this.A00.toBundle();
    }

    public C62233Xw(ActivityOptions activityOptions) {
        this.A00 = activityOptions;
    }

    public C62233Xw() {
    }
}
