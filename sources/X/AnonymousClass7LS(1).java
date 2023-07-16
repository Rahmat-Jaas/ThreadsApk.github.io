package X;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* renamed from: X.7LS  reason: invalid class name */
public abstract class AnonymousClass7LS implements DialogInterface.OnClickListener {
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (this instanceof AnonymousClass5ok) {
                AnonymousClass5ok r1 = (AnonymousClass5ok) this;
                Intent intent = r1.A00;
                if (intent != null) {
                    r1.A01.startActivityForResult(intent, 2);
                }
            } else {
                AnonymousClass5oj r12 = (AnonymousClass5oj) this;
                Intent intent2 = r12.A01;
                if (intent2 != null) {
                    r12.A00.startActivityForResult(intent2, 2);
                }
            }
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } catch (Throwable th) {
            dialogInterface.dismiss();
            throw th;
        }
        dialogInterface.dismiss();
    }
}
