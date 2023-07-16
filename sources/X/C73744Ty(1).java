package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: X.4Ty  reason: invalid class name and case insensitive filesystem */
public final class C73744Ty implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C73744Ty(Context context, UserSession userSession, String str, String str2) {
        this.A02 = str;
        this.A00 = context;
        this.A03 = str2;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(this.A02);
            if (decodeFile != null) {
                File A05 = AnonymousClass0hL.A05(this.A00);
                C31176Gi6.A0J(decodeFile, A05);
                String str = this.A03;
                String canonicalPath = A05.getCanonicalPath();
                C04220Ms.A06(canonicalPath);
                GO4.A00(this.A01, str, canonicalPath, decodeFile.getWidth());
                return null;
            }
            throw new IOException(C28174Ezk.A00(153));
        } catch (Exception e) {
            return e;
        }
    }
}
