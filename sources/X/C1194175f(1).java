package X;

import java.io.IOException;

/* renamed from: X.75f  reason: invalid class name and case insensitive filesystem */
public final class C1194175f {
    public C105896eA A00;
    public String A01;

    public static C111266n3 A00(AnonymousClass601 r0, String str) {
        C105886e9 r02;
        try {
            AnonymousClass794.A00();
            C105896eA A002 = AnonymousClass6Q9.A00(new C130817qp(C60713Qf.A00(r0, str)));
            if (A002 != null && (r02 = A002.A00) != null) {
                return r02.A00;
            }
            throw C18190wL.A0a("Encountered empty BloksResponse. Could not parse embedded payload");
        } catch (IOException unused) {
            throw C18190wL.A0a("Could not parse embedded payload");
        }
    }
}
