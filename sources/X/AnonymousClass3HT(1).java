package X;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.3HT  reason: invalid class name */
public final class AnonymousClass3HT {
    public final ContentResolver A00;
    public final Uri A01;
    public final AnonymousClass39S A02;
    public final AnonymousClass3E8 A03;
    public final C81964on A04;

    public AnonymousClass3HT(ContentResolver contentResolver, AnonymousClass39S r3, AnonymousClass3E8 r4, C81964on r5) {
        Uri uri = AnonymousClass3RU.A00;
        this.A02 = r3;
        this.A00 = contentResolver;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = uri;
    }

    public final AnonymousClass32Q A00(AnonymousClass32P r6) {
        try {
            Bundle A002 = AnonymousClass3JF.A00(this.A00, this.A01, r6.A00.deepCopy(), this.A02, "authenticate");
            AnonymousClass3JF.A01(A002, this.A03, "authenticate");
            if (A002 == null) {
                return null;
            }
            return new AnonymousClass32Q(A002.deepCopy());
        } catch (Exception e) {
            throw e;
        }
    }

    public final AnonymousClass3E9 A01(AnonymousClass32T r6) {
        try {
            Bundle A002 = AnonymousClass3JF.A00(this.A00, this.A01, r6.A00.deepCopy(), this.A02, "start");
            AnonymousClass3JF.A01(A002, this.A03, "start");
            if (A002 == null) {
                return null;
            }
            return new AnonymousClass3E9(A002.deepCopy());
        } catch (Exception e) {
            throw e;
        }
    }
}
