package com.google.android.gms.common.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass5oj;
import X.AnonymousClass7MI;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C86114wI;
import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public int A00 = 0;

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00 = 0;
        setResult(0);
        finish();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.A00);
        super.onSaveInstanceState(bundle);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.A00 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                AnonymousClass7MI A01 = AnonymousClass7MI.A01(this);
                if (i2 == -1) {
                    Handler handler = A01.A06;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i2 == 0) {
                    A01.A04(new ConnectionResult(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.A00 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A002 = C14030oh.A00(717675665);
        super.onCreate(bundle);
        if (bundle != null) {
            this.A00 = bundle.getInt("resolution");
        }
        if (this.A00 != 1) {
            Bundle A0C = C18190wL.A0C(this);
            if (A0C == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) A0C.get("pending_intent");
                Object obj = A0C.get(TraceFieldType.ErrorCode);
                if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                        this.A00 = 1;
                    } catch (ActivityNotFoundException e) {
                        if (A0C.getBoolean("notify_manager", true)) {
                            AnonymousClass7MI.A01(this).A04(new ConnectionResult(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String obj2 = pendingIntent.toString();
                            StringBuilder A0s = C86114wI.A0s(obj2.length() + 36);
                            A0s.append("Activity not found while launching ");
                            A0s.append(obj2);
                            String A0i = C18180wK.A0i(".", A0s);
                            if (Build.FINGERPRINT.contains("generic")) {
                                A0i = A0i.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", A0i, e);
                        }
                        this.A00 = 1;
                    } catch (IntentSender.SendIntentException e2) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                        finish();
                    }
                } else if (obj != null) {
                    int A04 = AnonymousClass0wJ.A04(obj);
                    Dialog A003 = GoogleApiAvailability.A00(this, this, new AnonymousClass5oj(this, GoogleApiAvailability.A00.A03(this, "d", A04)), A04);
                    if (A003 != null) {
                        GoogleApiAvailability.A01(this, A003, this, "GooglePlayServicesErrorDialog");
                    }
                    this.A00 = 1;
                } else {
                    str = "Activity started without resolution";
                }
                i = 1910397801;
            }
            Log.e("GoogleApiActivity", str);
            finish();
            i = 1910397801;
        } else {
            i = 1256905274;
        }
        C14030oh.A07(i, A002);
    }
}
