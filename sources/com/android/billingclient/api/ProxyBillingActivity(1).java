package com.android.billingclient.api;

import X.AnonymousClass000;
import X.C14030oh;
import X.C18230wP;
import X.C18250wR;
import X.C41258M6t;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import ch.boye.httpclientandroidlib.HttpStatus;

public class ProxyBillingActivity extends Activity {
    public ResultReceiver A00;
    public ResultReceiver A01;
    public boolean A02;

    private Intent A00() {
        Intent A05 = C18250wR.A05(AnonymousClass000.A00(325));
        A05.setPackage(getApplicationContext().getPackageName());
        return A05;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.A01;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.A00;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (r0 != null) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            super.onActivityResult(r7, r8, r9)
            r5 = 0
            r2 = 0
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            r0 = 100
            if (r7 != r0) goto L_0x008d
            X.LyC r0 = X.C41258M6t.A08(r9, r4)
            int r3 = r0.A00
            r0 = -1
            if (r8 != r0) goto L_0x001b
            if (r3 == 0) goto L_0x008b
            r8 = -1
        L_0x001b:
            java.lang.String r1 = "Activity finished with resultCode "
            java.lang.String r0 = " and billing's responseCode: "
            java.lang.String r0 = X.AnonymousClass00U.A01(r8, r3, r1, r0)
            X.C41258M6t.A0E(r4, r0)
        L_0x0026:
            android.os.ResultReceiver r0 = r6.A01
            if (r0 != 0) goto L_0x0099
            if (r9 == 0) goto L_0x0086
            android.os.Bundle r0 = r9.getExtras()
            if (r0 == 0) goto L_0x006b
            android.os.Bundle r0 = r9.getExtras()
            java.lang.String r4 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r1 = r0.getString(r4)
            if (r1 == 0) goto L_0x005f
            r0 = 324(0x144, float:4.54E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.content.Intent r3 = X.C18250wR.A05(r0)
            android.content.Context r0 = r6.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            r3.setPackage(r0)
            r3.putExtra(r4, r1)
        L_0x0056:
            r6.sendBroadcast(r3)
        L_0x0059:
            r6.A02 = r2
            r6.finish()
            return
        L_0x005f:
            android.content.Intent r3 = r6.A00()
            android.os.Bundle r0 = r9.getExtras()
            r3.putExtras(r0)
            goto L_0x0056
        L_0x006b:
            android.content.Intent r3 = r6.A00()
            java.lang.String r0 = "Got null bundle!"
            X.C41258M6t.A0E(r4, r0)
            r1 = 6
            java.lang.String r0 = "RESPONSE_CODE"
            r3.putExtra(r0, r1)
            java.lang.String r1 = "DEBUG_MESSAGE"
            r0 = 592(0x250, float:8.3E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putExtra(r1, r0)
            goto L_0x0056
        L_0x0086:
            android.content.Intent r3 = r6.A00()
            goto L_0x0056
        L_0x008b:
            r3 = 0
            goto L_0x0026
        L_0x008d:
            r0 = 101(0x65, float:1.42E-43)
            if (r7 != r0) goto L_0x00a3
            int r3 = X.C41258M6t.A00(r9)
            android.os.ResultReceiver r0 = r6.A00
            if (r0 == 0) goto L_0x0059
        L_0x0099:
            if (r9 == 0) goto L_0x009f
            android.os.Bundle r5 = r9.getExtras()
        L_0x009f:
            r0.send(r3, r5)
            goto L_0x0059
        L_0x00a3:
            java.lang.String r1 = "Got onActivityResult with wrong requestCode: "
            java.lang.String r0 = "; skipping..."
            java.lang.String r0 = X.AnonymousClass00U.A0S(r1, r0, r7)
            X.C41258M6t.A0E(r4, r0)
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onCreate(Bundle bundle) {
        int i;
        PendingIntent pendingIntent;
        int i2;
        int A002 = C14030oh.A00(-1052723710);
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        String A003 = AnonymousClass000.A00(109);
        if (bundle == null) {
            C41258M6t.A0D(A003, "Launching Play Store billing flow");
            Intent intent = getIntent();
            String A004 = AnonymousClass000.A00(596);
            boolean hasExtra = intent.hasExtra(A004);
            Intent intent2 = getIntent();
            if (hasExtra) {
                pendingIntent = (PendingIntent) intent2.getParcelableExtra(A004);
            } else {
                boolean hasExtra2 = intent2.hasExtra("SUBS_MANAGEMENT_INTENT");
                Intent intent3 = getIntent();
                if (hasExtra2) {
                    pendingIntent = (PendingIntent) intent3.getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                    this.A01 = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                } else if (intent3.hasExtra("IN_APP_MESSAGE_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                    this.A00 = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                    i2 = HttpStatus.SC_SWITCHING_PROTOCOLS;
                    this.A02 = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), i2, C18230wP.A0B(), 0, 0, 0);
                    i = 1476260409;
                } else {
                    pendingIntent = null;
                }
            }
            i2 = 100;
            try {
                this.A02 = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i2, C18230wP.A0B(), 0, 0, 0);
                i = 1476260409;
            } catch (IntentSender.SendIntentException e) {
                C41258M6t.A0F(A003, "Got exception while trying to start a purchase flow.", e);
                ResultReceiver resultReceiver = this.A01;
                if (resultReceiver != null) {
                    resultReceiver.send(6, (Bundle) null);
                } else {
                    ResultReceiver resultReceiver2 = this.A00;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, (Bundle) null);
                    } else {
                        Intent A005 = A00();
                        A005.putExtra("RESPONSE_CODE", 6);
                        A005.putExtra("DEBUG_MESSAGE", AnonymousClass000.A00(592));
                        sendBroadcast(A005);
                    }
                }
                this.A02 = false;
                finish();
                i = -1612696194;
            }
        } else {
            C41258M6t.A0D(A003, "Launching Play Store billing flow from savedInstanceState");
            this.A02 = bundle2.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle2.containsKey("result_receiver")) {
                this.A01 = (ResultReceiver) bundle2.getParcelable("result_receiver");
                i = 164295875;
            } else if (bundle2.containsKey("in_app_message_result_receiver")) {
                this.A00 = (ResultReceiver) bundle2.getParcelable("in_app_message_result_receiver");
                i = 2129764559;
            } else {
                i = 1330266237;
            }
        }
        C14030oh.A07(i, A002);
    }

    public final void onDestroy() {
        int i;
        int A002 = C14030oh.A00(-354970116);
        super.onDestroy();
        if (!isFinishing()) {
            i = 447854104;
        } else if (!this.A02) {
            i = -1791009161;
        } else {
            Intent A003 = A00();
            A003.putExtra("RESPONSE_CODE", 1);
            A003.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(A003);
            i = 1595197679;
        }
        C14030oh.A07(i, A002);
    }
}
