package X;

import android.database.Cursor;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.HashMap;

/* renamed from: X.4W8  reason: invalid class name */
public final class AnonymousClass4W8 extends HashMap<String, String> {
    public final /* synthetic */ Cursor A00;
    public final /* synthetic */ AnonymousClass4VH A01;

    public AnonymousClass4W8(Cursor cursor, AnonymousClass4VH r4, int i, int i2) {
        this.A01 = r4;
        this.A00 = cursor;
        put(FXPFAccessLibraryDebugFragment.NAME, cursor.getString(i));
        put("profile_pic_url", cursor.getString(i2));
        put("resolver_type", "content_provider");
    }
}
