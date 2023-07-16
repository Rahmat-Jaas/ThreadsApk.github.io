package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7GY  reason: invalid class name */
public final class AnonymousClass7GY {
    public static int A00;
    public static RectF A01;
    public static C127397h3 A02;
    public static C127397h3 A03;

    public static void A00(Context context, AnonymousClass601 r11, C63893iY r12) {
        int i = 0;
        Object A0B = C63893iY.A0B(r12, 0);
        if (A0B instanceof Number) {
            int A04 = AnonymousClass0wJ.A04(A0B);
            synchronized (C14620pq.class) {
            }
            String[] strArr = {String.valueOf(AnonymousClass00U.A0L(Environment.getExternalStorageDirectory().toString(), "/DCIM/Camera").toLowerCase().hashCode())};
            Uri contentUri = MediaStore.Images.Media.getContentUri("external");
            ContentResolver contentResolver = context.getContentResolver();
            AnonymousClass0UD.A00(contentUri.getAuthority(), 0, AnonymousClass006.A01);
            Cursor query = contentResolver.query(contentUri, new String[]{"_data"}, "bucket_id = ?", strArr, (String) null);
            ArrayList A0k = C18240wQ.A0k(A04);
            if (query != null && query.moveToFirst()) {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                do {
                    String string = query.getString(columnIndexOrThrow);
                    if (string != null) {
                        A0k.add(AnonymousClass00U.A0L("file://", string));
                        i++;
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } while (i < A04);
                query.close();
            }
            A03(r11, r12, A0k);
        }
    }

    public static void A01(Uri uri, AnonymousClass601 r7, C63893iY r8) {
        Bitmap decodeFile;
        List list = r8.A00;
        Object obj = list.get(2);
        Object obj2 = list.get(3);
        if ((obj2 instanceof Number) && (obj instanceof C105916eC)) {
            int A04 = AnonymousClass0wJ.A04(obj2);
            C109326jp r2 = ((C105916eC) obj).A00;
            String path = uri.getPath();
            if (path != null && (decodeFile = BitmapFactory.decodeFile(path)) != null) {
                int height = decodeFile.getHeight();
                int width = decodeFile.getWidth();
                if ((height > 0 && height < A04) || (width > 0 && width < A04)) {
                    AnonymousClass3RS.A00 = r7;
                    C63893iY A0S = C86154wM.A0S(AnonymousClass3VO.A00(), "SIZE_SMALL", 0);
                    AnonymousClass601 r0 = AnonymousClass3RS.A00;
                    if (r0 != null) {
                        C61043Rr.A00(r0, A0S, r2);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        Object obj3 = list.get(0);
        if (obj3 instanceof C105916eC) {
            C109326jp r22 = ((C105916eC) obj3).A00;
            AnonymousClass3RS.A00 = r7;
            C63893iY A0R = C86154wM.A0R(AnonymousClass3VO.A00(), uri.toString(), 0);
            AnonymousClass601 r02 = AnonymousClass3RS.A00;
            if (r02 != null) {
                C61043Rr.A00(r02, A0R, r22);
            }
            A00 = 0;
            A01 = null;
        }
    }

    public static void A02(AnonymousClass601 r2, C63893iY r3) {
        Object A0B = C63893iY.A0B(r3, 1);
        if (A0B instanceof C105916eC) {
            C109326jp r1 = ((C105916eC) A0B).A00;
            AnonymousClass3RS.A00 = r2;
            C63893iY A012 = AnonymousClass3VO.A00().A01();
            if (r2 != null) {
                C61043Rr.A00(r2, A012, r1);
            }
        }
    }

    public static void A03(AnonymousClass601 r3, C63893iY r4, ArrayList arrayList) {
        Object A0B = C63893iY.A0B(r4, 1);
        if (A0B instanceof C105916eC) {
            C109326jp r2 = ((C105916eC) A0B).A00;
            AnonymousClass3RS.A00 = r3;
            C63893iY A012 = C86124wJ.A0d(arrayList).A01();
            AnonymousClass601 r0 = AnonymousClass3RS.A00;
            if (r0 != null) {
                C61043Rr.A00(r0, A012, r2);
            }
        }
    }
}
