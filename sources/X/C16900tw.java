package X;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.0tw  reason: invalid class name and case insensitive filesystem */
public abstract class C16900tw extends IntentService {
    public C12790mU A00;
    public final C12710mM A01 = new C12710mM((Context) this);

    public abstract void A00();

    public abstract void A01(Intent intent);

    public abstract void A02(String str);

    public abstract void A03(String str, boolean z);

    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                if ("com.facebook.rti.fbns.intent.RECEIVE".equals(intent.getAction())) {
                    intent.toString();
                    if (((C12530m4) C17250ua.A00).A00(intent, this.A01).BZk()) {
                        String stringExtra = intent.getStringExtra("receive_type");
                        if (DialogModule.KEY_MESSAGE.equals(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("token");
                            String string = this.A00.A00.getString("token_key", "");
                            intent.getStringExtra("extra_notification_id");
                            if (TextUtils.isEmpty(string) || string.equals(stringExtra2)) {
                                A01(intent);
                            } else {
                                AnonymousClass0LU.A0C("FbnsCallbackHandlerBase", "Dropping unintended message.");
                            }
                        } else if ("registered".equals(stringExtra)) {
                            String stringExtra3 = intent.getStringExtra("data");
                            SharedPreferences.Editor edit = this.A00.A00.edit();
                            edit.putString("token_key", stringExtra3);
                            edit.apply();
                            A03(stringExtra3, AnonymousClass0s5.A02(C12710mM.A00(intent)));
                        } else if ("reg_error".equals(stringExtra)) {
                            A02(intent.getStringExtra("data"));
                        } else if (!"deleted".equals(stringExtra)) {
                            if ("unregistered".equals(stringExtra)) {
                                A00();
                            } else {
                                AnonymousClass0LU.A0B("FbnsCallbackHandlerBase", "Unknown message type");
                            }
                        }
                    }
                }
            } finally {
                C11340jw.A00(intent);
            }
        }
    }

    public C16900tw(String str) {
        super(str);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C14030oh.A04(-483181011);
        this.A00 = new C12800mV(this).A00(AnonymousClass006.A04);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        C14030oh.A0B(-860283456, A04);
        return onStartCommand;
    }
}
