package com.facebook.analytics2.logger;

import X.AnonymousClass0CO;
import X.AnonymousClass0CP;
import X.AnonymousClass0SJ;
import X.C14030oh;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.TimeUnit;

public class AlarmBasedUploadService extends Service {
    public AnonymousClass0CP A00;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    static {
        TimeUnit.MINUTES.toMillis(5);
        TimeUnit.HOURS.toMillis(6);
    }

    public final void onCreate() {
        int A04 = C14030oh.A04(-1346410516);
        this.A00 = AnonymousClass0CP.A00(this);
        C14030oh.A0B(192141211, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C14030oh.A04(1376750835);
        if (intent != null && intent.getAction().startsWith("com.facebook.analytics2.logger.UPLOAD_NOW")) {
            intent.setAction("com.facebook.analytics2.logger.UPLOAD_NOW");
        }
        AnonymousClass0CP r1 = this.A00;
        AnonymousClass0SJ.A00(r1);
        int A02 = r1.A02(intent, new AnonymousClass0CO(this, i2));
        C14030oh.A0B(-103674956, A04);
        return A02;
    }
}
