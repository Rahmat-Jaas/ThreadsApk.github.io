package com.instagram.contentprovider;

import X.C18240wQ;
import X.C18390x7;
import X.L6I;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.secure.content.PublicContentDelegate;

public class DeferredCurrentUserProvider$Impl extends PublicContentDelegate {
    public C18390x7 A00 = new C18390x7();

    public final Cursor A0Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C18390x7 r0 = this.A00;
        r0.A01();
        return C18390x7.A00(r0);
    }

    public DeferredCurrentUserProvider$Impl(L6I l6i) {
        super(l6i);
    }

    public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw C18240wQ.A0j();
    }

    public final int A0N(Uri uri, String str, String[] strArr) {
        throw C18240wQ.A0j();
    }

    public final Uri A0R(Uri uri, ContentValues contentValues) {
        throw C18240wQ.A0j();
    }

    public final String A0T(Uri uri) {
        throw C18240wQ.A0j();
    }
}
