package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.ref.WeakReference;

/* renamed from: X.4x7  reason: invalid class name */
public final class AnonymousClass4x7 extends ContextWrapper {
    public WeakReference A00;
    public final Context A01;

    public final Context getBaseContext() {
        Context context = (Context) this.A00.get();
        if (context == null) {
            return this.A01;
        }
        return context;
    }

    public final Object getSystemService(String str) {
        Context context = (Context) this.A00.get();
        if (context == null) {
            context = this.A01;
        }
        return context.getSystemService(str);
    }

    public AnonymousClass4x7(Activity activity, Context context) {
        super(context);
        this.A00 = C86144wL.A0w(activity);
        this.A01 = context;
    }
}
