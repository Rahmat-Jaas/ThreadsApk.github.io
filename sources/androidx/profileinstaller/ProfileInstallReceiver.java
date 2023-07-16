package androidx.profileinstaller;

import X.AnonymousClass85A;
import X.C013406g;
import X.C013706j;
import X.C125077cN;
import X.C14030oh;
import X.C86154wM;
import X.C98496Ft;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;

public class ProfileInstallReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        AnonymousClass85A r5;
        C125077cN r3;
        Object obj;
        int i;
        int i2;
        int A01 = C14030oh.A01(-1193999392);
        if (intent == null) {
            i2 = -541436934;
        } else {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                C013706j.A00(context, new C125077cN(this), AnonymousClass85A.A00, true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        r5 = AnonymousClass85A.A00;
                        r3 = new C125077cN(this);
                        try {
                            C013706j.A01(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            obj = null;
                            i = 10;
                        } catch (PackageManager.NameNotFoundException e) {
                            r5.execute(new C013406g(r3, e, 7));
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        r5 = AnonymousClass85A.A00;
                        r3 = new C125077cN(this);
                        C86154wM.A0U(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        obj = null;
                        i = 11;
                    }
                    r5.execute(new C013406g(r3, obj, i));
                }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                C125077cN r32 = new C125077cN(this);
                Process.sendSignal(Process.myPid(), 10);
                r32.CHE(12, (Object) null);
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                C125077cN r33 = new C125077cN(this);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    int i3 = 15;
                    if (C98496Ft.A00(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                        i3 = 14;
                    }
                    r33.CHE(i3, (Object) null);
                } else {
                    r33.CHE(16, (Object) null);
                }
            }
            i2 = 773008244;
        }
        C14030oh.A0E(i2, A01, intent);
    }
}
