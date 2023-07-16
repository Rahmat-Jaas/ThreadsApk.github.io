package androidx.profileinstaller;

import X.AnonymousClass075;
import X.C014006m;
import X.C014106n;
import X.C014406q;
import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;

public class ProfileInstallerInitializer implements AnonymousClass075 {
    public final /* bridge */ /* synthetic */ Object AFB(Context context) {
        Choreographer.getInstance().postFrameCallback(new C014106n(new C014006m(context.getApplicationContext(), this)));
        return new C014406q();
    }

    public final List AHd() {
        return Collections.emptyList();
    }
}
