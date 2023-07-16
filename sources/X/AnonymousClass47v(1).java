package X;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.CalendarContract;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.Map;

/* renamed from: X.47v  reason: invalid class name */
public final /* synthetic */ class AnonymousClass47v implements C144608im {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass601 A01;
    public final /* synthetic */ C127397h3 A02;

    public /* synthetic */ AnonymousClass47v(Context context, AnonymousClass601 r2, C127397h3 r3) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = r2;
    }

    public final void CAi(Map map) {
        C109326jp A0L;
        AnonymousClass3VO A002;
        Object obj;
        C127397h3 r8 = this.A02;
        Context context = this.A00;
        AnonymousClass601 r7 = this.A01;
        Object obj2 = map.get(AnonymousClass000.A00(765));
        int i = 0;
        if (obj2 == C971568d.GRANTED) {
            Uri uri = CalendarContract.Events.CONTENT_URI;
            long j = 0;
            if (uri != null) {
                boolean A0T = r8.A0T(51, false);
                long parseLong = Long.parseLong(r8.A0O(50, "0"));
                ContentResolver contentResolver = context.getContentResolver();
                if (A0T) {
                    contentResolver.delete(ContentUris.withAppendedId(uri, parseLong), (String) null, (String[]) null);
                } else {
                    String A0O = r8.A0O(43, "");
                    String A0O2 = r8.A0O(35, "");
                    r8.A04.get(40);
                    long A0I = r8.A0I(41, 0);
                    long A0I2 = r8.A0I(36, 0);
                    String A0O3 = r8.A0O(42, "");
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("calendar_id", 1);
                    contentValues.put(DialogModule.KEY_TITLE, A0O);
                    contentValues.put(DevServerEntity.COLUMN_DESCRIPTION, A0O2);
                    contentValues.put("dtstart", Long.valueOf(A0I));
                    contentValues.put("dtend", Long.valueOf(A0I2));
                    contentValues.put("eventTimezone", A0O3);
                    if (parseLong != 0) {
                        contentResolver.update(ContentUris.withAppendedId(uri, parseLong), contentValues, (String) null, (String[]) null);
                        j = parseLong;
                    } else {
                        Uri insert = contentResolver.insert(uri, contentValues);
                        if (!(insert == null || insert.getLastPathSegment() == null)) {
                            j = Long.parseLong(insert.getLastPathSegment());
                        }
                    }
                }
            }
            A0L = r8.A0L(45);
            if (A0L != null) {
                A002 = AnonymousClass3VO.A00();
                A002.A02(r8.A0O(43, ""), 0);
                A002.A02(1, 1);
                i = 2;
                obj = Long.valueOf(j);
            } else {
                return;
            }
        } else {
            A0L = r8.A0L(46);
            if (A0L != null) {
                A002 = AnonymousClass3VO.A00();
                if (obj2 == C971568d.DENIED) {
                    obj = I17.A00(430);
                } else {
                    obj = "PERMISSION_DENIED_DO_NOT_ASK_AGAIN";
                }
            } else {
                return;
            }
        }
        C63893iY.A0F(r7, A002, A0L, obj, i);
    }
}
