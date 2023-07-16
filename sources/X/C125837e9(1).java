package X;

import com.facebook.dcp.model.Example;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7e9  reason: invalid class name and case insensitive filesystem */
public final class C125837e9 implements C145798l6 {
    public final C146988nC A00;
    public final C03700Kj A01;

    public final AnonymousClass5Id CZ5(Long l, String str) {
        C04220Ms.A0B(str, 0);
        C146988nC r1 = this.A00;
        if (!((C125677do) r1).A00.hasKey(str)) {
            return AnonymousClass5Id.A01(Example.A03, "example not found in cache", false);
        }
        try {
            C39237Kq4 kq4 = C36975Ji8.A03;
            return AnonymousClass5Id.A00(C18240wQ.A0a(Example.class, r1.getString(str), kq4, kq4.A02));
        } catch (Exception unused) {
            return AnonymousClass5Id.A01(Example.A03, "example not found in cache", false);
        }
    }

    public final void CwJ(Example example, String str, long j) {
        C04220Ms.A0B(str, 0);
        C146988nC r6 = this.A00;
        String A0N = AnonymousClass00U.A0N(str, "server_features_last_download_timestamp", '_');
        TimeUnit timeUnit = TimeUnit.DAYS;
        long millis = timeUnit.toMillis(30);
        C04220Ms.A0B(A0N, 0);
        ((C125677do) r6).CYP(A0N, String.valueOf(j), millis);
        C39237Kq4 kq4 = C36975Ji8.A03;
        r6.CYP(str, C18210wN.A0d(Example.class, example, kq4, kq4.A02), timeUnit.toMillis(30));
    }

    public final AnonymousClass5Id CfA(String str) {
        C04220Ms.A0B(str, 0);
        try {
            C146988nC r2 = this.A00;
            String A0N = AnonymousClass00U.A0N(str, "server_features_last_download_timestamp", '_');
            C04220Ms.A0B(A0N, 0);
            return AnonymousClass5Id.A00(AnonymousClass0wJ.A0d(((C125677do) r2).getString(A0N)));
        } catch (C97426Bh | NumberFormatException unused) {
            return AnonymousClass5Id.A01(-1L, "last download timestamp for server features not found", false);
        }
    }

    public C125837e9(C03700Kj r1, C146988nC r2) {
        AnonymousClass0wJ.A1O(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }
}
