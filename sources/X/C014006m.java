package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;

/* renamed from: X.06m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C014006m implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ProfileInstallerInitializer A01;

    public /* synthetic */ C014006m(Context context, ProfileInstallerInitializer profileInstallerInitializer) {
        this.A01 = profileInstallerInitializer;
        this.A00 = context;
    }

    public final void run() {
        Context context = this.A00;
        Handler.createAsync(Looper.getMainLooper()).postDelayed(new C013806k(context), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
    }
}
