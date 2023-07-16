package X;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.3aj  reason: invalid class name and case insensitive filesystem */
public abstract class C62783aj {
    public static Application A00;
    public static C62783aj A01;

    public abstract boolean getShouldShowSmartLockForLogin();

    public abstract void getSmartLockBroker(FragmentActivity fragmentActivity, C82664q4 r2, C10300i6 r3);

    public abstract void getSmartLockBroker(FragmentActivity fragmentActivity, C82664q4 r2, C10300i6 r3, boolean z);

    public abstract C81514nv listenForSmsResponse(Activity activity, boolean z);

    public abstract void setShouldShowSmartLockForLogin(boolean z);

    public static synchronized C62783aj getInstance() {
        C62783aj r0;
        synchronized (C62783aj.class) {
            r0 = A01;
            if (r0 == null) {
                try {
                    r0 = (C62783aj) Class.forName("com.instagram.login.smartlock.impl.SmartLockPluginImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
                    A01 = r0;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        return r0;
    }

    public static H8a getInstanceAsync() {
        return new H8a(new C73724Tq(), 480);
    }

    public static void setApplication(Application application) {
        A00 = application;
    }
}
