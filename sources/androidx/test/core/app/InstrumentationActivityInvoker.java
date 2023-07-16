package androidx.test.core.app;

import X.C14030oh;
import X.C18250wR;
import X.C86114wI;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.redex.IDxBReceiverShape7S0100000_2_I2;

public class InstrumentationActivityInvoker {

    public class BootstrapActivity extends Activity {
        public boolean A00;
        public final BroadcastReceiver A01 = new IDxBReceiverShape7S0100000_2_I2(this, 0);

        public final void onActivityResult(int i, int i2, Intent intent) {
            if (i == 0) {
                Intent A05 = C18250wR.A05("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED");
                A05.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY", i2);
                if (intent != null) {
                    A05.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY", intent);
                }
                sendBroadcast(A05);
                finish();
            }
        }

        public final void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
            if (r5.getBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", false) == false) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCreate(android.os.Bundle r5) {
            /*
                r4 = this;
                r0 = 1716649766(0x6651ff26, float:2.4792031E23)
                int r3 = X.C14030oh.A00(r0)
                super.onCreate(r5)
                android.content.BroadcastReceiver r2 = r4.A01
                java.lang.String r1 = "androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY"
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r0.<init>(r1)
                androidx.test.core.app.InstrumentationActivityInvoker.A00(r2, r4, r0)
                r2 = 0
                if (r5 == 0) goto L_0x0022
                java.lang.String r0 = "IS_TARGET_ACTIVITY_STARTED_KEY"
                boolean r1 = r5.getBoolean(r0, r2)
                r0 = 1
                if (r1 != 0) goto L_0x0023
            L_0x0022:
                r0 = 0
            L_0x0023:
                r4.A00 = r0
                r4.overridePendingTransition(r2, r2)
                r0 = 772452760(0x2e0ab198, float:3.1535302E-11)
                X.C14030oh.A07(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.test.core.app.InstrumentationActivityInvoker.BootstrapActivity.onCreate(android.os.Bundle):void");
        }

        public final void onDestroy() {
            int A002 = C14030oh.A00(-897451316);
            super.onDestroy();
            unregisterReceiver(this.A01);
            C14030oh.A07(31942809, A002);
        }

        public final void onResume() {
            int A002 = C14030oh.A00(1698697661);
            super.onResume();
            if (!this.A00) {
                this.A00 = true;
                Parcelable parcelableExtra = getIntent().getParcelableExtra("androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY");
                parcelableExtra.getClass();
                PendingIntent pendingIntent = (PendingIntent) parcelableExtra;
                Bundle bundleExtra = getIntent().getBundleExtra("androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY");
                if (bundleExtra != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 0, (Intent) null, 268435456, 0, 0, bundleExtra);
                    } catch (IntentSender.SendIntentException e) {
                        Log.e("androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity", "Failed to start target activity.", e);
                        RuntimeException A0k = C86114wI.A0k(e);
                        C14030oh.A07(1849125782, A002);
                        throw A0k;
                    }
                } else {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, (Intent) null, 268435456, 0, 0);
                }
            }
            C14030oh.A07(-1576145524, A002);
        }

        public final void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", this.A00);
        }
    }

    public class EmptyActivity extends Activity {
        public final BroadcastReceiver A00 = new IDxBReceiverShape7S0100000_2_I2(this, 1);

        public final void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        public final void onCreate(Bundle bundle) {
            int A002 = C14030oh.A00(2007609749);
            super.onCreate(bundle);
            InstrumentationActivityInvoker.A00(this.A00, this, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
            overridePendingTransition(0, 0);
            C14030oh.A07(-1943610440, A002);
        }

        public final void onDestroy() {
            int A002 = C14030oh.A00(-2061992265);
            super.onDestroy();
            unregisterReceiver(this.A00);
            C14030oh.A07(-1720267599, A002);
        }

        public final void onResume() {
            int A002 = C14030oh.A00(465916527);
            super.onResume();
            sendBroadcast(C18250wR.A05("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_ACTIVITY_RESUMED"));
            C14030oh.A07(-1766033802, A002);
        }
    }

    public class EmptyFloatingActivity extends Activity {
        public final BroadcastReceiver A00 = new IDxBReceiverShape7S0100000_2_I2(this, 2);

        public final void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        public final void onCreate(Bundle bundle) {
            int A002 = C14030oh.A00(840797698);
            super.onCreate(bundle);
            InstrumentationActivityInvoker.A00(this.A00, this, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
            overridePendingTransition(0, 0);
            C14030oh.A07(131087133, A002);
        }

        public final void onDestroy() {
            int A002 = C14030oh.A00(-1365335671);
            super.onDestroy();
            unregisterReceiver(this.A00);
            C14030oh.A07(345698783, A002);
        }

        public final void onResume() {
            int A002 = C14030oh.A00(-673341291);
            super.onResume();
            sendBroadcast(C18250wR.A05("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_FLOATING_ACTIVITY_RESUMED"));
            C14030oh.A07(-619770408, A002);
        }
    }

    public static void A00(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 2);
        }
    }
}
