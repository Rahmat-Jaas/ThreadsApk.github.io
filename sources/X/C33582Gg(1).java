package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* renamed from: X.2Gg  reason: invalid class name and case insensitive filesystem */
public final class C33582Gg {
    public static Object A00(AnonymousClass601 r6) {
        String obj;
        AnonymousClass3VO A00;
        Bitmap A002;
        Context context = C63913ic.A0D(r6).A00;
        AnonymousClass3RS.A00 = r6;
        C30888GaS gaS = C30888GaS.A06;
        if (gaS.A04) {
            A00 = AnonymousClass3VO.A00();
            Uri uri = gaS.A01;
            if (uri == null) {
                uri = gaS.A00;
            }
            obj = null;
            if (!(uri == null || (A002 = C30888GaS.A00(context, uri)) == null)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                A002.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                obj = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
        } else {
            Uri uri2 = gaS.A01;
            if (uri2 == null && (uri2 = gaS.A00) == null) {
                obj = null;
            } else {
                obj = uri2.toString();
            }
            A00 = AnonymousClass3VO.A00();
        }
        AnonymousClass3RS.A00(C63893iY.A04(A00, obj, 0), 36);
        return null;
    }
}
