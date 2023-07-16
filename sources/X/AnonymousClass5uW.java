package X;

import android.app.Application;
import android.content.Context;
import android.view.WindowManager;

/* renamed from: X.5uW  reason: invalid class name */
public final class AnonymousClass5uW extends AnonymousClass4TI {
    public final Context A00;
    public final C28477FNn A01;
    public final Context A02;

    public AnonymousClass5uW(Context context, C28477FNn fNn) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
        this.A01 = fNn;
        this.A02 = context;
    }

    public final void A03() {
        C08380dH r6 = C09120et.A3D;
        boolean A1X = AnonymousClass0wJ.A1X(r6.A00().A2F.A00.invoke());
        boolean A1X2 = AnonymousClass0wJ.A1X(r6.A00().A2H.A00.invoke());
        if (A1X || A1X2) {
            AnonymousClass84V r3 = C103056Xq.A00;
            Context context = this.A02;
            r3.A01 = (WindowManager) context.getSystemService("window");
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(1000);
            r3.A00 = layoutParams;
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.type = 2038;
            layoutParams.format = 1;
            layoutParams.flags = 16843032;
            layoutParams.alpha = 0.7f;
            r3.A03 = new AnonymousClass50Q(context);
            if (A1X) {
                C1377289u r0 = new C1377289u();
                C1377289u.A02 = r0;
                r3.A02 = r0;
                r0.addObserver(r3);
            }
            if (A1X2) {
                C1377389v r02 = new C1377389v();
                C1377389v.A02 = r02;
                r3.A04 = r02;
                r02.addObserver(r3);
            }
        }
        if (r6.A00().A0U()) {
            Context context2 = this.A02;
            AnonymousClass7D9.A00 = context2;
            ((Application) context2).registerActivityLifecycleCallbacks(AnonymousClass7D9.A03);
        }
        if (AnonymousClass0wJ.A1X(r6.A00().A2P.A00.invoke())) {
            C1197576u r03 = C1197576u.A08;
            Context context3 = this.A02;
            r03.A00 = context3;
            Application application = (Application) context3;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(r03.A05);
            }
        }
    }
}
