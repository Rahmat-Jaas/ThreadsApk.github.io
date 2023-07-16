package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: X.7kG  reason: invalid class name and case insensitive filesystem */
public final class C128737kG implements C145358kN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C145358kN A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ Map A06;

    public final void CDo(String str) {
        try {
            Context context = this.A00;
            List list = this.A04;
            String str2 = this.A02;
            Map map = this.A06;
            List list2 = this.A05;
            AnonymousClass7BP.A02(context, this.A01, false, "SMS_OTP", "VERIFY_FACTOR", str2, this.A03, list, list2, map);
        } catch (AnonymousClass6CR e) {
            this.A01.CDn(false, C86144wL.A0b(), e);
        }
    }

    public C128737kG(Context context, C145358kN r2, String str, String str2, List list, List list2, Map map) {
        this.A00 = context;
        this.A04 = list;
        this.A02 = str;
        this.A06 = map;
        this.A05 = list2;
        this.A03 = str2;
        this.A01 = r2;
    }

    public final void CDn(Boolean bool, Integer num, Throwable th) {
        this.A01.CDn(bool, num, th);
    }
}
