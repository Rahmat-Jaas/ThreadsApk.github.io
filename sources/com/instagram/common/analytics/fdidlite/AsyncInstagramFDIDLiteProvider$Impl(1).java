package com.instagram.common.analytics.fdidlite;

import X.AnonymousClass0OY;
import X.C04220Ms;
import X.C04530Oa;
import X.L6I;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.secure.content.PublicContentDelegate;
import kotlin.jvm.internal.IDxLambdaShape880S0100000_I2;

public final class AsyncInstagramFDIDLiteProvider$Impl extends PublicContentDelegate {
    public final C04530Oa A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncInstagramFDIDLiteProvider$Impl(L6I l6i) {
        super(l6i);
        C04220Ms.A0B(l6i, 1);
        this.A00 = AnonymousClass0OY.A02(new IDxLambdaShape880S0100000_I2(l6i, 3));
    }

    public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C04220Ms.A0B(uri, 0);
        this.A00.getValue();
        throw new UnsupportedOperationException();
    }

    public final int A0N(Uri uri, String str, String[] strArr) {
        C04220Ms.A0B(uri, 0);
        this.A00.getValue();
        throw new UnsupportedOperationException();
    }

    public final Cursor A0Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C04220Ms.A0B(uri, 0);
        return ((ContentProvider) this.A00.getValue()).query(uri, strArr, str, strArr2, str2);
    }

    public final Uri A0R(Uri uri, ContentValues contentValues) {
        C04220Ms.A0B(uri, 0);
        C04220Ms.A0B(contentValues, 1);
        this.A00.getValue();
        throw new UnsupportedOperationException();
    }

    public final String A0T(Uri uri) {
        C04220Ms.A0B(uri, 0);
        this.A00.getValue();
        throw new UnsupportedOperationException();
    }
}
