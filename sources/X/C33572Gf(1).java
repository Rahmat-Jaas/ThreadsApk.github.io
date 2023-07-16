package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* renamed from: X.2Gf  reason: invalid class name and case insensitive filesystem */
public final class C33572Gf {
    public static final Object A00(AnonymousClass601 r6, C63893iY r7) {
        Bitmap A00;
        boolean A1Y = AnonymousClass0wJ.A1Y(r7, r6);
        Context context = C63893iY.A01(r7, A1Y ? 1 : 0).A00;
        AnonymousClass3RS.A00 = r6;
        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
        Uri uri = C30888GaS.A06.A00;
        String str = null;
        if (!(uri == null || (A00 = C30888GaS.A00(context, uri)) == null)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            A00.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), A1Y);
        }
        AnonymousClass3RS.A00(C63893iY.A04(A002, str, A1Y), 40);
        return null;
    }
}
