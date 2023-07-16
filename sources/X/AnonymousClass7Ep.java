package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.facebook.browser.lite.callback.IDxSRunnableShape2S0400000_2_I2;
import com.facebook.browser.lite.callback.IDxSRunnableShape5S0300000_2_I2;
import com.facebook.browser.lite.callback.IDxSRunnableShape80S0100000_2_I2;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Ep  reason: invalid class name */
public final class AnonymousClass7Ep {
    public static AnonymousClass7Ep A07;
    public int A00;
    public ServiceConnection A01;
    public Handler A02;
    public HandlerThread A03;
    public C104346bd A04;
    public C36385JSu A05;
    public BrowserLiteCallback A06;

    public static synchronized AnonymousClass7Ep A00() {
        AnonymousClass7Ep r0;
        synchronized (AnonymousClass7Ep.class) {
            r0 = A07;
            if (r0 == null) {
                r0 = new AnonymousClass7Ep();
                A07 = r0;
            }
        }
        return r0;
    }

    public static void A01(C111716oC r2, AnonymousClass7Ep r3) {
        if (r3.A01 == null) {
            C37252JnL.A01("BrowserLiteCallbacker", "Callback service is not available.", C86164wN.A1T());
        } else {
            r3.A02.post(new AnonymousClass80W(r2, r3));
        }
    }

    public final void A02(Context context, boolean z) {
        C36385JSu jSu;
        this.A00++;
        if (this.A01 == null || (jSu = this.A05) == null) {
            Intent A052 = C18250wR.A05("com.facebook.browser.lite.BrowserLiteCallback");
            A052.setPackage(context.getPackageName());
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(A052, 0);
            if (!queryIntentServices.isEmpty() && queryIntentServices.size() <= 1) {
                HandlerThread handlerThread = new HandlerThread("BrowserLiteCallbacker");
                C13820oM.A00(handlerThread);
                this.A03 = handlerThread;
                handlerThread.start();
                this.A02 = new Handler(this.A03.getLooper());
                this.A01 = new AnonymousClass7Lx(this, z);
                Intent intent = new Intent(A052);
                intent.setComponent(new ComponentName(context.getPackageName(), queryIntentServices.get(0).serviceInfo.name));
                context.bindService(intent, this.A01, 9);
                return;
            }
            return;
        }
        BrowserLiteCallback browserLiteCallback = this.A06;
        HashSet hashSet = null;
        if (browserLiteCallback != null) {
            try {
                List B2o = browserLiteCallback.B2o();
                if (B2o != null) {
                    hashSet = new HashSet(B2o);
                }
            } catch (RemoteException unused) {
            }
        }
        jSu.A00(hashSet);
        if (z) {
            A01(new IDxSRunnableShape80S0100000_2_I2(this, 1), this);
        }
        synchronized (this) {
            if (this.A04 != null) {
                AnonymousClass0MI.A06(AnonymousClass0MU.A6N, "alive");
            }
        }
    }

    public final void A03(IABEvent iABEvent, Bundle bundle, ZonePolicy zonePolicy) {
        A01(new IDxSRunnableShape2S0400000_2_I2(bundle, this, iABEvent, zonePolicy), this);
    }

    public final void A04(Map map, Bundle bundle) {
        A01(new IDxSRunnableShape5S0300000_2_I2(bundle, this, map), this);
    }
}
