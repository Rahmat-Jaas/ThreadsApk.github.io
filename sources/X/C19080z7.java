package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.instagram.barcelona.R;

/* renamed from: X.0z7  reason: invalid class name and case insensitive filesystem */
public final class C19080z7 extends Toast {
    public final Context A00;

    public final void show() {
        try {
            Context context = this.A00;
            boolean z = false;
            C002801h.A05(AnonymousClass0wJ.A1W(context), "context is null");
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                C002801h.A05(!activity.isFinishing(), "activity is finishing");
                if (!activity.isDestroyed()) {
                    z = true;
                }
                C002801h.A05(z, "activity is destroyed");
            }
            AnonymousClass0LU.A0G("IGToast", "Showing IG Toast", new Throwable());
            super.show();
        } catch (IllegalStateException e) {
            C10450iM.A06("IGToast", "Context is invalid", e);
        }
    }

    public C19080z7(Context context) {
        super(context);
        this.A00 = context;
    }

    public static C19080z7 A00(Context context, CharSequence charSequence, int i) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.ig_toast, (ViewGroup) null, false);
        AnonymousClass0wJ.A0L(inflate, R.id.text_view).setText(charSequence);
        C19080z7 r1 = new C19080z7(context);
        r1.setDuration(i);
        r1.setGravity(17, 0, 0);
        r1.setView(inflate);
        return r1;
    }
}
