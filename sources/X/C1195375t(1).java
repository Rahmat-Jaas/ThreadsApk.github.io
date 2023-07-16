package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;

/* renamed from: X.75t  reason: invalid class name and case insensitive filesystem */
public final class C1195375t {
    public static C1195375t A02;
    public static final SimpleDateFormat A03 = new SimpleDateFormat("dd/MM/yyyy z");
    public final SharedPreferences A00;
    public final SharedPreferences A01;

    public C1195375t(Context context) {
        this.A01 = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.A00 = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }
}
