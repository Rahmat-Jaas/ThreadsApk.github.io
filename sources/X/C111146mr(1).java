package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.Set;

/* renamed from: X.6mr  reason: invalid class name and case insensitive filesystem */
public final class C111146mr {
    public static C111146mr A09;
    public AnonymousClass4wz A00 = null;
    public final Context A01;
    public final IntentFilter A02;
    public final AnonymousClass78d A03;
    public final Set A04 = C18200wM.A0u();
    public final Set A05;
    public final Handler A06;
    public final C142258eT A07;
    public volatile boolean A08;

    public C111146mr(Context context, C142258eT r5) {
        AnonymousClass78d r2 = new AnonymousClass78d("SplitInstallListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService");
        this.A03 = r2;
        this.A02 = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext != null ? applicationContext : context;
        this.A06 = AnonymousClass0wJ.A0F();
        this.A05 = C86134wK.A0u();
        this.A07 = r5;
    }
}
