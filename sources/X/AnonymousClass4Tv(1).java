package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.4Tv  reason: invalid class name */
public final class AnonymousClass4Tv implements Callable {
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;

    public AnonymousClass4Tv(SharedPreferences sharedPreferences, Integer num, String str) {
        this.A00 = sharedPreferences;
        this.A02 = str;
        this.A01 = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.A00.getInt(this.A02, this.A01.intValue()));
    }
}
