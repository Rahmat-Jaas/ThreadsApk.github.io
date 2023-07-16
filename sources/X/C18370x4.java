package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0x4  reason: invalid class name and case insensitive filesystem */
public final class C18370x4 extends BroadcastReceiver implements C81514nv {
    public C63873iU A00;
    public String A01;
    public final Context A02;
    public final AtomicBoolean A03 = new AtomicBoolean(true);

    public static void A00(C18370x4 r2, String str) {
        if (r2.A03.getAndSet(false)) {
            r2.A02.unregisterReceiver(r2);
        }
        C63873iU r22 = r2.A00;
        if (r22 != null) {
            AnonymousClass0wJ.A0F().post(new C73124Ra(r22, str));
        }
    }

    public C18370x4(Context context) {
        this.A02 = context;
        context.registerReceiver(this, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        int A012 = C14030oh.A01(-709490868);
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            parcelableExtra.getClass();
            int i = ((Status) parcelableExtra).A01;
            if (i != 0) {
                if (i == 10) {
                    str = "dev_error";
                } else if (i != 15) {
                    str = "unknown";
                } else {
                    str = "timeout";
                }
                A00(this, str);
            } else {
                String stringExtra = intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                if (this.A03.getAndSet(false)) {
                    this.A02.unregisterReceiver(this);
                }
                this.A01 = stringExtra;
                C63873iU r2 = this.A00;
                if (r2 != null) {
                    r2.onSuccessInBackground(stringExtra);
                    AnonymousClass0wJ.A0F().post(new C73134Rb(r2, stringExtra));
                }
            }
        }
        C14030oh.A0E(192140706, A012, intent);
    }
}
