package X;

import android.os.AsyncTask;
import android.util.Log;

/* renamed from: X.01C  reason: invalid class name */
public final class AnonymousClass01C extends AsyncTask {
    public final /* synthetic */ AnonymousClass01G A00;

    public AnonymousClass01C(AnonymousClass01G r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        while (true) {
            AnonymousClass01G r2 = this.A00;
            AnonymousClass01E dequeueWork = r2.dequeueWork();
            if (dequeueWork == null) {
                return null;
            }
            r2.onHandleWork(dequeueWork.getIntent());
            try {
                dequeueWork.ADk();
            } catch (SecurityException e) {
                String message = e.getMessage();
                if (message == null || !message.contains(AnonymousClass01G.NO_LONGER_RUNNING_MESSAGE)) {
                    throw e;
                }
                Log.e(AnonymousClass01G.TAG, "Captured a \"Caller no longer running\"", e);
            }
        }
        throw e;
    }

    public final /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        this.A00.processorFinished();
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.A00.processorFinished();
    }
}
