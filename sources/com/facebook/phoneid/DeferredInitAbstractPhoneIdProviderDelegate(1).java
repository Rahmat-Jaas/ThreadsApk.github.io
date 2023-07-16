package com.facebook.phoneid;

import X.C18210wN;
import X.C18240wQ;
import X.C41029Luq;
import X.L6I;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public abstract class DeferredInitAbstractPhoneIdProviderDelegate extends C41029Luq {
    public final Cursor A09(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw C18210wN.A0W("ensureInitialized");
    }

    public final int A04(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw C18240wQ.A0j();
    }

    public final int A05(Uri uri, String str, String[] strArr) {
        throw C18240wQ.A0j();
    }

    public final Uri A0B(Uri uri, ContentValues contentValues) {
        throw C18240wQ.A0j();
    }

    public final String A0E(Uri uri) {
        throw C18240wQ.A0j();
    }

    public DeferredInitAbstractPhoneIdProviderDelegate(L6I l6i) {
        super(l6i);
    }
}
