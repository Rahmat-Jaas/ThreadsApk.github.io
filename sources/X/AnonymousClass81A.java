package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: X.81A  reason: invalid class name */
public final class AnonymousClass81A implements Runnable {
    public final C107466gn A00;
    public final /* synthetic */ C93375lV A01;

    public AnonymousClass81A(C107466gn r1, C93375lV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        PendingIntent pendingIntent;
        C93375lV r6 = this.A01;
        if (r6.A03) {
            C107466gn r1 = this.A00;
            ConnectionResult connectionResult = r1.A01;
            int i = connectionResult.A01;
            if (i == 0 || (pendingIntent = connectionResult.A02) == null) {
                GoogleApiAvailability googleApiAvailability = r6.A01;
                C146168ll r7 = r6.A00;
                Activity Arv = r7.Arv();
                C13320nQ.A01(Arv);
                if (googleApiAvailability.A03(Arv, (String) null, i) != null) {
                    Activity Arv2 = r7.Arv();
                    C13320nQ.A01(Arv2);
                    Dialog A002 = GoogleApiAvailability.A00(Arv2, r6, new AnonymousClass5ok(googleApiAvailability.A03(Arv2, "d", i), r7), i);
                    if (A002 != null) {
                        GoogleApiAvailability.A01(Arv2, A002, r6, "GooglePlayServicesErrorDialog");
                    }
                } else if (i == 18) {
                    Activity Arv3 = r7.Arv();
                    C13320nQ.A01(Arv3);
                    ProgressBar progressBar = new ProgressBar(Arv3, (AttributeSet) null, 16842874);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(Arv3);
                    builder.setView(progressBar);
                    builder.setMessage(AnonymousClass7ID.A01(Arv3, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog create = builder.create();
                    GoogleApiAvailability.A01(Arv3, create, r6, "GooglePlayServicesUpdatingDialog");
                    Activity Arv4 = r7.Arv();
                    C13320nQ.A01(Arv4);
                    googleApiAvailability.A05(Arv4.getApplicationContext(), new C93455ld(create, this));
                } else {
                    int i2 = r1.A00;
                    r6.A02.set((Object) null);
                    r6.A0A(connectionResult, i2);
                }
            } else {
                C146168ll r5 = r6.A00;
                Activity Arv5 = r5.Arv();
                C13320nQ.A01(Arv5);
                int i3 = r1.A00;
                Intent intent = new Intent(Arv5, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i3);
                intent.putExtra("notify_manager", false);
                r5.startActivityForResult(intent, 1);
            }
        }
    }
}
