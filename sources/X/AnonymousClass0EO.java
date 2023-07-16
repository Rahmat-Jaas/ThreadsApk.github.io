package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0EO  reason: invalid class name */
public class AnonymousClass0EO extends C16660tW {
    public final C16980u6 A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public final void A05(Context context, Intent intent) {
        if (intent.getPackage() == null && intent.getComponent() == null && intent.getSelector() == null) {
            StrictMode.noteSlowCall("Implicit intents using ScopedIntentLauncher queries all packages.");
        }
        C16300so A022 = A02(context, intent);
        List<Intent> A0D = this.A00.A0D(context, intent, this.A01);
        if (!A0D.isEmpty()) {
            for (Intent intent2 : A0D) {
                A06(context, intent, intent2, A022);
                try {
                    context.sendBroadcast(intent2, (String) null);
                } catch (RuntimeException e) {
                    if (!(e.getCause() instanceof DeadObjectException)) {
                        throw e;
                    }
                }
            }
        }
    }

    public final void A06(Context context, Intent intent, Intent intent2, C16300so r14) {
        Integer num;
        Context context2 = context;
        if (context != null) {
            C16300so r8 = r14;
            if (r14 != null) {
                List<C16330sr> list = this.A02;
                if (!list.isEmpty()) {
                    Intent intent3 = new Intent(intent);
                    Intent intent4 = new Intent(intent2);
                    for (C16330sr r4 : list) {
                        try {
                            Integer A0B = this.A00.A0B();
                            C04220Ms.A0B(A0B, 1);
                            Integer num2 = AnonymousClass006.A00;
                            if (!(A0B == num2 || A0B == (num = AnonymousClass006.A01))) {
                                if (!(intent3.getData() == null && (A0B == num2 || A0B == num || intent4.getData() == null))) {
                                    r4.BkC(context2, intent3, intent4, r8, A0B);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    public final boolean A0A(Context context, Intent intent, ServiceConnection serviceConnection) {
        C16300so A022 = A02(context, intent);
        Intent A0A = this.A00.A0A(context, intent, this.A01);
        if (A0A == null) {
            return false;
        }
        A06(context, intent, A0A, A022);
        return context.bindService(A0A, serviceConnection, 1);
    }

    public static void A00(Context context, AnonymousClass0EO r2) {
        if (context != null) {
            List list = r2.A03;
            if (!list.isEmpty()) {
                synchronized (list) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        }
    }

    public AnonymousClass0EO A01(String str) {
        return new AnonymousClass0EO(this.A00, str, this.A03, this.A02);
    }

    public final C16300so A02(Context context, Intent intent) {
        if (context != null) {
            List list = this.A02;
            if (!list.isEmpty()) {
                if (TextUtils.isEmpty(intent.getStringExtra("MSF_INTENT_METADATA_ID"))) {
                    byte[] bArr = new byte[16];
                    new SecureRandom().nextBytes(bArr);
                    String encodeToString = Base64.encodeToString(bArr, 8);
                    long currentTimeMillis = System.currentTimeMillis();
                    String packageName = context.getPackageName();
                    intent.putExtra("MSF_INTENT_METADATA_ID", encodeToString);
                    intent.putExtra("MSF_INTENT_METADATA_LAUNCH_START_TIME", currentTimeMillis);
                    intent.putExtra("MSF_INTENT_METADATA_ORIGIN_PACKAGE_NAME", packageName);
                } else {
                    intent.getLongExtra("MSF_INTENT_METADATA_LAUNCH_START_TIME", -1);
                    intent.getStringExtra("MSF_INTENT_METADATA_ORIGIN_PACKAGE_NAME");
                }
                C16300so r3 = new C16300so();
                new Intent(intent);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                    try {
                        Integer A0B = this.A00.A0B();
                        C04220Ms.A0B(A0B, 1);
                        if (!(A0B == AnonymousClass006.A00 || A0B == AnonymousClass006.A01)) {
                            intent.getData();
                        }
                    } catch (Exception unused) {
                    }
                }
                return r3;
            }
        }
        return null;
    }

    public AnonymousClass0EO(C16980u6 r1, String str, List list, List list2) {
        this.A00 = r1;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = str;
    }

    public final void A03(Activity activity, Context context, Intent intent, View view) {
        C16300so A022 = A02(context, intent);
        Intent A08 = this.A00.A08(context, intent, this.A01);
        if (A08 != null) {
            A00(context, this);
            A06(context, intent, A08, A022);
            context.startActivity(A08, C62233Xw.A00(activity, view).A01());
        }
    }

    public final void A04(Context context, Intent intent) {
        C16300so A022 = A02(context, intent);
        Intent A0A = this.A00.A0A(context, intent, this.A01);
        if (A0A != null) {
            A06(context, intent, A0A, A022);
            context.startForegroundService(A0A);
        }
    }

    public final void A07(Context context, Intent intent, Bundle bundle) {
        C16300so A022 = A02(context, intent);
        C16980u6 r1 = this.A00;
        Intent A08 = r1.A08(context, intent, this.A01);
        if (A08 != null) {
            A00(context, this);
            if (C16660tW.A02(context, A08)) {
                r1.A02.Ccv("Warning: launching intent with a non-Activity Context requires FLAG_ACTIVITY_NEW_TASK, or the Android Runtime will throw a AndroidRuntimeException. Adding the flag to prevent a crash. This might lead to unexpected behavior with the back button. Please pass in an Activity Context.");
            }
            A06(context, intent, A08, A022);
            context.startActivity(A08, bundle);
        }
    }

    public final boolean A08(Activity activity, Intent intent, int i) {
        C16300so A022 = A02(activity, intent);
        Intent A08 = this.A00.A08(activity, intent, this.A01);
        if (A08 == null) {
            return false;
        }
        A00(activity, this);
        A06(activity, intent, A08, A022);
        activity.startActivityForResult(A08, i);
        return true;
    }

    public final boolean A09(Context context, Intent intent) {
        C16300so A022 = A02(context, intent);
        C16980u6 r1 = this.A00;
        Intent A08 = r1.A08(context, intent, this.A01);
        if (A08 == null) {
            return false;
        }
        A00(context, this);
        if (C16660tW.A02(context, intent)) {
            r1.A02.Ccv("Warning: launching intent with a non-Activity Context requires FLAG_ACTIVITY_NEW_TASK, or the Android Runtime will throw a AndroidRuntimeException. Adding the flag to prevent a crash. This might lead to unexpected behavior with the back button. Please pass in an Activity Context.");
        }
        A06(context, intent, A08, A022);
        context.startActivity(A08);
        return true;
    }

    public final boolean A0B(Intent intent, Fragment fragment, int i) {
        Context context = fragment.getContext();
        C16300so A022 = A02(context, intent);
        Intent A08 = this.A00.A08(context, intent, this.A01);
        if (A08 == null) {
            return false;
        }
        A00(context, this);
        A06(context, intent, A08, A022);
        fragment.startActivityForResult(A08, i);
        return true;
    }
}
