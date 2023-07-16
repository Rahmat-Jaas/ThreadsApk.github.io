package androidx.lifecycle;

import X.AnonymousClass064;
import X.AnonymousClass066;
import X.AnonymousClass075;
import X.AnonymousClass0ZV;
import X.C04220Ms;
import X.C116036wJ;
import android.content.Context;
import androidx.startup.AppInitializer;
import java.util.List;

public final class ProcessLifecycleInitializer implements AnonymousClass075 {
    /* renamed from: A00 */
    public final AnonymousClass066 AFB(Context context) {
        C04220Ms.A0B(context, 0);
        AppInitializer instance = AppInitializer.getInstance(context);
        C04220Ms.A06(instance);
        if (instance.A02.contains(getClass())) {
            AnonymousClass064.A00(context);
            C116036wJ.A01(context);
            return C116036wJ.A00();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }

    public final List AHd() {
        return AnonymousClass0ZV.A00;
    }
}
