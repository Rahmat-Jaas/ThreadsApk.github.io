package X;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;

/* renamed from: X.098  reason: invalid class name */
public final class AnonymousClass098 extends AnonymousClass00R {
    public final /* synthetic */ ComponentActivity A00;

    public AnonymousClass098(ComponentActivity componentActivity) {
        this.A00 = componentActivity;
    }

    public final void A03(AnonymousClass00X r12, C62233Xw r13, Object obj, int i) {
        ComponentActivity componentActivity = this.A00;
        AnonymousClass00W A03 = r12.A03(componentActivity, obj);
        int i2 = i;
        if (A03 != null) {
            new Handler(Looper.getMainLooper()).post(new AnonymousClass004(this, A03, i));
            return;
        }
        Intent A02 = r12.A02(componentActivity, obj);
        Bundle bundle = null;
        if (A02.getExtras() != null && A02.getExtras().getClassLoader() == null) {
            A02.setExtrasClassLoader(componentActivity.getClassLoader());
        }
        if (A02.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = A02.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            A02.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(A02.getAction())) {
            String[] stringArrayExtra = A02.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            F6X.A04(componentActivity, stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(A02.getAction())) {
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) A02.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                componentActivity.startIntentSenderForResult(intentSenderRequest.A03, i2, intentSenderRequest.A02, intentSenderRequest.A00, intentSenderRequest.A01, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new AnonymousClass005(e, this, i));
            }
        } else {
            componentActivity.startActivityForResult(A02, i, bundle);
        }
    }
}
