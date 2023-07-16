package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import com.instagram.barcelona.R;

/* renamed from: X.0xG  reason: invalid class name and case insensitive filesystem */
public final class C18480xG extends AsyncTask {
    public Uri A00;
    public boolean A01 = false;
    public final int A02;
    public final /* synthetic */ C69794Ai A03;

    public C18480xG(Uri uri, C69794Ai r3, int i) {
        this.A03 = r3;
        this.A02 = i;
        this.A00 = uri;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (X.C69794Ai.A03(r5.A03) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r7) {
        /*
            r6 = this;
            X.4Ai r5 = r6.A03
            X.1cR r0 = r5.A02
            r4 = 0
            if (r0 == 0) goto L_0x001a
            int r3 = r6.A02
            if (r3 != 0) goto L_0x0014
            com.instagram.service.session.UserSession r0 = r5.A03
            boolean r1 = X.C69794Ai.A03(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x001b
            r0 = 1
            r6.A01 = r0
        L_0x001a:
            return r4
        L_0x001b:
            X.1cR r0 = r5.A02     // Catch:{ Exception -> 0x0032 }
            android.content.Context r2 = r0.requireContext()     // Catch:{ Exception -> 0x0032 }
            com.instagram.service.session.UserSession r1 = r5.A03     // Catch:{ Exception -> 0x0032 }
            android.net.Uri r0 = r6.A00     // Catch:{ Exception -> 0x0032 }
            android.graphics.Bitmap r1 = X.C31540GrE.A00(r2, r0, r1, r3)     // Catch:{ Exception -> 0x0032 }
            r1.getClass()     // Catch:{ Exception -> 0x0032 }
            r0 = 1
            android.graphics.Bitmap r4 = X.C31540GrE.A01(r1, r3, r0)     // Catch:{ Exception -> 0x0032 }
            return r4
        L_0x0032:
            r2 = move-exception
            java.lang.String r1 = "AddAvatarHelper"
            java.lang.String r0 = "An error occurred fetching your image"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18480xG.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2 = (Bitmap) obj;
        C69794Ai r4 = this.A03;
        AnonymousClass1cR r3 = r4.A02;
        if (!(r3 == null || r3.mView == null)) {
            if (bitmap2 != null) {
                AnonymousClass37S r0 = new AnonymousClass37S(bitmap2, this.A00, this.A02);
                r4.A00 = r0;
                bitmap = r0.A00;
            } else if (this.A01) {
                r4.A00 = null;
                Drawable drawable = r3.requireContext().getDrawable(R.drawable.profile_anonymous_user);
                r3.A00 = null;
                r3.A02.A00 = null;
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                C25828Dsm A002 = C62973bE.A00(r3.requireContext());
                A002.A0K(2131833009);
                AnonymousClass0wJ.A1K(A002);
            }
            r3.A03(bitmap);
        }
        super.onPostExecute(bitmap2);
    }
}
