package X;

import android.content.SharedPreferences;
import kotlin.Unit;

/* renamed from: X.034  reason: invalid class name */
public final class AnonymousClass034 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ C08390dI A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass034(C08390dI r2, String str, boolean z) {
        super(1);
        this.A00 = r2;
        this.A01 = str;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SharedPreferences.Editor putLong = this.A00.A0C().edit().putLong(this.A01, ((Number) obj).longValue());
        if (this.A02) {
            putLong.commit();
        } else {
            putLong.apply();
        }
        return Unit.A00;
    }
}
